/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.NguyenLieu;

/**
 *
 * @author FSC
 */
public class AddNguyenLieu extends javax.swing.JFrame {

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

        staffNguyenLieuText_360 = new javax.swing.JTextField();
        staffNguyenLieu_360 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        titlePanel_360 = new javax.swing.JPanel();
        titleLabel_373 = new javax.swing.JLabel();
        mainPanel_360 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        idNguyenLieu_360 = new javax.swing.JLabel();
        nameNguyenLieuText_360 = new javax.swing.JTextField();
        amountNguyenLieuText_360 = new javax.swing.JTextField();
        unitNguyenLieuCB_360 = new javax.swing.JComboBox<>();
        idNguyenLieuText_360 = new javax.swing.JTextField();
        staffNguyenLieuText_361 = new javax.swing.JTextField();
        staffNguyenLieu_361 = new javax.swing.JLabel();
        amountNguyenLieu_360 = new javax.swing.JLabel();
        nameNguyenLieu_360 = new javax.swing.JLabel();
        unitNguyenLieu_360 = new javax.swing.JLabel();
        backBtn_360 = new javax.swing.JButton();
        clearBtn_360 = new javax.swing.JButton();
        submitBtn_360 = new javax.swing.JButton();

        staffNguyenLieuText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        staffNguyenLieu_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        staffNguyenLieu_360.setForeground(new java.awt.Color(51, 51, 51));
        staffNguyenLieu_360.setText("NHÂN VIÊN CẬP NHẬT");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        titlePanel_360.setBackground(new java.awt.Color(51, 255, 51));

        titleLabel_373.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        titleLabel_373.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel_373.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel_373.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/harvest.png"))); // NOI18N
        titleLabel_373.setText("NHẬP NGUYÊN LIỆU");

        javax.swing.GroupLayout titlePanel_360Layout = new javax.swing.GroupLayout(titlePanel_360);
        titlePanel_360.setLayout(titlePanel_360Layout);
        titlePanel_360Layout.setHorizontalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanel_360Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel_373)
                .addGap(87, 87, 87))
        );
        titlePanel_360Layout.setVerticalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel_360Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLabel_373)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        mainPanel_360.setBackground(new java.awt.Color(255, 255, 255));

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

        staffNguyenLieuText_361.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        staffNguyenLieu_361.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        staffNguyenLieu_361.setForeground(new java.awt.Color(51, 51, 51));
        staffNguyenLieu_361.setText("NHÂN VIÊN CẬP NHẬT");

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
                    .addComponent(staffNguyenLieu_361)
                    .addComponent(idNguyenLieu_360))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(amountNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unitNguyenLieu_360)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(unitNguyenLieuCB_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(staffNguyenLieuText_361)
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
                    .addComponent(staffNguyenLieuText_361, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(staffNguyenLieu_361))
                .addContainerGap())
        );

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

        submitBtn_360.setBackground(new java.awt.Color(51, 255, 51));
        submitBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/submit.png"))); // NOI18N

        javax.swing.GroupLayout mainPanel_360Layout = new javax.swing.GroupLayout(mainPanel_360);
        mainPanel_360.setLayout(mainPanel_360Layout);
        mainPanel_360Layout.setHorizontalGroup(
            mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
        );
        mainPanel_360Layout.setVerticalGroup(
            mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_360Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
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
        new NguyenLieuView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtn_360ActionPerformed

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
    private javax.swing.JTextField staffNguyenLieuText_361;
    private javax.swing.JLabel staffNguyenLieu_360;
    private javax.swing.JLabel staffNguyenLieu_361;
    private javax.swing.JButton submitBtn_360;
    private javax.swing.JLabel titleLabel_373;
    private javax.swing.JPanel titlePanel_360;
    private javax.swing.JComboBox<String> unitNguyenLieuCB_360;
    private javax.swing.JLabel unitNguyenLieu_360;
    // End of variables declaration//GEN-END:variables
}
