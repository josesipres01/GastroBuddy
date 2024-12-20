/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pantallas;

import Dialogos.BorrarConf;
import EnumPantalla.Pantalla;
import Main.VentanaPrincipal;
import config.Conexion;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisi
 */
public class StaffRolesP extends javax.swing.JPanel {

    VentanaPrincipal ventana;
    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;

    /**
     * Creates new form StaffP
     */
    public StaffRolesP(VentanaPrincipal v) {
        initComponents();
        this.ventana = v;
        listar();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDeDatosRoles = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        txtRoleName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtRoleDes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnNvoRegistro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        panelPrincipal.setBackground(new java.awt.Color(81, 81, 201));

        jPanel1.setBackground(new java.awt.Color(81, 81, 201));

        TablaDeDatosRoles.setBackground(new java.awt.Color(239, 239, 239));
        TablaDeDatosRoles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "code", "role_name", "role_description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDeDatosRoles.setGridColor(new java.awt.Color(153, 153, 153));
        TablaDeDatosRoles.setShowGrid(true);
        TablaDeDatosRoles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDeDatosRolesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDeDatosRoles);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnModificar.setBackground(new java.awt.Color(255, 153, 51));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBorrar.setBackground(new java.awt.Color(255, 153, 51));
        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calling Heart", 0, 86)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText(" STAFF Roles ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Code");

        txtCode.setEditable(false);

        txtRoleName.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("role_name");

        txtRoleDes.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("role_description");

        btnNvoRegistro.setBackground(new java.awt.Color(255, 153, 51));
        btnNvoRegistro.setText("Nuevo Registro");
        btnNvoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNvoRegistroActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(201, 201, 201)
                        .addComponent(jLabel1))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNvoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txtRoleName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtRoleDes, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(btnNvoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(239, 239, 239)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel3))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtRoleDes, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCode, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtRoleName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaDeDatosRolesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDeDatosRolesMouseClicked

        if (TablaDeDatosRoles.isFocusable()) {
            int row = TablaDeDatosRoles.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "There is no row selected");
            } else {
                String code = (String) TablaDeDatosRoles.getValueAt(row, 0).toString();
                String roleName = (String) TablaDeDatosRoles.getValueAt(row, 1);
                String roleDes = (String) TablaDeDatosRoles.getValueAt(row, 2);
                //String roleCode = (String) TablaDeDatosStaff.getValueAt(row, 3);
                txtCode.setText(code);
                txtRoleName.setText(roleName);
                txtRoleDes.setText(roleDes);
            }
        }
    }//GEN-LAST:event_TablaDeDatosRolesMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int filaSeleccionada = TablaDeDatosRoles.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Select a record to modify.", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtener datos del registro seleccionado
        int id = (int) TablaDeDatosRoles.getValueAt(filaSeleccionada, 0); // ID en la primera columna
        String roleName = TablaDeDatosRoles.getValueAt(filaSeleccionada, 1).toString();
        String description = TablaDeDatosRoles.getValueAt(filaSeleccionada, 2).toString();
        Frame parentFrame = (Frame) SwingUtilities.getWindowAncestor(this);
        ModificarRoles dialog = new ModificarRoles(parentFrame, model, this, id, roleName, description);
        dialog.setVisible(true); // Muestra el diálogo
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        borrarRegistro();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNvoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNvoRegistroActionPerformed

     Frame parentFrame = (Frame) SwingUtilities.getWindowAncestor(this);
     AgregarRoles dialog = new AgregarRoles(parentFrame, model, this);
     dialog.setVisible(true); // Muestra el diálogo
    }//GEN-LAST:event_btnNvoRegistroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.PrincipalP);
    }//GEN-LAST:event_jButton1ActionPerformed

    void listar() {
        String sql = "SELECT * FROM reff_staff_roles ORDER BY code;";
        try {
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] meals = new Object[5];
            model = (DefaultTableModel) TablaDeDatosRoles.getModel();
            while (rs.next()) {
                meals[0] = rs.getInt("code");
                meals[1] = rs.getString("role_name");
                meals[2] = rs.getString("role_description");
                model.addRow(meals);
            }
            TablaDeDatosRoles.setModel(model);
        } catch (Exception e) {

        }
    }



    void borrarRegistro() {
        if (!txtCode.getText().equals("")) {
            BorrarConf bc = new BorrarConf(this.ventana, true);
            bc.setVisible(true);
            if (bc.getReturnStatus() == 1) {
                //
                int code = Integer.parseInt(txtCode.getText());
                String sql = "DELETE FROM reff_staff_roles WHERE  code=" + code;
                try {
                    con = cn.getConnection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Role Deleted");
                    limpiarTexts();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error deleting record:  " + e.getMessage(), "Delete record", JOptionPane.ERROR_MESSAGE);
                }
                //
            }
        } else {
            JOptionPane.showMessageDialog(null, "The id field is empty, to delete a record an id is required.\nPlease try again.", "Delete record", JOptionPane.ERROR_MESSAGE);
        }
        actualizar();
    }

    void modificarRegistro() {
        if (txtCode.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "The id field is empty, to modify a record an id is required.\nPlease try again.", "Modify record", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // solicitando valores
                int code = Integer.parseInt(txtCode.getText());
                String roleDes = txtRoleDes.getText();
                String roleName = txtRoleName.getText();
                //sql
                String sql = "UPDATE reff_staff_roles SET role_name='" + roleName + "', role_description='" + roleDes + "' WHERE code=" + code + ";";
                con = cn.getConnection();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "¡Registration modified successfully!", "Modify record", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error modifying record: " + e.getMessage(), "Modify record", JOptionPane.ERROR_MESSAGE);
            }
        }
        actualizar();
    }

    void limpiarTexts() {
        txtCode.setText("");
        txtRoleDes.setText("");
        txtRoleName.setText("");
    }

    void limpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < TablaDeDatosRoles.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    void actualizar() {
        limpiarTabla(model);
        listar();
    }







    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDeDatosRoles;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNvoRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtRoleDes;
    private javax.swing.JTextField txtRoleName;
    // End of variables declaration//GEN-END:variables
}
