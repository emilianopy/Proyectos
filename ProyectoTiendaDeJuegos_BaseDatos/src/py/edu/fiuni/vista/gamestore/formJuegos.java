/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package py.edu.fiuni.vista.gamestore;

/**
 *
 * @author HP
 */
public class formJuegos extends javax.swing.JFrame {

    /**
     * Creates new form formJuegos
     */
    public formJuegos() {
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

        pnlCabecera = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lblCabecera = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        pnlBuscador = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtBuscador = new javax.swing.JTextPane();
        cboOpBuscar = new javax.swing.JComboBox<>();
        lblBuscarPor = new javax.swing.JLabel();
        btnEditar = new javax.swing.JButton();
        btnCargarJuego = new javax.swing.JButton();
        btnEliminarJuego = new javax.swing.JButton();
        pnlTabla = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDatosJuego = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        pnlCabecera.setBackground(new java.awt.Color(255, 255, 255));
        pnlCabecera.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        pnlCabecera.add(jPanel1, java.awt.BorderLayout.NORTH);

        lblCabecera.setBackground(new java.awt.Color(255, 255, 255));
        lblCabecera.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        lblCabecera.setForeground(new java.awt.Color(238, 112, 82));
        lblCabecera.setText("Formulario Juego");
        pnlCabecera.add(lblCabecera, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        pnlBuscador.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setViewportView(txtBuscador);

        cboOpBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nombre", "Codigo", "Tipo Consola" }));

        lblBuscarPor.setFont(new java.awt.Font("Calibri Light", 0, 18)); // NOI18N
        lblBuscarPor.setForeground(new java.awt.Color(234, 112, 82));
        lblBuscarPor.setText("Buscar por:");

        javax.swing.GroupLayout pnlBuscadorLayout = new javax.swing.GroupLayout(pnlBuscador);
        pnlBuscador.setLayout(pnlBuscadorLayout);
        pnlBuscadorLayout.setHorizontalGroup(
            pnlBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBuscadorLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblBuscarPor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboOpBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(328, Short.MAX_VALUE))
        );
        pnlBuscadorLayout.setVerticalGroup(
            pnlBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboOpBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblBuscarPor))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnEditar.setBackground(new java.awt.Color(255, 255, 255));
        btnEditar.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\editClaro.png")); // NOI18N
        btnEditar.setBorder(null);
        btnEditar.setBorderPainted(false);
        btnEditar.setContentAreaFilled(false);
        btnEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditar.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\editOscuro.png")); // NOI18N
        btnEditar.setRolloverSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\editOscuro.png")); // NOI18N
        btnEditar.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\editOscuro.png")); // NOI18N

        btnCargarJuego.setBackground(new java.awt.Color(255, 255, 255));
        btnCargarJuego.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\cargarJuegoClaro.png")); // NOI18N
        btnCargarJuego.setBorder(null);
        btnCargarJuego.setBorderPainted(false);
        btnCargarJuego.setContentAreaFilled(false);
        btnCargarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCargarJuego.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\cargarJuegoOscuro.png")); // NOI18N
        btnCargarJuego.setRolloverSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\cargarJuegoOscuro.png")); // NOI18N
        btnCargarJuego.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\cargarJuegoOscuro.png")); // NOI18N
        btnCargarJuego.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCargarJuegoMouseClicked(evt);
            }
        });

        btnEliminarJuego.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminarJuego.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\deleteClaro.png")); // NOI18N
        btnEliminarJuego.setBorder(null);
        btnEliminarJuego.setBorderPainted(false);
        btnEliminarJuego.setContentAreaFilled(false);
        btnEliminarJuego.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarJuego.setRolloverIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\deleteOscuro.png")); // NOI18N
        btnEliminarJuego.setRolloverSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\deleteOscuro.png")); // NOI18N
        btnEliminarJuego.setSelectedIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Documents\\NetBeansProjects\\ProyectoTiendaDeJuegos\\src\\ImagenesParaElProyecto\\deleteOscuro.png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(692, Short.MAX_VALUE)
                .addComponent(btnCargarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEliminarJuego)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(pnlBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(btnCargarJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEditar)
                    .addComponent(btnEliminarJuego))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlCabecera.add(jPanel2, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlCabecera, java.awt.BorderLayout.NORTH);

        pnlTabla.setBackground(new java.awt.Color(255, 255, 255));
        pnlTabla.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Juego", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Calibri Light", 0, 18), new java.awt.Color(238, 112, 82))); // NOI18N

        tblDatosJuego.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblDatosJuego);

        javax.swing.GroupLayout pnlTablaLayout = new javax.swing.GroupLayout(pnlTabla);
        pnlTabla.setLayout(pnlTablaLayout);
        pnlTablaLayout.setHorizontalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
        );
        pnlTablaLayout.setVerticalGroup(
            pnlTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTablaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        getContentPane().add(pnlTabla, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarJuegoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCargarJuegoMouseClicked
        CargarJuego crgJuego = new CargarJuego();
        crgJuego.setVisible(true);
        
    }//GEN-LAST:event_btnCargarJuegoMouseClicked

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
            java.util.logging.Logger.getLogger(formJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formJuegos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formJuegos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargarJuego;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminarJuego;
    private javax.swing.JComboBox<String> cboOpBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblBuscarPor;
    private javax.swing.JLabel lblCabecera;
    private javax.swing.JPanel pnlBuscador;
    private javax.swing.JPanel pnlCabecera;
    private javax.swing.JPanel pnlTabla;
    private javax.swing.JTable tblDatosJuego;
    private javax.swing.JTextPane txtBuscador;
    // End of variables declaration//GEN-END:variables
}
