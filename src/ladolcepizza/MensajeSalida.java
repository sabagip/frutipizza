/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladolcepizza;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 *
 * @author SABAGIP
 */
public class MensajeSalida {

    String contraseña = "xxx.1234";
    JPasswordField panelContraseña = new JPasswordField("-------");
    JLabel etiqueta = new JLabel("Ingresa la contraseña");
    JPanel panel = new JPanel();

    public MensajeSalida() {
        panel.add(etiqueta);
        panel.add(panelContraseña);

        int config = JOptionPane.showConfirmDialog(null, panel, "¿Seguro que deseas salir?", JOptionPane.OK_CANCEL_OPTION);
        char cadena[] = panelContraseña.getPassword();
        String contra = "";
        for (int i = 0; i < cadena.length; i++) {
            contra = contra + cadena[i];
        }

        if (config == JOptionPane.OK_OPTION && contra.equals(contraseña)) {
            JOptionPane.showMessageDialog(null, "Adios");
            System.exit(0);
        } else {
            if (config == JOptionPane.OK_OPTION && !contra.equals(contraseña)) {
                JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
            }

        }

    }

}
