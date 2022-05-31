/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.DatBan;

import Manager.ManagerDatBan;
import Manager.ManagerNguyenLieu;
import Manager.ManagerTraCuuBan;
import Service.DatBanService;
import Service.HoaDonService;
import Service.TraCuuBanService;
import model.Table;
import View.ChonMon.ChonMonFrame;
import View.DatBan.DatBan_NguoiDaiDien;
import View.MainFrame.mainFrame;
import View.NguyenLieu.NguyenLieuView;
import View.ThanhToan.ThanhToanFrame;
import java.awt.event.ActionEvent;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DatBan;

/**
 *
 * @author win
 */
public class TraCuuBan extends javax.swing.JFrame {

    TraCuuBanService traCuuBanService = new TraCuuBanService();
    HoaDonService hoaDonService = new HoaDonService();
    DatBan datban = new DatBan();
    DatBanService datBanService = new DatBanService();

    /**
     * Creates new form TraCuuBan
     */
    public TraCuuBan() throws SQLException {
        initComponents();
        setData(traCuuBanService.getAllListTable_352());
        DefaultTableModel defaultTableModel;
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        traCuuTable_352.setModel(defaultTableModel);
        defaultTableModel.addColumn("ID Bàn Ăn");
        defaultTableModel.addColumn("Trạng thái");
        setData(traCuuBanService.getAllListTable_352());

    }

    private void setData(List<Table> tables) throws SQLException {
        DefaultTableModel defaultTableModel;
        ManagerTraCuuBan us = new ManagerTraCuuBan();
        defaultTableModel = new DefaultTableModel();
        traCuuTable_352.setModel(defaultTableModel);
        defaultTableModel.addColumn("ID Bàn Ăn");
        defaultTableModel.addColumn("Trạng thái");
        for (Table table : tables) {
            defaultTableModel.addRow(new Object[]{table.getIdTable_352(), table.getStatusTable_352()});
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        datBan_352 = new javax.swing.JButton();
        backBtn_352 = new javax.swing.JButton();
        thanhToan_352 = new javax.swing.JButton();
        goiMon_352 = new javax.swing.JButton();
        huyDat_352 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        traCuuTable_352 = new com.raven.suportSwing.TableColumn();
        IDBA_Label = new javax.swing.JLabel();
        IDBA_Label1 = new javax.swing.JLabel();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 50));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_find.png"))); // NOI18N
        jLabel1.setText("TRA CỨU BÀN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 896, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        datBan_352.setBackground(new java.awt.Color(51, 153, 255));
        datBan_352.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        datBan_352.setForeground(new java.awt.Color(255, 255, 255));
        datBan_352.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_dinner-table.png"))); // NOI18N
        datBan_352.setText("ĐẶT BÀN");
        datBan_352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datBan_352ActionPerformed(evt);
            }
        });

        backBtn_352.setBackground(new java.awt.Color(51, 153, 255));
        backBtn_352.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn_352.setForeground(new java.awt.Color(255, 255, 255));
        backBtn_352.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        backBtn_352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_352ActionPerformed(evt);
            }
        });

        thanhToan_352.setBackground(new java.awt.Color(51, 153, 255));
        thanhToan_352.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        thanhToan_352.setForeground(new java.awt.Color(255, 255, 255));
        thanhToan_352.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/submit.png"))); // NOI18N
        thanhToan_352.setText("THANH TOÁN");
        thanhToan_352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thanhToan_352ActionPerformed(evt);
            }
        });

        goiMon_352.setBackground(new java.awt.Color(51, 153, 255));
        goiMon_352.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        goiMon_352.setForeground(new java.awt.Color(255, 255, 255));
        goiMon_352.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_eat.png"))); // NOI18N
        goiMon_352.setText("GỌI MÓN");
        goiMon_352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goiMon_352ActionPerformed(evt);
            }
        });

        huyDat_352.setBackground(new java.awt.Color(51, 153, 255));
        huyDat_352.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        huyDat_352.setForeground(new java.awt.Color(255, 255, 255));
        huyDat_352.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_classroom.png"))); // NOI18N
        huyDat_352.setText("HUỶ ĐẶT");
        huyDat_352.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                huyDat_352ActionPerformed(evt);
            }
        });

        traCuuTable_352.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Bàn ăn", "Trạng thái"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        traCuuTable_352.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                traCuuTable_352MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(traCuuTable_352);

        IDBA_Label.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        IDBA_Label1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        IDBA_Label1.setText("ID Bàn ăn:");

        status.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        status.setText("ID Bàn ăn:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backBtn_352, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addComponent(datBan_352)
                        .addGap(52, 52, 52)
                        .addComponent(huyDat_352)
                        .addGap(52, 52, 52)
                        .addComponent(goiMon_352, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59)
                        .addComponent(thanhToan_352))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status)
                        .addGap(44, 44, 44)
                        .addComponent(IDBA_Label1)
                        .addGap(18, 18, 18)
                        .addComponent(IDBA_Label)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDBA_Label)
                    .addComponent(IDBA_Label1)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(530, 530, 530)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(huyDat_352, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn_352, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thanhToan_352, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(datBan_352, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(goiMon_352, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(88, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn_352ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn_352ActionPerformed
        // TODO add your handling code here:
        new mainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtn_352ActionPerformed

    private void datBan_352ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datBan_352ActionPerformed
        int row = traCuuTable_352.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(TraCuuBan.this, "Vui lòng chọn bàn muốn gọi món", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            if("Đã đặt bàn".equals((String) traCuuTable_352.getValueAt(row, 1)) || "Đang sử dụng".equals((String) traCuuTable_352.getValueAt(row, 1))) {
                JOptionPane.showMessageDialog(TraCuuBan.this, "Bàn đã được đặt hoặc đang sử dụng, vui lòng chọn bàn trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }else{ 
                String ID = (String) traCuuTable_352.getValueAt(row, 0);
                try {
                    new DatBan_NguoiDaiDien(ID).setVisible(true);
                    this.dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
                }
                this.dispose();
            }
        }
    }//GEN-LAST:event_datBan_352ActionPerformed

    private void thanhToan_352ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thanhToan_352ActionPerformed
//        try {
//            // TODO add your handling code here:
//            hoaDonService.chuyenTrangThai_HoaDon(IDBA_Label.getText());
//        } catch (SQLException ex) {
//            Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            traCuuBanService.chuyenTrangThai_BanAn(IDBA_Label.getText());
//        } catch (SQLException ex) {
//            Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        try {
//            setData(traCuuBanService.getAllListTable_352());
//        } catch (SQLException ex) {
//            Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
        
        int row = traCuuTable_352.getSelectedRow();
        String ID = (String) traCuuTable_352.getValueAt(row, 0);
        try {
            new ThanhToanFrame(ID).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_thanhToan_352ActionPerformed

    private void goiMon_352ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goiMon_352ActionPerformed
        int row = traCuuTable_352.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(TraCuuBan.this, "Vui lòng chọn bàn muốn gọi món", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            if ( "Trống".equals((String) traCuuTable_352.getValueAt(row, 1))) {
                JOptionPane.showMessageDialog(TraCuuBan.this, "Vui lòng chọn bàn không trống", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }else{
                String ID = (String) traCuuTable_352.getValueAt(row, 0);
                try {
                    new ChonMonFrame(ID).setVisible(true);
                    this.dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }//GEN-LAST:event_goiMon_352ActionPerformed

    private void huyDat_352ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_huyDat_352ActionPerformed
        try {
            traCuuBanService.chuyenTrangThai_BanAn(IDBA_Label.getText());
        } catch (SQLException ex) {
            Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();

        try {
            new TraCuuBan().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_huyDat_352ActionPerformed

    private void traCuuTable_352MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_traCuuTable_352MouseClicked
        // TODO add your handling code here:
        int idBA = traCuuTable_352.rowAtPoint(evt.getPoint());
        int status = traCuuTable_352.rowAtPoint(evt.getPoint());
        String IDBA = traCuuTable_352.getValueAt(idBA, 0).toString();
        String Status = traCuuTable_352.getValueAt(status, 1).toString();
        try {
            IDBA_Label.setText(traCuuBanService.getIdTable_352(IDBA));
            this.status.setText(traCuuBanService.getIdTable_352(Status));
        } catch (SQLException ex) {
            Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_traCuuTable_352MouseClicked

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
                if ("Window".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TraCuuBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TraCuuBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TraCuuBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TraCuuBan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                try {
                    new TraCuuBan().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        /* Create and display the form */

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IDBA_Label;
    private javax.swing.JLabel IDBA_Label1;
    private javax.swing.JButton backBtn_352;
    private javax.swing.JButton datBan_352;
    private javax.swing.JButton goiMon_352;
    private javax.swing.JButton huyDat_352;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel status;
    private javax.swing.JButton thanhToan_352;
    private com.raven.suportSwing.TableColumn traCuuTable_352;
    // End of variables declaration//GEN-END:variables

    private void traCuuTable_352MouseClicked(ActionEvent evt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
