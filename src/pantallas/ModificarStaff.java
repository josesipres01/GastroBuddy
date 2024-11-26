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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joses
 */
public class ModificarStaff extends javax.swing.JDialog {

    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
   private DefaultTableModel tableModel; 
   private final StaffP staff;
    private final int id;
    private final String firstName;
    private final String lastName;
    private final int roleCode;

    /**
     * Creates new form AgregarStaff
     */
   public ModificarStaff(Frame parent, DefaultTableModel tableModel, StaffP staff, int id, String firstName, String lastName, int roleCode) {
    super(parent, "Modify Staff", true); // Título del diálogo
    this.model = tableModel; // Modelo de la tabla (para actualizarla después)
    this.staff = staff; // Objeto Staff para modificarlo

    // Establecer los datos del personal seleccionado para mostrar en los campos de la interfaz
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.roleCode = roleCode;
    initComponents(); // Inicializar los componentes gráficos (botones, campos de texto, etc.)
    poblarComboBoxes();
    seleccionarComboBoxRole(roleCode);

    
    // Establecer los valores iniciales en los campos de texto (asumiendo que tienes los JTextFields correspondientes)
    txtFirstName.setText(firstName);
    txtLastName.setText(lastName);
   comboRole.setSelectedItem(roleCode);  // Asumiendo que comboBoxStaffName es un JComboBox

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel3))
                        .addGap(0, 153, Short.MAX_VALUE)))
                .addContainerGap())
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
        try {
            // TODO add your handling code here:
            guardarCambios();
        } catch (ParseException ex) {
            Logger.getLogger(ModificarStaff.class.getName()).log(Level.SEVERE, null, ex);
        }
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
void guardarCambios() throws ParseException {
    // Obtener los nuevos valores desde los campos de texto
    String firstName = txtFirstName.getText().trim(); // Obtener el primer nombre
    String lastName = txtLastName.getText().trim();   // Obtener el apellido

    // Validar que los campos obligatorios no estén vacíos
    if (firstName.isEmpty() || lastName.isEmpty()) {
        JOptionPane.showMessageDialog(this, "First name and last name are required.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validar que firstName y lastName solo contengan letras (incluye acentos y espacios)
    if (!firstName.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        JOptionPane.showMessageDialog(this, "First name must only contain letters.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!lastName.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
        JOptionPane.showMessageDialog(this, "Last name must only contain letters.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener el objeto seleccionado de comboRole
    ComboBoxItem selectedCode = (ComboBoxItem) comboRole.getSelectedItem();

    // Validar que se haya seleccionado algo en el JComboBox
    if (selectedCode == null) {
        JOptionPane.showMessageDialog(this, "All fields are required.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Obtener el código de rol desde el objeto ComboBoxItem
    int roleCode = selectedCode.getId();
    String roleName = ""; // Variable para almacenar el nombre del rol

    // Crear una conexión a la base de datos
    Connection con = null;
    try {
        con = cn.getConnection(); // Obtener la conexión

        // Validar si la conexión es nula o está cerrada
        if (con == null || con.isClosed()) {
            JOptionPane.showMessageDialog(this, "Database connection is closed or not available.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Actualizar el registro en la base de datos
        String sql = "UPDATE staff SET first_name=?, last_name=?, role_code=? WHERE id = ?;";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, firstName);  // Establecer el primer nombre
        pst.setString(2, lastName);   // Establecer el apellido
        pst.setInt(3, roleCode);      // Establecer el código de rol
        pst.setInt(4, this.id);       // Establecer el ID del registro a actualizar

        // Ejecutar la actualización en la base de datos
        int filasAfectadas = pst.executeUpdate();

        // Verificar si se actualizó correctamente
        if (filasAfectadas > 0) {
            JOptionPane.showMessageDialog(this, "Staff updated successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);

            // Obtener el nombre del rol desde la base de datos
            String sqlRoleName = "SELECT role_name FROM reff_staff_roles WHERE code = ?";
            PreparedStatement pstRoleName = con.prepareStatement(sqlRoleName);
            pstRoleName.setInt(1, roleCode);
            ResultSet rs = pstRoleName.executeQuery();

            if (rs.next()) {
                roleName = rs.getString("role_name"); // Obtener el nombre del rol
            }

            // Actualizar la tabla principal con los nuevos datos
            actualizarTabla(this.id, firstName, lastName, roleCode, roleName);

            // Cerrar la ventana de modificación
            this.dispose(); // Cerrar el diálogo
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update staff.", "Error", JOptionPane.ERROR_MESSAGE);
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

void actualizarTabla(int id, String firstName, String lastName, int roleCode, String roleName) {
    // Formatear el texto como "code-role"
    String codeRole = roleCode + " - " + roleName;

    // Recorrer las filas de la tabla y actualizar la fila correspondiente
    for (int i = 0; i < model.getRowCount(); i++) {
        int tableId = (int) model.getValueAt(i, 0); // ID en la primera columna de la tabla
        if (tableId == id) {
            // Actualizar la fila con los nuevos datos
            model.setValueAt(firstName, i, 1); // Nombre del staff en la segunda columna
            model.setValueAt(lastName, i, 2);  // Apellido del staff en la tercera columna
            model.setValueAt(codeRole, i, 3);  // Formato "code-role" en la cuarta columna
            break; // Salir del loop una vez que se haya actualizado la fila correspondiente
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
            
            // Crear un objeto ComboBoxItem con el código y el nombre del rol
            ComboBoxItem comboItem = new ComboBoxItem(roleCode, roleName);
            
            // Agregar el objeto ComboBoxItem al JComboBox
            comboRole.addItem(comboItem);
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

private void seleccionarComboBoxRole(int roleCode) {
    for (int i = 0; i < comboRole.getItemCount(); i++) {
        ComboBoxItem item = (ComboBoxItem) comboRole.getItemAt(i); // Obtén el elemento del JComboBox
        if (item.getId() == roleCode) { // Compara el ID del rol
            comboRole.setSelectedIndex(i); // Selecciona el elemento
            break;
        }
    }
}






    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<ComboBoxItem> comboRole;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    // End of variables declaration//GEN-END:variables
}