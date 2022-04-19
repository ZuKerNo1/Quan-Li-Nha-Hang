/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.KhuyenMai;

/**
 *
 * @author FSC
 */
public class UpdateKhuyenMai extends javax.swing.JFrame {

    /**
     * Creates new form UpdateKhuyenMai
     */
    public UpdateKhuyenMai() {
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
        titleLabel_360 = new javax.swing.JLabel();
        mainPanel_360 = new javax.swing.JPanel();
        startDay_360 = new javax.swing.JLabel();
        startDayText_360 = new javax.swing.JTextField();
        endDate_360 = new javax.swing.JLabel();
        endDateText_360 = new javax.swing.JTextField();
        appliProductText_360 = new javax.swing.JTextField();
        appliProduct_360 = new javax.swing.JLabel();
        note_360 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        noteText_360 = new javax.swing.JTextArea();
        backBtn_360 = new javax.swing.JButton();
        submitBtn_360 = new javax.swing.JButton();
        quantity_360 = new javax.swing.JLabel();
        quantityText_360 = new javax.swing.JTextField();
        clearBtn_360 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePanel_360.setBackground(new java.awt.Color(255, 255, 51));

        titleLabel_360.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleLabel_360.setForeground(new java.awt.Color(255, 61, 61));
        titleLabel_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/tag.png"))); // NOI18N
        titleLabel_360.setText("CHỈNH SỬA KHUYẾN MÃI");

        javax.swing.GroupLayout titlePanel_360Layout = new javax.swing.GroupLayout(titlePanel_360);
        titlePanel_360.setLayout(titlePanel_360Layout);
        titlePanel_360Layout.setHorizontalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanel_360Layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addComponent(titleLabel_360)
                .addGap(112, 112, 112))
        );
        titlePanel_360Layout.setVerticalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel_360Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleLabel_360)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        mainPanel_360.setBackground(new java.awt.Color(153, 153, 153));

        startDay_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        startDay_360.setForeground(new java.awt.Color(255, 255, 255));
        startDay_360.setText("Ngày bắt đầu");

        startDayText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        endDate_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        endDate_360.setForeground(new java.awt.Color(255, 255, 255));
        endDate_360.setText("Ngày kết thúc");

        endDateText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        appliProductText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        appliProduct_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        appliProduct_360.setForeground(new java.awt.Color(255, 255, 255));
        appliProduct_360.setText("Sản phẩm áp dụng");

        note_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        note_360.setForeground(new java.awt.Color(255, 255, 255));
        note_360.setText("Ghi chú");

        noteText_360.setColumns(20);
        noteText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        noteText_360.setRows(5);
        jScrollPane1.setViewportView(noteText_360);

        backBtn_360.setBackground(new java.awt.Color(255, 153, 51));
        backBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        backBtn_360.setText("BACK");
        backBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_360ActionPerformed(evt);
            }
        });

        submitBtn_360.setBackground(new java.awt.Color(255, 153, 51));
        submitBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn_360.setText("SUBMIT");
        submitBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtn_360ActionPerformed(evt);
            }
        });

        quantity_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        quantity_360.setForeground(new java.awt.Color(255, 255, 255));
        quantity_360.setText("Số lượng");

        quantityText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        clearBtn_360.setBackground(new java.awt.Color(255, 153, 51));
        clearBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clearBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn_360.setText("CLEAR ALL");
        clearBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtn_360ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanel_360Layout = new javax.swing.GroupLayout(mainPanel_360);
        mainPanel_360.setLayout(mainPanel_360Layout);
        mainPanel_360Layout.setHorizontalGroup(
            mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_360Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(mainPanel_360Layout.createSequentialGroup()
                        .addComponent(backBtn_360)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearBtn_360)
                        .addGap(18, 18, 18)
                        .addComponent(submitBtn_360))
                    .addGroup(mainPanel_360Layout.createSequentialGroup()
                        .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(appliProduct_360)
                            .addComponent(note_360)
                            .addComponent(quantity_360)
                            .addComponent(endDate_360)
                            .addComponent(startDay_360))
                        .addGap(39, 39, 39)
                        .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(startDayText_360, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(endDateText_360, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(appliProductText_360, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addComponent(quantityText_360, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE))))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        mainPanel_360Layout.setVerticalGroup(
            mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_360Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDay_360)
                    .addComponent(startDayText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(endDate_360)
                    .addComponent(endDateText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantity_360)
                    .addComponent(quantityText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(appliProduct_360)
                    .addComponent(appliProductText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(note_360)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn_360)
                    .addComponent(submitBtn_360)
                    .addComponent(clearBtn_360))
                .addGap(32, 32, 32))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn_360ActionPerformed
        // TODO add your handling code here:
        new KhuyenMaiView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtn_360ActionPerformed

    private void submitBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtn_360ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_submitBtn_360ActionPerformed

    private void clearBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtn_360ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_clearBtn_360ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateKhuyenMai.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateKhuyenMai().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField appliProductText_360;
    private javax.swing.JLabel appliProduct_360;
    private javax.swing.JButton backBtn_360;
    private javax.swing.JButton clearBtn_360;
    private javax.swing.JTextField endDateText_360;
    private javax.swing.JLabel endDate_360;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel_360;
    private javax.swing.JTextArea noteText_360;
    private javax.swing.JLabel note_360;
    private javax.swing.JTextField quantityText_360;
    private javax.swing.JLabel quantity_360;
    private javax.swing.JTextField startDayText_360;
    private javax.swing.JLabel startDay_360;
    private javax.swing.JButton submitBtn_360;
    private javax.swing.JLabel titleLabel_360;
    private javax.swing.JPanel titlePanel_360;
    // End of variables declaration//GEN-END:variables
}