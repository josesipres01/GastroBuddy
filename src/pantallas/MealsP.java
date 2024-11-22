/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package pantallas;
import Dialogos.BorrarConf;
import Dialogos.CommitConf;
import EnumPantalla.Pantalla;
import Main.VentanaPrincipal;
import config.Conexion;
import java.awt.Frame;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisi
 */
public class MealsP extends javax.swing.JPanel {

    VentanaPrincipal ventana;
    Conexion cn = new Conexion();
    Connection con;
    DefaultTableModel model;
    Statement st;
    ResultSet rs;
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    Map<Integer, String> mStaff = new HashMap<>();
    Map<Integer, String> mCliente = new HashMap<>();
    
    /**
     * Creates new form MealsP
     */
    public MealsP(VentanaPrincipal v) {
        initComponents();
        this.ventana = v;
        LocalDate date = LocalDate.now();
        String dateSql = date.format(formatter);
        jForDateofmeal.setText(dateSql);
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
        TablaDeDatosPrin = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtCostofmeal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        btnNvoRegistro = new javax.swing.JButton();
        jForDateofmeal = new javax.swing.JFormattedTextField();
        jButton1 = new javax.swing.JButton();
        btnPagar = new javax.swing.JButton();
        txtStaffId = new javax.swing.JTextField();
        txtCustId = new javax.swing.JTextField();

        panelPrincipal.setBackground(new java.awt.Color(81, 81, 201));

        jPanel1.setBackground(new java.awt.Color(81, 81, 201));

        TablaDeDatosPrin.setBackground(new java.awt.Color(239, 239, 239));
        TablaDeDatosPrin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "staff_name", "customers_name", "date_of_meal", "cost_of_meal"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaDeDatosPrin.setGridColor(new java.awt.Color(153, 153, 153));
        TablaDeDatosPrin.setShowGrid(true);
        TablaDeDatosPrin.getTableHeader().setResizingAllowed(false);
        TablaDeDatosPrin.getTableHeader().setReorderingAllowed(false);
        TablaDeDatosPrin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDeDatosPrinMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDeDatosPrin);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 838, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                .addContainerGap())
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

        jLabel1.setFont(new java.awt.Font("Calling Heart", 0, 96)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText(" Meals");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("id");

        txtId.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("staff_id");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("customers_id");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("date_of_meal");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("cost_of_meal");

        btnNvoRegistro.setBackground(new java.awt.Color(255, 153, 51));
        btnNvoRegistro.setText("Nuevo Registro");
        btnNvoRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNvoRegistroActionPerformed(evt);
            }
        });

        jForDateofmeal.setEditable(false);
        jForDateofmeal.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        jForDateofmeal.setToolTipText("Año-Mes-Dia");
        jForDateofmeal.setFocusable(false);

        jButton1.setBackground(new java.awt.Color(255, 153, 51));
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnPagar.setBackground(new java.awt.Color(255, 153, 51));
        btnPagar.setText("Pagar");
        btnPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(261, 261, 261)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(462, 462, 462))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNvoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabel4))
                                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                                        .addComponent(txtStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(44, 44, 44)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jForDateofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCostofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(41, Short.MAX_VALUE))))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addComponent(btnNvoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)))
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addComponent(jLabel4))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtCostofmeal)
                        .addComponent(txtId, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jForDateofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void TablaDeDatosPrinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDeDatosPrinMouseClicked

         if (TablaDeDatosPrin.isFocusable()) {
            int row = TablaDeDatosPrin.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "There is no row selected");
            } else {
            // Obtén los valores de las celdas, asegurando el tipo correcto
                String id = TablaDeDatosPrin.getValueAt(row, 0).toString();
                String staffName = TablaDeDatosPrin.getValueAt(row, 1).toString();// Nombre del staff
                String customerName = TablaDeDatosPrin.getValueAt(row, 2).toString();// Nombre del cliente
                String dateString = TablaDeDatosPrin.getValueAt(row, 3).toString();// Fecha de la comida
                String costOfMeal = TablaDeDatosPrin.getValueAt(row, 4).toString();// Costo de la comida

                // Asigna valores a los campos correspondientes
                txtId.setText(id);
                txtStaffId.setText(staffName);  // Asignación a TextField de StaffId
                txtCustId.setText(customerName);  // Asignación a TextField de CustId
                jForDateofmeal.setText(dateString);  // Asigna la fecha
                txtCostofmeal.setText(costOfMeal);// Asigna el costo
        
        }
    }
    }//GEN-LAST:event_TablaDeDatosPrinMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        modificarRegistro();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        borrarRegistro();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNvoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNvoRegistroActionPerformed

    Frame parentFrame = (Frame) SwingUtilities.getWindowAncestor(this);
    AgregarMeals dialog = new AgregarMeals(parentFrame, model, this);
    dialog.setVisible(true); // Muestra el diálogo
    }//GEN-LAST:event_btnNvoRegistroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.PrincipalP);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
        pagarMeal();
    }//GEN-LAST:event_btnPagarActionPerformed

void listar() {
     String sql = "SELECT m.id, s.first_name AS staff_name, c.name AS customer_name, m.date_of_meal, m.cost_of_meal FROM meals m JOIN staff s ON m.staff_id = s.id JOIN customers c ON m.customers_id = c.id;";
        try {
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] meals = new Object[5];
            model = (DefaultTableModel) TablaDeDatosPrin.getModel();

            model.setRowCount(0);  // Limpiar tabla

            while (rs.next()) {
                meals[0] = rs.getInt("id");
                meals[1] = rs.getString("staff_name");
                meals[2] = rs.getString("customer_name");
                meals[3] = rs.getString("date_of_meal");
                meals[4] = rs.getDouble("cost_of_meal");
                model.addRow(meals);
            }
            TablaDeDatosPrin.setModel(model);
        } catch (Exception e) {
            e.printStackTrace();
    }
}


    
    void pagarMeal() {
    if (txtStaffId.getText().equals("") || txtCustId.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "The Personal and Client fields cannot be empty.\nPlease try again.", "Pay meal", JOptionPane.ERROR_MESSAGE);
    } else {
        try {
            int id = Integer.parseInt(txtId.getText());
            String staffName = txtStaffId.getText();  // Obtiene el nombre del staff del TextField
            String customerName = txtCustId.getText();  // Obtiene el nombre del cliente del TextField
            double costOfMeal = Double.parseDouble(txtCostofmeal.getText());
            String sqlDatetime = jForDateofmeal.getText();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dateFormat.parse(sqlDatetime);
            java.sql.Date dateSql = new java.sql.Date(date.getTime());
            
            con = cn.getConnection();
            con.setAutoCommit(false);
            
            // Obtener el ID del staff basado en el nombre del staff
            String sqlStaffId = "SELECT id FROM staff WHERE first_name='" + staffName + "'";
            Statement stStaff = con.createStatement();
            ResultSet rsStaff = stStaff.executeQuery(sqlStaffId);
            
            int staffId = 0;
            if (rsStaff.next()) {
                staffId = rsStaff.getInt("id");
            }
            rsStaff.close();  // Cierra el ResultSet de Staff
            stStaff.close();  // Cierra el Statement de Staff
            
            // Obtener el ID del cliente basado en el nombre del cliente
            String sqlCustomerId = "SELECT id FROM customers WHERE name='" + customerName + "'";
            Statement stCustomer = con.createStatement();
            ResultSet rsCustomer = stCustomer.executeQuery(sqlCustomerId);
            
            int customerId = 0;
            if (rsCustomer.next()) {
                customerId = rsCustomer.getInt("id");
            }
            rsCustomer.close();  // Cierra el ResultSet de Customer
            stCustomer.close();  // Cierra el Statement de Customer

            // Inserta en la tabla de ventas
            String sqlInsert = "INSERT INTO sales(amount, id_meals, id_staff, id_customer, date_of_meal) " +
                    "VALUES (" + costOfMeal + ", " + id + ", " + staffId + ", " + customerId + ",'" + dateSql + "');";
            Statement stInsert = con.createStatement();
            stInsert.executeUpdate(sqlInsert);
            stInsert.close();  // Cierra el Statement de Insert

            // Borra de la tabla meals
            String sqlDelete = "DELETE FROM meals WHERE Id=" + id + ";";
            Statement stDelete = con.createStatement();
            stDelete.executeUpdate(sqlDelete);
            stDelete.close();  // Cierra el Statement de Delete

            CommitConf com = new CommitConf(this.ventana, true);
            com.setVisible(true);

            if (com.getReturnStatus() == 1) {
                JOptionPane.showMessageDialog(null, "¡Payment has been made successfully!", "Payment successful", JOptionPane.INFORMATION_MESSAGE);
                con.commit();
            } else if (com.getReturnStatus() == 0) {
                con.rollback();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error making payment: " + e.getMessage(), "Payment Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            actualizar();
            limpiarTexts();
        }
    }
    }

    void borrarRegistro() {
        if(!txtId.getText().equals("")){
            BorrarConf bc = new BorrarConf(this.ventana, true);
            bc.setVisible(true);
            if(bc.getReturnStatus() == 1){
                int id = Integer.parseInt(txtId.getText());
                String sql = "DELETE FROM meals WHERE Id=" + id +";";
                try {
                    con = cn.getConnection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Meal Deleted");
                } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Error deleting record: " + e.getMessage(), "Delete record", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "The id field is empty, to delete a record an id is required.\nPlease try again.", "Delete record", JOptionPane.ERROR_MESSAGE);
        }
        actualizar();
        limpiarTexts();
    }

    void modificarRegistro() {
         if(txtId.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "The ID field is empty, to edit a record an ID is required.\nPlease try again.", "Modify record", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                // Obtener los valores de los TextFields
                int id = Integer.parseInt(txtId.getText());
                String staffName = txtStaffId.getText();  // Obtener el nombre del staff del TextField
                String customerName = txtCustId.getText();  // Obtener el nombre del cliente del TextField
                double costOfMeal = Double.parseDouble(txtCostofmeal.getText());
                String sqlDatetime = jForDateofmeal.getText();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = dateFormat.parse(sqlDatetime);
                java.sql.Date dateSql = new java.sql.Date(date.getTime());

                // Sentencia SQL para actualizar el registro
                String sql = "UPDATE meals SET cost_of_meal=" + costOfMeal + ", staff_id=(SELECT id FROM staff WHERE first_name='" + staffName + "'), customers_id=(SELECT id FROM customers WHERE name='" + customerName + "') WHERE id=" + id + ";";
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
    
    void generarMenus(){
        generarMenuStaff();
        generarMenuClientes();
    }
    
    void generarMenuStaff(){
        // Consulta para obtener el nombre de los staff desde la base de datos
    try {
        String sql = "SELECT id, first_name, last_name FROM staff ORDER BY id;";
        con = cn.getConnection();
        st = con.createStatement();
        rs = st.executeQuery(sql);

        while (rs.next()) {
            // Guardar los nombres de los Staff si es necesario para otra lógica
            mStaff.put(rs.getInt(1), rs.getString(2) + " " + rs.getString(3));
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        }
    }

    void generarMenuClientes(){
       // Consulta para obtener los nombres de los clientes desde la base de datos
    try {
        String sql = "SELECT id, name FROM customers ORDER BY id;";
        con = cn.getConnection();
        st = con.createStatement();
        rs = st.executeQuery(sql);

        while (rs.next()) {
            // Guardar los nombres de los Clientes si es necesario para otra lógica
            mCliente.put(rs.getInt(1), rs.getString(2));
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
        }
    }
    
    void limpiarTexts() {
        txtId.setText("");
        //txtCustomersid.setText("");
        //txtStaffId.setText("");
        txtCostofmeal.setText("");
    }
    
    void limpiarTabla(DefaultTableModel model) {
        for (int i = 0; i < TablaDeDatosPrin.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
    
    void actualizar(){
        limpiarTabla(model);
        listar();
    }
    
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDeDatosPrin;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNvoRegistro;
    private javax.swing.JButton btnPagar;
    private javax.swing.JButton jButton1;
    private javax.swing.JFormattedTextField jForDateofmeal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTextField txtCostofmeal;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtStaffId;
    // End of variables declaration//GEN-END:variables
}
