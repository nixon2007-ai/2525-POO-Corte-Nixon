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
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventHandlers {
    private final SimpleGuiApp app;

    public EventHandlers(SimpleGuiApp app) {
        this.app = app;
    }

    public ActionListener getAddAction() {
        return (ActionEvent e) -> {
            String input = app.getTextField().getText().trim();
            if (!input.isEmpty()) {
                app.getListModel().addElement(input);
                app.getTextField().setText(""); // Limpiar el campo de texto
            } else {
                JOptionPane.showMessageDialog(app.getFrame(), "Por favor, ingrese un texto válido.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        };
    }

    public ActionListener getClearAction() {
        return (ActionEvent e) -> {
            app.getTextField().setText(""); // Limpiar el campo de texto
            app.getListModel().clear(); // Limpiar la lista
        };
    }

    public ListSelectionListener getListSelectionListener() {
        return (ListSelectionEvent e) -> {
            if (!e.getValueIsAdjusting()) {
                String selectedValue = app.list.getSelectedValue();
                if (selectedValue != null) {
                    app.getTextField().setText(selectedValue); // Mostrar el elemento seleccionado en el campo de texto
                }
            }
        };
    }
}
