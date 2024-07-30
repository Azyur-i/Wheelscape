
package group5crms.myapps;

import group5crms.mylibs.Authentication;
import group5crms.mylibs.*;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AdminLogin extends javax.swing.JFrame implements Authentication {

    public AdminLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitBtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        loginBtn = new javax.swing.JButton();
        adminUsernameField = new javax.swing.JTextField();
        adminPasswordField = new javax.swing.JPasswordField();
        memberLoginBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        exitBtn.setBackground(new java.awt.Color(153, 0, 0));
        exitBtn.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.setBorder(null);
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn);
        exitBtn.setBounds(1110, 600, 110, 40);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 30)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Administrator Login");

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username:");

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password:");

        loginBtn.setBackground(new java.awt.Color(255, 102, 102));
        loginBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        loginBtn.setForeground(new java.awt.Color(255, 255, 255));
        loginBtn.setText("Login");
        loginBtn.setBorder(null);
        loginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginBtnActionPerformed(evt);
            }
        });

        adminUsernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        adminPasswordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        adminPasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                adminPasswordFieldKeyPressed(evt);
            }
        });

        memberLoginBtn.setBackground(new java.awt.Color(153, 153, 255));
        memberLoginBtn.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        memberLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        memberLoginBtn.setText("Back to Member Login");
        memberLoginBtn.setBorder(null);
        memberLoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memberLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memberLoginBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(adminUsernameField, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(adminPasswordField)))
                            .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(memberLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jLabel2)))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(adminUsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(adminPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(memberLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(460, 120, 430, 440);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_logo_left.png")));
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 1310, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memberLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memberLoginBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        CustomerLogin start = new CustomerLogin();
        start.setVisible(true);
    }//GEN-LAST:event_memberLoginBtnActionPerformed

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed
        login();
    }//GEN-LAST:event_loginBtnActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        try {
            Data.WriteToText();
            System.exit(0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void adminPasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_adminPasswordFieldKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_adminPasswordFieldKeyPressed

    public void login(){
        String username = adminUsernameField.getText();
        char[] pass = adminPasswordField.getPassword();
        String password = new String(pass);
        Admin found = Data.checkAdminUsername(username);
        
        if(username.equals("") && password.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Username and Password.");
              
        } else if(found!=null && password.equals(found.getPassword())){
            WheelScape.loginAdmin = found;
            JOptionPane.showMessageDialog(null, "Login successful!");
            
            this.setVisible(false);
            AdminPanel ap = new AdminPanel();
            ap.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password, Please Try Again.");
  
        }
        
    }
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
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField adminPasswordField;
    private javax.swing.JTextField adminUsernameField;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JButton memberLoginBtn;
    // End of variables declaration//GEN-END:variables
}
