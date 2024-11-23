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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author joses
 */
public class ModificarMenu extends javax.swing.JDialog {

    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
    private DefaultTableModel tableModel; 
    private final MenuP menu;
    /**
     * Creates new form AgregarMenus
     */
    public ModificarMenu(Frame parent, DefaultTableModel tableModel, MenuP menu, int id, String menuName, String type, String season, String dateDateFrom, String dateDateTo) {
        super(parent, "Modify record", true); // Usando parent como Fram
        
        this.tableModel = tableModel; 
        this.menu = menu;
        initComponents();
        
          // Rellenar los campos con los datos del registro seleccionado
        txtName.setText(menuName);
        txtType1.setText(type);
        txtSeason.setText(season);
        jForDateFrom1.setText(dateDateFrom);
        jForDateTo.setText(dateDateTo);
        
        txtName.putClientProperty("id", id);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel txtType = new javax.swing.JPanel();
        javax.swing.JButton btnAgregar7 = new javax.swing.JButton();
        javax.swing.JLabel jLabel24 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel22 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtType1 = new javax.swing.JTextField();
        javax.swing.JLabel jLabel23 = new javax.swing.JLabel();
        txtSeason = new javax.swing.JTextField();
        javax.swing.JLabel jLabel25 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        jForDateFrom1 = new javax.swing.JFormattedTextField();
        jForDateTo = new javax.swing.JFormattedTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));

        txtType.setBackground(new java.awt.Color(81, 81, 201));

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
        jLabel24.setText(" New Menu");

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Menu Name");

        txtName.setFocusCycleRoot(true);

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Type");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Season");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("available_date_from");

        jForDateFrom1.setToolTipText("Año-Mes-Dia");

        jForDateTo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jForDateTo.setToolTipText("Año-Mes-Dia");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("available_date_to");

        jLabel1.setText("2024-12-31");

        jLabel2.setText("2024-12-31");

        javax.swing.GroupLayout txtTypeLayout = new javax.swing.GroupLayout(txtType);
        txtType.setLayout(txtTypeLayout);
        txtTypeLayout.setHorizontalGroup(
            txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTypeLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtTypeLayout.createSequentialGroup()
                        .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23)
                            .addComponent(txtType1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25)
                            .addComponent(txtSeason, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(txtTypeLayout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jForDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(txtTypeLayout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregar7, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(txtTypeLayout.createSequentialGroup()
                        .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jForDateFrom1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtTypeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        txtTypeLayout.setVerticalGroup(
            txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(txtTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jForDateFrom1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jForDateTo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtType1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(txtTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(txtTypeLayout.createSequentialGroup()
                        .addComponent(txtSeason, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, txtTypeLayout.createSequentialGroup()
                        .addComponent(btnAgregar7, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregar7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregar7ActionPerformed
        // TODO add your handling code here
        
       try {
            guardarCambios();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(null, "Invalid date format: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
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
    
void guardarCambios() throws ParseException {
    // Retrieve values
    int id = (int) txtName.getClientProperty("id");
    String type = txtType1.getText().trim();
    String season = txtSeason.getText().trim();
    String menuName = txtName.getText().trim();
    
    
    // Parse dates
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    String dateDateFromS = jForDateFrom1.getText().trim();
    String dateDateToS = jForDateTo.getText().trim();
    
    if (dateDateFromS.isEmpty() || dateDateToS.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Please fill in all date fields.", "Warning", JOptionPane.WARNING_MESSAGE);
        return;
    }
    Date dateDateFrom = dateFormat.parse(dateDateFromS);
    Date dateDateTo = dateFormat.parse(dateDateToS);

    try {
        // Establish connection and prepare the query
        con = cn.getConnection(); // Assuming you have a configured `Conexion` class
        String sql = "UPDATE menu SET name = ?, available_date_from = ?, available_date_to = ?, type = ?, season = ? WHERE id = ?";
        PreparedStatement pst = con.prepareStatement(sql);        
        pst.setString(1, menuName);
        pst.setDate(2, new java.sql.Date(dateDateFrom.getTime()));
        pst.setDate(3, new java.sql.Date(dateDateTo.getTime()));
        pst.setString(4, type);
        pst.setString(5, season);
        pst.setInt(6, id);

        // Execute the update
        int rowsAffected = pst.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Changes saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            // Update the main table
            actualizarTabla(id, type, season, menuName, dateDateFrom, dateDateTo);
            // Close the window
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "The record to update was not found.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } 
    
}



private void actualizarTabla(int id, String type, String season, String menuName, Date dateDateFrom, Date dateDateTo) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    for (int i = 0; i < tableModel.getRowCount(); i++) {
        if ((int) tableModel.getValueAt(i, 0) == id) { // Comparar por ID
            tableModel.setValueAt(menuName, i, 1); // Actualiza el nombre del menú
            tableModel.setValueAt(dateFormat.format(dateDateFrom), i, 2); // Actualiza la fecha desde
            tableModel.setValueAt(dateFormat.format(dateDateTo), i, 3); // Actualiza la fecha hasta
            tableModel.setValueAt(type, i, 4); // Actualiza el tipo
            tableModel.setValueAt(season, i, 5); // Actualiza la temporada
            break;
        }
    }
}





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jForDateFrom1;
    private javax.swing.JFormattedTextField jForDateTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSeason;
    private javax.swing.JTextField txtType1;
    // End of variables declaration//GEN-END:variables
}

