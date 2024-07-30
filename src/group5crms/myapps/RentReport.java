
package group5crms.myapps;

import group5crms.mylibs.*;
import java.awt.print.PrinterException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class RentReport extends javax.swing.JFrame {

    
    public RentReport() {
        initComponents();
        printReport();
        
        date.setText(WheelScape.toDate());
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        reportTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        endDate = new com.toedter.calendar.JDateChooser();
        startDate = new com.toedter.calendar.JDateChooser();
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
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        backBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(30, 80, 120, 30);

        reportTxt.setEditable(false);
        reportTxt.setColumns(20);
        reportTxt.setFont(new java.awt.Font("Perpetua", 0, 14)); // NOI18N
        reportTxt.setRows(5);
        jScrollPane1.setViewportView(reportTxt);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 180, 1150, 420);

        jLabel1.setFont(new java.awt.Font("Perpetua", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rent Report");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(580, 70, 340, 50);
        getContentPane().add(endDate);
        endDate.setBounds(730, 130, 140, 30);
        getContentPane().add(startDate);
        startDate.setBounds(540, 130, 140, 30);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_mediumlogo.png")));

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
        date.setText("Date");
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
                .addGap(18, 18, 18)
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitIcon)
                    .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(date)
                        .addComponent(manageCarNav)
                        .addComponent(generateReportNav)))
                .addContainerGap(10, Short.MAX_VALUE))
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
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageCusNav, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(manageRentNav, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15))
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 60);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_logo.png")));
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1300, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminGenReport agr = new AdminGenReport();
        agr.setVisible(true);
    }//GEN-LAST:event_backBtnActionPerformed

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
            Logger.getLogger(RentReport.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(RentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentReport().setVisible(true);
            }
        });
    }
    
    public void printReport() {
        reportTxt.setText("");
        
        int totalRents = 0;
        double totalExpectedEarnings = 0;

        for (Rent rent : Data.rents) {
            if (!rent.getStatus().equals("Rejected") && !rent.getStatus().equals("Cancelled")) {

                totalRents += 1;

                String totalStr = rent.getTotal().substring(3);
                totalExpectedEarnings += Double.parseDouble(totalStr);

                
            }
        }
                
        reportTxt.append(
            "\t\t Rent Report \n\n" +

            "Total Rents: \t\t" + totalRents + " rents\n" +
            "Total Expected Earnings: \t\tPhp. " + String.format("%.2f", totalExpectedEarnings) + "\n" +
            "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n" +
            "\t\t\t\t\t\tRents List" + 
            "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n" +
            "Rent ID\tName\t\tContact\tEmail\t\tCar\t\tCar Plate\tDays\tTotal\tPayment Method\n");

        for (Rent rent: Data.rents) {
            if (!rent.getStatus().equals("Rejected") || !rent.getStatus().equals("Cancelled")) {
                String beautifyTab = "\t";
                String beautifyTabCar = "\t";

                if (rent.getEmail().length() <= 12) {
                    beautifyTab = "\t\t";
                }
                if (rent.getCar().length() <= 12) {
                    beautifyTabCar = "\t\t";
                }

                reportTxt.append(
                        rent.getRentID() + "\t" + rent.getName() + "\t\t" + 
                        rent.getContact() + "\t" + rent.getEmail() + beautifyTab + 
                        rent.getCar() + beautifyTabCar + rent.getCarPlate() + "\t" + 
                        rent.getDays() + "\t" + rent.getTotal() + "\t" + 
                        rent.getPaymentMethod() + "\n"
                );
            }
            

        }

        reportTxt.append(
            "\n-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n" +

            "End of report!\n" +
            "Generated on " + WheelScape.toDate()
        );
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel date;
    private com.toedter.calendar.JDateChooser endDate;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel generateReportNav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel manageCarNav;
    private javax.swing.JLabel manageCusNav;
    private javax.swing.JLabel manageRentNav;
    private javax.swing.JTextArea reportTxt;
    private com.toedter.calendar.JDateChooser startDate;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
