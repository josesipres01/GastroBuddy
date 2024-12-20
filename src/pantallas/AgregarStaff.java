/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pantallas;

import config.ComboBoxItem;
import config.Conexion;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joses
 */
public class AgregarStaff extends javax.swing.JDialog {

    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
   private DefaultTableModel tableModel; 
   private final StaffP staff;

    /**
     * Creates new form AgregarStaff
     */
    public AgregarStaff(Frame parent,DefaultTableModel tableModel, StaffP staff) {
        super(parent, "New Registration", true); 
        this.tableModel = model; 
        this.staff = staff;
        initComponents();
        poblarComboBoxes(); // Llama al método para llenar los combos        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        comboRole = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Calling Heart", 0, 86)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText(" New Staff");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        jPanel1.setBackground(new java.awt.Color(81, 81, 201));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("First_name");

        txtFirstName.setFocusCycleRoot(true);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Last _name");

        btnAgregar.setBackground(new java.awt.Color(255, 153, 51));
        btnAgregar.setText("Guardar");
        btnAgregar.setFocusable(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Role_code");

        comboRole.setModel(new javax.swing.DefaultComboBoxModel<>());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4)
                    .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(comboRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
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

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        agregarRegistro();
    }//GEN-LAST:event_btnAgregarActionPerformed

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
    // Verificar que el campo de nombre no esté vacío
    if (txtFirstName.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "The 'First Name' field is empty. Please enter it.", 
                                      "Add record", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Verificar que el campo de apellido no esté vacío
    if (txtLastName.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "The 'Last Name' field is empty. Please enter it.", 
                                      "Add record", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que First Name solo contenga letras
    if (!txtFirstName.getText().trim().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        JOptionPane.showMessageDialog(null, "The 'First Name' field should only contain text.", 
                                      "Add record", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que Last Name solo contenga letras
    if (!txtLastName.getText().trim().matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        JOptionPane.showMessageDialog(null, "The 'Last Name' field should only contain text.", 
                                      "Add record", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Verificar que el campo de código no esté vacío
    if (comboRole.getSelectedItem() == null || comboRole.getSelectedItem().toString().trim().isEmpty()) {
        JOptionPane.showMessageDialog(null, "The 'Role Code' field is empty. Please select a role.",
                                      "Add record", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener el texto seleccionado en el JComboBox
    String selectedRole = comboRole.getSelectedItem().toString().trim();
    // Separar el 'roleCode' y 'roleName' usando el guion como delimitador
    String[] parts = selectedRole.split(" - ");
    
    // Validar que la cadena contiene un código de rol válido
    int roleCode = -1;
    try {
        roleCode = Integer.parseInt(parts[0]); // Obtener el 'roleCode'
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Invalid Role Code selected.", 
                                      "Add record", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Conexión a la base de datos y ejecución del INSERT
    Connection con = null;
    PreparedStatement pst = null;

    try {
        // Obtener los valores de los campos
        String first_name = txtFirstName.getText().trim();
        String last_name = txtLastName.getText().trim();

        // Establecer conexión con la base de datos
        con = cn.getConnection();

        // Preparar consulta SQL
        String sql = "INSERT INTO public.staff (first_name, last_name, role_code) VALUES (?, ?, ?)";
        pst = con.prepareStatement(sql);

        // Asignar valores a los parámetros de la consulta
        pst.setString(1, first_name);
        pst.setString(2, last_name);
        pst.setInt(3, roleCode); // Usar roleCode extraído de la cadena

        // Ejecutar la consulta
        int rowsAffected = pst.executeUpdate();

        // Verificar si el registro fue exitoso
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "¡Registration added successfully!", 
                                          "Add record", JOptionPane.INFORMATION_MESSAGE);
            staff.actualizar(); // Actualizar la tabla en la pantalla principal
            this.dispose(); // Cerrar el diálogo
        } else {
            JOptionPane.showMessageDialog(null, "Registration could not be added.", 
                                          "Add record", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "A database error occurred: " + ex.getMessage(), 
                                      "Add record", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Cerrar el PreparedStatement y la conexión
        try {
            if (pst != null) pst.close();
            if (con != null && !con.isClosed()) con.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection closing error: " + e.getMessage(), 
                                          "Add record", JOptionPane.ERROR_MESSAGE);
        }
    }
}


 private void poblarComboBoxes() {
    Connection con = null;
    PreparedStatement pstRole = null;
    ResultSet rsRole = null;

    try {
        con = cn.getConnection();
        if (con == null) {
            System.out.println("Error: The connection to the database could not be established.");
            return;
        }

        // Poblar JComboBox para "Role"
        String sqlRole = "SELECT code, role_name FROM reff_staff_roles";
        pstRole = con.prepareStatement(sqlRole);
        rsRole = pstRole.executeQuery();
        
        while (rsRole.next()) {
            int roleCode = rsRole.getInt("code"); // Obtener el 'roleCode'
            String roleName = rsRole.getString("role_name"); // Obtener el 'roleName'
            
            // Agregar una cadena que contenga el 'roleCode' y 'roleName' al JComboBox
            comboRole.addItem(roleCode + " - " + roleName);
            System.out.println("Role agregado: " + roleCode + " - " + roleName);
        }

    } catch (SQLException e) {
        System.out.println("Error al poblar los ComboBox: " + e.getMessage());
        JOptionPane.showMessageDialog(null, "Error filling ComboBox: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } finally {
        try {
            if (rsRole != null) rsRole.close();
            if (pstRole != null) pstRole.close();
            if (con != null && !con.isClosed()) con.close();
        } catch (SQLException e) {
            System.out.println("Error al cerrar la conexión: " + e.getMessage());
            JOptionPane.showMessageDialog(null, "Connection closing error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}
