
package group5crms.myapps;

import group5crms.mylibs.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class SettingsPanel extends javax.swing.JFrame {

    
    public SettingsPanel() {
        initComponents();
        
        
        String path;
        
        date.setText(WheelScape.toDate());
        
        setLabel();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        usernameLabel = new javax.swing.JLabel();
        passwordLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        phoneNumLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        newPassword = new javax.swing.JPasswordField();
        confirmPassword = new javax.swing.JPasswordField();
        phoneNum = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        saveBtn = new javax.swing.JButton();
        topBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        backgroundBtn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/person.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(110, 110, 150, 160);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        jLabel4.setText("Username:");

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        jLabel5.setText("Password:");

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        jLabel6.setText("Age:");

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        jLabel7.setText("Contact Number:");

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        jLabel8.setText("Email:");

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        jLabel9.setText("Address:");

        usernameLabel.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        usernameLabel.setText("username");

        passwordLabel.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        passwordLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/hidden.png"))); // NOI18N
        passwordLabel.setText("password");
        passwordLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        passwordLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        passwordLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        passwordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                passwordLabelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                passwordLabelMouseExited(evt);
            }
        });

        ageLabel.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        ageLabel.setText("age");

        phoneNumLabel.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        phoneNumLabel.setText("contact num");

        emailLabel.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        emailLabel.setText("email");

        addressLabel.setFont(new java.awt.Font("Perpetua", 0, 22)); // NOI18N
        addressLabel.setText("address");

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel)
                    .addComponent(usernameLabel)
                    .addComponent(passwordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(emailLabel)
                    .addComponent(phoneNumLabel)
                    .addComponent(addressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel7)
                            .addComponent(usernameLabel)
                            .addComponent(phoneNumLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(passwordLabel)
                            .addComponent(emailLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)
                            .addComponent(ageLabel)
                            .addComponent(addressLabel))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(290, 110, 920, 160);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jSeparator3);
        jSeparator3.setBounds(110, 290, 1100, 10);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 0, 0)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel10.setText("Edit Profile");

        jLabel11.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel11.setText("New Password:");

        jLabel12.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel12.setText("Confirm Password:");

        jLabel13.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel13.setText("Contact Number:");

        jLabel14.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel14.setText("Email:");

        jLabel15.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel15.setText("Address:");

        newPassword.setBackground(new java.awt.Color(229, 241, 243));
        newPassword.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        newPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        confirmPassword.setBackground(new java.awt.Color(229, 241, 243));
        confirmPassword.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        confirmPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        phoneNum.setBackground(new java.awt.Color(229, 241, 243));
        phoneNum.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        phoneNum.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        email.setBackground(new java.awt.Color(229, 241, 243));
        email.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        email.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));

        address.setBackground(new java.awt.Color(229, 241, 243));
        address.setColumns(20);
        address.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        address.setRows(5);
        address.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(102, 204, 255), 2, true));
        jScrollPane1.setViewportView(address);

        saveBtn.setBackground(new java.awt.Color(0, 102, 204));
        saveBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(217, 217, 217)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addGap(0, 0, Short.MAX_VALUE)
                                    .addComponent(saveBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel14)
                                        .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel15)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(newPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(217, 217, 217)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel13)
                                        .addComponent(phoneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(618, 618, 618)))
                            .addGap(232, 232, 232)))
                    .addComponent(jLabel10))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(saveBtn))
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(phoneNum)
                            .addComponent(newPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(110, 310, 1100, 320);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_mediumlogo.png")));

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Main Menu");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Setting");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        date.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("date");

        exitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/exit.png"))); // NOI18N
        exitIcon.setToolTipText("Exit");
        exitIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 762, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitIcon)
                .addGap(34, 34, 34))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitIcon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(date)
                        .addComponent(jLabel16)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 60);

        backgroundBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N
        backgroundBtn.setText("jLabel1");
        getContentPane().add(backgroundBtn);
        backgroundBtn.setBounds(-3, -4, 1310, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordLabelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLabelMouseEntered
        // TODO add your handling code here:
        passwordLabel.setText(WheelScape.loginCustomer.getPassword());
    }//GEN-LAST:event_passwordLabelMouseEntered

    private void passwordLabelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passwordLabelMouseExited
        // TODO add your handling code here:
        passwordLabel.setText("*".repeat(WheelScape.loginCustomer.getPassword().length()));
    }//GEN-LAST:event_passwordLabelMouseExited

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        
        char[] password = newPassword.getPassword();
        char[] conPass = confirmPassword.getPassword();
        
        String newPass = new String(password);
        String confirmPass = new String(conPass);
        String addressVal = address.getText().replace("\n", " ");
        String phoneNumVal = phoneNum.getText().replace("\n", " ");
        String emailVal = email.getText().replace("\n", " ");
        
        int flag = 0;
        
        if (newPass.equals("") && confirmPass.equals("") && addressVal.equals("") && phoneNumVal.equals("") && emailVal.equals("")){
            JOptionPane.showMessageDialog(null, "Please Edit Atleast One Field", "Error!", JOptionPane.ERROR_MESSAGE);
            
        } else if((!newPass.equals("") || !confirmPass.equals("")) && !newPass.equals(confirmPass) ) {
            
            JOptionPane.showMessageDialog(null, "Password and Confirm Password does not match ! Please Try Again.", "Error!", JOptionPane.ERROR_MESSAGE);
            
        } else {
            
            if(!newPass.equals("") && newPass.equals(confirmPass)) {
                WheelScape.loginCustomer.setPassword(newPass);
                flag = 1;
            }
            
            if(!phoneNumVal.equals("")) {
                
                if ((phoneNumVal.length() < 10 || phoneNumVal.length() > 11) || !phoneNumVal.startsWith("01") ) {
                    JOptionPane.showMessageDialog(null, "Invalid Phone Number!", "Error!", JOptionPane.ERROR_MESSAGE);
                } else {
                    
                    
                    try { 
                        Integer.parseInt(phoneNumVal);
                        WheelScape.loginCustomer.setPhoneNum(phoneNumVal);
                        flag = 1;
                    }  
                    catch (Exception e) { 
                        
                        JOptionPane.showMessageDialog(null, "Invalid Phone Number!", "Error!", JOptionPane.ERROR_MESSAGE);
                        
                    } 
                }
                
            } 
            if(!emailVal.equals("")){
                
                if (emailVal.contains("@") || emailVal.contains(".")) {
                    
                    WheelScape.loginCustomer.setEmail(emailVal);
                    flag = 1;
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid Email!", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                
                
            } 
            if(!addressVal.equals("")) {

                WheelScape.loginCustomer.setAddress(addressVal);
                flag = 1;
            } 
        } 
        
        if (flag == 1){
        
            try {
                Data.WriteToText();
                JOptionPane.showMessageDialog(null, "Successfully Updated Profile.");
                
                setLabel();
                
                address.setText("");
                phoneNum.setText("");
                email.setText("");
                confirmPassword.setText("");
                newPassword.setText("");
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(SettingsPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }
        
        System.out.println(WheelScape.loginCustomer.toString());
    }//GEN-LAST:event_saveBtnActionPerformed

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);

        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        this.setVisible(false);
        Data.logout();
    }//GEN-LAST:event_exitIconMouseClicked
    
    public void setLabel() {
        
        usernameLabel.setText(WheelScape.loginCustomer.getUsername());
        passwordLabel.setText("*".repeat(WheelScape.loginCustomer.getPassword().length()));
        ageLabel.setText(String.valueOf(WheelScape.loginCustomer.getAge()));
        phoneNumLabel.setText(String.valueOf(WheelScape.loginCustomer.getPhoneNum()));
        emailLabel.setText(WheelScape.loginCustomer.getEmail());
        addressLabel.setText(WheelScape.loginCustomer.getAddress());
        
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
            java.util.logging.Logger.getLogger(SettingsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SettingsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SettingsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SettingsPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SettingsPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea address;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JLabel backgroundBtn;
    private javax.swing.JPasswordField confirmPassword;
    private javax.swing.JLabel date;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPasswordField newPassword;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JTextField phoneNum;
    private javax.swing.JLabel phoneNumLabel;
    private javax.swing.JButton saveBtn;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel usernameLabel;
    // End of variables declaration//GEN-END:variables
}
