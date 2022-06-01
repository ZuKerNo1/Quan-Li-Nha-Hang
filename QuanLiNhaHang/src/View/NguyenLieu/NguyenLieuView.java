/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.NguyenLieu;

import Manager.ManagerNguyenLieu;
import Service.NguyenLieuService;
import View.MainFrame.mainFrame;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.NguyenLieu;

/**
 *
 * @author FSC
 */
public class NguyenLieuView extends javax.swing.JFrame {
    NguyenLieuService nguyenLieuService_360 = new NguyenLieuService();
    /**
     * Creates new form NguyenLieuView
     */
    public NguyenLieuView() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        DefaultTableModel defaultTableModel;
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }

        };
        ngLieuTableList_360.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã nguyên liệu");
        defaultTableModel.addColumn("Tên nguyên liệu");
        defaultTableModel.addColumn("Số lượng còn");
        defaultTableModel.addColumn("Đơn vị");
        defaultTableModel.addColumn("Nhân viên cập nhật");
        setData(nguyenLieuService_360.getAllListNguyenLieu());
    }
    
    private void setData(List<NguyenLieu> nguyenLieus) throws SQLException {
        DefaultTableModel defaultTableModel;
        ManagerNguyenLieu us = new ManagerNguyenLieu();
        defaultTableModel = new DefaultTableModel();
        ngLieuTableList_360.setModel(defaultTableModel);
        defaultTableModel.addColumn("ID nguyên liệu");
        defaultTableModel.addColumn("Tên nguyên liệu");
        defaultTableModel.addColumn("Số lượng");
        defaultTableModel.addColumn("Đơn giá");
        defaultTableModel.addColumn("NV Cập nhập");
        for (NguyenLieu nguyenLieu : nguyenLieus) {
            defaultTableModel.addRow(new Object[]{nguyenLieu.getIdNL_360(), nguyenLieu.getNameNL_360(), nguyenLieu.getSoLuong_360(),
                nguyenLieu.getDonVi_360(),nguyenLieu.getNhanVienCapNhap_360()});
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

        jPanel1 = new javax.swing.JPanel();
        titlePanel_360 = new javax.swing.JPanel();
        titleLabel_360 = new javax.swing.JLabel();
        mainPanel_360 = new javax.swing.JPanel();
        backBtn_360 = new javax.swing.JButton();
        refreshBtn_360 = new javax.swing.JButton();
        deleteBtn_360 = new javax.swing.JButton();
        addBtn_360 = new javax.swing.JButton();
        updateBtn_360 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ngLieuTableList_360 = new com.raven.suportSwing.TableColumn();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(400, 50));
        setPreferredSize(new java.awt.Dimension(880, 720));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        titlePanel_360.setBackground(new java.awt.Color(51, 255, 51));

        titleLabel_360.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        titleLabel_360.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel_360.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/harvest.png"))); // NOI18N
        titleLabel_360.setText("NGUYÊN VẬT LIỆU");

        javax.swing.GroupLayout titlePanel_360Layout = new javax.swing.GroupLayout(titlePanel_360);
        titlePanel_360.setLayout(titlePanel_360Layout);
        titlePanel_360Layout.setHorizontalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel_360Layout.createSequentialGroup()
                .addGap(277, 277, 277)
                .addComponent(titleLabel_360)
                .addContainerGap(386, Short.MAX_VALUE))
        );
        titlePanel_360Layout.setVerticalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel_360Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel_360, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                .addContainerGap())
        );

        mainPanel_360.setBackground(new java.awt.Color(255, 255, 255));

        backBtn_360.setBackground(new java.awt.Color(51, 255, 51));
        backBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        backBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/back.png"))); // NOI18N
        backBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_360ActionPerformed(evt);
            }
        });

        refreshBtn_360.setBackground(new java.awt.Color(51, 255, 51));
        refreshBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refreshBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/refresh.png"))); // NOI18N
        refreshBtn_360.setText("REFRESH");
        refreshBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtn_360ActionPerformed(evt);
            }
        });

        deleteBtn_360.setBackground(new java.awt.Color(51, 255, 51));
        deleteBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        deleteBtn_360.setText("DELETE");
        deleteBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtn_360ActionPerformed(evt);
            }
        });

        addBtn_360.setBackground(new java.awt.Color(51, 255, 51));
        addBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        addBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add-to-basket.png"))); // NOI18N
        addBtn_360.setText("ADD");
        addBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn_360ActionPerformed(evt);
            }
        });

        updateBtn_360.setBackground(new java.awt.Color(51, 255, 51));
        updateBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        updateBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        updateBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/updating.png"))); // NOI18N
        updateBtn_360.setText("UPDATE");
        updateBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtn_360ActionPerformed(evt);
            }
        });

        ngLieuTableList_360.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID NGUYÊN LIỆU", "TÊN NGUYÊN LIỆU", "SỐ LƯỢNG", "ĐƠN VỊ", "Tổng giá bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(ngLieuTableList_360);

        javax.swing.GroupLayout mainPanel_360Layout = new javax.swing.GroupLayout(mainPanel_360);
        mainPanel_360.setLayout(mainPanel_360Layout);
        mainPanel_360Layout.setHorizontalGroup(
            mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_360Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(mainPanel_360Layout.createSequentialGroup()
                        .addComponent(backBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(updateBtn_360)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn_360)
                        .addGap(18, 18, 18)
                        .addComponent(refreshBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(addBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        mainPanel_360Layout.setVerticalGroup(
            mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_360Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(backBtn_360, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(addBtn_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(refreshBtn_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteBtn_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateBtn_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(mainPanel_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titlePanel_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn_360ActionPerformed
        // TODO add your handling code here:
        new mainFrame().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtn_360ActionPerformed

    private void addBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn_360ActionPerformed
        // TODO add your handling code here:
        new AddNguyenLieu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_addBtn_360ActionPerformed

    private void updateBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtn_360ActionPerformed
        // TODO add your handling code here:
        int row = ngLieuTableList_360.getSelectedRow();
        if(row == -1){
            JOptionPane.showMessageDialog(NguyenLieuView.this, "Vui lòng chọn sản phẩm muốn sửa", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }else{
            String ID = (String) ngLieuTableList_360.getValueAt(row, 0);
            try {
                    new UpdateNguyenLieu(ID).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NguyenLieuView.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
        } 
    }//GEN-LAST:event_updateBtn_360ActionPerformed

    private void deleteBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtn_360ActionPerformed
        // TODO add your handling code here:
        ManagerNguyenLieu ps = new ManagerNguyenLieu();
        
        int row = ngLieuTableList_360.getSelectedRow();
        if (row == -1) {
            JOptionPane.showMessageDialog(NguyenLieuView.this, "Vui lòng chọn nguyên liệu muốn xóa!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } else {
            int comfirm = JOptionPane.showConfirmDialog(NguyenLieuView.this, "Bạn có chắc chắn muốn xóa!");

            if (comfirm == JOptionPane.YES_OPTION) {
                String ID = (String) ngLieuTableList_360.getValueAt(row, 0);

                try {
                    nguyenLieuService_360.deleteNguyenLieu(ID);
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(NguyenLieuView.class.getName()).log(Level.SEVERE, null, ex);
                }

                try {
                    setData(nguyenLieuService_360.getAllListNguyenLieu());
                } catch (SQLException ex) {
                    java.util.logging.Logger.getLogger(NguyenLieuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_deleteBtn_360ActionPerformed

    private void refreshBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtn_360ActionPerformed
        // TODO add your handling code here:
        try {
            setData(nguyenLieuService_360.getAllListNguyenLieu());
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(NguyenLieuView.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(NguyenLieuView.this, "ĐÃ LÀM MỚI", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_refreshBtn_360ActionPerformed

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
            java.util.logging.Logger.getLogger(NguyenLieuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NguyenLieuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NguyenLieuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NguyenLieuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new NguyenLieuView().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(NguyenLieuView.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn_360;
    private javax.swing.JButton backBtn_360;
    private javax.swing.JButton deleteBtn_360;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel_360;
    private com.raven.suportSwing.TableColumn ngLieuTableList_360;
    private javax.swing.JButton refreshBtn_360;
    private javax.swing.JLabel titleLabel_360;
    private javax.swing.JPanel titlePanel_360;
    private javax.swing.JButton updateBtn_360;
    // End of variables declaration//GEN-END:variables
}
