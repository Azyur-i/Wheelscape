
package group5crms.myapps;

import group5crms.mylibs.*;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UserRegister extends javax.swing.JFrame {

    
    public UserRegister() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        passwordField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        confirmPassField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        addressField = new javax.swing.JTextArea();
        genderComboBox = new javax.swing.JComboBox<>();
        registerBtn = new javax.swing.JButton();
        loginLink = new javax.swing.JLabel();
        ageField = new com.toedter.calendar.JDateChooser();
        adminRegister = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Welcome to Wheelscape! Enter Your Info Here:");

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Username:");

        usernameField.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        usernameField.setForeground(new java.awt.Color(51, 51, 51));
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password:");

        passwordField.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        passwordField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Confirm Password:");

        confirmPassField.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        confirmPassField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender:");

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DoB:");

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email:");

        phoneField.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        phoneField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phone Number:");

        emailField.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        emailField.setForeground(new java.awt.Color(51, 51, 51));

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address:");

        addressField.setColumns(20);
        addressField.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addressField.setForeground(new java.awt.Color(51, 51, 51));
        addressField.setRows(5);
        addressField.setTabSize(4);
        jScrollPane1.setViewportView(addressField);

        genderComboBox.setBackground(new java.awt.Color(204, 204, 204));
        genderComboBox.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        genderComboBox.setForeground(new java.awt.Color(51, 51, 51));
        genderComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Non-Binary", "Other" }));

        registerBtn.setBackground(new java.awt.Color(255, 102, 102));
        registerBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        registerBtn.setForeground(new java.awt.Color(255, 255, 255));
        registerBtn.setText("Register");
        registerBtn.setBorder(null);
        registerBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBtnActionPerformed(evt);
            }
        });

        loginLink.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        loginLink.setForeground(new java.awt.Color(51, 153, 255));
        loginLink.setText("Back to Login Page");
        loginLink.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLinkMouseClicked(evt);
            }
        });

        ageField.setBackground(new java.awt.Color(204, 204, 204));
        ageField.setForeground(new java.awt.Color(51, 51, 51));

        adminRegister.setBackground(new java.awt.Color(153, 153, 255));
        adminRegister.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        adminRegister.setForeground(new java.awt.Color(255, 255, 255));
        adminRegister.setText("Register as Admin");
        adminRegister.setBorder(null);
        adminRegister.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        adminRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminRegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(adminRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(loginLink))
                    .addComponent(registerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(88, 88, 88)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                        .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel9))
                        .addGap(9, 9, 9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(18, 18, 18))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(15, 15, 15)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(emailField)
                                    .addComponent(phoneField, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                    .addComponent(ageField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(37, 37, 37))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(genderComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPassField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(registerBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginLink)
                    .addComponent(adminRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(250, 70, 820, 560);

        exitBtn.setBackground(new java.awt.Color(153, 0, 0));
        exitBtn.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        exitBtn.setForeground(new java.awt.Color(255, 255, 255));
        exitBtn.setText("Exit");
        exitBtn.setBorder(null);
        exitBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitBtn);
        exitBtn.setBounds(1130, 590, 130, 40);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.jpg"))); // NOI18N
        Background.setText("Background");
        getContentPane().add(Background);
        Background.setBounds(-3, -4, 1310, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
         try {
            Data.WriteToText();
            System.exit(0);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CustomerLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_exitBtnActionPerformed

    private void loginLinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLinkMouseClicked
        // TODO add your handling code here:
        CustomerLogin loginPage = new CustomerLogin();
        loginPage.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginLinkMouseClicked

    private void registerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBtnActionPerformed
        try {                                            
            // TODO add your handling code here:
            
            boolean DetailsPerfect = false;
            
            String username = usernameField.getText().replace("\n", " ");
            String password = passwordField.getText().replace("\n", " ");
            String confirmPass = confirmPassField.getText().replace("\n", " ");
            String gender = genderComboBox.getSelectedItem().toString();
            String phoneNum = phoneField.getText().replace("\n", " ");
            String email = emailField.getText().replace("\n", " ");
            String address = addressField.getText().replace("\n", " ");
            
            int ageInt = 0;
            
            if(ageField.getDate() != null) {
                Date age = ageField.getDate();
                SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                Date ageChosen = sdf.parse(sdf.format(age));
                Date today = sdf.parse(sdf.format(new Date()));

                long millisecondsDifference = today.getTime() - ageChosen.getTime();
                long age_diff_years = (millisecondsDifference /(1000l * 60 * 60 * 24 * 365));
                ageInt = (int)age_diff_years;
            }
            
            try {

                if (username.equals("") || password.equals("") || gender.equals("") || ageField.getDate() == null || phoneNum.equals("") || email.equals("") || address.equals("")) {
                    
                    JOptionPane.showMessageDialog(null, "Please fill in all fields.", "Error!", JOptionPane.ERROR_MESSAGE);
                } else if (!password.equals(confirmPass)) {
                    
                    JOptionPane.showMessageDialog(null, "Password do not match.", "Error!", JOptionPane.ERROR_MESSAGE);
  
                } else if ((ageInt <= 0) || (ageInt >= 100)) {
                  
                    JOptionPane.showMessageDialog(null, "Invalid Age.", "Error!", JOptionPane.ERROR_MESSAGE);
                } else if ((0 <= ageInt) && (ageInt <= 17)) {
                    
                    JOptionPane.showMessageDialog(null, "Not a valid age to drive.", "Error!", JOptionPane.ERROR_MESSAGE);
                } else {
                   
                    if (true) {
                        if (email.contains("@") || email.contains(".")) {
                            DetailsPerfect = true;
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid Email!", "Error!", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid! Fill in all fields.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
          
            if (DetailsPerfect) {
                
                Customer found = Data.checkUsername(username);
                
                if (found == null) {
                    try {
                        
                        User cust = new Customer.CustomerBuilder()
                                .username(username)
                                .password(password)
                                .gender(gender)
                                .age(ageInt)
                                .phoneNum(phoneNum)
                                .email(email)
                                .address(address)
                                .build();
                        
                        Data.customers.add(cust);
                        Data.WriteToText();
                        
                        this.setVisible(false);
                        CustomerLogin start = new CustomerLogin();
                        start.setVisible(true);
                        
                        JOptionPane.showMessageDialog(null, "Your account has been registered!", "Success!", JOptionPane.INFORMATION_MESSAGE);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(UserRegister.class.getName()).log(Level.SEVERE, null, ex);
                        JOptionPane.showMessageDialog(null, "Something went wrong!", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Cannot Register with the same Username", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                
            }
        } catch (ParseException ex) {            
            Logger.getLogger(UserRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_registerBtnActionPerformed

    private void adminRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminRegisterActionPerformed
        
        String username = usernameField.getText();
        String password = passwordField.getText();

        String pass = "admin1234";
        String result = JOptionPane.showInputDialog("Enter password to gain admin access:");
        
        if (pass.equals(result)) {
            try {
                Admin adminToAdd = new Admin(username, password);

                Data.admins.add(adminToAdd);
                Data.WriteToText();
                JOptionPane.showMessageDialog(null, "Successfully added admin.");
            } catch (FileNotFoundException ex) {
                Logger.getLogger(UserRegister.class.getName()).log(Level.SEVERE, null, ex);
            } 
            
            } else if (username.equals("") || password.equals("")) {
                JOptionPane.showMessageDialog(null, "Username or Password can't be empty!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else if (username.length() < 4 || password.length() < 4) {
                JOptionPane.showMessageDialog(null, "Username or Password is too short, please select a longer username or password!", "Error!", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Wrong Admin Password!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_adminRegisterActionPerformed

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameFieldActionPerformed

    
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
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserRegister.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JTextArea addressField;
    private javax.swing.JButton adminRegister;
    private com.toedter.calendar.JDateChooser ageField;
    private javax.swing.JTextField confirmPassField;
    private javax.swing.JTextField emailField;
    private javax.swing.JButton exitBtn;
    private javax.swing.JComboBox<String> genderComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel loginLink;
    private javax.swing.JTextField passwordField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton registerBtn;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
