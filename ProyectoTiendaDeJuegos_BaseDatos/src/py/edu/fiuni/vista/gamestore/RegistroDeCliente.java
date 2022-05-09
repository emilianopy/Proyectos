/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.vista.gamestore;

import com.sun.jdi.connect.spi.Connection;
import py.edu.fiuni.modelo.gamestore.Cliente;
import py.edu.fiuni.modelo.gamestore.conectorDB;

/**
 *
 * @author HP
 */
public class RegistroDeCliente extends javax.swing.JFrame {

    /**
     * Creates new form RegistroDeCliente
     */
    public RegistroDeCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        lblGameStore1 = new javax.swing.JLabel();
        panelDeRegistro = new javax.swing.JPanel();
        panelContRegistro = new javax.swing.JPanel();
        lblCedulaIdentidad = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblApellido = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        lblNroTelefono = new javax.swing.JLabel();
        btnAgregarCliente = new javax.swing.JButton();
        txtNroCedula = new javax.swing.JTextField();
        sepNroCedula = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        sepNombre = new javax.swing.JSeparator();
        txtApellido = new javax.swing.JTextField();
        sepApellido = new javax.swing.JSeparator();
        txtDireccion = new javax.swing.JTextField();
        sepDireccion = new javax.swing.JSeparator();
        txtNroTelefono = new javax.swing.JTextField();
        sepNroTelefono = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(238, 112, 82));
        panelPrincipal.setLayout(new java.awt.BorderLayout());

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));
        panelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelLogo.setOpaque(false);
        panelLogo.setLayout(new java.awt.BorderLayout());

        lblGameStore1.setBackground(new java.awt.Color(255, 255, 255));
        lblGameStore1.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        lblGameStore1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameStore1.setText("Registrar Cliente");
        lblGameStore1.setToolTipText("");
        lblGameStore1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblGameStore1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelLogo.add(lblGameStore1, java.awt.BorderLayout.CENTER);

        panelPrincipal.add(panelLogo, java.awt.BorderLayout.NORTH);

        panelDeRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelDeRegistro.setLayout(new java.awt.BorderLayout());

        panelContRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelContRegistro.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCedulaIdentidad.setBackground(new java.awt.Color(255, 255, 255));
        lblCedulaIdentidad.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblCedulaIdentidad.setForeground(new java.awt.Color(238, 112, 82));
        lblCedulaIdentidad.setText("Cedula de Identidad: ");
        panelContRegistro.add(lblCedulaIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lblNombre.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(238, 112, 82));
        lblNombre.setText("Nombre: ");
        panelContRegistro.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 205, -1));

        lblApellido.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblApellido.setForeground(new java.awt.Color(238, 112, 82));
        lblApellido.setText("Apellido:");
        panelContRegistro.add(lblApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 205, -1));

        lblDireccion.setBackground(new java.awt.Color(255, 255, 255));
        lblDireccion.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblDireccion.setForeground(new java.awt.Color(238, 112, 82));
        lblDireccion.setText("Direccion:");
        panelContRegistro.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        lblNroTelefono.setBackground(new java.awt.Color(255, 255, 255));
        lblNroTelefono.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblNroTelefono.setForeground(new java.awt.Color(238, 112, 82));
        lblNroTelefono.setText("Numero de Telefono:");
        panelContRegistro.add(lblNroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, 33));

        btnAgregarCliente.setBackground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\agregarClaro.png")); // NOI18N
        btnAgregarCliente.setBorder(null);
        btnAgregarCliente.setBorderPainted(false);
        btnAgregarCliente.setContentAreaFilled(false);
        btnAgregarCliente.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\agregarOscuro.png")); // NOI18N
        btnAgregarCliente.setRolloverSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\agregarOscuro.png")); // NOI18N
        btnAgregarCliente.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\agregarOscuro.png")); // NOI18N
        btnAgregarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarClienteActionPerformed(evt);
            }
        });
        panelContRegistro.add(btnAgregarCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 56, 54));

        txtNroCedula.setForeground(new java.awt.Color(153, 153, 153));
        txtNroCedula.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNroCedula.setBorder(null);
        txtNroCedula.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panelContRegistro.add(txtNroCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, 30));
        panelContRegistro.add(sepNroCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 110, -1));

        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNombre.setBorder(null);
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panelContRegistro.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 70, 110, 30));
        panelContRegistro.add(sepNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 102, 110, 10));

        txtApellido.setForeground(new java.awt.Color(153, 153, 153));
        txtApellido.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtApellido.setBorder(null);
        txtApellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panelContRegistro.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 110, 30));
        panelContRegistro.add(sepApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 110, 20));

        txtDireccion.setForeground(new java.awt.Color(153, 153, 153));
        txtDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtDireccion.setBorder(null);
        txtDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panelContRegistro.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 110, 30));
        panelContRegistro.add(sepDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 110, 20));

        txtNroTelefono.setForeground(new java.awt.Color(153, 153, 153));
        txtNroTelefono.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtNroTelefono.setBorder(null);
        txtNroTelefono.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        panelContRegistro.add(txtNroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 110, 30));
        panelContRegistro.add(sepNroTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 110, 10));

        panelDeRegistro.add(panelContRegistro, java.awt.BorderLayout.CENTER);

        panelPrincipal.add(panelDeRegistro, java.awt.BorderLayout.CENTER);

        getContentPane().add(panelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarClienteActionPerformed
        Cliente nuevoCliente = new Cliente(txtNroCedula.getText(), txtNombre.getText(), txtApellido.getText(), txtDireccion.getText(), txtNroTelefono.getText());
        nuevoCliente.guardar();
    }//GEN-LAST:event_btnAgregarClienteActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(RegistroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroDeCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeCliente().setVisible(true);

                Cliente emiliano = new Cliente("5900978", "Emilianoooo", "Miranda", "NN", "0985153710");
                emiliano.guardar();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarCliente;
    private javax.swing.JLabel lblApellido;
    private javax.swing.JLabel lblCedulaIdentidad;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblGameStore1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNroTelefono;
    private javax.swing.JPanel panelContRegistro;
    private javax.swing.JPanel panelDeRegistro;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JSeparator sepApellido;
    private javax.swing.JSeparator sepDireccion;
    private javax.swing.JSeparator sepNombre;
    private javax.swing.JSeparator sepNroCedula;
    private javax.swing.JSeparator sepNroTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNroCedula;
    private javax.swing.JTextField txtNroTelefono;
    // End of variables declaration//GEN-END:variables
   private conectorDB con = new conectorDB();
}
