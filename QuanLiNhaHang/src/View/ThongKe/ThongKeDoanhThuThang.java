/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Manager.StatisticalDAO;
import Service.DThuThangService;
import View.MainFrame.mainFrame;
import com.raven.form.ShowChart;
import com.raven.form.showChartRevenue;

import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.DoanhThuThang;

/**
 *
 * @author win
 */
public class ThongKeDoanhThuThang extends javax.swing.JFrame {
    DThuThangService dThuService = new DThuThangService();
//    StatisticalDAO sDao = new StatisticalDAO();
    /**
     * Creates new form ThongKe
     */
    public ThongKeDoanhThuThang() throws SQLException {
        initComponents();
        DefaultTableModel defaultTableModel;
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

        };
        tableShow.setModel(defaultTableModel);
        defaultTableModel.addColumn("Tháng");
        defaultTableModel.addColumn("Doanh thu");
        setData(dThuService.getAllListDThu());
        tongTien_Text.setText(dThuService.TongTien());
    }
    
    private void setData(List<DoanhThuThang> dThus) throws SQLException {
        DefaultTableModel defaultTableModel;
        defaultTableModel = new DefaultTableModel();
        tableShow.setModel(defaultTableModel);
        defaultTableModel.addColumn("Tháng");
        defaultTableModel.addColumn("Doanh Thu");
        for (DoanhThuThang dThu : dThus) {
            defaultTableModel.addRow(new Object[]{dThu.getThang(), dThu.getDoanhThu()});
        }
        
    }
//    public void fillYear() {
//        DefaultComboBoxModel model = (DefaultComboBoxModel) cBox_Year.getModel();
//        model.removeAllElements();
//        List<Integer> list = sDao.selectYears();
//        for (Integer i : list) {
//            model.addElement(i);
//        }
//    }
//
//    public void fillTable() throws Exception {
//        DefaultTableModel model = (DefaultTableModel) tableShow.getModel();
//        model.setRowCount(0);
//        int year = (int) cBox_Year.getSelectedItem();
//        List<Object[]> list = sDao.getSalesStatisticalRevenue(year);
//        for (Object[] o : list) {
//            model.addRow(o);
//        }
//        for (int i = 0; i < tableShow.getRowCount(); i++) {
//            int moneyImport = sDao.getSelectImport((int) tableShow.getValueAt(i, 0), (int) cBox_Year.getSelectedItem());
//            int moneyReturn = (int) tableShow.getValueAt(i, 3);
//            tableShow.setValueAt(moneyReturn, i, 3);
//            tableShow.setValueAt(moneyImport, i, 4);
//            tableShow.setValueAt((int) tableShow.getValueAt(i, 2) - (moneyImport + moneyReturn), i, 5);
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backBtn_360 = new javax.swing.JButton();
        backBtn_361 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cBox_Year = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tongTien_Text = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableShow = new com.raven.suportSwing.TableColumn();
        radiStreet = new com.raven.suportSwing.RadioButtonCustom();
        radiColumn = new com.raven.suportSwing.RadioButtonCustom();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.LINE_AXIS));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_grow-up.png"))); // NOI18N
        jLabel1.setText(" DOANH THU THÁNG");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1530, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addComponent(jLabel1)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel2.setBackground(new java.awt.Color(240, 239, 234));

        backBtn_360.setBackground(new java.awt.Color(255, 51, 51));
        backBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        backBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_go.png"))); // NOI18N
        backBtn_360.setText("XEM BÁO CÁO NĂM");
        backBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_360ActionPerformed(evt);
            }
        });

        backBtn_361.setBackground(new java.awt.Color(255, 51, 51));
        backBtn_361.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn_361.setForeground(new java.awt.Color(255, 255, 255));
        backBtn_361.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        backBtn_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_361ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 16)); // NOI18N
        jLabel4.setText("Năm ");

        cBox_Year.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        cBox_Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020" }));

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        jLabel2.setBackground(new java.awt.Color(255, 51, 51));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_symbol.png"))); // NOI18N
        jLabel2.setText("TỔNG ");

        tongTien_Text.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        tongTien_Text.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tongTien_Text, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
            .addComponent(tongTien_Text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tableShow.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tháng", "Tổng giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableShow);

        buttonGroup1.add(radiStreet);
        radiStreet.setText("Biều đồ đường");
        radiStreet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiStreetActionPerformed(evt);
            }
        });

        buttonGroup1.add(radiColumn);
        radiColumn.setText("Biều đồ Cột");

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Biểu đồ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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
                        .addComponent(backBtn_361, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cBox_Year, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(radiStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(radiColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(backBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(67, 67, 67))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1451, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(67, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(radiStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radiColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(cBox_Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(backBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(451, 451, 451)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backBtn_361, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(118, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(89, 89, 89)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn_360ActionPerformed
        try {
            // TODO add your handling code here:
            new ThongKeDoanhThuNam().setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeDoanhThuThang.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_backBtn_360ActionPerformed

    private void backBtn_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn_361ActionPerformed
        // TODO add your handling code here:
        new mainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtn_361ActionPerformed

    private void radiStreetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiStreetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radiStreetActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        if (radiStreet.isSelected()) {
//            new ShowChart((DefaultTableModel) tableShow.getModel(), null).setVisible(true);
//
//        } else {
//            new showChartRevenue((DefaultTableModel) tableShow.getModel()).setVisible(true);
//        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeDoanhThuThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThuThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThuThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeDoanhThuThang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ThongKeDoanhThuThang().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ThongKeDoanhThuThang.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn_360;
    private javax.swing.JButton backBtn_361;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cBox_Year;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private com.raven.suportSwing.RadioButtonCustom radiColumn;
    private com.raven.suportSwing.RadioButtonCustom radiStreet;
    private com.raven.suportSwing.TableColumn tableShow;
    private javax.swing.JLabel tongTien_Text;
    // End of variables declaration//GEN-END:variables
}
