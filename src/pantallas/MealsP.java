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
        jForDateofmeal.setText(dateSql.toString());
        generarMenus();
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
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
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
        cBoxStaffId = new javax.swing.JComboBox<>();
        cBoxCustId = new javax.swing.JComboBox<>();

        panelPrincipal.setBackground(new java.awt.Color(81, 81, 201));

        jPanel1.setBackground(new java.awt.Color(81, 81, 201));

        TablaDeDatosPrin.setBackground(new java.awt.Color(239, 239, 239));
        TablaDeDatosPrin.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "staff_id", "customers_id", "date_of_meal", "cost_of_meal"
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

        btnAgregar.setBackground(new java.awt.Color(255, 153, 51));
        btnAgregar.setText("Agregar");
        btnAgregar.setEnabled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnLimpiar.setBackground(new java.awt.Color(255, 153, 51));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setEnabled(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

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

        cBoxStaffId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));

        cBoxCustId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " " }));
        cBoxCustId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxCustIdActionPerformed(evt);
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
                                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                                        .addComponent(cBoxStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cBoxCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jForDateofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(txtCostofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(29, Short.MAX_VALUE))))
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
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)))
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
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtCostofmeal)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cBoxStaffId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cBoxCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jForDateofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        if(TablaDeDatosPrin.isFocusable()){
            int row = TablaDeDatosPrin.getSelectedRow();
            if (row == -1) {
                JOptionPane.showMessageDialog(null, "No se Selecciono");
            } else {
                String id = (String) TablaDeDatosPrin.getValueAt(row, 0).toString();
                String staffId = (String) TablaDeDatosPrin.getValueAt(row, 1);
                String customersid = (String) TablaDeDatosPrin.getValueAt(row, 2);
                String dateString = (String) TablaDeDatosPrin.getValueAt(row, 3);
                String costofmeal = (String) TablaDeDatosPrin.getValueAt(row, 4);
                txtId.setText(id);
                cBoxStaffId.setSelectedItem(staffId + mStaff.get(Integer.parseInt(staffId)));
                cBoxCustId.setSelectedItem(customersid + mCliente.get(Integer.parseInt(customersid)));
                jForDateofmeal.setText(dateString);
                txtCostofmeal.setText(costofmeal);
            }
        }
    }//GEN-LAST:event_TablaDeDatosPrinMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        agregarRegistro();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        limpiarTexts();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        modificarRegistro();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed

        borrarRegistro();
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnNvoRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNvoRegistroActionPerformed

        nuevoRegistro();
    }//GEN-LAST:event_btnNvoRegistroActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ventana.setPantalla(Pantalla.PrincipalP);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPagarActionPerformed
        // TODO add your handling code here:
        pagarMeal();
    }//GEN-LAST:event_btnPagarActionPerformed

    private void cBoxCustIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxCustIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxCustIdActionPerformed

    void listar() {
        String sql = "SELECT * FROM meals ORDER BY id;";
        try {
            con = cn.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);
            Object[] meals = new Object[5];
//            String[] Titulos={"ID","DNI","NOMBRES"};         
//            model=new DefaultTableModel(null,Titulos);   
            model = (DefaultTableModel) TablaDeDatosPrin.getModel();
            while (rs.next()) {
                meals[0] = rs.getInt("id");
                meals[1] = rs.getString("staff_id");
                meals[2] = rs.getString("customers_id");
                meals[3] = rs.getString("date_of_meal");
                meals[4] = rs.getString("cost_of_meal");
                model.addRow(meals);
            }
            TablaDeDatosPrin.setModel(model);
        } catch (Exception e) {

        }

    }

    void agregarRegistro() {
            try {
                if((cBoxStaffId.getSelectedItem().toString().equals(" ") || cBoxCustId.getSelectedItem().toString().equals(" "))){
                    JOptionPane.showMessageDialog(null, "El campo StaffId o CustomerId esta vacio, para pagar es necesario un id.\nIntentelo de nuevo.", "Pagar meal", JOptionPane.ERROR_MESSAGE);
                    deshabilitarTexts();
                }else{
                    //int id = Integer.parseInt(txtId.getText());
                    String idStaff[] = cBoxStaffId.getSelectedItem().toString().split("-");
                    String idCust[] = cBoxCustId.getSelectedItem().toString().split("-");
                    int customersId = Integer.parseInt(idCust[0]);
                    int staffId = Integer.parseInt(idStaff[0]);
                    double costOfMeal = Double.parseDouble(txtCostofmeal.getText());
                    String sqlDatetime = jForDateofmeal.getText();
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                    Date date = dateFormat.parse(sqlDatetime);
                    java.sql.Date dateSql = new java.sql.Date(date.getTime());
                    String sql = "INSERT INTO public.meals (date_of_meal, cost_of_meal, customers_id, staff_id) VALUES ('" + dateSql + "', " + costOfMeal + ", " + customersId +"," + staffId +");";
                    con = cn.getConnection();
                    st = con.createStatement();
                    st.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "¡Registro Agregado Exitosamente!", "Agregar registro", JOptionPane.INFORMATION_MESSAGE);
                    deshabilitarTexts();
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al crear el registro: " + e.getMessage(), "Agregar registro", JOptionPane.ERROR_MESSAGE);
                deshabilitarTexts();
            }
        actualizar();
        limpiarTexts();
    }
    
    void pagarMeal(){
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El campo id esta vacio, para pagar es necesario un id.\nIntentelo de nuevo.", "Pagar meal", JOptionPane.ERROR_MESSAGE);
            deshabilitarTexts();
        }else{
            try {
                int id = Integer.parseInt(txtId.getText());
                String idStaff[] = cBoxStaffId.getSelectedItem().toString().split("-");
                String idCust[] = cBoxCustId.getSelectedItem().toString().split("-");
                int customersId = Integer.parseInt(idCust[0]);
                int staffId = Integer.parseInt(idStaff[0]);
                double costOfMeal = Double.parseDouble(txtCostofmeal.getText());
                String sqlDatetime = jForDateofmeal.getText();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = dateFormat.parse(sqlDatetime);
                java.sql.Date dateSql = new java.sql.Date(date.getTime());
                
                con = cn.getConnection();
                con.setAutoCommit(false);
                
                String sqlInsert = "INSERT INTO sales(amount, id_meals, id_staff, id_customer, date_of_meal) VALUES (" + costOfMeal + ", " + id + ", " + staffId + ", " + customersId + ",'" + dateSql + "');";
                st = con.createStatement();
                st.executeUpdate(sqlInsert);
                
                String sqlDelete ="DELETE FROM meals WHERE Id=" + id +";";
                st = con.createStatement();
                st.executeUpdate(sqlDelete);
                
                CommitConf com = new CommitConf(this.ventana, true);
                com.setVisible(true);
                
                if(com.getReturnStatus() == 1){
                    JOptionPane.showMessageDialog(null, "¡El pago se ha realizado Exitosamente!", "Pago Exitoso", JOptionPane.INFORMATION_MESSAGE);
                    con.commit();
                }else if(com.getReturnStatus() == 0){
                    con.rollback();
                }
                deshabilitarTexts();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error al realizar el pago: " + e.getMessage(), "Error Pago", JOptionPane.ERROR_MESSAGE);
                deshabilitarTexts();
            }
        }
        actualizar();
        limpiarTexts();
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
                    JOptionPane.showMessageDialog(null, "Usuario Eliminado");
                } catch (Exception e) {
                                JOptionPane.showMessageDialog(null, "Error al borrar el registro: " + e.getMessage(), "Borrar registro", JOptionPane.ERROR_MESSAGE);
                }
            }
        }else{
            JOptionPane.showMessageDialog(null, "El campo id esta vacio, para borrar un registro es necesario un id.\nIntentelo de nuevo.", "Borrar registro", JOptionPane.ERROR_MESSAGE);
        }
        actualizar();
        limpiarTexts();
    }

    void modificarRegistro() {
        if(txtId.getText().equals("")){
            JOptionPane.showMessageDialog(null, "El campo id esta vacio, Para modificar un registro es necesario un id.\nIntentelo de nuevo.", "Modificar registro", JOptionPane.ERROR_MESSAGE);
        }else{
            try{
                // solicitando valores
                int id = Integer.parseInt(txtId.getText());
                String idStaff[] = cBoxStaffId.getSelectedItem().toString().split("-");
                String idCust[] = cBoxCustId.getSelectedItem().toString().split("-");
                int customersId = Integer.parseInt(idCust[0]);
                int staffId = Integer.parseInt(idStaff[0]);
                double costOfMeal = Double.parseDouble(txtCostofmeal.getText());
                String sqlDatetime = jForDateofmeal.getText();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                Date date = dateFormat.parse(sqlDatetime);
                java.sql.Date dateSql = new java.sql.Date(date.getTime());
                //sql
                String sql = "UPDATE  public.meals SET cost_of_meal=" + costOfMeal +", customers_id="+customersId+", staff_id="+ staffId +" WHERE id=" + id + ";";
                con = cn.getConnection();
                st = con.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "¡Registro modificado Exitosamente!", "Modificar registro", JOptionPane.INFORMATION_MESSAGE);


            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error al modificar el registro: " + e.getMessage(), "Modificar registro", JOptionPane.ERROR_MESSAGE);
            }
        }
        actualizar();
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
    
    void nuevoRegistro() {
        if(btnNvoRegistro.getText().equals("Nuevo Registro")){
            habilitarTexts();
            txtId.setText("");
            //txtCustomersid.setText("");
            //txtStaffId.setText("");
            cBoxStaffId.setSelectedIndex(0);
            cBoxCustId.setSelectedIndex(0);
            txtCostofmeal.setText("");
            LocalDate date = LocalDate.now();
            String dateSql = date.format(formatter);
            jForDateofmeal.setText(dateSql.toString());
            btnNvoRegistro.setText("Cancelar");
            cBoxStaffId.requestFocus();
        }else{
            deshabilitarTexts();
            limpiarTexts();
        }
    }
    
    void habilitarTexts(){
        //txtId.setEditable(true);
        txtId.setVisible(false);
        jLabel2.setVisible(false);
        //txtCustomersid.setEditable(true);
        //txtStaffId.setEditable(true);
        btnModificar.setEnabled(false);
        btnBorrar.setEnabled(false);
        btnPagar.setEnabled(false);
        btnAgregar.setEnabled(true);
        btnLimpiar.setEnabled(true);
        TablaDeDatosPrin.setFocusable(false);
    }
    
    void deshabilitarTexts(){
        //txtId.setEditable(false);
        txtId.setVisible(true);
        jLabel2.setVisible(true);
        //txtCustomersid.setEditable(false);
        //txtStaffId.setEditable(false);
        cBoxStaffId.setSelectedIndex(0);
        cBoxCustId.setSelectedIndex(0);
        btnAgregar.setEnabled(false);
        btnLimpiar.setEnabled(false);
        btnModificar.setEnabled(true);
        btnBorrar.setEnabled(true);
        btnPagar.setEnabled(true);
        btnNvoRegistro.setText("Nuevo Registro");
        TablaDeDatosPrin.setFocusable(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaDeDatosPrin;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNvoRegistro;
    private javax.swing.JButton btnPagar;
    private javax.swing.JComboBox<String> cBoxCustId;
    private javax.swing.JComboBox<String> cBoxStaffId;
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
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
