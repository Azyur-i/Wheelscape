
package group5crms.myapps;

import group5crms.mylibs.Authentication;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import group5crms.mylibs.*;
public class CustomerLogin extends javax.swing.JFrame implements Authentication {

 
    public CustomerLogin() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        loginBtn = new javax.swing.JButton();
        registerBtn = new javax.swing.JLabel();
        guestBtn = new javax.swing.JLabel();
        adminLoginBtn = new javax.swing.JButton();
        passwordField = new javax.swing.JPasswordField();
        exitBtn = new javax.swing.JButton();
        backgroundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_smalllogo.png")));
        jLabel7.setText("jLabel7");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("W!elcome to Wheelscape!");

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Username:");

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 204, 204));
        jLabel3.setText("Password:");

        usernameField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

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

        registerBtn.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(51, 102, 204));
        registerBtn.setText("New here? Register.");
        registerBtn.setToolTipText("");
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registerBtnMouseClicked(evt);
            }
        });

        guestBtn.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        guestBtn.setForeground(new java.awt.Color(51, 102, 204));
        guestBtn.setText("Continue as Guest");
        guestBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guestBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guestBtnMouseClicked(evt);
            }
        });

        adminLoginBtn.setBackground(new java.awt.Color(153, 153, 255));
        adminLoginBtn.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        adminLoginBtn.setForeground(new java.awt.Color(255, 255, 255));
        adminLoginBtn.setText("Admin Login");
        adminLoginBtn.setBorder(null);
        adminLoginBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminLoginBtnActionPerformed(evt);
            }
        });

        passwordField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        passwordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                passwordFieldKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adminLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(guestBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(registerBtn, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(loginBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(usernameField)
                            .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))))
                .addGap(34, 34, 34))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(loginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(registerBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guestBtn))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(adminLoginBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

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

        backgroundImage.setBackground(new java.awt.Color(0, 0, 0));
        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N
        backgroundImage.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(1110, 1110, 1110)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(backgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel7)
                .addGap(32, 32, 32)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(backgroundImage, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginBtnActionPerformed

        login();

    }//GEN-LAST:event_loginBtnActionPerformed

    private void registerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerBtnMouseClicked
        this.setVisible(false);
        UserRegister reg = new UserRegister();
        reg.setVisible(true);
    }//GEN-LAST:event_registerBtnMouseClicked

    private void guestBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guestBtnMouseClicked

        this.setVisible(false);
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_guestBtnMouseClicked

    private void adminLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminLoginBtnActionPerformed
        this.setVisible(false);
        AdminLogin adminLogin = new AdminLogin();
        adminLogin.setVisible(true);
    }//GEN-LAST:event_adminLoginBtnActionPerformed

    private void passwordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passwordFieldKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_passwordFieldKeyPressed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        try {
            Data.WriteToText();
            System.exit(0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    public void login(){
        String username = usernameField.getText();
        char[] pass = passwordField.getPassword();
       
        String password = new String(pass);
        
      
        Customer found = Data.checkUsername(username);
        
       
        if(username.equals("") && password.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter Username and Password.", "Error!", JOptionPane.ERROR_MESSAGE);
        
         
        } else if(found!= null && password.equals(found.getPassword())){
            
                WheelScape.loginCustomer = found;
                JOptionPane.showMessageDialog(null, "Login successful!");
              
                this.setVisible(false);
                MainMenu mm = new MainMenu();
                mm.setVisible(true);
            
        } else {
            JOptionPane.showMessageDialog(null, "Wrong Username or Password, Please Try Again.", "Error!", JOptionPane.ERROR_MESSAGE);
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
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adminLoginBtn;
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JButton exitBtn;
    private javax.swing.JLabel guestBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginBtn;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel registerBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
