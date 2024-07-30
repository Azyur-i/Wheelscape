
package group5crms.myapps;

import group5crms.mylibs.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminGenReport extends javax.swing.JFrame {

    public AdminGenReport() {
        initComponents();
        
        // set date
        date.setText(WheelScape.toDate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        rentReport = new javax.swing.JButton();
        customerReport = new javax.swing.JButton();
        carsReport = new javax.swing.JButton();
        topBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        manageCusNav = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        manageCarNav = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        manageRentNav = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        generateReportNav = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel1.setText("Generate Report");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(480, 150, 350, 50);

        rentReport.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rentReport.setText("Rent Report");
        rentReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentReportActionPerformed(evt);
            }
        });
        getContentPane().add(rentReport);
        rentReport.setBounds(550, 410, 190, 70);

        customerReport.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        customerReport.setText("Customer Report");
        customerReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerReportActionPerformed(evt);
            }
        });
        getContentPane().add(customerReport);
        customerReport.setBounds(550, 230, 190, 70);

        carsReport.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        carsReport.setText("Cars Report");
        carsReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carsReportMouseClicked(evt);
            }
        });
        carsReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                carsReportActionPerformed(evt);
            }
        });
        getContentPane().add(carsReport);
        carsReport.setBounds(550, 320, 190, 70);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_mediumlogo.png")));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        manageCusNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        manageCusNav.setForeground(new java.awt.Color(255, 255, 255));
        manageCusNav.setText("Manage Users");
        manageCusNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageCusNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageCusNavMouseClicked(evt);
            }
        });

        date.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("<<date>>");
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit.png"))); // NOI18N
        exitIcon.setToolTipText("Exit");
        exitIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });

        manageCarNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        manageCarNav.setForeground(new java.awt.Color(255, 255, 255));
        manageCarNav.setText("Manage Cars");
        manageCarNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageCarNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageCarNavMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");

        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setToolTipText("");

        manageRentNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        manageRentNav.setForeground(new java.awt.Color(255, 255, 255));
        manageRentNav.setText("Manage Rents");
        manageRentNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageRentNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageRentNavMouseClicked(evt);
            }
        });

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator4.setToolTipText("");

        generateReportNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        generateReportNav.setForeground(new java.awt.Color(255, 255, 255));
        generateReportNav.setText("Generate Report");
        generateReportNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateReportNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateReportNavMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(128, 128, 128)
                .addComponent(manageCarNav)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageRentNav)
                .addGap(27, 27, 27)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(manageCusNav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateReportNav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 306, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitIcon)
                .addGap(36, 36, 36))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator3)
                    .addComponent(jSeparator4))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageCusNav)
                .addGap(15, 15, 15))
            .addGroup(topBarLayout.createSequentialGroup()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitIcon)
                            .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(date)
                                .addComponent(manageCarNav)
                                .addComponent(generateReportNav))))
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(manageRentNav)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_logo.png")));
        getContentPane().add(Background);
        Background.setBounds(0, 10, 1300, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerReportActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CustReport cr = new CustReport();
        cr.setVisible(true);
    }//GEN-LAST:event_customerReportActionPerformed

    private void rentReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentReportActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        RentReport br = new RentReport();
        br.setVisible(true);
    }//GEN-LAST:event_rentReportActionPerformed

    private void carsReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carsReportMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        CarReport cr = new CarReport();
        cr.setVisible(true);
    }//GEN-LAST:event_carsReportMouseClicked

    private void carsReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_carsReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_carsReportActionPerformed

    private void manageCusNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCusNavMouseClicked
        this.setVisible(false);

        AdminManageCust amc = new AdminManageCust();
        amc.setVisible(true);
    }//GEN-LAST:event_manageCusNavMouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked

        this.setVisible(false);
        Data.logout();
    }//GEN-LAST:event_exitIconMouseClicked

    private void manageCarNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCarNavMouseClicked
        
        try {
            this.setVisible(false);

            AdminEditCars aec = new AdminEditCars();
            aec.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminGenReport.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_manageCarNavMouseClicked

    private void manageRentNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRentNavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminManageMultiRent amb = new AdminManageMultiRent();
        amb.setVisible(true);
    }//GEN-LAST:event_manageRentNavMouseClicked

    private void generateReportNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateReportNavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminGenReport agr = new AdminGenReport();
        agr.setVisible(true);
    }//GEN-LAST:event_generateReportNavMouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String string) {
   
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminGenReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminGenReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminGenReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminGenReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminGenReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton carsReport;
    private javax.swing.JButton customerReport;
    private javax.swing.JLabel date;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel generateReportNav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel manageCarNav;
    private javax.swing.JLabel manageCusNav;
    private javax.swing.JLabel manageRentNav;
    private javax.swing.JButton rentReport;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
