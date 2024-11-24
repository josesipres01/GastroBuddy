/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pantallas;

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
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joses
 */
public class ModificarSales extends javax.swing.JDialog {

    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
     private DefaultTableModel tableModel; 
     private final SalesP sales;
    private final int id;
    /**
     * Creates new form AgregarSales
     */
    public ModificarSales(Frame parent,DefaultTableModel tableModel, SalesP sales, int id, Double amount, int idMeals, String staffName, String customerName,String dateOfMeal) {
       super(parent, "New Registration", true); 
        this.tableModel = tableModel; 
        this.sales = sales;
        this.id=id;
        initComponents();
        poblarComboBoxes(); // Llama al método para llenar los combos      
        
        // Rellenar los campos de texto con los valores recibidos
        txtAmount.setText(amount.toString());  // Establecer el valor del monto
        this.dateOfMeal.setText(dateOfMeal);
        // Rellenar el JComboBox para el nombre del personal (staffName)
        comboStaff.setSelectedItem(staffName);  // Asumiendo que comboBoxStaffName es un JComboBox
        // Rellenar el JComboBox para el nombre del cliente (customerName)
        comboCustomer.setSelectedItem(customerName);  // Asumiendo que comboBoxCustomerName es un JComboBox

        // Si el campo `idMeals` se usa de alguna forma, puedes asignarlo también, por ejemplo:
        setComboBoxSelection(comboMeals, idMeals);

        
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
        javax.swing.JLabel jLabel25 = new javax.swing.JLabel();
        javax.swing.JButton btnAgregar7 = new javax.swing.JButton();
        javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel22 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        dateOfMeal = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel26 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboStaff = new javax.swing.JComboBox<>();
        comboMeals = new javax.swing.JComboBox<>();
        comboCustomer = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        jPanel1.setBackground(new java.awt.Color(81, 81, 201));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("staff_name");

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
        jLabel24.setText(" New Sale");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Amount");

        txtAmount.setFocusCycleRoot(true);
        txtAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAmountActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("id_meals");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("date_of_meal");

        dateOfMeal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        dateOfMeal.setToolTipText("Año-Mes-Dia");
        dateOfMeal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("customer_name");

        jLabel2.setText("2024-12-31");

        comboStaff.setModel(new javax.swing.DefaultComboBoxModel<>());

        comboMeals.setModel(new javax.swing.DefaultComboBoxModel<>());

        comboCustomer.setModel(new javax.swing.DefaultComboBoxModel<>());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(comboMeals, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel26)
                                        .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(55, 55, 55)
                                    .addComponent(btnAgregar7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel22)
                                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(40, 40, 40)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(dateOfMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))))
                            .addComponent(jLabel25)
                            .addComponent(comboStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(59, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dateOfMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(12, 12, 12)
                        .addComponent(comboMeals, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboStaff, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
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
        try {
            // TODO add your handling code here:
            guardarCambios();
        } catch (ParseException ex) {
            Logger.getLogger(ModificarSales.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAgregar7ActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAmountActionPerformed

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
       
            }
        });
    }
   
void guardarCambios() throws ParseException {
    // Validación de Amount: asegurarse de que es un número
    String amountText = txtAmount.getText().trim();
    if (amountText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Amount is required.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    Double amount = null;
    try {
        amount = Double.parseDouble(amountText); // Validación explícita para Amount
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Amount must be a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener la fecha de la comida
    String dateOfMeal = this.dateOfMeal.getText().trim();
    if (!isValidDate(dateOfMeal)) {
        JOptionPane.showMessageDialog(this, "Invalid date format. Please use yyyy-MM-dd.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener los objetos seleccionados de los JComboBox
    ComboBoxItem selectedStaff = (ComboBoxItem) comboStaff.getSelectedItem();
    ComboBoxItem selectedCustomer = (ComboBoxItem) comboCustomer.getSelectedItem();
    ComboBoxItem selectedMeal = (ComboBoxItem) comboMeals.getSelectedItem();

    // Validar que se haya seleccionado algo en los JComboBox
    if (selectedStaff == null || selectedCustomer == null || this.dateOfMeal.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int staffId = selectedStaff.getId();
    String staffName = selectedStaff.getNombre();
    int customerId = selectedCustomer.getId();
    String customerName = selectedCustomer.getNombre();
    int mealId = selectedMeal.getId();

    // Parsear la fecha de la comida
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    Date dateOfMealDate = dateFormat.parse(dateOfMeal);

    Connection con = null; // Inicializar conexión
    try {
        con = cn.getConnection(); // Obtener la conexión

        // Validar si la conexión es nula o está cerrada
        if (con == null || con.isClosed()) {
            JOptionPane.showMessageDialog(this, "Database connection is closed or not available.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar el registro en la base de datos
        String sql = "UPDATE sales SET amount=?, id_meals=?, id_staff=?, id_customer=?, date_of_meal=? WHERE id = ?;";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setDouble(1, amount);
        pst.setInt(2, mealId);
        pst.setInt(3, staffId);
        pst.setInt(4, customerId);
        pst.setDate(5, new java.sql.Date(dateOfMealDate.getTime())); // Convertir la fecha a java.sql.Date
        pst.setInt(6, this.id); // Usar el atributo `id`

        int filasAfectadas = pst.executeUpdate();

        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Registration updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Actualizar la tabla principal
            actualizarTabla(this.id, staffName, customerName, amount, dateOfMeal);

            // Cerrar la ventana
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Asegurarse de cerrar la conexión
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

// Método para validar la fecha con formato yyyy-MM-dd
private boolean isValidDate(String date) {
    // Expresión regular para el formato yyyy-MM-dd
    String regex = "^\\d{4}-\\d{2}-\\d{2}$";
    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(date);
    return matcher.matches();
}




void actualizarTabla(int id, String staffName, String customerName, Double amount, String dateOfMeal) {
    if (tableModel == null) {
        JOptionPane.showMessageDialog(this, "Table model is not initialized.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Buscar el registro en la tabla y actualizar los valores
    for (int i = 0; i < tableModel.getRowCount(); i++) {
        int rowId = (int) tableModel.getValueAt(i, 0); // Suponiendo que el ID está en la columna 0
        if (rowId == id) {
            tableModel.setValueAt(staffName, i, 3);  // Nombre del staff en la columna 3
            tableModel.setValueAt(customerName, i, 4);  // Nombre del cliente en la columna 4
            tableModel.setValueAt(amount, i, 1);  // Monto en la columna 1
            tableModel.setValueAt(dateOfMeal, i, 5);  // Fecha en la columna 5

        }
    }
}





private void poblarComboBoxes() {
    Connection con = null;
    PreparedStatement pstStaff = null;
    PreparedStatement pstCustomer = null;
    PreparedStatement pstMeals = null;
    ResultSet rsStaff = null;
    ResultSet rsCustomer = null;
    ResultSet rsMeals = null;

    try {
        con = cn.getConnection();
        if (con == null) {
            System.out.println("Error: The connection to the database could not be established.");
            return;
        }

        // Poblar JComboBox para "Staff"
        String sqlStaff = "SELECT id, first_name FROM staff";
        pstStaff = con.prepareStatement(sqlStaff);
        rsStaff = pstStaff.executeQuery();
        while (rsStaff.next()) {
            int id = rsStaff.getInt("id");
            String nombre = rsStaff.getString("first_name");
            comboStaff.addItem(new ComboBoxItem(id, nombre));
            System.out.println("Staff agregado: ID = " + id + ", Nombre = " + nombre);
        }

        // Poblar JComboBox para "Customers"
        String sqlCustomer = "SELECT id, name FROM customers";
        pstCustomer = con.prepareStatement(sqlCustomer);
        rsCustomer = pstCustomer.executeQuery();
        while (rsCustomer.next()) {
            int id = rsCustomer.getInt("id");
            String nombre = rsCustomer.getString("name");
            comboCustomer.addItem(new ComboBoxItem(id, nombre));
            System.out.println("Cliente agregado: ID = " + id + ", Nombre = " + nombre);
        }

        // Poblar JComboBox para "Meals"
        String sqlMeals = "SELECT id FROM meals";
        pstMeals = con.prepareStatement(sqlMeals);
        rsMeals = pstMeals.executeQuery();
        while (rsMeals.next()) {
            int id = rsMeals.getInt("id");
            comboMeals.addItem(new ComboBoxItem(id, "ID: " + id)); // El texto será "ID: {id}"
            System.out.println("Comida agregada: ID = " + id);
        }

    } catch (SQLException e) {
        System.out.println("Error al poblar los ComboBox: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error filling ComboBox: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (rsStaff != null) rsStaff.close();
            if (pstStaff != null) pstStaff.close();
            if (rsCustomer != null) rsCustomer.close();
            if (pstCustomer != null) pstCustomer.close();
            if (rsMeals != null) rsMeals.close();
            if (pstMeals != null) pstMeals.close();
            if (con != null && !con.isClosed()) con.close();
        } catch (SQLException e) {
            System.out.println("Connection closing error: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Connection closing error:  " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

private void setComboBoxSelection(JComboBox<ComboBoxItem> comboBox, int idToSelect) {
    for (int i = 0; i < comboBox.getItemCount(); i++) {
        ComboBoxItem item = comboBox.getItemAt(i);
        if (item.getId() == idToSelect) { // Comparar por ID
            comboBox.setSelectedIndex(i);
            return;
        }
    }
    // Si no se encuentra, puedes manejarlo:
    JOptionPane.showMessageDialog(this, "No matching item found in the combo box.", "Warning", JOptionPane.WARNING_MESSAGE);
}







    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<ComboBoxItem
    > comboCustomer;
    private javax.swing.JComboBox<ComboBoxItem> comboMeals;
    private javax.swing.JComboBox<ComboBoxItem> comboStaff;
    private javax.swing.JFormattedTextField dateOfMeal;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtAmount;
    // End of variables declaration//GEN-END:variables
}
