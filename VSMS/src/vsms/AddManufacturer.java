/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vsms;

import vsms.folder.MySqlConnect;
import vsms.folder.Menufacturer;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SAMI
 */
public class AddManufacturer extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    static String domain;
    
    public AddManufacturer() {
        initComponents();
        show_manufacturer();
    }

    public ArrayList<Menufacturer> manufacturerList(){
        ArrayList<Menufacturer> manufacturerList = new ArrayList<>();
        try{
            conn= MySqlConnect.ConnectDB();
            String query = "select * from manufacturers";
            pst = conn.prepareStatement(query);
            rs = pst.executeQuery();
            Menufacturer manufacturer;
            while(rs.next()){
                manufacturer = new Menufacturer (rs.getInt("id"),rs.getString("manufacturer_name"));
                manufacturerList.add(manufacturer);
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        return manufacturerList;
    }
    
    public void show_manufacturer(){
        ArrayList<Menufacturer> list = manufacturerList();
        DefaultTableModel model= (DefaultTableModel)manufacturerInformation.getModel();
        Object[] row = new Object[2];
        for(int i =0; i<list.size();i++){
            row[0]=list.get(i).getId();
            row[1]= list.get(i).getManufacturerName();
            model.addRow(row);
      
            
        }
       
    
            
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        manufacturerInformation = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menufacturerText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        fileText = new javax.swing.JTextField();
        fileButton = new javax.swing.JButton();
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

        manufacturerInformation.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Logo"
            }
        ));
        manufacturerInformation.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manufacturerInformationMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(manufacturerInformation);

        deleteButton.setBackground(new java.awt.Color(153, 153, 153));
        deleteButton.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.PNG"))); // NOI18N
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("ALL MENUFACTURER");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Logo:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("ADD NEW MENUFACTURER");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Menufacturer Name:");

        addButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/insert.PNG"))); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        fileButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        fileButton.setText("File chooser");
        fileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(deleteButton)
                .addGap(28, 28, 28))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(fileButton, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fileText))
                            .addComponent(menufacturerText, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(202, 202, 202))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menufacturerText, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileText, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fileButton)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 80, Short.MAX_VALUE)
                .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void fileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fileButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        fileText.setText(filename);
        
    }//GEN-LAST:event_fileButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        conn= MySqlConnect.ConnectDB();
        
        String insert = "insert into manufacturers(manufacturer_name) values(?)";
        
        try{
            pst = conn.prepareStatement(insert);
            
            pst.setString(1,menufacturerText.getText());

            
            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)manufacturerInformation.getModel();
            model.setRowCount(0);
            show_manufacturer();

            JOptionPane.showMessageDialog(null, "Inserted Data Successfully");
           

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        conn= MySqlConnect.ConnectDB();
        int p = JOptionPane.showConfirmDialog(rootPane, "Do You really want to delete?", "Deleted", JOptionPane.YES_NO_OPTION);
        if(p==0){
            
            
        //SimpleDateFormat format = new SimpleDateFormat( "MM/dd/yyyy" );  // United States style of format.
        
        try{
            
            String delete = "delete from manufacturers where id ="+domain;
            pst = conn.prepareStatement(delete);
            //pst.setString(1, domain);

            pst.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)manufacturerInformation.getModel();
            model.setRowCount(0);
            show_manufacturer();
            JOptionPane.showMessageDialog(null, "Delete Data Successfully");
           

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);

        }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void manufacturerInformationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manufacturerInformationMouseClicked
          try {
            // TODO add your handling code here:
            
            DefaultTableModel model = (DefaultTableModel)manufacturerInformation.getModel();
            //int i = manufacturerInformation.getSelectedRow();
           //String domain;
            int[] row_indexes= manufacturerInformation.getSelectedRows();
            for(int i=0;i<row_indexes.length;i++){
            domain= manufacturerInformation.getValueAt(row_indexes[i], 0).toString();  
            //System.out.println( domain);
}
            
    

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_manufacturerInformationMouseClicked

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
            java.util.logging.Logger.getLogger(AddManufacturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddManufacturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddManufacturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddManufacturer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddManufacturer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JMenuItem addEmployee;
    private javax.swing.JMenuItem addManufacturer;
    private javax.swing.JMenuItem addModel;
    private javax.swing.JMenuItem allEmployee;
    private javax.swing.JMenuItem allVechiles;
    private javax.swing.JMenu dashboard;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton fileButton;
    private javax.swing.JTextField fileText;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable manufacturerInformation;
    private javax.swing.JTextField menufacturerText;
    private javax.swing.JMenuItem soldVechiles;
    // End of variables declaration//GEN-END:variables
}
