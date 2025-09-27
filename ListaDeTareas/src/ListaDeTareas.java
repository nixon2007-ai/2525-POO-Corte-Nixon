import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListaDeTareas {
    private final JFrame frame;
    private final JTextField campoTarea;
    private final DefaultListModel<String> modeloLista;
    private final JList<String> listaTareas;

    public ListaDeTareas() {
        // Crear ventana principal
        frame = new JFrame("Lista de Tareas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());

        // Panel superior con campo de texto y botón de añadir
        JPanel panelSuperior = new JPanel(new BorderLayout());
        campoTarea = new JTextField();
        JButton botonAñadir = new JButton("Añadir Tarea");

        panelSuperior.add(campoTarea, BorderLayout.CENTER);
        panelSuperior.add(botonAñadir, BorderLayout.EAST);

        // Lista de tareas con modelo
        modeloLista = new DefaultListModel<>();
        listaTareas = new JList<>(modeloLista);
        listaTareas.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listaTareas.setCellRenderer(new TareaRenderer());

        JScrollPane scrollPane = new JScrollPane(listaTareas);

        // Panel inferior con botones de completar y eliminar
        JPanel panelInferior = new JPanel();
        JButton botonCompletar = new JButton("Marcar como Completada");
        JButton botonEliminar = new JButton("Eliminar Tarea");

        panelInferior.add(botonCompletar);
        panelInferior.add(botonEliminar);

        // Añadir componentes al frame
        frame.add(panelSuperior, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);
        frame.add(panelInferior, BorderLayout.SOUTH);

        // Manejadores de eventos
        botonAñadir.addActionListener(e -> añadirTarea());
        campoTarea.addActionListener(e -> añadirTarea());

        botonCompletar.addActionListener(e -> marcarComoCompletada());
        botonEliminar.addActionListener(e -> eliminarTarea());

        // Doble clic para marcar como completada
        listaTareas.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    marcarComoCompletada();
                }
            }
        });

        frame.setVisible(true);
    }

    // Añadir tarea al modelo
    private void añadirTarea() {
        String texto = campoTarea.getText().trim();
        if (!texto.isEmpty()) {
            modeloLista.addElement(texto);
            campoTarea.setText("");
        }
    }

    // Marcar tarea como completada (añadiendo prefijo "[✔]")
    private void marcarComoCompletada() {
        int index = listaTareas.getSelectedIndex();
        if (index != -1) {
            String tarea = modeloLista.getElementAt(index);
            if (!tarea.startsWith("[✔] ")) {
                modeloLista.setElementAt("[✔] " + tarea, index);
            }
        }
    }

    // Eliminar tarea seleccionada
    private void eliminarTarea() {
        int index = listaTareas.getSelectedIndex();
        if (index != -1) {
            modeloLista.remove(index);
        }
    }

    // Renderer para mostrar tareas completadas con estilo diferente
    private class TareaRenderer extends DefaultListCellRenderer {
        @Override
        public Component getListCellRendererComponent(JList<?> list, Object value, int index,
                                                      boolean isSelected, boolean cellHasFocus) {
            JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
            String texto = value.toString();
            if (texto.startsWith("[✔] ")) {
                label.setForeground(Color.GRAY);
                label.setFont(label.getFont().deriveFont(Font.ITALIC));
            } else {
                label.setForeground(Color.BLACK);
                label.setFont(label.getFont().deriveFont(Font.PLAIN));
            }
            return label;
        }
    }

    // Método principal
    public static void main(String[] args) {
        SwingUtilities.invokeLater(ListaDeTareas::new);
    }
}
