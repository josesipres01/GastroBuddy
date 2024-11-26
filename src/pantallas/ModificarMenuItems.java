/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pantallas;

import config.Conexion;
import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joses
 */
public class ModificarMenuItems extends javax.swing.JDialog {
       
     Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
     private DefaultTableModel tableModel; 
     private final MenuItemsP items;
     Map<Integer, String> hashMap = new HashMap<>();
    private final int id;
    private final String menu_name;
    private final String description;
    private final double price;
    private final String nameItem;

    /**
     * Creates new form AgregarMenuItems
     */
    public ModificarMenuItems(Frame parent, DefaultTableModel tableModel, MenuItemsP items, int id, String menu_name, String nameItem, String description, double price) {
        super(parent, "New Registration", true); // Usando parent como Frame
        this.tableModel = tableModel; // Inicializar el modelo de la tabla
        this.items = items; 
        this.id = id;
        this.menu_name = menu_name;
        this.description = description;
        this.price = price;
        this.nameItem= nameItem;
        

        initComponents();
        generarMenus();
        
        txtName.setText(nameItem);
        txtPrice.setText(String.valueOf(price));
        
        cBoxMenuId.setSelectedItem(menu_name);
        txtDescription.setText(description);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        javax.swing.JButton btnAgregar7 = new javax.swing.JButton();
        javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        javax.swing.JLabel jLabel25 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        cBoxMenuId = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        jPanel1.setBackground(new java.awt.Color(81, 81, 201));

        btnAgregar7.setBackground(new java.awt.Color(255, 153, 51));
        btnAgregar7.setText("Guardar");
        btnAgregar7.setFocusable(false);
        btnAgregar7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregar7ActionPerformed(evt);
            }
        });

        jLabel24.setBackground(new java.awt.Color(255, 153, 51));
        jLabel24.setFont(new java.awt.Font("Calling Heart", 0, 86)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 153, 51));
        jLabel24.setText(" New Item");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("description");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("price");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("name");

        cBoxMenuId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Menu_id");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(6, 6, 6)
                            .addComponent(btnAgregar7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel3)
                                .addComponent(cBoxMenuId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(40, 40, 40)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(txtDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel25))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescription))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cBoxMenuId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar7ActionPerformed
        // TODO add your handling code here:
        guardarCambios();
    }//GEN-LAST:event_btnAgregar7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       
            }
        });
    }
    
void guardarCambios() {
    // Obtener el valor seleccionado del JComboBox
    String selectedMenu = (String) cBoxMenuId.getSelectedItem();

    // Validar que el valor no sea nulo o vacío
    if (selectedMenu == null || selectedMenu.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Menu must be selected.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Extraer el ID del menú del formato "id-nameMenu"
    int menuId = Integer.parseInt(selectedMenu.split("-")[0]);

    // Obtener los demás valores desde los campos del formulario
    String name = txtName.getText();
    String description = txtDescription.getText();
    double price = 0;

    // Validar el campo de precio
    try {
        price = Double.parseDouble(txtPrice.getText());

        // Validar que el precio no sea negativo
        if (price < 0) {
            JOptionPane.showMessageDialog(this, "The price cannot be negative.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "The price must be a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que los campos obligatorios no estén vacíos
    if (name.isEmpty() || description.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Verificar si la fila con el ID existe
    Connection con = null;
    try {
        con = cn.getConnection();  // Obtener la conexión a la base de datos

        // Verificar que la conexión es válida
        if (con == null || con.isClosed()) {
            JOptionPane.showMessageDialog(this, "Database connection is closed or not available.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar el registro en la base de datos
        String sql = "UPDATE menu_items SET menu_id=?, name=?, description=?, price=? WHERE id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1, menuId);  // Establecer el ID del menú
        pst.setString(2, name);  // Establecer el nombre del ítem
        pst.setString(3, description);  // Establecer la descripción
        pst.setDouble(4, price);  // Establecer el precio
        pst.setInt(5, this.id);  // ID del item a actualizar

        int filasAfectadas = pst.executeUpdate();  // Ejecutar la actualización

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Menu item updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Actualizar la tabla principal
            actualizarTabla(menuId, name, description, price);
            // Cerrar la ventana
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update record. Please check the provided information.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        if (con != null) {
            try {
                con.close();  // Asegurarse de cerrar la conexión
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}


void generarMenus() {
    generarMenu();
}

public void generarMenu() {
    try {
        Conexion cn = new Conexion();
        Connection con;
        Statement st;
        ResultSet rs;

        String sql = "SELECT id, name FROM menu ORDER BY id;";
        con = cn.getConnection();
        st = con.createStatement();
        rs = st.executeQuery(sql);

        while (rs.next()) {
            cBoxMenuId.addItem(rs.getString(1) + "-" + rs.getString(2));
            hashMap.put(rs.getInt(1), "-" + rs.getString(2));
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

void actualizarTabla(int menuId, String name, String description, double price) {
    for (int i = 0; i < tableModel.getRowCount(); i++) {
        int tableId = (int) tableModel.getValueAt(i, 0); // ID en la primera columna
        if (tableId == id) { // Coincidir el ID
            tableModel.setValueAt(obtenerNombreMenu(menuId), i, 1); // Actualizar menú (ID y nombre)
            tableModel.setValueAt(name, i, 2); // Actualizar nombre del ítem
            tableModel.setValueAt(price, i, 3); // Actualizar precio
            tableModel.setValueAt(description, i, 4); // Actualizar descripción

            break;
        }
    }
}

private String obtenerNombreMenu(int menuId) {
    String menuName = "";
    try (Connection con = cn.getConnection();
         PreparedStatement pst = con.prepareStatement("SELECT name FROM menu WHERE id = ?")) {
        pst.setInt(1, menuId);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            menuName = rs.getString("name");
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return menuName;
}



    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cBoxMenuId;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
