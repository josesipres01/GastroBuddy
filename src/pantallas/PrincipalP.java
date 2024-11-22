/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pantallas;

import EnumPantalla.Pantalla;
import Main.VentanaPrincipal;
import config.Conexion;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author luisi
 */
public class PrincipalP extends javax.swing.JPanel {

    VentanaPrincipal ventana;
    
    static Conexion cn = new Conexion();
    /**
     * Creates new form PrincipalP
     */
    public PrincipalP(VentanaPrincipal v) throws SQLException {
        initComponents();
        this.ventana = v;
        checkEstado();
        
    }

    void checkEstado () throws SQLException{
        if (cn.getEstado()){
            labelEstado.setText("Estado de BD: Activo");
        }else{
            labelEstado.setText("Estado de BD: Inactiva");
        }
        cn.closeConnection();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnMeals = new javax.swing.JButton();
        btnStaff = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnStaffRoles = new javax.swing.JButton();
        btnMenuItems = new javax.swing.JButton();
        btnMealDishes = new javax.swing.JButton();
        btnSales = new javax.swing.JButton();
        btnCustomers = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelEstado = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelPrincipal.setBackground(new java.awt.Color(222, 247, 244));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        btnMeals.setFont(new java.awt.Font("Juicebox", 0, 32)); // NOI18N
        btnMeals.setForeground(new java.awt.Color(46, 46, 117));
        btnMeals.setText("MEALS");
        btnMeals.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMeals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMealsActionPerformed(evt);
            }
        });

        btnStaff.setFont(new java.awt.Font("Juicebox", 0, 32)); // NOI18N
        btnStaff.setForeground(new java.awt.Color(46, 46, 117));
        btnStaff.setText("STAFF");
        btnStaff.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStaff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Juicebox", 0, 32)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(46, 46, 117));
        btnMenu.setText("MENU");
        btnMenu.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnStaffRoles.setFont(new java.awt.Font("Juicebox", 0, 32)); // NOI18N
        btnStaffRoles.setForeground(new java.awt.Color(46, 46, 117));
        btnStaffRoles.setText("STAFF ROLES");
        btnStaffRoles.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnStaffRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStaffRolesActionPerformed(evt);
            }
        });

        btnMenuItems.setFont(new java.awt.Font("Juicebox", 0, 32)); // NOI18N
        btnMenuItems.setForeground(new java.awt.Color(46, 46, 117));
        btnMenuItems.setText("MENU ITEMS");
        btnMenuItems.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMenuItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuItemsActionPerformed(evt);
            }
        });

        btnMealDishes.setFont(new java.awt.Font("Juicebox", 0, 32)); // NOI18N
        btnMealDishes.setForeground(new java.awt.Color(46, 46, 117));
        btnMealDishes.setText("MEAL DISHES");
        btnMealDishes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnMealDishes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMealDishesActionPerformed(evt);
            }
        });

        btnSales.setFont(new java.awt.Font("Juicebox", 0, 32)); // NOI18N
        btnSales.setForeground(new java.awt.Color(46, 46, 117));
        btnSales.setText("SALES");
        btnSales.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnSales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalesActionPerformed(evt);
            }
        });

        btnCustomers.setFont(new java.awt.Font("Juicebox", 0, 32)); // NOI18N
        btnCustomers.setForeground(new java.awt.Color(46, 46, 117));
        btnCustomers.setText("CUSTOMERS");
        btnCustomers.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        btnCustomers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMeals, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenuItems, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnStaff, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMealDishes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCustomers, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStaffRoles, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnSales, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnMeals, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnMenuItems, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnMealDishes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnStaffRoles, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCustomers, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        panelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 512, 1100, -1));

        jPanel5.setBackground(new java.awt.Color(58, 58, 145));
        jPanel5.setFocusable(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        panelPrincipal.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 664, 1100, 80));

        jPanel2.setBackground(new java.awt.Color(80, 80, 201));
        jPanel2.setEnabled(false);
        jPanel2.setFocusable(false);

        labelEstado.setFont(new java.awt.Font("Juicebox", 0, 24)); // NOI18N
        labelEstado.setForeground(new java.awt.Color(255, 255, 255));

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salir-alt (2).png"))); // NOI18N
        btncerrar.setPreferredSize(new java.awt.Dimension(42, 42));
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(713, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        panelPrincipal.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 150));

        jPanel3.setBackground(new java.awt.Color(255, 153, 51));
        jPanel3.setEnabled(false);
        jPanel3.setFocusable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        panelPrincipal.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 409, 1100, -1));

        jPanel4.setBackground(new java.awt.Color(255, 153, 51));
        jPanel4.setEnabled(false);
        jPanel4.setFocusable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        panelPrincipal.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 246, 1100, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Calling Heart", 0, 128)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 255));
        jLabel1.setText(" Gastro Buddy ");
        jPanel6.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, 150));

        panelPrincipal.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 1100, 160));

        add(panelPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnMealsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMealsActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.MealsP);
    }//GEN-LAST:event_btnMealsActionPerformed

    private void btnStaffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.StaffP);
    }//GEN-LAST:event_btnStaffActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.MenusP);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnStaffRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStaffRolesActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.StaffRolesP);
    }//GEN-LAST:event_btnStaffRolesActionPerformed

    private void btnMenuItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuItemsActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.MenuItems);
    }//GEN-LAST:event_btnMenuItemsActionPerformed

    private void btnMealDishesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMealDishesActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.MealDishes);
    }//GEN-LAST:event_btnMealDishesActionPerformed

    private void btnSalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalesActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.Sales);
    }//GEN-LAST:event_btnSalesActionPerformed

    private void btnCustomersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomersActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.Customers);
    }//GEN-LAST:event_btnCustomersActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        // TODO add your handling code here:
        
        int confirm = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que deseas cerrar sesión?", "Cerrar Sesión", JOptionPane.YES_NO_OPTION);
                if (confirm == JOptionPane.YES_OPTION) {
                    ventana.dispose(); // Cierra la ventana actual
                    abrirLogin(); // Redirige al login
                }
    }//GEN-LAST:event_btncerrarActionPerformed

    private void abrirLogin() {
        // Crear un JFrame
        JFrame frame = new JFrame("Login Screen");
        
        // Crear una instancia del panel Login
        Login loginPanel = new Login();
        
        // Configurar el JFrame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Cerrar aplicación al cerrar ventana
        frame.setSize(1100, 750); // Tamaño del JFrame
        frame.setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        frame.setResizable(false); // Desactiva el redimensionamiento (y elimina el botón de maximizar)



        
        // Agregar el panel Login al JFrame
        frame.setContentPane(loginPanel);
        
        // Hacer visible el JFrame
        frame.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomers;
    private javax.swing.JButton btnMealDishes;
    private javax.swing.JButton btnMeals;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenuItems;
    private javax.swing.JButton btnSales;
    private javax.swing.JButton btnStaff;
    private javax.swing.JButton btnStaffRoles;
    private javax.swing.JButton btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel labelEstado;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
