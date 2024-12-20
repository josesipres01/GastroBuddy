/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pantallas;

import static Adds.Connect.connection;
import config.ComboBoxItem;
import config.Conexion;
import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joses
 */
public class ModificarMeals extends javax.swing.JDialog {

    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
     private DefaultTableModel tableModel; 
     private final MealsP meals;
     Map<Integer, String> mStaff = new HashMap<>();
    Map<Integer, String> mCliente = new HashMap<>();
    private final int id;
    private final String staffName;
    private final String customerName;
    private final double costOfMeal;
    private final String dateOfMeal;
  

    /**
     * Creates new form AgregarMeals
     */
    public ModificarMeals(Frame parent, DefaultTableModel tableModel, MealsP meals, int id, String staffName, String customerName, String dateOfMeal, double costOfMeal) {
        super(parent, "New Registration", true); 
        this.model = tableModel;
        this.id = id; 
        this.meals = meals; 
        this.staffName = staffName; 
        this.customerName = customerName;
        this.dateOfMeal = dateOfMeal; 
        this.costOfMeal= costOfMeal;
        initComponents();
        generarMenus();
        
        // Llenar los campos con los datos pasados al constructor
        jForDateofmeal.setText(dateOfMeal);
        txtCostofmeal.setText(String.valueOf(costOfMeal));
        
         // Rellenar el JComboBox para el nombre del personal (staffName)
        cBoxStaffId.setSelectedItem(staffName);
        // Rellenar el JComboBox para el nombre del cliente (customerName)
        cBoxCustId.setSelectedItem(customerName);
        // Si el campo `idMeals` se usa de alguna forma, puedes asignarlo también, por ejemplo:


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
        cBoxStaffId = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        jForDateofmeal = new javax.swing.JFormattedTextField();
        txtCostofmeal = new javax.swing.JTextField();
        cBoxCustId = new javax.swing.JComboBox<>();
        javax.swing.JLabel jLabel25 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        javax.swing.JButton btnAgregar7 = new javax.swing.JButton();
        javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        jPanel1.setBackground(new java.awt.Color(81, 81, 201));

        cBoxStaffId.setModel(new javax.swing.DefaultComboBoxModel<>());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("staff_id");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("date_of_meal");

        jForDateofmeal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jForDateofmeal.setToolTipText("Año-Mes-Dia");
        jForDateofmeal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jForDateofmealFocusLost(evt);
            }
        });
        jForDateofmeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jForDateofmealActionPerformed(evt);
            }
        });

        txtCostofmeal.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCostofmealFocusLost(evt);
            }
        });

        cBoxCustId.setModel(new javax.swing.DefaultComboBoxModel<>());
        cBoxCustId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxCustIdActionPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("cost_of_meal");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("customers_id");

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
        jLabel24.setText(" New Meal");

        jLabel1.setText("2024-12-31");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnAgregar7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jForDateofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtCostofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cBoxCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel3)
                                        .addComponent(cBoxStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel25))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(40, 40, 40)
                                            .addComponent(jLabel4))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(76, 76, 76)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(37, 37, 37))))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cBoxStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jForDateofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(25, 25, 25)))
                .addComponent(cBoxCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel25)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCostofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(btnAgregar7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cBoxCustIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxCustIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxCustIdActionPerformed

    private void btnAgregar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar7ActionPerformed
        // TODO add your handling code here:
        guardarCambios();
    }//GEN-LAST:event_btnAgregar7ActionPerformed

    private void jForDateofmealFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jForDateofmealFocusLost
        // TODO add your handling code here:     
         
           
    }//GEN-LAST:event_jForDateofmealFocusLost

    private void jForDateofmealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jForDateofmealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jForDateofmealActionPerformed

    private void txtCostofmealFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCostofmealFocusLost
      
    

    }//GEN-LAST:event_txtCostofmealFocusLost

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
    // Obtener los objetos seleccionados de los JComboBox
    ComboBoxItem selectedStaff = (ComboBoxItem) cBoxStaffId.getSelectedItem();  // Obtener staff seleccionado
    ComboBoxItem selectedCustomer = (ComboBoxItem) cBoxCustId.getSelectedItem();  // Obtener customer seleccionado

    // Validar que los JComboBox no estén vacíos
    if (selectedCustomer == null || selectedStaff == null) {
        JOptionPane.showMessageDialog(this, "Staff and Customer must be selected.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener los valores de meal_id y item_id
    int customerId = selectedCustomer.getId();  // Obtención del ID del customer seleccionado
    int staffId = selectedStaff.getId();  // Obtención del ID del staff seleccionado
    String staffName = selectedStaff.getNombre();
    String customerName = selectedCustomer.getNombre();

    // Obtener los valores adicionales de la comida
    String dateOfMeal = jForDateofmeal.getText().trim(); // Asumiendo que hay un campo de texto para la fecha
    String costOfMealText = txtCostofmeal.getText().trim(); // Campo de texto para el costo

    // Verificar que la fecha y el costo sean válidos
    if (dateOfMeal.isEmpty() || costOfMealText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields must be filled out.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int costOfMeal = 0;
    try {
        costOfMeal = Integer.parseInt(costOfMealText);  // Convertir el costo de la comida a entero
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Cost must be a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Conexión a la base de datos
    Connection con = null;
    try {
        con = cn.getConnection();  // Obtener la conexión a la base de datos

        // Verificar que la conexión sea válida
        if (con == null || con.isClosed()) {
            JOptionPane.showMessageDialog(this, "Database connection is closed or not available.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // SQL para actualizar el registro en la base de datos
        String sql = "UPDATE meals SET date_of_meal=?, cost_of_meal=?, customers_id=?, staff_id=? WHERE id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, dateOfMeal);
        pst.setInt(2, costOfMeal);
        pst.setInt(3, customerId);
        pst.setInt(4, staffId);
        pst.setInt(5, this.id);

        int filasAfectadas = pst.executeUpdate();  // Ejecutar la actualización

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Registration updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Actualizar la tabla principal (opcional)
            actualizarTabla(id, staffName, customerName, dateOfMeal, costOfMeal);
            // Cerrar la ventana de modificación
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



      void generarMenus(){
        generarMenuStaff();
        generarMenuClientes();
    }
      
  void generarMenuStaff() {
    try {
        Conexion cn = new Conexion();
        Connection con = cn.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT id, first_name, last_name FROM staff ORDER BY id;");

        while (rs.next()) {
            int id = rs.getInt(1);  // ID del staff
            String fullName = rs.getString(2) + " " + rs.getString(3);  // Nombre completo

            // Crear ComboBoxItem y agregarlo al JComboBox
            ComboBoxItem staffItem = new ComboBoxItem(id, fullName);
            cBoxStaffId.addItem(staffItem);
            mStaff.put(id, fullName);  // Si necesitas almacenar los nombres por ID
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

void generarMenuClientes() {
    try {
        Conexion cn = new Conexion();
        Connection con = cn.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("SELECT id, name FROM customers ORDER BY id;");

        while (rs.next()) {
            int id = rs.getInt(1);  // ID del cliente
            String name = rs.getString(2);  // Nombre del cliente

            // Crear ComboBoxItem y agregarlo al JComboBox
            ComboBoxItem customerItem = new ComboBoxItem(id, name);
            cBoxCustId.addItem(customerItem);
            mCliente.put(id, name);  // Si necesitas almacenar los nombres por ID
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
}

  
    
   void actualizarTabla(int id, String staffName, String customerName, String dateOfMeal, int costOfMeal) {
   

    // Buscar la fila con el ID correspondiente y actualizar los valores
    for (int i = 0; i < model.getRowCount(); i++) {
        int tableId = (int) model.getValueAt(i, 0);  // Obtener el ID de la primera columna

        if (tableId == id) {
            // Actualizar las celdas correspondientes con los nuevos valores
            model.setValueAt(staffName, i, 1);  // Actualizar staffName
            model.setValueAt(customerName, i, 2);  // Actualizar customerName
            model.setValueAt(dateOfMeal, i, 3);  // Actualizar dateOfMeal
            model.setValueAt(costOfMeal, i, 4);  // Actualizar costOfMeal
            break;  // Terminar el ciclo una vez que se haya actualizado la fila
        }
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<ComboBoxItem> cBoxCustId;
    private javax.swing.JComboBox<ComboBoxItem> cBoxStaffId;
    private javax.swing.JFormattedTextField jForDateofmeal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCostofmeal;
    // End of variables declaration//GEN-END:variables
}
