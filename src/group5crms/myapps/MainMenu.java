
package group5crms.myapps;

import group5crms.mylibs.*;
import javax.swing.JOptionPane;

public class MainMenu extends javax.swing.JFrame {

    public MainMenu() {
        initComponents();
       
        date.setText(WheelScape.toDate());
        if(WheelScape.loginCustomer != null) {
            username.setText(WheelScape.loginCustomer.getUsername());
        } else {
            username.setText("Guest");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        username = new javax.swing.JLabel();
        rentBtn = new javax.swing.JButton();
        reportBtn = new javax.swing.JButton();
        settingBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        payBtn = new javax.swing.JButton();
        backgroundImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Greetings,");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 210, 190, 50);

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Welcome to Wheelscape.");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(450, 270, 600, 30);

        date.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("<<date>>");
        date.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        getContentPane().add(date);
        date.setBounds(1110, 110, 180, 40);

        username.setFont(new java.awt.Font("Perpetua", 0, 48)); // NOI18N
        username.setForeground(new java.awt.Color(255, 255, 255));
        username.setText("<<username>>");
        getContentPane().add(username);
        username.setBounds(570, 210, 320, 50);

        rentBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cheque.png")));
        rentBtn.setBackground(new java.awt.Color(102, 204, 255));
        rentBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        rentBtn.setText("  Rent a Car");
        rentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rentBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        rentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(rentBtn);
        rentBtn.setBounds(270, 360, 360, 60);

        reportBtn.setBackground(new java.awt.Color(102, 204, 255));
        reportBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        reportBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/clipboard.png"))); // NOI18N
        reportBtn.setText("  Rent History");
        reportBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        reportBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportBtnActionPerformed(evt);
            }
        });
        getContentPane().add(reportBtn);
        reportBtn.setBounds(270, 440, 360, 60);

        settingBtn.setBackground(new java.awt.Color(102, 204, 255));
        settingBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        settingBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/mechanical-gears-.png"))); // NOI18N
        settingBtn.setText("  Settings");
        settingBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        settingBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingBtnActionPerformed(evt);
            }
        });
        getContentPane().add(settingBtn);
        settingBtn.setBounds(660, 440, 360, 60);

        logoutBtn.setBackground(new java.awt.Color(153, 0, 0));
        logoutBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Back to Login Screen");
        logoutBtn.setBorder(null);
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });
        getContentPane().add(logoutBtn);
        logoutBtn.setBounds(1020, 580, 220, 40);

        payBtn.setBackground(new java.awt.Color(102, 204, 255));
        payBtn.setFont(new java.awt.Font("Gill Sans MT", 0, 24)); // NOI18N
        payBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cheque.png"))); // NOI18N
        payBtn.setText("  Payment");
        payBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        payBtn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        payBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                payBtnActionPerformed(evt);
            }
        });
        getContentPane().add(payBtn);
        payBtn.setBounds(660, 360, 360, 60);

        backgroundImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N
        backgroundImg.setText("jLabel2");
        getContentPane().add(backgroundImg);
        backgroundImg.setBounds(-3, -4, 1310, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void settingBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingBtnActionPerformed
        // TODO add your handling code here:
        
        if(WheelScape.loginCustomer != null) {
            this.setVisible(false);
        
            SettingsPanel setting = new SettingsPanel();
            setting.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Please register to access the feature.");
        }
    }//GEN-LAST:event_settingBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        this.setVisible(false);
        
        Data.logout();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void rentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBtnActionPerformed
        this.setVisible(false);
        
        RentCar rent = new RentCar();
        rent.setVisible(true);
    }//GEN-LAST:event_rentBtnActionPerformed

    private void reportBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportBtnActionPerformed
        if(WheelScape.loginCustomer != null) {
            this.setVisible(false);
            
            ViewRent vr = new ViewRent();
            vr.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please register to access the feature.");
        }
    }//GEN-LAST:event_reportBtnActionPerformed

    private void payBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_payBtnActionPerformed
        if(WheelScape.loginCustomer != null) {
            this.setVisible(false);
        
            RentPayment rp = new RentPayment();
            rp.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Please register to access the feature.");
        }
        
    }//GEN-LAST:event_payBtnActionPerformed

    public static void main(String args[]) {
    
   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImg;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton payBtn;
    private javax.swing.JButton rentBtn;
    private javax.swing.JButton reportBtn;
    private javax.swing.JButton settingBtn;
    private javax.swing.JLabel username;
    // End of variables declaration//GEN-END:variables
}
