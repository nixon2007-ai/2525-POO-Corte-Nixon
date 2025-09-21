import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AgendaPersonal extends JFrame {
    private DefaultTableModel modeloTabla;
    private JTable tablaEventos;
    private JSpinner spinnerFecha;
    private JSpinner spinnerHora;
    private JTextField campoDescripcion;

    public AgendaPersonal() {
        setTitle("Agenda Personal de Nixon Corte");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        inicializarComponentes();
    }

    private void inicializarComponentes() {
        // Panel de entrada
        JPanel panelEntrada = new JPanel();
        panelEntrada.setLayout(new GridLayout(3, 2));

        // Etiquetas y campos de entrada
        panelEntrada.add(new JLabel("Fecha (dd/MM/yyyy):"));
        spinnerFecha = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor fechaEditor = new JSpinner.DateEditor(spinnerFecha, "dd/MM/yyyy");
        spinnerFecha.setEditor(fechaEditor);
        panelEntrada.add(spinnerFecha);

        panelEntrada.add(new JLabel("Hora (HH:mm):"));
        spinnerHora = new JSpinner(new SpinnerDateModel());
        JSpinner.DateEditor horaEditor = new JSpinner.DateEditor(spinnerHora, "HH:mm");
        spinnerHora.setEditor(horaEditor);
        panelEntrada.add(spinnerHora);

        panelEntrada.add(new JLabel("Descripción:"));
        campoDescripcion = new JTextField();
        panelEntrada.add(campoDescripcion);

        add(panelEntrada, BorderLayout.NORTH);

        // Tabla de eventos
        modeloTabla = new DefaultTableModel(new String[]{"Fecha", "Hora", "Descripción"}, 0);
        tablaEventos = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaEventos);
        add(scrollPane, BorderLayout.CENTER);

        // Panel de botones
        JPanel panelBotones = new JPanel();
        JButton botonAgregar = new JButton("Agregar");
        JButton botonEliminar = new JButton("Eliminar seleccionado");
        JButton botonSalir = new JButton("Salir");

        panelBotones.add(botonAgregar);
        panelBotones.add(botonEliminar);
        panelBotones.add(botonSalir);
        add(panelBotones, BorderLayout.SOUTH);

        // Manejo de eventos
        botonAgregar.addActionListener((ActionEvent e) -> {
            agregarEvento();
        });

        botonEliminar.addActionListener((ActionEvent e) -> {
            eliminarEventoSeleccionado();
        });

        botonSalir.addActionListener((ActionEvent e) -> {
            dispose();
        });
    }

    private void agregarEvento() {
        String descripcion = campoDescripcion.getText().trim();
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La descripción no puede estar vacía", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        Date fecha = (Date) spinnerFecha.getValue();
        Date hora = (Date) spinnerHora.getValue();

        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat formatoHora = new SimpleDateFormat("HH:mm");

        String fechaFormateada = formatoFecha.format(fecha);
        String horaFormateada = formatoHora.format(hora);

        modeloTabla.addRow(new Object[]{fechaFormateada, horaFormateada, descripcion});
        campoDescripcion.setText("");
        campoDescripcion.requestFocus();
    }

    private void eliminarEventoSeleccionado() {
        int filaSeleccionada = tablaEventos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Selecciona un evento primero", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int confirmacion = JOptionPane.showConfirmDialog(this, "¿Eliminar el evento seleccionado?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
        if (confirmacion == JOptionPane.YES_OPTION) {
            modeloTabla.removeRow(filaSeleccionada);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AgendaPersonal agenda = new AgendaPersonal();
            agenda.setVisible(true);
        });
    }
}
