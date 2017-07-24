/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.vista;

import ec.edu.controlador.ManejadorPacientes;
import ec.edu.modelo.Usuarios;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Rocío
 */
public class LogeoClDr extends javax.swing.JFrame {

    /**
     * Creates new form LogeoClDr
     */
    public LogeoClDr() {
        initComponents();
        setLocationRelativeTo(null);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        pswContrasena = new javax.swing.JPasswordField();
        jbIngresar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(643, 446));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setText("Ingreso");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(254, 45, 110, 25);

        jLabel2.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(94, 125, 110, 25);

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(94, 185, 130, 25);

        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        getContentPane().add(txtUser);
        txtUser.setBounds(260, 130, 116, 30);

        pswContrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        getContentPane().add(pswContrasena);
        pswContrasena.setBounds(260, 190, 120, 30);

        jbIngresar.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jbIngresar.setText("Ingresar");
        jbIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbIngresarMouseClicked(evt);
            }
        });
        jbIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jbIngresar);
        jbIngresar.setBounds(260, 270, 121, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ec/edu/sources/nycastings-bg-light.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 0, 640, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUserActionPerformed

    private void jbIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbIngresarMouseClicked
                try {
//            DATPacientes objUs = new DATPacientes();
            //De ResultSet desfragmentar datos
//        ResultSet rs = objUs.obtenerUsuario();
//        String user="";
//        String pass="";
//        int tipo=0;
//        if (rs.next()) {
//            user=rs.getString(1);
//            pass=rs.getString(2);
//            tipo=rs.getInt(3);
//        }
//        Usuarios objS = new Usuarios(txtUser.getText(), txtPassword.getText(), "1");
//                Usuarios objD = new Usuarios(txtUser.getText(), txtPassword.getText(), "2");
//            if (txtUser.getText().equals(user)&&txtPassword.getText().equals(pass)&&objD.getTipo().equals(tipo)) {
//                new GUIRegistrarCosulta().setVisible(true);
//                dispose();
//                
//            }else if(txtUser.getText().equals(user)&&txtPassword.getText().equals(pass)&&objS.getTipo().equals(tipo)){
//                new principal().setVisible(true);
//                dispose();
//            }else{
//                JOptionPane.showMessageDialog(rootPane,"Usuario o contraseña incorrectos!!!", "Credenciales", 1);
//            }
//
            if (txtUser.getText().equals("") || pswContrasena.getText().equals("")) {
                JOptionPane.showMessageDialog(rootPane, "Campos vacíos!!!", "Credenciales", 1);
            } else {
                ManejadorPacientes objUsuario = new ManejadorPacientes();
                ArrayList<Usuarios> lisUsers = new ArrayList<Usuarios>();
                Usuarios objS = new Usuarios(txtUser.getText(), pswContrasena.getText(), "1");
                Usuarios objD = new Usuarios(txtUser.getText(), pswContrasena.getText(), "2");
                lisUsers = objUsuario.obtenerUsuario();
                String user = "";
                String pass = "";
                String tipo = "";
                for (Usuarios use : lisUsers) {
                    user=use.getUsuario();
                    pass=use.getClave();
                    tipo=use.getTipo();
//                    if (txtUser.getText().equals(use.getUsuario()) && txtPassword.getText().equals(use.getClave()) && objD.getTipo().equals(use.getTipo())) {
//                        new GUIRegistrarCosulta().setVisible(true);
//                        dispose();
//                    } else if ((txtUser.getText().equals(use.getUsuario())) && (txtPassword.getText().equals(use.getClave())) && objS.getTipo().equals(use.getTipo())) {
//                        new principal().setVisible(true);
//                        dispose();
//                    }
                }
                if (txtUser.getText().equals(user)&&pswContrasena.getText().equals(pass)&&objD.getTipo().equals(tipo)) {
                new GUIRegistrarCosulta().setVisible(true);
                dispose();
                
            }else if(txtUser.getText().equals(user)&&pswContrasena.getText().equals(pass)&&objS.getTipo().equals(tipo)){
                new principal().setVisible(true);
                dispose();
            }else{
                JOptionPane.showMessageDialog(rootPane,"Usuario o contraseña incorrectos!!!", "Credenciales", 1);
            }
            }
        } catch (Exception ex) {
            System.err.print(ex);
        }
    }//GEN-LAST:event_jbIngresarMouseClicked

    private void jbIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(LogeoClDr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogeoClDr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogeoClDr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogeoClDr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogeoClDr().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton jbIngresar;
    private javax.swing.JPasswordField pswContrasena;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
