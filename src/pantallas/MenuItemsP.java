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
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisi
 */
public class MenuItemsP extends javax.swing.JPanel {

    VentanaPrincipal ventana;
    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
    Map<Integer, String> hashMap = new HashMap<>();

    /**
     * Creates new form StaffP
     */
    public MenuItemsP(VentanaPrincipal v) {
        initComponents();
        this.ventana = v;
        listar();
        generarMenu();
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
        TablaDeDatosItems = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnNvoRegistro = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        cBoxMenuId = new javax.swing.JComboBox<>();

        panelPrincipal.setBackground(new java.awt.Color(81, 81, 201));

        jPanel1.setBackground(new java.awt.Color(81, 81, 201));

        TablaDeDatosItems.setBackground(new java.awt.Color(239, 239, 239));
        TablaDeDatosItems.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "menu_name", "name", "price", "description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDeDatosItems.setGridColor(new java.awt.Color(153, 153, 153));
        TablaDeDatosItems.setShowGrid(true);
        TablaDeDatosItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDeDatosItemsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDeDatosItems);

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
        jLabel1.setText("Menu Items ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("id");

        txtId.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("menu_name");

        txtName.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("name");

        txtPrice.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("price");

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

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("description");

        txtDescription.setEditable(false);

        cBoxMenuId.setEnabled(false);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnNvoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cBoxMenuId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cBoxMenuId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrice))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription)))
                .addGap(28, 28, 28))
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

    private void TablaDeDatosItemsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDeDatosItemsMouseClicked

         if (TablaDeDatosItems.isFocusable()) {
        int row = TablaDeDatosItems.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(null, "There is no row selected");
        } else {
            // Obtén los valores de las celdas de la fila seleccionada
            String id = TablaDeDatosItems.getValueAt(row, 0).toString();
            String menu_name = TablaDeDatosItems.getValueAt(row, 1).toString();
            String price = TablaDeDatosItems.getValueAt(row, 2).toString();
            String name = TablaDeDatosItems.getValueAt(row, 3).toString();
            String description = TablaDeDatosItems.getValueAt(row, 4).toString();

            // Asigna los valores obtenidos a los campos correspondientes
            txtId.setText(id);
            txtName.setText(price);
            txtPrice.setText(name);
            txtDescription.setText(description);

            // Para el ComboBox, si el nombre del menú ya está en el ComboBox, lo selecciona
            cBoxMenuId.setSelectedItem(menu_name);

            // Si necesitas obtener algún valor del hashMap relacionado con el `menu_name`
            // Si el `menu_name` es una clave del `hashMap`
            if (hashMap.containsKey(menu_name)) {
                cBoxMenuId.setSelectedItem(menu_name + " - " + hashMap.get(menu_name));
            } else {
                cBoxMenuId.setSelectedItem(menu_name); // De lo contrario, selecciona solo el nombre
            }
        }
    }
    }//GEN-LAST:event_TablaDeDatosItemsMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
int filaSeleccionada = TablaDeDatosItems.getSelectedRow();

// Validar si no se ha seleccionado ninguna fila
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "You must select a record to modify.", "Warning", JOptionPane.WARNING_MESSAGE);
            return; // Salir del método si no se selecciona ninguna fila
        }

// Obtener los datos de la fila seleccionada
        int id = (int) TablaDeDatosItems.getValueAt(filaSeleccionada, 0); // ID en la primera columna
        String menu_name = TablaDeDatosItems.getValueAt(filaSeleccionada, 1).toString();
        String nameItem = TablaDeDatosItems.getValueAt(filaSeleccionada, 2).toString();
        String description = TablaDeDatosItems.getValueAt(filaSeleccionada, 4).toString();
        double price = (Double) TablaDeDatosItems.getValueAt(filaSeleccionada, 3); // Precio del ítem

// Crear el diálogo de modificación con los datos obtenidos
        Frame parentFrame = (Frame) SwingUtilities.getWindowAncestor(this);
        ModificarMenuItems dialog = new ModificarMenuItems(parentFrame, model, this, id, menu_name, nameItem, description, price);
        dialog.setVisible(true); // Muestra el diálogo


    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        borrarRegistro();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNvoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNvoRegistroActionPerformed

    Frame parentFrame = (Frame) SwingUtilities.getWindowAncestor(this);
    AgregarMenuItems dialog = new AgregarMenuItems(parentFrame, model, this);
    dialog.setVisible(true); // Muestra el diálogo
    }//GEN-LAST:event_btnNvoRegistroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.PrincipalP);
    }//GEN-LAST:event_jButton1ActionPerformed

    void listar() {
    String sql = "SELECT m.id, l.name AS menu_name, m.name, m.price, m.description " +
                 "FROM menu_items m " +
                 "JOIN menu l ON l.id = m.menu_id;"; 
    try {
        con = cn.getConnection();
        st = con.createStatement();
        rs = st.executeQuery(sql);

        // Limpiar la tabla antes de agregar nuevos datos
        model = (DefaultTableModel) TablaDeDatosItems.getModel();
        model.setRowCount(0); // Limpia las filas existentes

        Object[] menuItems = new Object[5]; // Para almacenar las 5 columnas que seleccionas

        while (rs.next()) {
            menuItems[0] = rs.getInt("id");           
            menuItems[1] = rs.getString("menu_name"); 
            menuItems[2] = rs.getString("name");
            menuItems[3] = rs.getDouble("price");
            menuItems[4] = rs.getString("description"); 

            model.addRow(menuItems);
        }
        TablaDeDatosItems.setModel(model);
    } catch (Exception e) {
        e.printStackTrace(); // Para depurar cualquier excepción
    }
}



    void borrarRegistro() {
        if (!txtId.getText().equals("")) {
            BorrarConf bc = new BorrarConf(this.ventana, true);
            bc.setVisible(true);
            if (bc.getReturnStatus() == 1) {
                //
                int id = Integer.parseInt(txtId.getText());
                String sql = "DELETE FROM menu_items WHERE id=" + id;
                try {
                    con = cn.getConnection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Item Deleted");
                    limpiarTexts();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error deleting record: " + e.getMessage(), "Delete record", JOptionPane.ERROR_MESSAGE);
                }
                //
            }
        } else {
            JOptionPane.showMessageDialog(null, "The id field is empty, to delete a record an id is required.\nPlease try again.", "Delete record", JOptionPane.ERROR_MESSAGE);
        }
        actualizar();
    }

    void modificarRegistro() {
        if (txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "The id field is empty, to modify a record an id is required.\nPlease try again.", "Modify record", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int id = Integer.parseInt(txtId.getText());
                double price = Double.parseDouble(txtPrice.getText());
                String description = txtDescription.getText();
                String name = txtName.getText();
                //sql
                String sql = "UPDATE public.menu_items SET name='" + name + "', price='" + price + "', description='" + description + "' WHERE id=" + id + ";";
                con = cn.getConnection();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "¡Record modified successfully!", "Modify record", JOptionPane.INFORMATION_MESSAGE);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error modifying record: " + e.getMessage(), "Modify record", JOptionPane.ERROR_MESSAGE);
            }
        }
        actualizar();
    }

    public void generarMenu(){
        //
        try{
            Conexion cn = new Conexion();
            Connection con;
            Statement st;
            ResultSet rs;

            String sql = "SELECT id, name FROM menu ORDER BY id;";
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                cBoxMenuId.addItem(rs.getString(1) + "-" + rs.getString(2) );
                hashMap.put(rs.getInt(1), "-" + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    void limpiarTexts() {
        txtId.setText("");
        txtName.setText("");
        txtPrice.setText("");
    }

    void limpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < TablaDeDatosItems.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    void actualizar() {
        limpiarTabla(model);
        listar();
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDeDatosItems;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNvoRegistro;
    private javax.swing.JComboBox<String> cBoxMenuId;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
