/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsms;

import vsms.folder.MySqlConnect;
import vsms.folder.Employee;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author SAMI
 */
public class AllEmployee extends javax.swing.JFrame {
    java.sql.Date sqlDate;
    java.util.Date date;
    
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    
    String Gender;
    String type;

   
    public AllEmployee() {
        initComponents();
        show_employee();
    }
    
    public ArrayList<Employee> employeeList(){
        ArrayList<Employee> employeeList = new ArrayList<>();
        try{
            conn= MySqlConnect.ConnectDB();
            String query = "select * from users";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            Employee employee;
            while(rs.next()){
                employee = new Employee (rs.getInt("id"),rs.getString("password"),rs.getString("address"),rs.getString("type"),rs.getString("position"),rs.getString("gender"),rs.getString("email"),rs.getString("first_name"),rs.getString("last_name"),rs.getString("mobile"),rs.getString("birthday"));
                employeeList.add(employee);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        return employeeList;
    }
    
    public void show_employee(){
        ArrayList<Employee> list = employeeList();
        DefaultTableModel model= (DefaultTableModel)employeeInformation.getModel();
        Object[] row = new Object[11];
        for(int i =0; i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]= list.get(i).getFirstName();
            row[2]= list.get(i).getLastName();
            row[3]= list.get(i).getEmail();
            row[4]= list.get(i).getMobile();
            row[5]= list.get(i).getPosition();
            row[6]= list.get(i).getGender();
            row[7]= list.get(i).getBirthday();
            row[8]= list.get(i).getType();
            row[9]= list.get(i).getPassword();
            row[10]= list.get(i).getAddress();
            model.addRow(row);
      
            
        }
    }
    
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeGroup = new javax.swing.ButtonGroup();
        genderGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeInformation = new javax.swing.JTable();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        userType = new javax.swing.JLabel();
        dateOfBirth = new javax.swing.JLabel();
        Position = new javax.swing.JLabel();
        password = new javax.swing.JLabel();
        positionTxt = new javax.swing.JTextField();
        lastTxt = new javax.swing.JTextField();
        firstTxt = new javax.swing.JTextField();
        emailTxt = new javax.swing.JTextField();
        mobileTxt = new javax.swing.JTextField();
        passwordTxt = new javax.swing.JPasswordField();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        addressTxt = new javax.swing.JTextArea();
        adminButton = new javax.swing.JRadioButton();
        employeeButton = new javax.swing.JRadioButton();
        Position1 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        idText = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        dashboard = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        addEmployee = new javax.swing.JMenuItem();
        allEmployee = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        addManufacturer = new javax.swing.JMenuItem();
        addModel = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        allVechiles = new javax.swing.JMenuItem();
        soldVechiles = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("   Employee Information");

        employeeInformation.setBackground(new java.awt.Color(153, 153, 153));
        employeeInformation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        employeeInformation.setFont(new java.awt.Font("Times New Roman", 1, 10)); // NOI18N
        employeeInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Mobile", "Position", "Gender", "Date Of Birth", "Aceess", "Password", "Address"
            }
        ));
        employeeInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeInformationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeInformation);

        updateButton.setBackground(new java.awt.Color(153, 153, 153));
        updateButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update.PNG"))); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(153, 153, 153));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.PNG"))); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("UPDATE EMPLOYEE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("First Name:");

        email.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        email.setText("Email :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Last Name:");

        mobile.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        mobile.setText("Mobile:");

        address.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        address.setText("Address:");

        userType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        userType.setText("User Type:");

        dateOfBirth.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        dateOfBirth.setText("Date Of Birth:");

        Position.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Position.setText("Position:");

        password.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        password.setText("Password:");

        mobileTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobileTxtActionPerformed(evt);
            }
        });
        mobileTxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileTxtKeyTyped(evt);
            }
        });

        maleButton.setBackground(new java.awt.Color(153, 153, 153));
        genderGroup.add(maleButton);
        maleButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        maleButton.setText("Male");

        femaleButton.setBackground(new java.awt.Color(153, 153, 153));
        genderGroup.add(femaleButton);
        femaleButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        femaleButton.setText("Female");

        addressTxt.setColumns(20);
        addressTxt.setRows(5);
        jScrollPane3.setViewportView(addressTxt);

        typeGroup.add(adminButton);
        adminButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adminButton.setText("Admin");

        typeGroup.add(employeeButton);
        employeeButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        employeeButton.setText("Employee");

        Position1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Position1.setText("Gender:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("ID:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Position1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(adminButton)
                                .addGap(18, 18, 18)
                                .addComponent(employeeButton))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(288, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(maleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(femaleButton))
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170)
                        .addComponent(updateButton)
                        .addGap(95, 95, 95)
                        .addComponent(deleteButton)
                        .addGap(0, 171, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(positionTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(mobileTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(lastTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(passwordTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(emailTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(firstTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                    .addComponent(idText))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(idText, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobileTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Position, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(positionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Position1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maleButton, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(femaleButton)
                            .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(userType, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adminButton)
                    .addComponent(employeeButton))
                .addContainerGap(162, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 51, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 5));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setAlignmentX(5.0F);
        jMenuBar1.setAlignmentY(5.0F);
        jMenuBar1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jMenuBar1.setMargin(new java.awt.Insets(10, 10, 10, 10));

        dashboard.setBackground(new java.awt.Color(0, 102, 102));
        dashboard.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 204), 5));
        dashboard.setText("Dashboard     ");
        dashboard.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardActionPerformed(evt);
            }
        });
        jMenuBar1.add(dashboard);

        jMenu2.setBackground(new java.awt.Color(0, 51, 51));
        jMenu2.setText("Manage Employee     ");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        addEmployee.setText("Add Employee");
        addEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(addEmployee);

        allEmployee.setText("All Employee");
        allEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allEmployeeActionPerformed(evt);
            }
        });
        jMenu2.add(allEmployee);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Manufacturer & Model     ");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        addManufacturer.setText("Add Manufacturer");
        addManufacturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addManufacturerActionPerformed(evt);
            }
        });
        jMenu3.add(addManufacturer);

        addModel.setText("Add Model");
        addModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addModelActionPerformed(evt);
            }
        });
        jMenu3.add(addModel);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Vechiles     ");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N

        allVechiles.setText("All Vechiles");
        allVechiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allVechilesActionPerformed(evt);
            }
        });
        jMenu4.add(allVechiles);

        soldVechiles.setText("Sold Vechiles");
        soldVechiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soldVechilesActionPerformed(evt);
            }
        });
        jMenu4.add(soldVechiles);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardActionPerformed
        // TODO add your handling code here:
        Dashboard d = new Dashboard();
        d.setVisible(true);
        dispose();
    }//GEN-LAST:event_dashboardActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
        // TODO add your handling code here:
        AddEmployee addemp = new AddEmployee();
        addemp.setVisible(true);
        dispose();
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void allEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allEmployeeActionPerformed
        // TODO add your handling code here:
        AllEmployee allemp = new AllEmployee();
        allemp.setVisible(true);
        dispose();
    }//GEN-LAST:event_allEmployeeActionPerformed

    private void addManufacturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addManufacturerActionPerformed
        // TODO add your handling code here:
        AddManufacturer manufacturer = new AddManufacturer();
        manufacturer.setVisible(true);
        dispose();
    }//GEN-LAST:event_addManufacturerActionPerformed

    private void addModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addModelActionPerformed
        // TODO add your handling code here:
        AddModel model = new AddModel();
        model.setVisible(true);
        dispose();
    }//GEN-LAST:event_addModelActionPerformed

    private void allVechilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allVechilesActionPerformed
        // TODO add your handling code here:
        AllVechiles allvechiles = new AllVechiles();
        allvechiles.setVisible(true);
        dispose();
    }//GEN-LAST:event_allVechilesActionPerformed

    private void soldVechilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soldVechilesActionPerformed
        // TODO add your handling code here:
        SoldVechiles soldvechiles = new SoldVechiles();
        soldvechiles.setVisible(true);
        dispose();
    }//GEN-LAST:event_soldVechilesActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
         conn= MySqlConnect.ConnectDB();
         int row = employeeInformation.getSelectedRow();
         String value = employeeInformation.getModel().getValueAt(row, 0).toString();
        String update = "update users set email = ?,password = ?,first_name = ?,last_name = ?,mobile = ?,position = ?,gender = ?,birthday=?,address = ?,type = ? where id = "+value;
        //SimpleDateFormat format = new SimpleDateFormat( "MM/dd/yyyy" );  // United States style of format.
        
        try{
            pst = conn.prepareStatement(update);
            
            pst.setString(1,emailTxt.getText());
            pst.setString(2, passwordTxt.getText());
            pst.setString(3, firstTxt.getText());
            pst.setString(4, lastTxt.getText());
            pst.setString(5, mobileTxt.getText());
            pst.setString(6, positionTxt.getText());
            if(maleButton.isSelected()){
                Gender  = "male";
            }
            if(femaleButton.isSelected()){
                Gender = "female";
            }
            pst.setString(7, Gender);
            date = jDateChooser1.getDate();
            sqlDate = new java.sql.Date(date.getTime());
            pst.setDate(8, sqlDate);
           
        
       
            //pst.setString(8, ((JTextField)dateTxt.getDateEditor().getUiComponent()).getText());
            pst.setString(9, addressTxt.getText());
            
            if(adminButton.isSelected()){
                type  = "admin";
            }
            if(employeeButton.isSelected()){
                type = "employee";
            }
            pst.setString(10, type);
            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)employeeInformation.getModel();
            model.setRowCount(0);
            show_employee();
            
            JOptionPane.showMessageDialog(null, "Updated Data Successfully");
           

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void mobileTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobileTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTxtActionPerformed

    private void mobileTxtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileTxtKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_mobileTxtKeyTyped

    private void employeeInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeInformationMouseClicked
        try {
            // TODO add your handling code here:
            
            
            int i = employeeInformation.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)employeeInformation.getModel();
            
            
            
            //idText.setText(Integer.parseInt( model.getValueAt(i, 1).toString() ));
            idText.setText(model.getValueAt(i, 0).toString());
            firstTxt.setText(model.getValueAt(i, 1).toString());
            lastTxt.setText(model.getValueAt(i, 2).toString());
            emailTxt.setText(model.getValueAt(i, 3).toString());
            mobileTxt.setText(model.getValueAt(i, 4).toString());
            positionTxt.setText(model.getValueAt(i, 5).toString());
            String sex = model.getValueAt(i, 6).toString();
            if(sex.equals("male")){
                maleButton.setSelected(true);
            }
            else{
                femaleButton.setSelected(true);
            }
            
             String s = (String)model.getValueAt(i, 7);
            
            SimpleDateFormat f=new SimpleDateFormat("yyyy-M-dd");
            java.util.Date d= f.parse(s);
            jDateChooser1.setDate(d);
            
            
            String t = model.getValueAt(i, 8).toString();
            if(t.equals("admin")){
                adminButton.setSelected(true);
            }
            else{
                employeeButton.setSelected(true);
            }
            passwordTxt.setText(model.getValueAt(i, 9).toString());
            addressTxt.setText(model.getValueAt(i, 10).toString());
            
           
            
         
        } catch (ParseException ex) {
            Logger.getLogger(AllEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    
        
    }//GEN-LAST:event_employeeInformationMouseClicked

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        conn= MySqlConnect.ConnectDB();
        int p = JOptionPane.showConfirmDialog(rootPane, "Do You really want to delete?", "Deleted", JOptionPane.YES_NO_OPTION);
        if(p==0){
            
            
        //SimpleDateFormat format = new SimpleDateFormat( "MM/dd/yyyy" );  // United States style of format.
        
        try{
            
            String delete = "delete from users where id = ?";
            pst = conn.prepareStatement(delete);
            pst.setString(1, idText.getText());

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)employeeInformation.getModel();
            model.setRowCount(0);
            show_employee();
            JOptionPane.showMessageDialog(null, "Delete Data Successfully");
           

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AllEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AllEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Position;
    private javax.swing.JLabel Position1;
    private javax.swing.JMenuItem addEmployee;
    private javax.swing.JMenuItem addManufacturer;
    private javax.swing.JMenuItem addModel;
    private javax.swing.JLabel address;
    private javax.swing.JTextArea addressTxt;
    private javax.swing.JRadioButton adminButton;
    private javax.swing.JMenuItem allEmployee;
    private javax.swing.JMenuItem allVechiles;
    private javax.swing.JMenu dashboard;
    private javax.swing.JLabel dateOfBirth;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel email;
    private javax.swing.JTextField emailTxt;
    private javax.swing.JRadioButton employeeButton;
    private javax.swing.JTable employeeInformation;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JTextField firstTxt;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JTextField idText;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField lastTxt;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JLabel mobile;
    private javax.swing.JTextField mobileTxt;
    private javax.swing.JLabel password;
    private javax.swing.JPasswordField passwordTxt;
    private javax.swing.JTextField positionTxt;
    private javax.swing.JMenuItem soldVechiles;
    private javax.swing.ButtonGroup typeGroup;
    private javax.swing.JButton updateButton;
    private javax.swing.JLabel userType;
    // End of variables declaration//GEN-END:variables
}
