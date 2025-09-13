/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplicaciónguibásica;

/**
 *
 * @author ORTEL
 */
import javax.swing.*;
import java.awt.*;

public class SimpleGuiApp {
    private JFrame frame;
    private JTextField textField;
    private DefaultListModel<String> listModel;
    JList<String> list;

    public SimpleGuiApp() {
        // Crear la ventana principal
        frame = new JFrame("Aplicación GUI Básica elaborada por Nixon Corte");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        
        // Crear el layout
        frame.setLayout(new BorderLayout());

        // Crear componentes
        textField = new JTextField(20);
        JButton addButton = new JButton("Agregar");
        JButton clearButton = new JButton("Limpiar");

        // Modelo y lista
        listModel = new DefaultListModel<>();
        list = new JList<>(listModel);
        JScrollPane listScrollPane = new JScrollPane(list);

        // Panel para los botones y el campo de texto
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(addButton);
        panel.add(clearButton);

        // Agregar componentes a la ventana
        frame.add(panel, BorderLayout.NORTH);
        frame.add(listScrollPane, BorderLayout.CENTER);

        // Manejar eventos de botones
        EventHandlers eventHandlers = new EventHandlers(this);
        addButton.addActionListener(eventHandlers.getAddAction());
        clearButton.addActionListener(eventHandlers.getClearAction());

        // Manejar selección en la lista
        list.addListSelectionListener(eventHandlers.getListSelectionListener());

        // Mostrar la ventana
        frame.setVisible(true);
    }

    // Métodos para acceder a los componentes
    public JTextField getTextField() {
        return textField;
    }

    public DefaultListModel<String> getListModel() {
        return listModel;
    }

    public JFrame getFrame() {
        return frame;
    }
}
