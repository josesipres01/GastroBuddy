/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pantallas;

import static Adds.Connect.connection;
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
public class AgregarMeals extends javax.swing.JDialog {

    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
     private DefaultTableModel tableModel; 
     private final MealsP meals;
     Map<Integer, String> mStaff = new HashMap<>();
    Map<Integer, String> mCliente = new HashMap<>();
  

    /**
     * Creates new form AgregarMeals
     */
    public AgregarMeals(Frame parent,DefaultTableModel tableModel, MealsP meals) {
        super(parent, "Nuevo Registro", true); 
        this.tableModel = model;
        this.meals = meals; 
        initComponents();
        generarMenus();

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

        cBoxStaffId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

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

        cBoxCustId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
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
        agregarRegistro();
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
    
void agregarRegistro() {
    boolean valid = true; // Control de validaciones

    // Validación del campo Cost of Meal
    if (txtCostofmeal.getText().trim().isEmpty()) {
        txtCostofmeal.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        JOptionPane.showMessageDialog(null, "El campo 'cost of meal' es obligatorio.", "Validación", JOptionPane.ERROR_MESSAGE);
        valid = false;
    } else {
        try {
            double costOfMeal = Double.parseDouble(txtCostofmeal.getText().trim());
            if (costOfMeal < 0) {
                throw new IllegalArgumentException("cost of meal no puede ser negativo.");
            }
            txtCostofmeal.setBorder(UIManager.getBorder("TextField.border")); // Restaurar borde original
        } catch (NumberFormatException e) {
            txtCostofmeal.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            JOptionPane.showMessageDialog(null, "El campo 'cost of meal' debe contener un número válido.", "Validación", JOptionPane.ERROR_MESSAGE);
            valid = false;
        } catch (IllegalArgumentException e) {
            txtCostofmeal.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            JOptionPane.showMessageDialog(null, e.getMessage(), "Validación", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
    }

    // Validación del ComboBox StaffId
    if (cBoxStaffId.getSelectedItem() == null || cBoxStaffId.getSelectedItem().toString().trim().isEmpty()) {
        cBoxStaffId.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        JOptionPane.showMessageDialog(null, "El campo 'staff_id' es obligatorio.", "Validación", JOptionPane.ERROR_MESSAGE);
        valid = false;
    } else {
        cBoxStaffId.setBorder(UIManager.getBorder("ComboBox.border")); // Restaurar borde original
    }

    // Validación del ComboBox CustId
    if (cBoxCustId.getSelectedItem() == null || cBoxCustId.getSelectedItem().toString().trim().isEmpty()) {
        cBoxCustId.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        JOptionPane.showMessageDialog(null, "El campo 'customer_id' es obligatorio.", "Validación", JOptionPane.ERROR_MESSAGE);
        valid = false;
    } else {
        cBoxCustId.setBorder(UIManager.getBorder("ComboBox.border")); // Restaurar borde original
    }

    // Validación del campo jForDateofmeal
    if (jForDateofmeal.getText().trim().isEmpty()) {
        jForDateofmeal.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        JOptionPane.showMessageDialog(null, "El campo 'date of meal' es obligatorio.", "Validación", JOptionPane.ERROR_MESSAGE);
        valid = false;
    } else {
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false); // Asegurarse de que la fecha sea estrictamente válida
            dateFormat.parse(jForDateofmeal.getText().trim());
            jForDateofmeal.setBorder(UIManager.getBorder("FormattedTextField.border")); // Restaurar borde original
        } catch (ParseException e) {
            jForDateofmeal.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
            JOptionPane.showMessageDialog(null, "El campo 'date of meal' debe tener un formato válido (yyyy-MM-dd).", "Validación", JOptionPane.ERROR_MESSAGE);
            valid = false;
        }
    }

    // Detener el proceso si hay errores de validación
    if (!valid) {
        return;
    }

    Connection con = null;
    PreparedStatement pst = null;

    try {
        // Obtener valores de los combos y el texto
        String idStaff[] = cBoxStaffId.getSelectedItem().toString().split("-");
        String idCust[] = cBoxCustId.getSelectedItem().toString().split("-");
        int customersId = Integer.parseInt(idCust[0]);
        int staffId = Integer.parseInt(idStaff[0]);
        double costOfMeal = Double.parseDouble(txtCostofmeal.getText().trim());

        // Convertir la fecha de la comida a formato SQL
        String sqlDatetime = jForDateofmeal.getText();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse(sqlDatetime);
        java.sql.Date dateSql = new java.sql.Date(date.getTime());

        con = cn.getConnection();

        // Preparar la consulta SQL
        String sql = "INSERT INTO public.meals (date_of_meal, cost_of_meal, customers_id, staff_id) VALUES (?, ?, ?, ?)";
        pst = con.prepareStatement(sql);
        pst.setDate(1, dateSql);
        pst.setDouble(2, costOfMeal);
        pst.setInt(3, customersId);
        pst.setInt(4, staffId);

        // Ejecutar la consulta
        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "¡Registro agregado exitosamente!", "Agregar registro", JOptionPane.INFORMATION_MESSAGE);
            meals.actualizar(); // Actualizar datos
            this.dispose(); // Cerrar ventana
        } else {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el registro.", "Agregar registro", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Ocurrió un error en la base de datos: " + ex.getMessage(), "Agregar registro", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Error inesperado al crear el registro: " + e.getMessage(), "Agregar registro", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (pst != null) {
                pst.close();
            }
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cerrar la conexión: " + e.getMessage(), "Agregar registro", JOptionPane.ERROR_MESSAGE);
        }
    }
}



      void generarMenus(){
        generarMenuStaff();
        generarMenuClientes();
    }
    
    void generarMenuStaff(){
        //
        try{
            Conexion cn = new Conexion();
            Connection con;
            Statement st;
            ResultSet rs;

            String sql = "SELECT id, first_name, last_name FROM staff ORDER BY id;";
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                cBoxStaffId.addItem(rs.getString(1) + "-" + rs.getString(2) + " " + rs.getString(3));
                mStaff.put(rs.getInt(1), "-" + rs.getString(2) + " " + rs.getString(3));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    void generarMenuClientes(){
        //
        try{
            Conexion cn = new Conexion();
            Connection con;
            Statement st;
            ResultSet rs;

            String sql = "SELECT id, name FROM customers ORDER BY id;";
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                cBoxCustId.addItem(rs.getString(1) + "-" + rs.getString(2));
                mCliente.put(rs.getInt(1), "-" + rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cBoxCustId;
    private javax.swing.JComboBox<String> cBoxStaffId;
    private javax.swing.JFormattedTextField jForDateofmeal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtCostofmeal;
    // End of variables declaration//GEN-END:variables
}
