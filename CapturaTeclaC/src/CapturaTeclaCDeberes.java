import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CapturaTeclaCDeberes extends JFrame {
    private JList<String> lista;
    private DefaultListModel<String> modelo;
    private final JButton boton;

    // Supongamos que los deberes de las semanas 1 a 18 están todos completos
    private boolean[] deberesCompletos = new boolean[18];

    public CapturaTeclaCDeberes() {
        // Inicializar el estado de los deberes (todos completos en este ejemplo)
        for (int i = 0; i < deberesCompletos.length; i++) {
            deberesCompletos[i] = true; // Cambiar a false si no se completaron
        }

        // Configuración de la ventana
        setTitle("Captura de Tecla 'C' - Deberes realizados de la asignatura de POO");
        setSize(600, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Modelo y lista
        modelo = new DefaultListModel<>();
        for (int i = 1; i <= 16; i++) {
            modelo.addElement("Semana de Programación Orientada a Obejtos - numero " + i);
        }
        lista = new JList<>(modelo);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        
        // Botón
        boton = new JButton("Acción");
        boton.addActionListener(e -> System.out.println("Botón presionado"));

        // Agregar componentes a la ventana
        add(new JScrollPane(lista));
        add(boton);

        // Configurar el KeyListener
        lista.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == 'c' || e.getKeyChar() == 'C') {
                    // Acción al presionar 'C'
                    int index = lista.getSelectedIndex();
                    if (index != -1) {
                        String semana = modelo.getElementAt(index);
                        boolean completado = deberesCompletos[index];
                        System.out.println(semana + " - Deberes " + (completado ? "completos." : "no completos."));
                    } else {
                        System.out.println("Tecla 'C' presionada, pero no hay semana seleccionada.");
                    }
                }
            }
        });

        // Hacer que la lista tenga el foco al iniciar
        lista.requestFocusInWindow();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            CapturaTeclaCDeberes ventana = new CapturaTeclaCDeberes();
            ventana.setVisible(true);
        });
    }
}
