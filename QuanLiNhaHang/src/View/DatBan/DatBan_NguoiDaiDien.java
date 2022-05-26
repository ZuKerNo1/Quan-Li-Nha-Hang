/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.DatBan;

import Manager.ManagerDatBan;
import Service.CustomerService;
import Service.DatBanService;
import Service.HoaDonService;
import Service.TraCuuBanService;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Customer;
import model.DatBan;

/**
 *
 * @author FSC
 */
public class DatBan_NguoiDaiDien extends javax.swing.JFrame {

    DatBan datBan = new DatBan();

    DatBanService datBanService = new DatBanService();

    TraCuuBanService traCuuBanService = new TraCuuBanService();
    HoaDonService hoaDonService = new HoaDonService();;

    /**
     * Creates new form DatBan
     */
    public DatBan_NguoiDaiDien() {
        initComponents();
        setLocationRelativeTo(null);
    }

    DatBan_NguoiDaiDien(String ID) throws SQLException {
        initComponents();
        idBA.setText(traCuuBanService.getIdTabel(ID));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnM = new javax.swing.JPanel();
        submitBtn_352 = new javax.swing.JButton();
        backBtn_352 = new javax.swing.JButton();
        clearBtn_352 = new javax.swing.JButton();
        txtRole_352 = new com.raven.suportSwing.TextField();
        female_352 = new com.raven.suportSwing.RadioButtonCustom();
        male_352 = new com.raven.suportSwing.RadioButtonCustom();
        txtPhone_352 = new com.raven.suportSwing.TextField();
        jLabel3 = new javax.swing.JLabel();
        txtName_352 = new com.raven.suportSwing.TextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        idBA = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRequest_352 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dayDat_352 = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAddress_352 = new javax.swing.JTextArea();
        updateBtn_352 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        clrdoB_352 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 50));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        btnM.setBackground(new java.awt.Color(255, 255, 255));

        submitBtn_352.setBackground(new java.awt.Color(255, 102, 51));
        submitBtn_352.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn_352.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn_352.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/submit.png"))); // NOI18N
        submitBtn_352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn_352ActionPerformed(evt);
            }
        });

        backBtn_352.setBackground(new java.awt.Color(255, 102, 51));
        backBtn_352.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn_352.setForeground(new java.awt.Color(255, 255, 255));
        backBtn_352.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        backBtn_352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_352ActionPerformed(evt);
            }
        });

        clearBtn_352.setBackground(new java.awt.Color(255, 102, 51));
        clearBtn_352.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clearBtn_352.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn_352.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/broom.png"))); // NOI18N
        clearBtn_352.setText("CLEAR ALL");

        txtRole_352.setLabelText("Nhân viên phụ trách");
        txtRole_352.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRole_352FocusGained(evt);
            }
        });
        txtRole_352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRole_352ActionPerformed(evt);
            }
        });

        buttonGroup1.add(female_352);
        female_352.setText("Nữ");

        buttonGroup1.add(male_352);
        male_352.setSelected(true);
        male_352.setText("Nam");

        txtPhone_352.setLabelText("Điện thoại");
        txtPhone_352.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPhone_352FocusGained(evt);
            }
        });

        jLabel3.setText("Giới tính");

        txtName_352.setLabelText("Tên");
        txtName_352.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtName_352FocusGained(evt);
            }
        });
        txtName_352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtName_352ActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thông tin đặt bàn:");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_table.png"))); // NOI18N
        jLabel1.setText("ĐẶT BÀN");

        idBA.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        idBA.setText("ID Bàn ăn");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 767, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(idBA, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idBA))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        txtRequest_352.setColumns(20);
        txtRequest_352.setRows(5);
        jScrollPane1.setViewportView(txtRequest_352);

        jLabel4.setText("Địa chỉ");

        jLabel5.setText("Ngày đặt");

        jLabel6.setText("Yêu cầu đặc biệt");

        txtAddress_352.setColumns(20);
        txtAddress_352.setRows(5);
        jScrollPane2.setViewportView(txtAddress_352);

        updateBtn_352.setBackground(new java.awt.Color(255, 102, 51));
        updateBtn_352.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateBtn_352.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn_352.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/updating.png"))); // NOI18N
        updateBtn_352.setText("UPDATE");
        updateBtn_352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn_352ActionPerformed(evt);
            }
        });

        jLabel7.setText("Ngày sinh");

        javax.swing.GroupLayout btnMLayout = new javax.swing.GroupLayout(btnM);
        btnM.setLayout(btnMLayout);
        btnMLayout.setHorizontalGroup(
            btnMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(btnMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMLayout.createSequentialGroup()
                        .addGroup(btnMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMLayout.createSequentialGroup()
                                .addComponent(backBtn_352, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateBtn_352)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(clearBtn_352))
                            .addGroup(btnMLayout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addGroup(btnMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName_352, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPhone_352, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtRole_352, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                .addGap(115, 115, 115)
                                .addGroup(btnMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(btnMLayout.createSequentialGroup()
                                        .addComponent(dayDat_352, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 116, Short.MAX_VALUE))
                                    .addGroup(btnMLayout.createSequentialGroup()
                                        .addGroup(btnMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel3)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(btnMLayout.createSequentialGroup()
                                                .addComponent(male_352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(47, 47, 47)
                                                .addComponent(female_352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(clrdoB_352, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(18, 18, 18)
                        .addComponent(submitBtn_352, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        btnMLayout.setVerticalGroup(
            btnMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnMLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(btnMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(btnMLayout.createSequentialGroup()
                        .addComponent(txtName_352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhone_352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(txtRole_352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(btnMLayout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dayDat_352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clrdoB_352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(btnMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(male_352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(female_352, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(btnMLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn_352, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn_352, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitBtn_352, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn_352, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(btnM);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn_352ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn_352ActionPerformed
        try {
            // TODO add your handling code here:
            new TraCuuBan().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DatBan_NguoiDaiDien.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_backBtn_352ActionPerformed

    private void txtRole_352FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRole_352FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_txtRole_352FocusGained

    private void txtRole_352ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRole_352ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRole_352ActionPerformed

    private void txtName_352FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtName_352FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName_352FocusGained

    private void txtName_352ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtName_352ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtName_352ActionPerformed

    private void txtPhone_352FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhone_352FocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_txtPhone_352FocusGained

    private void submitBtn_352ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn_352ActionPerformed
        
        Customer customer = new Customer();
        CustomerService customerService = new CustomerService();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String dateDat = sdf.format(dayDat_352.getDate());
        String date = sdf.format(clrdoB_352.getDate());
        try {
            // ktra xem trong db co khach hang nao co so dt trung` k neu k thi add du lieu khach hang vao db
            if (customerService.getCustomerById(txtPhone_352.getText()) == null) {
                
                datBan.setPhone_352(txtPhone_352.getText());
                datBan.setName_352(txtName_352.getText());               
                datBan.setRole_352(txtRole_352.getText());
                datBan.setAddress_352(txtAddress_352.getText());
                datBan.setDayDat_352(dateDat);
                datBan.setRequest_352(txtRequest_352.getText());               
                // lay ra gia tri cho gender
                String gender = "";
                if(male_352.isSelected()){
                    gender += "Nam";
                }else if(female_352.isSelected()){
                    gender += "Nữ";
                }
                datBan.setGender_352(gender);
                // Lay gia tri cho idBA

                datBan.setIdBA_352(this.idBA.getText());

                try {
                    datBanService.addDatBan(datBan);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(DatBan_NguoiDaiDien.this, "Thêm bàn không thành công", "Lỗi", JOptionPane.ERROR_MESSAGE);
                    Logger.getLogger(DatBan_NguoiDaiDien.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(DatBan_NguoiDaiDien.this, "Thêm bàn thành công", "Thành công", JOptionPane.PLAIN_MESSAGE);
                // add du lieu vao bang khach hang
                customer.setName_354(txtName_352.getText());               
                customer.setDob_354(date);             
                customer.setGender_354(gender);
                customer.setAddress_354(txtAddress_352.getText());
                customer.setPhone_354(txtPhone_352.getText());
                customerService.addCustomer(customer);
                //end
                // add du lieu vao` bang dat ban
                
                JOptionPane.showMessageDialog(DatBan_NguoiDaiDien.this, "Đặt bàn thành công");
            } else {
                
                JOptionPane.showMessageDialog(DatBan_NguoiDaiDien.this, "SĐT đã được đăng ký");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DatBan_NguoiDaiDien.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            hoaDonService.addHoaDon(idBA.getText(), txtRole_352.getText());
        } catch (SQLException ex) {
            Logger.getLogger(DatBan_NguoiDaiDien.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            new TraCuuBan().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(DatBan_NguoiDaiDien.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_submitBtn_352ActionPerformed

    private void updateBtn_352ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn_352ActionPerformed

        /*StringBuilder sb= new StringBuilder();
       if(txtPhone_352.getText().equals("")){
           sb.append("SĐT không được dể trống ");
           //txtPhone_352.setBackground(Color.red);
       }else{
          // txtPhone_352.setBackground(Color.white);
       }
       if(sb.length()>0){
           JOptionPane.showMessageDialog(this, sb);
           return;
       }
       if (JOptionPane.showConfirmDialog(this, "bạn có muốn update không")== JOptionPane.NO_OPTION){
           return;
       }
       
       try {
            DatBan datban = new DatBan() ; 
            datban.setName_352(txtName_352.getText());
            datban.setPhone_352(txtPhone_352.getText());
            datban.setRole_352(txtRole_352.getText());
            datban.setAddress_352(txtAddress_352.getText());
        
            datban.setRequest_352(txtRequest_352.getText());
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM--dd");
            String date = sdf.format(dayDat_352.getDate());
            
            String gender = "";
            if(male_352.isSelected()){
                gender += "Nam";
            }else if(female_352.isSelected()){
                gender += "Nữ";
            }
           
            ManagerDatBan mdatban =new ManagerDatBan();
            mdatban.update(datban);
            
            JOptionPane.showMessageDialog(this, "Thông tin đã được cập nhập");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Errol " +e.getMessage());
            e.printStackTrace();
        }
         */
    }//GEN-LAST:event_updateBtn_352ActionPerformed

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
            java.util.logging.Logger.getLogger(DatBan_NguoiDaiDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatBan_NguoiDaiDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatBan_NguoiDaiDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatBan_NguoiDaiDien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DatBan_NguoiDaiDien().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn_352;
    private javax.swing.JPanel btnM;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clearBtn_352;
    private com.toedter.calendar.JDateChooser clrdoB_352;
    private com.toedter.calendar.JDateChooser dayDat_352;
    private com.raven.suportSwing.RadioButtonCustom female_352;
    private javax.swing.JLabel idBA;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private com.raven.suportSwing.RadioButtonCustom male_352;
    private javax.swing.JButton submitBtn_352;
    private javax.swing.JTextArea txtAddress_352;
    private com.raven.suportSwing.TextField txtName_352;
    private com.raven.suportSwing.TextField txtPhone_352;
    private javax.swing.JTextArea txtRequest_352;
    private com.raven.suportSwing.TextField txtRole_352;
    private javax.swing.JButton updateBtn_352;
    // End of variables declaration//GEN-END:variables
}
