/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ladolcepizza;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import BasedeDatos.Conexion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SABAGIP
 */
public final class TerminarPedido extends javax.swing.JFrame {

    /**
     * Creates new form TerminarPedido
     */
    int seg;
    ResultSet consulta;
    String comandosSQL;
    Conexion conexion = new Conexion();
    String idCompra;
    DefaultTableModel modelo = new DefaultTableModel();
    String nombre = "";
    String apellidoP = "";
    String apellidoM = "";
    String fecha = "";
    String tiempo = "";
    boolean activada = false;
    public static boolean bandera = false;
    char arreglo[];
    JFrame ventana;
    Timer temp;

    public TerminarPedido() {
        initComponents();
        //llenarTblPedido();
        txtIdCompra.setVisible(false);
        txtNombre.setVisible(false);
        txtApellidoP.setVisible(false);
        txtAplellidoM.setVisible(false);
        txtTiempo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtIdCompra = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoP = new javax.swing.JTextField();
        txtAplellidoM = new javax.swing.JTextField();
        txtTiempo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPedido = new javax.swing.JTable();
        btnAceptar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAgregarPizza = new javax.swing.JButton();
        lblTemp = new javax.swing.JLabel();
        pgrProgreso = new javax.swing.JProgressBar();

        txtNombre.setText("jTextField1");

        txtApellidoP.setText("jTextField1");

        txtAplellidoM.setText("jTextField1");

        txtTiempo.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        tblPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Inrgredientes", "# Pizzas", "Tamaño", "Subtotal"
            }
        ));
        tblPedido.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tblPedido);
        tblPedido.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar pizza");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnAgregarPizza.setText("Agregar Pizza");
        btnAgregarPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPizzaActionPerformed(evt);
            }
        });

        lblTemp.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTemp.setText("3:00");

        pgrProgreso.setBackground(new java.awt.Color(51, 153, 255));
        pgrProgreso.setForeground(new java.awt.Color(255, 255, 0));
        pgrProgreso.setMaximum(180);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addComponent(btnBorrar)
                        .addGap(50, 50, 50)
                        .addComponent(btnAgregarPizza)
                        .addGap(41, 41, 41)
                        .addComponent(btnAceptar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblTemp))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pgrProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pgrProgreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(lblTemp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnBorrar)
                    .addComponent(btnAgregarPizza))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        llenarTblPedido();
        
        
        if (activada == false) {
            seg = Integer.parseInt(txtTiempo.getText());
            pgrProgreso.setValue(seg);
            temporizador(seg, this);
            temp.start();
            activada = true;
        }


    }//GEN-LAST:event_formWindowActivated

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        terminarPedido();
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        // TODO add your handling code here:

        String ingredientes = "";
        int numeroPizzas = 0;
        float subTotal = 0;
        ingredientes = (String) tblPedido.getValueAt(tblPedido.getSelectedRow(), 0);
        numeroPizzas = (int) tblPedido.getValueAt(tblPedido.getSelectedRow(), 1);
        subTotal = (float) tblPedido.getValueAt(tblPedido.getSelectedRow(), 3);

        try {
            if (conexion.crearConexion()) {
                comandosSQL = "DELETE FROM detalle_compra WHERE idcompra = " + idCompra
                        + " AND ingredientes = '" + ingredientes + "' AND cantidad_pizza = " + numeroPizzas
                        + " AND totalPizza = " + subTotal;

                if (conexion.ejecutarSQL(comandosSQL)) {
                    llenarTblPedido();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error al eliminar la pizza");
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Error al conectar a la base de datos");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, "Seleccione la pizza que desea eliminar");
        } finally {

        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnAgregarPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPizzaActionPerformed
        // TODO add your handling code here:
        Creacion creacion = new Creacion();
        Creacion.txtNombreCliente.setText(nombre);
        Creacion.txtApellidoP.setText(apellidoP);
        Creacion.txtApellidoM.setText(apellidoM);
        Creacion.txtIdCompra.setText(idCompra);
        Creacion.txtTiempo.setText(tiempo);
        Creacion.bandera = bandera;
        Creacion.seg = seg;
        temp.stop();
        creacion.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_btnAgregarPizzaActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        
        MensajeSalida mensajeSalida = new MensajeSalida();
    }//GEN-LAST:event_formWindowClosing

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TerminarPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TerminarPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TerminarPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TerminarPedido.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TerminarPedido().setVisible(true);
            }
        });
    }

    void llenarTblPedido() {

        idCompra = txtIdCompra.getText();
        nombre = txtNombre.getText();
        apellidoP = txtApellidoP.getText();
        apellidoM = txtAplellidoM.getText();
        Object datos[] = new Object[4];
        //fecha = txtFecha.getText();
        if (conexion.crearConexion()) {

            comandosSQL = "SELECT ingredientes, cantidad_pizza, tamanio, totalPizza FROM"
                    + " detalle_compra WHERE idcompra = " + idCompra;

            modelo = (DefaultTableModel) tblPedido.getModel();
            modelo.setRowCount(0);
            try {
                consulta = conexion.ejecutarSQLSelect(comandosSQL);
                while (consulta.next()) {
                    for (int i = 0; i < 4; i++) {
                        datos[i] = consulta.getObject(i + 1);
                    }
                    modelo.addRow(datos);
                }

                float total = 0;
                for (int i = 0; i < tblPedido.getRowCount(); i++) {
                    total = total + (Float) tblPedido.getValueAt(i, 3);
                }
                datos[0] = "";
                datos[1] = "";
                datos[2] = "Total =";
                datos[3] = total;
                modelo.addRow(datos);

            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("error " + consulta);
            } finally {
                try {
                    consulta.close();
                } catch (Exception e) {
                    System.out.println("error2 " + consulta);
                }
            }
        }
    }

    void temporizador(int segundos, JFrame frame) {
        seg = segundos;
        ventana = frame;
        temp = new Timer(1000, new ActionListener() {
            float segundo;
            int minutos;

            @Override
            public void actionPerformed(ActionEvent e) {

                pgrProgreso.setValue(seg);
                minutos = seg / 60;
                segundo = (seg % 60);
                String cadena = segundo + "";
                char arreglo[] = cadena.toCharArray();
                if (arreglo.length == 3) {
                    lblTemp.setText(minutos + ":" + "0" + arreglo[0]);
                }
                if (arreglo.length == 4) {
                    lblTemp.setText(minutos + ":" + arreglo[0] + arreglo[1]);
                }

                if (seg == 0 && bandera == false) {
                    JOptionPane.showMessageDialog(rootPane, "Debes de terminar tu furipedido");
                    seg = 31;
                    bandera = true;
                    pgrProgreso.setValue(seg);
                }
                if (seg == 0 && bandera == true) {
                    JOptionPane.showMessageDialog(rootPane, "Se te ha acabado tu tiempo");
                    Inicio inicio = new Inicio();
                    inicio.setVisible(true);

                    ventana.dispose();

                }
                seg--;
            }
        });

    }
    
    void terminarPedido(){
        
            comandosSQL = "UPDATE compra SET confirmaPedido = 1 WHERE idcompra = " + idCompra ;
            if(conexion.ejecutarSQL(comandosSQL) == false){
                System.out.println(comandosSQL);
                JOptionPane.showMessageDialog(rootPane, "Lo sentimos, no pudimos agregar tu pedido \n Por favor, intentelo de nuevo");
                Inicio inicio = new Inicio();
                inicio.setVisible(true);
                this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "¡Tu pedido ha sido agregado! \n En un  momento te llamamos.");
            }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnAgregarPizza;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTemp;
    private javax.swing.JProgressBar pgrProgreso;
    private javax.swing.JTable tblPedido;
    public static javax.swing.JTextField txtApellidoP;
    public static javax.swing.JTextField txtAplellidoM;
    public static javax.swing.JTextField txtIdCompra;
    public static javax.swing.JTextField txtNombre;
    public static javax.swing.JTextField txtTiempo;
    // End of variables declaration//GEN-END:variables
}
