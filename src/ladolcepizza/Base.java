/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ladolcepizza;

import javax.swing.ImageIcon;

/**
 *
 * @author SABAGIP
 */
public class Base extends javax.swing.JFrame {

    /**
     * Creates new form Base
     */
    public Base() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblAtras = new javax.swing.JLabel();
        lblAdelante = new javax.swing.JLabel();
        rdtnHarina = new javax.swing.JRadioButton();
        rdtnPan = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(761, 460));

        jLabel1.setFont(new java.awt.Font("Brush Script MT", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Escoge la masa que deseas");
        jLabel1.setName("lblMasa"); // NOI18N

        lblAtras.setText("Atras");
        lblAtras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAtrasMouseClicked(evt);
            }
        });

        lblAdelante.setText("Siguiente");
        lblAdelante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAdelanteMouseClicked(evt);
            }
        });

        rdtnHarina.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        rdtnHarina.setSelected(true);
        rdtnHarina.setText("Harina");
        rdtnHarina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdtnHarinaActionPerformed(evt);
            }
        });

        rdtnPan.setFont(new java.awt.Font("Perpetua Titling MT", 0, 18)); // NOI18N
        rdtnPan.setText("Pan");
        rdtnPan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdtnPanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(rdtnHarina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(40, 40, 40)
                        .addComponent(rdtnPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(29, 29, 29)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblAtras)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblAdelante))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAdelante)
                    .addComponent(lblAtras))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdtnHarina, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdtnPan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(243, 243, 243))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblAtrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAtrasMouseClicked
        try {
            // TODO add your handling code here:
            // this.setVisible(false);
            this.finalize();

            Inicio inicio = new Inicio();
            inicio.setVisible(true);
        } catch (Throwable ex) {

        }
    }//GEN-LAST:event_lblAtrasMouseClicked

    private void lblAdelanteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAdelanteMouseClicked
        // TODO add your handling code here:

        this.setVisible(false);
    }//GEN-LAST:event_lblAdelanteMouseClicked

    private void rdtnHarinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtnHarinaActionPerformed
        // TODO add your handling code here:
        /*ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/harina.jpg"));
        ImageIcon imgEscalada = imgIcon.getImage().getScaledInstance(lblImagen.getWidth(),
            lblImagen.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        lblImagen.setIcon(iconoEscalado);*/
    }//GEN-LAST:event_rdtnHarinaActionPerformed

    private void rdtnPanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdtnPanActionPerformed
        // TODO add your handling code here:
 /*
        ImageIcon imgIcon = new ImageIcon(getClass().getResource("/Imagenes/pan.jpg"));
        Image imgEscalada = imgIcon.getImage().getScaledInstance(lblImagen.getWidth(),
            lblImagen.getHeight(), Image.SCALE_SMOOTH);
        Icon iconoEscalado = new ImageIcon(imgEscalada);
        lblImagen.setIcon(iconoEscalado);*/
    }//GEN-LAST:event_rdtnPanActionPerformed

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
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Base().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAdelante;
    private javax.swing.JLabel lblAtras;
    private javax.swing.JRadioButton rdtnHarina;
    private javax.swing.JRadioButton rdtnPan;
    // End of variables declaration//GEN-END:variables
}
