/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View.NhanVien;

import Service.EmployeeService;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import model.Employee;

/**
 *
 * @author AD
 */
public class ViewEmployee extends javax.swing.JFrame {
    DefaultTableModel defaulttableModel_354;
    Employee employee_354;
    EmployeeService serviceEmployee_354;
    /**
     * Creates new form ViewEmployee
     */
    public ViewEmployee() throws SQLException {
        initComponents();
        employee_354 = new Employee();
        serviceEmployee_354 = new EmployeeService();
        defaulttableModel_354 = new DefaultTableModel(){
            @Override
            public boolean isCellEditable(int row, int column) {
                return super.isCellEditable(row, column); //To change body of generated methods, choose Tools | Templates.
            }
        };
        table_354.setModel(defaulttableModel_354);
        defaulttableModel_354.addColumn("ID");
        defaulttableModel_354.addColumn("TÊN");
        defaulttableModel_354.addColumn("NGÀY SINH");
        defaulttableModel_354.addColumn("GIỚI TÍNH");
        defaulttableModel_354.addColumn("SỐ ĐIỆN THOẠI");
        defaulttableModel_354.addColumn("ĐỊA CHỈ");
        defaulttableModel_354.addColumn("CHỨC VỤ");
        defaulttableModel_354.addColumn("LƯƠNG");
        defaulttableModel_354.addColumn("TÌNH TRẠNG");
        table_354.getColumnModel().getColumn(0).setMaxWidth(60);
        table_354.getColumnModel().getColumn(1).setMinWidth(100);
        table_354.getColumnModel().getColumn(2).setMinWidth(80);
        table_354.getColumnModel().getColumn(3).setMaxWidth(80);
        table_354.getColumnModel().getColumn(4).setMinWidth(100);
        table_354.getColumnModel().getColumn(5).setMinWidth(100);
        table_354.getColumnModel().getColumn(6).setMinWidth(50);
        table_354.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
        table_354.getTableHeader().setPreferredSize(new Dimension(100, 50));
        table_354.setRowHeight(50);
        table_354.validate();
        table_354.repaint();
        setTableData_354(serviceEmployee_354.getAllEmployees());
        label_354.setText(String.valueOf(defaulttableModel_354.getRowCount()));
        
        // thay doi thanh scroll bar
        try{
            for(UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
            if("Windows".equals(info.getName())){
                UIManager.setLookAndFeel(info.getClassName());
                break;
            }
            }
        } catch(Exception e){
            e.getMessage();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        search_354 = new javax.swing.JTextField();
        searchBtn_354 = new javax.swing.JButton();
        backBtn_354 = new javax.swing.JButton();
        updateBtn_354 = new javax.swing.JButton();
        deleteBtn_354 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        table_354 = new com.raven.suportSwing.TableColumn();
        addBtn_354 = new javax.swing.JButton();
        refreshBtn_354 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        label_354 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(232, 64, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/employee.png"))); // NOI18N
        jLabel1.setText("QUẢN LÍ NHÂN VIÊN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 649, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        search_354.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchBtn_354.setBackground(new java.awt.Color(255, 255, 255));
        searchBtn_354.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        searchBtn_354.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtn_354ActionPerformed(evt);
            }
        });

        backBtn_354.setBackground(new java.awt.Color(232, 64, 60));
        backBtn_354.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        backBtn_354.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_354ActionPerformed(evt);
            }
        });

        updateBtn_354.setBackground(new java.awt.Color(232, 64, 60));
        updateBtn_354.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/update.png"))); // NOI18N
        updateBtn_354.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn_354ActionPerformed(evt);
            }
        });

        deleteBtn_354.setBackground(new java.awt.Color(232, 64, 60));
        deleteBtn_354.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/delete.png"))); // NOI18N
        deleteBtn_354.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn_354ActionPerformed(evt);
            }
        });

        table_354.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Tên nhân viên", "Ngày sinh", "Giới tính", "Số điện thoại", "Địa chỉ", "Chức vụ", "Tình trạng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table_354.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(table_354);

        addBtn_354.setBackground(new java.awt.Color(232, 64, 60));
        addBtn_354.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/more.png"))); // NOI18N
        addBtn_354.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn_354ActionPerformed(evt);
            }
        });

        refreshBtn_354.setBackground(new java.awt.Color(232, 64, 60));
        refreshBtn_354.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/updating.png"))); // NOI18N
        refreshBtn_354.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtn_354ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(search_354, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBtn_354))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refreshBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(deleteBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(searchBtn_354, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(search_354, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 15, Short.MAX_VALUE))
                    .addComponent(addBtn_354, javax.swing.GroupLayout.DEFAULT_SIZE, 56, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshBtn_354, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TỔNG SỐ NHÂN VIÊN");

        label_354.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        label_354.setText("jLabel4");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(label_354, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(label_354, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBtn_354ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn_354ActionPerformed
        // TODO add your handling code here:
        new AddEmployee().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addBtn_354ActionPerformed

    private void backBtn_354ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn_354ActionPerformed
        // TODO add your handling code here:
        //new mainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtn_354ActionPerformed

    private void updateBtn_354ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn_354ActionPerformed
        // TODO add your handling code here:
        int row_354 = table_354.getSelectedRow();
        if(row_354 == -1){
            JOptionPane.showMessageDialog(ViewEmployee.this, "Vui lòng chọn dòng dữ liệu muốn thay đổi", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }else{
            String employeeID_354 = (String) table_354.getValueAt(row_354, 0);
            try {
                new UpdateEmployee(employeeID_354).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(ViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        }
    }//GEN-LAST:event_updateBtn_354ActionPerformed

    private void deleteBtn_354ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn_354ActionPerformed
        // TODO add your handling code here:
        int row_354 = table_354.getSelectedRow();
        if(row_354 == -1){
            JOptionPane.showMessageDialog(ViewEmployee.this, "Vui lòng chọn dòng dữ liệu muốn xoá", "lỗi", JOptionPane.ERROR_MESSAGE);
        }else{
            int confirm_354 = JOptionPane.showConfirmDialog(ViewEmployee.this, "Bạn có chắc chắn muốn xoá");
            
            if(confirm_354 == JOptionPane.YES_OPTION){
                String employeeID = String.valueOf(table_354.getValueAt(row_354, 0));
                try {
                    serviceEmployee_354.deleteEmployee(employeeID);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
            }
            defaulttableModel_354.setRowCount(0);
            try {
                setTableData_354(serviceEmployee_354.getAllEmployees());
            } catch (SQLException ex) {
                Logger.getLogger(ViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
            label_354.setText(String.valueOf(defaulttableModel_354.getRowCount()));
        }
    }//GEN-LAST:event_deleteBtn_354ActionPerformed

    private void refreshBtn_354ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtn_354ActionPerformed
        // TODO add your handling code here:
        defaulttableModel_354.setRowCount(0);
        try {
            setTableData_354(serviceEmployee_354.getAllEmployees());
        } catch (SQLException ex) {
            Logger.getLogger(ViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshBtn_354ActionPerformed

    private void searchBtn_354ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtn_354ActionPerformed
        // TODO add your handling code here:
        Employee e_354 = new Employee();
        String find = search_354.getText();
        if(find == ""){
            try {
                setTableData_354(serviceEmployee_354.getAllEmployees());
            } catch (SQLException ex) {
                Logger.getLogger(ViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                if (serviceEmployee_354.find(find) != null) {
                    try {
                        defaulttableModel_354.setRowCount(0);
                        setTableData_354(serviceEmployee_354.find(find));
                    } catch (SQLException ex) {
                        Logger.getLogger(ViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } else {
                    defaulttableModel_354.setNumRows(0);
                    JOptionPane.showMessageDialog(null, "Không có trong danh sách");
                }
            } catch (SQLException ex) {
                Logger.getLogger(ViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_searchBtn_354ActionPerformed
    private void setTableData_354(List<Employee> Employees){
        for(Employee employee_354: Employees){
            defaulttableModel_354.addRow(new Object[]{employee_354.getId_354(), employee_354.getName_354(), employee_354.getDob_354(), employee_354.getGender_354(), employee_354.getPhone_354(),
            employee_354.getAddress_354(), employee_354.getRole_354(), employee_354.getSalary_354(), employee_354.getStatus_354()});
        }
    }  
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewEmployee().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewEmployee.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn_354;
    private javax.swing.JButton backBtn_354;
    private javax.swing.JButton deleteBtn_354;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel label_354;
    private javax.swing.JButton refreshBtn_354;
    private javax.swing.JButton searchBtn_354;
    private javax.swing.JTextField search_354;
    private com.raven.suportSwing.TableColumn table_354;
    private javax.swing.JButton updateBtn_354;
    // End of variables declaration//GEN-END:variables
}
