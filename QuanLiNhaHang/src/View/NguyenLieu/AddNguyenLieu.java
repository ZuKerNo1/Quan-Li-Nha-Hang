/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.NguyenLieu;

import Service.NguyenLieuService;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.NguyenLieu;

/**
 *
 * @author FSC
 */
public class AddNguyenLieu extends javax.swing.JFrame {
    NguyenLieuService nlService = new NguyenLieuService();
    /**
     * Creates new form AddNguyenLieu
     */
    public AddNguyenLieu() {
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
        titlePanel_360 = new javax.swing.JPanel();
        titleLabel_373 = new javax.swing.JLabel();
        mainPanel_360 = new javax.swing.JPanel();
<<<<<<< HEAD
        backBtn_360 = new javax.swing.JButton();
        clearBtn_360 = new javax.swing.JButton();
        submitBtn_360 = new javax.swing.JButton();
        idNguyenLieuText_360 = new com.raven.suportSwing.TextField();
        nameNguyenLieuText_360 = new com.raven.suportSwing.TextField();
        amountNguyenLieuText_360 = new com.raven.suportSwing.TextField();
        staffNguyenLieuText_360 = new com.raven.suportSwing.TextField();
        unitNguyenLieuCB_360 = new com.raven.suportSwing.Combobox();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 150));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titlePanel_360.setBackground(new java.awt.Color(255, 255, 255));

        titleLabel_373.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
=======
        jPanel2 = new javax.swing.JPanel();
        idNguyenLieu_360 = new javax.swing.JLabel();
        nameNguyenLieuText_360 = new javax.swing.JTextField();
        amountNguyenLieuText_360 = new javax.swing.JTextField();
        unitNguyenLieuCB_360 = new javax.swing.JComboBox<>();
        idNguyenLieuText_360 = new javax.swing.JTextField();
        staffNguyenLieuText_360 = new javax.swing.JTextField();
        staffNguyenLieu_360 = new javax.swing.JLabel();
        amountNguyenLieu_360 = new javax.swing.JLabel();
        nameNguyenLieu_360 = new javax.swing.JLabel();
        unitNguyenLieu_360 = new javax.swing.JLabel();
        backBtn_360 = new javax.swing.JButton();
        clearBtn_360 = new javax.swing.JButton();
        submitBtn_360 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titlePanel_360.setBackground(new java.awt.Color(51, 255, 51));

        titleLabel_373.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        titleLabel_373.setForeground(new java.awt.Color(255, 255, 255));
>>>>>>> ThongKe
        titleLabel_373.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel_373.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/harvest.png"))); // NOI18N
        titleLabel_373.setText("NHẬP NGUYÊN LIỆU");

        javax.swing.GroupLayout titlePanel_360Layout = new javax.swing.GroupLayout(titlePanel_360);
        titlePanel_360.setLayout(titlePanel_360Layout);
        titlePanel_360Layout.setHorizontalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(titlePanel_360Layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(titleLabel_373)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
=======
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanel_360Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel_373)
                .addGap(87, 87, 87))
>>>>>>> ThongKe
        );
        titlePanel_360Layout.setVerticalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel_360Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLabel_373)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        mainPanel_360.setBackground(new java.awt.Color(255, 255, 255));

<<<<<<< HEAD
=======
        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        idNguyenLieu_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idNguyenLieu_360.setForeground(new java.awt.Color(51, 51, 51));
        idNguyenLieu_360.setText("MÃ NGUYÊN LIỆU");

        nameNguyenLieuText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        amountNguyenLieuText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        unitNguyenLieuCB_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        unitNguyenLieuCB_360.setForeground(new java.awt.Color(255, 255, 255));
        unitNguyenLieuCB_360.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogram", "Thùng", "Két" }));

        idNguyenLieuText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        staffNguyenLieuText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        staffNguyenLieu_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        staffNguyenLieu_360.setForeground(new java.awt.Color(51, 51, 51));
        staffNguyenLieu_360.setText("NHÂN VIÊN CẬP NHẬT");

        amountNguyenLieu_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        amountNguyenLieu_360.setForeground(new java.awt.Color(51, 51, 51));
        amountNguyenLieu_360.setText("SỐ LƯỢNG");

        nameNguyenLieu_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameNguyenLieu_360.setForeground(new java.awt.Color(51, 51, 51));
        nameNguyenLieu_360.setText("TÊN NGUYÊN LIỆU");

        unitNguyenLieu_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        unitNguyenLieu_360.setForeground(new java.awt.Color(51, 51, 51));
        unitNguyenLieu_360.setText("ĐƠN VỊ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nameNguyenLieu_360)
                    .addComponent(amountNguyenLieu_360)
                    .addComponent(staffNguyenLieu_360)
                    .addComponent(idNguyenLieu_360))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(amountNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unitNguyenLieu_360)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(unitNguyenLieuCB_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(staffNguyenLieuText_360)
                    .addComponent(nameNguyenLieuText_360)
                    .addComponent(idNguyenLieuText_360))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNguyenLieu_360)
                    .addComponent(idNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameNguyenLieu_360))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitNguyenLieuCB_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitNguyenLieu_360)
                    .addComponent(amountNguyenLieu_360))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(staffNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffNguyenLieu_360))
                .addContainerGap())
        );

>>>>>>> ThongKe
        backBtn_360.setBackground(new java.awt.Color(51, 255, 51));
        backBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        backBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        backBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_360ActionPerformed(evt);
            }
        });

        clearBtn_360.setBackground(new java.awt.Color(51, 255, 51));
        clearBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clearBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/broom.png"))); // NOI18N
        clearBtn_360.setText("CLEAR ALL");
<<<<<<< HEAD
        clearBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn_360ActionPerformed(evt);
            }
        });
=======
>>>>>>> ThongKe

        submitBtn_360.setBackground(new java.awt.Color(51, 255, 51));
        submitBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/submit.png"))); // NOI18N
        submitBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn_360ActionPerformed(evt);
            }
        });

<<<<<<< HEAD
        idNguyenLieuText_360.setLabelText("MÃ NGUYÊN LIỆU");
        idNguyenLieuText_360.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                idNguyenLieuText_360FocusGained(evt);
            }
        });

        nameNguyenLieuText_360.setLabelText("TÊN NGUYÊN LIỆU");
        nameNguyenLieuText_360.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameNguyenLieuText_360FocusGained(evt);
            }
        });

        amountNguyenLieuText_360.setLabelText("SỐ LƯỢNG");
        amountNguyenLieuText_360.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                amountNguyenLieuText_360FocusGained(evt);
            }
        });

        staffNguyenLieuText_360.setLabelText("NHÂN VIÊN CẬP NHẬP");
        staffNguyenLieuText_360.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                staffNguyenLieuText_360FocusGained(evt);
            }
        });

        unitNguyenLieuCB_360.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KILOGRAM", "THÙNG", "KÉT" }));
        unitNguyenLieuCB_360.setLabeText("");
        unitNguyenLieuCB_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                unitNguyenLieuCB_360ActionPerformed(evt);
            }
        });

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Thông tin nguyên liệu:");

=======
>>>>>>> ThongKe
        javax.swing.GroupLayout mainPanel_360Layout = new javax.swing.GroupLayout(mainPanel_360);
        mainPanel_360.setLayout(mainPanel_360Layout);
        mainPanel_360Layout.setHorizontalGroup(
            mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel_360Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3)
                    .addGroup(mainPanel_360Layout.createSequentialGroup()
                        .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountNguyenLieuText_360, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(staffNguyenLieuText_360, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(unitNguyenLieuCB_360, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanel_360Layout.createSequentialGroup()
                        .addComponent(backBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(349, 349, 349)
                        .addComponent(clearBtn_360)
                        .addGap(18, 18, 18)
                        .addComponent(submitBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel_360Layout.createSequentialGroup()
                        .addComponent(idNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nameNguyenLieuText_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(40, 40, 40))
=======
            .addGroup(mainPanel_360Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanel_360Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(mainPanel_360Layout.createSequentialGroup()
                        .addComponent(backBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearBtn_360)
                        .addGap(18, 18, 18)
                        .addComponent(submitBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
>>>>>>> ThongKe
        );
        mainPanel_360Layout.setVerticalGroup(
            mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_360Layout.createSequentialGroup()
<<<<<<< HEAD
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(amountNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitNguyenLieuCB_360, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(staffNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
=======
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
>>>>>>> ThongKe
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(submitBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(clearBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(backBtn_360, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
<<<<<<< HEAD
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(mainPanel_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
=======
            .addComponent(mainPanel_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> ThongKe
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titlePanel_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainPanel_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
<<<<<<< HEAD
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
=======
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
>>>>>>> ThongKe
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn_360ActionPerformed
        try {
            // TODO add your handling code here:
            new NguyenLieuView().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddNguyenLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_backBtn_360ActionPerformed

    private void submitBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn_360ActionPerformed
        // TODO add your handling code here:
        NguyenLieu nguyenLieu = new NguyenLieu();
        nguyenLieu.setIdNL_360(idNguyenLieuText_360.getText());
        nguyenLieu.setNameNL_360(nameNguyenLieuText_360.getText());
        nguyenLieu.setSoLuong_360(Integer.valueOf(amountNguyenLieuText_360.getText()));
        nguyenLieu.setDonVi_360(unitNguyenLieuCB_360.getSelectedItem().toString());
        nguyenLieu.setNhanVienCapNhap_360(staffNguyenLieuText_360.getText());
        try {
                nlService.addListNguyenLieu(nguyenLieu);
            } catch (SQLException ex) {
                Logger.getLogger(AddNguyenLieu.class.getName()).log(Level.SEVERE, null, ex);
            }
        try {
            new NguyenLieuView().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(AddNguyenLieu.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_submitBtn_360ActionPerformed

<<<<<<< HEAD
<<<<<<< HEAD
    private void idNguyenLieuText_360FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_idNguyenLieuText_360FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_idNguyenLieuText_360FocusGained

    private void nameNguyenLieuText_360FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameNguyenLieuText_360FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_nameNguyenLieuText_360FocusGained

    private void amountNguyenLieuText_360FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_amountNguyenLieuText_360FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_amountNguyenLieuText_360FocusGained

    private void staffNguyenLieuText_360FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_staffNguyenLieuText_360FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_staffNguyenLieuText_360FocusGained

    private void unitNguyenLieuCB_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_unitNguyenLieuCB_360ActionPerformed

    }//GEN-LAST:event_unitNguyenLieuCB_360ActionPerformed
=======
    private void clearBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn_360ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtn_360ActionPerformed
>>>>>>> DatBan

=======
>>>>>>> ThongKe
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
            java.util.logging.Logger.getLogger(AddNguyenLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNguyenLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNguyenLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNguyenLieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNguyenLieu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
<<<<<<< HEAD
    private com.raven.suportSwing.TextField amountNguyenLieuText_360;
    private javax.swing.JButton backBtn_360;
    private javax.swing.JButton clearBtn_360;
    private com.raven.suportSwing.TextField idNguyenLieuText_360;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel mainPanel_360;
    private com.raven.suportSwing.TextField nameNguyenLieuText_360;
    private com.raven.suportSwing.TextField staffNguyenLieuText_360;
    private javax.swing.JButton submitBtn_360;
    private javax.swing.JLabel titleLabel_373;
    private javax.swing.JPanel titlePanel_360;
    private com.raven.suportSwing.Combobox unitNguyenLieuCB_360;
=======
    private javax.swing.JTextField amountNguyenLieuText_360;
    private javax.swing.JLabel amountNguyenLieu_360;
    private javax.swing.JButton backBtn_360;
    private javax.swing.JButton clearBtn_360;
    private javax.swing.JTextField idNguyenLieuText_360;
    private javax.swing.JLabel idNguyenLieu_360;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel mainPanel_360;
    private javax.swing.JTextField nameNguyenLieuText_360;
    private javax.swing.JLabel nameNguyenLieu_360;
    private javax.swing.JTextField staffNguyenLieuText_360;
    private javax.swing.JLabel staffNguyenLieu_360;
    private javax.swing.JButton submitBtn_360;
    private javax.swing.JLabel titleLabel_373;
    private javax.swing.JPanel titlePanel_360;
    private javax.swing.JComboBox<String> unitNguyenLieuCB_360;
    private javax.swing.JLabel unitNguyenLieu_360;
>>>>>>> ThongKe
    // End of variables declaration//GEN-END:variables
}
