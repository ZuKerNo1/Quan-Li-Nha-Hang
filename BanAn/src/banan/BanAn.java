package banan;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author FSC
 */
public class BanAn extends javax.swing.JFrame {

    /**
     * Creates new form NguyenVatLieu
     */
    public BanAn() {
        initComponents();
        DefaultTableModel defaultTableModel;
        defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; //To change body of generated methods, choose Tools | Templates.
            }
        };
        ngLieuTableList_360.setModel(defaultTableModel);
        defaultTableModel.addColumn("Mã bàn ăn");
        defaultTableModel.addColumn("Số lượng người");
        defaultTableModel.addColumn("Món");
        defaultTableModel.addColumn("Tổng tiền");
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ngLieuTableList_360 = new javax.swing.JTable();
        backBtn_360 = new javax.swing.JButton();
        refreshBtn_360 = new javax.swing.JButton();
        deleteBtn_360 = new javax.swing.JButton();
        addBtn_360 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titlePanel_360.setBackground(new java.awt.Color(243, 161, 37));

        titleLabel_360.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        titleLabel_360.setForeground(new java.awt.Color(0, 183, 45));
        titleLabel_360.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel_360.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/ingredients.png"))); // NOI18N
        titleLabel_360.setText("BÀN ĂN");

        javax.swing.GroupLayout titlePanel_360Layout = new javax.swing.GroupLayout(titlePanel_360);
        titlePanel_360.setLayout(titlePanel_360Layout);
        titlePanel_360Layout.setHorizontalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel_360Layout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(titleLabel_360)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        titlePanel_360Layout.setVerticalGroup(
            titlePanel_360Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanel_360Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(titleLabel_360)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        ngLieuTableList_360.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ngLieuTableList_360);

        backBtn_360.setBackground(new java.awt.Color(102, 255, 102));
        backBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        backBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        backBtn_360.setText("BACK");
        backBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn_360ActionPerformed(evt);
            }
        });

        refreshBtn_360.setBackground(new java.awt.Color(102, 255, 102));
        refreshBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        refreshBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        refreshBtn_360.setText("REFRESH");

        deleteBtn_360.setBackground(new java.awt.Color(102, 255, 102));
        deleteBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        deleteBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn_360.setText("DELETE");

        addBtn_360.setBackground(new java.awt.Color(102, 255, 102));
        addBtn_360.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        addBtn_360.setForeground(new java.awt.Color(255, 255, 255));
        addBtn_360.setText("ADD");
        addBtn_360.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtn_360ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backBtn_360)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addBtn_360)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn_360)
                        .addGap(18, 18, 18)
                        .addComponent(refreshBtn_360)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 307, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backBtn_360)
                    .addComponent(refreshBtn_360)
                    .addComponent(addBtn_360)
                    .addComponent(deleteBtn_360))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(titlePanel_360, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(titlePanel_360, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
    }//GEN-LAST:event_backBtn_360ActionPerformed

    private void addBtn_360ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtn_360ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addBtn_360ActionPerformed

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
            java.util.logging.Logger.getLogger(BanAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BanAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BanAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BanAn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BanAn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn_360;
    private javax.swing.JButton backBtn_360;
    private javax.swing.JButton deleteBtn_360;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable ngLieuTableList_360;
    private javax.swing.JButton refreshBtn_360;
    private javax.swing.JLabel titleLabel_360;
    private javax.swing.JPanel titlePanel_360;
    // End of variables declaration//GEN-END:variables
}
