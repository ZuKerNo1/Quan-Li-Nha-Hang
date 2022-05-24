/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.DatBan;

import Manager.ManagerNguyenLieu;
import Manager.ManagerTraCuuBan;
import model.Table;
import Service.TraCuuBanService;
import View.ChonMon.ChonMonFrame;
import View.DatBan.DatBan_NguoiDaiDien;
import View.MainFrame.mainFrame;
import View.NguyenLieu.NguyenLieuView;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author win
 */
public class TraCuuBan extends javax.swing.JFrame {
    TraCuuBanService traCuuBanService = new TraCuuBanService();
    /**
     * Creates new form TraCuuBan
     */
    public TraCuuBan() throws SQLException {
        initComponents();
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
        setData(traCuuBanService.getAllListTraCuuBan());
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
        clearBtn_360 = new javax.swing.JButton();
        backBtn_360 = new javax.swing.JButton();
        submitBtn_360 = new javax.swing.JButton();
        submitBtn_361 = new javax.swing.JButton();
        submitBtn_362 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        traCuuTable_352 = new com.raven.suportSwing.TableColumn();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 150));
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
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        clearBtn_360.setBackground(new java.awt.Color(51, 153, 255));
        clearBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clearBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_dinner-table.png"))); // NOI18N
        clearBtn_360.setText("ĐẶT BÀN");
        clearBtn_360.setSelected(true);
        clearBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn_360ActionPerformed(evt);
            }
        });

        backBtn_360.setBackground(new java.awt.Color(51, 153, 255));
        backBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        backBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        backBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_360ActionPerformed(evt);
            }
        });

        submitBtn_360.setBackground(new java.awt.Color(51, 153, 255));
        submitBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/submit.png"))); // NOI18N
        submitBtn_360.setText("THANH TOÁN");
        submitBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn_360ActionPerformed(evt);
            }
        });

        submitBtn_361.setBackground(new java.awt.Color(51, 153, 255));
        submitBtn_361.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn_361.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn_361.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_eat.png"))); // NOI18N
        submitBtn_361.setText("GỌI MÓN");
        submitBtn_361.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn_361ActionPerformed(evt);
            }
        });

        submitBtn_362.setBackground(new java.awt.Color(51, 153, 255));
        submitBtn_362.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn_362.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn_362.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon_classroom.png"))); // NOI18N
        submitBtn_362.setText("HUỶ ĐẶT");
        submitBtn_362.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn_362ActionPerformed(evt);
            }
        });

        traCuuTable_352.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Bàn ăn", "Tổng giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(traCuuTable_352);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backBtn_360, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(40, 40, 40)
                .addComponent(clearBtn_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(52, 52, 52)
                .addComponent(submitBtn_362)
                .addGap(51, 51, 51)
                .addComponent(submitBtn_361, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(54, 54, 54)
                .addComponent(submitBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(563, 563, 563)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(clearBtn_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submitBtn_361, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(submitBtn_362, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(backBtn_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(submitBtn_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 517, Short.MAX_VALUE)
                    .addGap(138, 138, 138)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane2.setViewportView(jPanel1);

        getContentPane().add(jScrollPane2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn_360ActionPerformed
        // TODO add your handling code here:
        new mainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtn_360ActionPerformed

    private void clearBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn_360ActionPerformed
        // TODO add your handling code here:
        new DatBan_NguoiDaiDien().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_clearBtn_360ActionPerformed

    private void submitBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn_360ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtn_360ActionPerformed

    private void submitBtn_361ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn_361ActionPerformed
       /* // TODO add your handling code here:
        int row = traCuuTable_352.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(TraCuuBan.this, "Vui lòng chọn bàn muốn gọi món", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }else{
            String ID = (String) traCuuTable_352.getValueAt(row, 0);
            try {
                new ChonMonFrame(ID).setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(TraCuuBan.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        } */
    }//GEN-LAST:event_submitBtn_361ActionPerformed

    private void submitBtn_362ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn_362ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtn_362ActionPerformed

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
    private javax.swing.JButton backBtn_360;
    private javax.swing.JButton clearBtn_360;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton submitBtn_360;
    private javax.swing.JButton submitBtn_361;
    private javax.swing.JButton submitBtn_362;
    private com.raven.suportSwing.TableColumn traCuuTable_352;
    // End of variables declaration//GEN-END:variables
}
