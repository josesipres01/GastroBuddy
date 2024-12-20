/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package pantallas;

import config.Conexion;
import java.awt.Color;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author joses
 */
public class AgregarCustomers extends javax.swing.JDialog {

    /**
     * Creates new form AgregarCustomers
     */
    
    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
   private DefaultTableModel tableModel; 
   private final CustomersP customer;

    
     public AgregarCustomers(Frame parent,DefaultTableModel tableModel, CustomersP customer) {
         
        super(parent, "New Registration", true); // Usando parent como Frame
        this.tableModel = model; // Inicializar el modelo de la tabla
        this.customer = customer;
        initComponents();

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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        jPanel1.setBackground(new java.awt.Color(81, 81, 201));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setInheritsPopupMenu(true);

        jLabel1.setFont(new java.awt.Font("Calling Heart", 0, 86)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText(" New Customer");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Name ");

        txtName.setFocusCycleRoot(true);

        txtPhone.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Phone");

        btnAgregar.setBackground(new java.awt.Color(255, 153, 51));
        btnAgregar.setText("Guardar");
        btnAgregar.setFocusable(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jLabel3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        agregarRegistro();

    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtPhoneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneFocusLost

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
    boolean valid = true; // Variable para controlar si los datos son válidos

    // Validación del campo Nombre
    String name = txtName.getText().trim();
    if (name.isEmpty()) {
        txtName.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        JOptionPane.showMessageDialog(null, "The 'Name' field is obligatory.", "Validation", JOptionPane.ERROR_MESSAGE);
        txtName.requestFocus();
        valid = false;
    } else if (!name.matches("^[a-zA-ZÁÉÍÓÚáéíóúÑñ ]+$")) { // Validar solo letras y espacios
        txtName.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        JOptionPane.showMessageDialog(null, "The 'Name' field can only contain text.", "Validation", JOptionPane.ERROR_MESSAGE);
        txtName.requestFocus();
        valid = false;
    } else {
        txtName.setBorder(UIManager.getBorder("TextField.border")); // Restaurar el borde original
    }

    // Validación del campo Teléfono
    String phone = txtPhone.getText().trim();
    if (phone.isEmpty()) {
        txtPhone.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        JOptionPane.showMessageDialog(null, "The 'Phone' field is obligatory.", "Validation", JOptionPane.ERROR_MESSAGE);
        txtPhone.requestFocus();
        valid = false;
    } else if (!phone.matches("\\d{10}")) { // Validar que el teléfono tenga exactamente 10 dígitos
        txtPhone.setBorder(BorderFactory.createLineBorder(Color.RED, 2));
        JOptionPane.showMessageDialog(null, "The 'Phone' field must contain exactly 10 digits.", "Validation", JOptionPane.ERROR_MESSAGE);
        txtPhone.requestFocus();
        valid = false;
    } else {
        txtPhone.setBorder(UIManager.getBorder("TextField.border")); // Restaurar el borde original
    }

    // Si algún campo no es válido, no proceder
    if (!valid) {
        return;
    }

    Connection con = null;
    PreparedStatement pst = null;

    try {
        // Convertir el valor de phone a entero dentro de un bloque try-catch
        double phoneDouble = Double.parseDouble(phone);

        con = cn.getConnection();

        // Preparar la consulta SQL
        String sql = "INSERT INTO customers (name, phone) VALUES (?, ?)";
        pst = con.prepareStatement(sql);

        // Asignar valores a los parámetros
        pst.setString(1, name);
        pst.setDouble(2, phoneDouble);

        int rowsAffected = pst.executeUpdate();

        // Confirmar si el registro fue exitoso
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "¡Registration added successfully!", "Add record", JOptionPane.INFORMATION_MESSAGE);
            customer.actualizar();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Registration could not be added.", "Add record", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "A database error occurred: " + ex.getMessage(), "Add record", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "The phone must be a valid number.", "Validation", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Unexpected error creating the record: " + e.getMessage(), "Add record", JOptionPane.ERROR_MESSAGE);
    } finally {
        // Cerrar recursos
        try {
            if (pst != null) {
                pst.close();
            }
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Connection closing error: " + e.getMessage(), "Add record", JOptionPane.ERROR_MESSAGE);
        }
    }
}




   


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
