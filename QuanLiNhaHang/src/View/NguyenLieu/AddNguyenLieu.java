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

        jPanel1 = new javax.swing.JPanel();
        titlePanel_360 = new javax.swing.JPanel();
        titleLabel_373 = new javax.swing.JLabel();
        mainPanel_360 = new javax.swing.JPanel();
        submitBtn_360 = new javax.swing.JButton();
        backBtn_360 = new javax.swing.JButton();
        clearBtn_360 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        idNguyenLieu_360 = new javax.swing.JLabel();
        nameNguyenLieuText_360 = new javax.swing.JTextField();
        unitNguyenLieu_360 = new javax.swing.JLabel();
        amountNguyenLieuText_360 = new javax.swing.JTextField();
        amountNguyenLieu_360 = new javax.swing.JLabel();
        unitNguyenLieuCB_360 = new javax.swing.JComboBox<>();
        idNguyenLieuText_360 = new javax.swing.JTextField();
        nameNguyenLieu_360 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePanel_360.setBackground(new java.awt.Color(243, 161, 37));

        titleLabel_373.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleLabel_373.setForeground(new java.awt.Color(0, 183, 45));
        titleLabel_373.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel_373.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ingredients.png"))); // NOI18N
        titleLabel_373.setText("NHẬP NGUYÊN LIỆU");

        javax.swing.GroupLayout titlePanel_360Layout = new javax.swing.GroupLayout(titlePanel_360);
        titlePanel_360.setLayout(titlePanel_360Layout);
        titlePanel_360Layout.setHorizontalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanel_360Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel_373)
                .addGap(117, 117, 117))
        );
        titlePanel_360Layout.setVerticalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel_360Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleLabel_373)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        mainPanel_360.setBackground(new java.awt.Color(153, 153, 153));

        submitBtn_360.setBackground(new java.awt.Color(0, 183, 45));
        submitBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        submitBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        submitBtn_360.setText("SUBMIT");

        backBtn_360.setBackground(new java.awt.Color(0, 183, 45));
        backBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        backBtn_360.setText("BACK");
        backBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_360ActionPerformed(evt);
            }
        });

        clearBtn_360.setBackground(new java.awt.Color(0, 183, 45));
        clearBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        clearBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        clearBtn_360.setText("CLEAR ALL");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        idNguyenLieu_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        idNguyenLieu_360.setForeground(new java.awt.Color(255, 255, 255));
        idNguyenLieu_360.setText("Mã nguyên liệu");

        nameNguyenLieuText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        unitNguyenLieu_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        unitNguyenLieu_360.setForeground(new java.awt.Color(255, 255, 255));
        unitNguyenLieu_360.setText("Đơn vị");

        amountNguyenLieuText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        amountNguyenLieu_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        amountNguyenLieu_360.setForeground(new java.awt.Color(255, 255, 255));
        amountNguyenLieu_360.setText("Số lượng");

        unitNguyenLieuCB_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        unitNguyenLieuCB_360.setForeground(new java.awt.Color(255, 255, 255));
        unitNguyenLieuCB_360.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogram", "Thùng", "Két" }));

        idNguyenLieuText_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        nameNguyenLieu_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        nameNguyenLieu_360.setForeground(new java.awt.Color(255, 255, 255));
        nameNguyenLieu_360.setText("Tên nguyên liệu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(idNguyenLieu_360)
                    .addComponent(nameNguyenLieu_360)
                    .addComponent(amountNguyenLieu_360))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(amountNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unitNguyenLieu_360)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(unitNguyenLieuCB_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(nameNguyenLieuText_360)
                    .addComponent(idNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idNguyenLieu_360)
                    .addComponent(idNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameNguyenLieu_360)
                    .addComponent(nameNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountNguyenLieu_360)
                    .addComponent(amountNguyenLieuText_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(unitNguyenLieu_360)
                    .addComponent(unitNguyenLieuCB_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout mainPanel_360Layout = new javax.swing.GroupLayout(mainPanel_360);
        mainPanel_360.setLayout(mainPanel_360Layout);
        mainPanel_360Layout.setHorizontalGroup(
            mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_360Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainPanel_360Layout.createSequentialGroup()
                        .addComponent(backBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(175, 175, 175)
                        .addComponent(clearBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        mainPanel_360Layout.setVerticalGroup(
            mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanel_360Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearBtn_360, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
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
    private javax.swing.JButton submitBtn_360;
    private javax.swing.JLabel titleLabel_373;
    private javax.swing.JPanel titlePanel_360;
    private javax.swing.JComboBox<String> unitNguyenLieuCB_360;
    private javax.swing.JLabel unitNguyenLieu_360;
    // End of variables declaration//GEN-END:variables
}
