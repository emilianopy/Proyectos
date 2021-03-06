/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.vista.gamestore;

import AppPackage.AnimationClass;

public class formPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form Tienda
     */
    public formPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        PanelPrincipal = new javax.swing.JPanel();
        panelCabecera = new javax.swing.JPanel();
        panelLogo = new javax.swing.JPanel();
        lblGameStore = new javax.swing.JLabel();
        panelCentro = new javax.swing.JPanel();
        ventas = new javax.swing.JButton();
        juego = new javax.swing.JButton();
        cliente = new javax.swing.JButton();
        informacionTienda = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        PanelPrincipal.setLayout(new java.awt.BorderLayout());

        panelCabecera.setBackground(new java.awt.Color(255, 255, 255));
        panelCabecera.setForeground(new java.awt.Color(255, 255, 255));
        panelCabecera.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelCabecera.setLayout(new java.awt.BorderLayout());

        panelLogo.setBackground(new java.awt.Color(255, 255, 255));
        panelLogo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelLogo.setOpaque(false);
        panelLogo.setLayout(new java.awt.BorderLayout());

        lblGameStore.setBackground(new java.awt.Color(255, 255, 255));
        lblGameStore.setFont(new java.awt.Font("Haettenschweiler", 0, 36)); // NOI18N
        lblGameStore.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblGameStore.setText("Game Store");
        lblGameStore.setToolTipText("");
        lblGameStore.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblGameStore.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        panelLogo.add(lblGameStore, java.awt.BorderLayout.CENTER);

        panelCabecera.add(panelLogo, java.awt.BorderLayout.CENTER);
        panelLogo.getAccessibleContext().setAccessibleName("");

        PanelPrincipal.add(panelCabecera, java.awt.BorderLayout.NORTH);

        panelCentro.setBackground(new java.awt.Color(255, 255, 255));
        panelCentro.setLayout(new java.awt.GridLayout(2, 2, 0, 30));

        ventas.setBackground(new java.awt.Color(255, 255, 255));
        ventas.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        ventas.setForeground(new java.awt.Color(135, 135, 135));
        ventas.setText("Ventas");
        ventas.setToolTipText("");
        ventas.setBorder(null);
        ventas.setBorderPainted(false);
        ventas.setContentAreaFilled(false);
        ventas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ventas.setDefaultCapable(false);
        ventas.setFocusable(false);
        ventas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        ventas.setIconTextGap(0);
        ventas.setMargin(new java.awt.Insets(2, 13, 2, 14));
        ventas.setMaximumSize(new java.awt.Dimension(12, 131));
        ventas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        ventas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ventasMouseClicked(evt);
            }
        });
        panelCentro.add(ventas);

        juego.setBackground(new java.awt.Color(255, 255, 255));
        juego.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        juego.setForeground(new java.awt.Color(135, 135, 135));
        juego.setText("Juegos");
        juego.setBorder(null);
        juego.setBorderPainted(false);
        juego.setContentAreaFilled(false);
        juego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        juego.setDefaultCapable(false);
        juego.setFocusable(false);
        juego.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        juego.setMargin(new java.awt.Insets(2, 13, 2, 14));
        juego.setMaximumSize(new java.awt.Dimension(12, 131));
        juego.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelCentro.add(juego);

        cliente.setBackground(new java.awt.Color(255, 255, 255));
        cliente.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        cliente.setForeground(new java.awt.Color(135, 135, 135));
        cliente.setText("Clientes");
        cliente.setBorder(null);
        cliente.setBorderPainted(false);
        cliente.setContentAreaFilled(false);
        cliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cliente.setDefaultCapable(false);
        cliente.setFocusable(false);
        cliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cliente.setMargin(new java.awt.Insets(2, 13, 2, 14));
        cliente.setMaximumSize(new java.awt.Dimension(12, 131));
        cliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelCentro.add(cliente);

        informacionTienda.setBackground(new java.awt.Color(255, 255, 255));
        informacionTienda.setFont(new java.awt.Font("Dubai Medium", 0, 18)); // NOI18N
        informacionTienda.setForeground(new java.awt.Color(135, 135, 135));
        informacionTienda.setText("Informacion de Tienda");
        informacionTienda.setBorder(null);
        informacionTienda.setBorderPainted(false);
        informacionTienda.setContentAreaFilled(false);
        informacionTienda.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        informacionTienda.setDefaultCapable(false);
        informacionTienda.setFocusable(false);
        informacionTienda.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        informacionTienda.setMargin(new java.awt.Insets(2, 13, 2, 14));
        informacionTienda.setMaximumSize(new java.awt.Dimension(12, 131));
        informacionTienda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        panelCentro.add(informacionTienda);

        PanelPrincipal.add(panelCentro, java.awt.BorderLayout.CENTER);

        getContentPane().add(PanelPrincipal, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ventasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ventasMouseClicked
       MenuVenta mnuVna = new MenuVenta();
       mnuVna.setVisible(true);
       dispose();
    }//GEN-LAST:event_ventasMouseClicked

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
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton cliente;
    private javax.swing.JButton informacionTienda;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton juego;
    private javax.swing.JLabel lblGameStore;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelCentro;
    private javax.swing.JPanel panelLogo;
    private javax.swing.JButton ventas;
    // End of variables declaration//GEN-END:variables
}
