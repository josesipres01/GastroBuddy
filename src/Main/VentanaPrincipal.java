/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Adds.Connect;
import EnumPantalla.Pantalla;
import config.Conexion;
import java.awt.IllegalComponentStateException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import pantallas.CustomersP;
import pantallas.Login;
import pantallas.MealDishesP;
import pantallas.MealsP;
import pantallas.MenuItemsP;
import pantallas.MenuP;
import pantallas.PrincipalP;
import pantallas.SalesP;
import pantallas.StaffP;
import pantallas.StaffRolesP;
import reportes.RCompCust;
import reportes.RVentasDia;
import reportes.RVenEmp;

/**
 *
 * @author Tona Scott Luis Fernando 222207980
 */
public class VentanaPrincipal extends javax.swing.JFrame {

        boolean principal = true;
   
    public VentanaPrincipal() {
            try {
                initComponents();
                setIconImage(new ImageIcon(getClass().getResource("/Recursos/gastroServerIcon.png")).getImage());
                setLocationRelativeTo(null);
                this.setContentPane(new PrincipalP(this));
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenidoActual = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GastroBuddy");
        setBackground(new java.awt.Color(222, 247, 244));
        setIconImages(null);
        setResizable(false);

        javax.swing.GroupLayout contenidoActualLayout = new javax.swing.GroupLayout(contenidoActual);
        contenidoActual.setLayout(contenidoActualLayout);
        contenidoActualLayout.setHorizontalGroup(
            contenidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1091, Short.MAX_VALUE)
        );
        contenidoActualLayout.setVerticalGroup(
            contenidoActualLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 729, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 255));

        jMenu1.setText("Archivo");

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem5.setText("Cerrar Sesion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Reportes");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("Ventas por dia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("Ventas por cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem3);

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.ALT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem4.setText("Ventas por empleado");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenidoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenidoActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        if(principal){
            RVentasDia rM1 = new RVentasDia(this,true);
            rM1.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if(principal){
            RCompCust rCompCust = new RCompCust(this,true);
            rCompCust.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        if(principal){
            RVenEmp venEmp = new RVenEmp(this,true);
            venEmp.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
         // Confirmar cierre de sesión
    int confirm = JOptionPane.showConfirmDialog(this, "Are you sure you want to log out?", "Log out", JOptionPane.YES_NO_OPTION);
    if (confirm == JOptionPane.YES_OPTION) {
        // Cerrar conexiones activas
        try {
            // Usar clase Conexion
            Conexion conexion = new Conexion(); // Instancia global si la tienes
            if (conexion.getEstado()) {
                conexion.cerrarConexion(); // Cerrar conexión
                System.out.println("Conexión cerrada correctamente.");
            }

            // Usar clase Connect
            if (Connect.connection != null && !Connect.connection.isClosed()) {
                Connect.connection.close(); // Cerrar conexión
                System.out.println("Conexión de Connect cerrada correctamente.");
            }
        } catch (SQLException ex) {
            System.err.println("[ERROR]: No fue posible cerrar la conexión.");
            ex.printStackTrace();
        }

        // Cerrar la ventana actual y redirigir al Login
        this.dispose(); // Cerrar la ventana actual

        // Crear una nueva instancia del Login
        JFrame loginFrame = new JFrame("Login Screen");
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar aplicación al cerrar ventana
        loginFrame.setSize(1100, 750); // Dimensiones del login
        loginFrame.setLocationRelativeTo(null); // Centrar en pantalla
        loginFrame.setResizable(false); // No permitir redimensionar

        Login loginPanel = new Login(); // Instancia del Login existente
        loginFrame.setContentPane(loginPanel); // Establecer el panel del Login
        loginFrame.setVisible(true); // Mostrar el login
    }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    public void actualizarContenido(JPanel panel){
        try {
            // Eliminamos el contenido anterior.
            if (this.contenidoActual != null) { this.remove(this.contenidoActual); }
            // Guardamos una referencia del nuevo contenido. 
            this.contenidoActual = panel;
            // Actualizamos el contenido en la ventana. 
            this.setContentPane(this.contenidoActual);
            // Obligamos a la ventana a reconstruir el contenido a mostrar. 
            this.revalidate();
            } catch (IllegalComponentStateException e) {
            System.err.println("[ERROR]: No fue posible establecer el contenido."); 
        }
    }
    
    /**
     * Establece nuevo contenido en pantalla segun el enum dado y despues ejecuta el metodo 
     * actualizarContenido() segun la pantalla seleccionada
     * @param p 
     */
    public void setPantalla(Pantalla p){
        if(p == Pantalla.PrincipalP){ try {
            this.actualizarContenido(new PrincipalP(this) ); principal=true;
            } catch (SQLException ex) {
                Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
 }
        if(p == Pantalla.MealsP){ this.actualizarContenido(new MealsP(this)); principal=false; }
        if(p == Pantalla.StaffP){ this.actualizarContenido(new StaffP(this)); principal=false; }
        if(p == Pantalla.MenusP){ this.actualizarContenido(new MenuP(this)); principal=false; }
        if(p == Pantalla.StaffRolesP){ this.actualizarContenido(new StaffRolesP(this)); principal=false; }
        if(p == Pantalla.Customers){ this.actualizarContenido(new CustomersP(this)); principal=false; }
        if(p == Pantalla.MealDishes){ this.actualizarContenido(new MealDishesP(this)); principal=false; }
        if(p == Pantalla.MenuItems){ this.actualizarContenido(new MenuItemsP(this)); principal=false; }
        if(p == Pantalla.Sales){ this.actualizarContenido(new SalesP(this)); principal=false; }
    }
    
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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenidoActual;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
