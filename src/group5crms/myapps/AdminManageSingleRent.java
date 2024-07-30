
package group5crms.myapps;

import group5crms.mylibs.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.JOptionPane;

public class AdminManageSingleRent extends javax.swing.JFrame {
    
    AdminManageMultiRent amb = new AdminManageMultiRent();
    
    public AdminManageSingleRent() {
        initComponents();
        setLabels();
        
        // set date
        date.setText(WheelScape.toDate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn1 = new javax.swing.JButton();
        Background1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        dayRentedLabel = new javax.swing.JLabel();
        totalPaymentLabel = new javax.swing.JLabel();
        paymentMethodLabel = new javax.swing.JLabel();
        pickupAddInput = new javax.swing.JTextField();
        returnAddInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewInput = new javax.swing.JTextArea();
        deleteBtn = new javax.swing.JButton();
        returnDateLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        carLabel = new javax.swing.JLabel();
        carPlateLabel = new javax.swing.JLabel();
        rentDateLabel = new javax.swing.JLabel();
        pickupDateLabel = new javax.swing.JLabel();
        modifyBtn = new javax.swing.JButton();
        approveBtn = new javax.swing.JButton();
        rejectBtn = new javax.swing.JButton();
        topBar3 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        manageCusNav = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        exitIcon3 = new javax.swing.JLabel();
        manageCarNav = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        manageRentNav = new javax.swing.JLabel();
        jSeparator13 = new javax.swing.JSeparator();
        generateReportNav = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        rentIdLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        backBtn1.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        backBtn1.setText("< Back");
        backBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel4.setText("Contact :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(790, 150, 110, 30);

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel3.setText("Name :");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 150, 110, 30);

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel5.setText("Email :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(430, 150, 110, 30);

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel6.setText("Car :");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 260, 110, 30);

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel7.setText("Car Plate:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 300, 110, 30);

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel8.setText("Rent Date:");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(350, 260, 143, 30);

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel9.setText("Pickup Address:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 370, 143, 30);

        jLabel12.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel12.setText("Return Address:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(30, 430, 143, 30);

        jLabel13.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel13.setText("Pickup Date:");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(610, 260, 143, 30);

        jLabel14.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel14.setText("Return Date:");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(350, 300, 143, 30);

        jLabel15.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel15.setText("Days Rented:");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(610, 300, 118, 28);

        jLabel16.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel16.setText("Total Payment:");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(890, 260, 135, 30);

        jLabel17.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel17.setText("Payment Method:");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(890, 300, 168, 30);

        jLabel18.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel18.setText("Review:");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(30, 490, 73, 28);

        jLabel19.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel19.setText("Customer Information");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(20, 110, 195, 30);

        jLabel20.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel20.setText("Car Information");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(30, 220, 140, 30);

        jLabel21.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel21.setText("Rent Information");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(350, 220, 150, 30);

        dayRentedLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        dayRentedLabel.setText("<<date>>");
        jPanel1.add(dayRentedLabel);
        dayRentedLabel.setBounds(750, 300, 160, 30);

        totalPaymentLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        totalPaymentLabel.setText("value");
        jPanel1.add(totalPaymentLabel);
        totalPaymentLabel.setBounds(1070, 260, 160, 30);

        paymentMethodLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        paymentMethodLabel.setText("value");
        jPanel1.add(paymentMethodLabel);
        paymentMethodLabel.setBounds(1070, 300, 160, 30);

        pickupAddInput.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jPanel1.add(pickupAddInput);
        pickupAddInput.setBounds(190, 370, 590, 40);

        returnAddInput.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        returnAddInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnAddInputActionPerformed(evt);
            }
        });
        jPanel1.add(returnAddInput);
        returnAddInput.setBounds(190, 420, 590, 40);

        reviewInput.setColumns(20);
        reviewInput.setRows(5);
        jScrollPane1.setViewportView(reviewInput);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(110, 490, 1070, 80);

        deleteBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        deleteBtn.setText("Delete");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });
        jPanel1.add(deleteBtn);
        deleteBtn.setBounds(1010, 420, 170, 30);

        returnDateLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        returnDateLabel.setText("<<date>>");
        jPanel1.add(returnDateLabel);
        returnDateLabel.setBounds(480, 300, 180, 30);

        nameLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        nameLabel.setText("<<name>>");
        jPanel1.add(nameLabel);
        nameLabel.setBounds(170, 150, 200, 30);

        emailLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        emailLabel.setText("<<email>>");
        jPanel1.add(emailLabel);
        emailLabel.setBounds(530, 150, 180, 30);

        contactLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        contactLabel.setText("<<contact>>");
        jPanel1.add(contactLabel);
        contactLabel.setBounds(900, 150, 180, 30);

        carLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        carLabel.setText("<<carInfo>>");
        jPanel1.add(carLabel);
        carLabel.setBounds(140, 260, 180, 30);

        carPlateLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        carPlateLabel.setText("<<carPlate>>");
        jPanel1.add(carPlateLabel);
        carPlateLabel.setBounds(140, 300, 180, 30);

        rentDateLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rentDateLabel.setText("<<date>>");
        jPanel1.add(rentDateLabel);
        rentDateLabel.setBounds(480, 260, 180, 30);

        pickupDateLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        pickupDateLabel.setText("<<date>>");
        jPanel1.add(pickupDateLabel);
        pickupDateLabel.setBounds(750, 260, 180, 40);

        modifyBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        modifyBtn.setText("Modify");
        modifyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyBtnActionPerformed(evt);
            }
        });
        jPanel1.add(modifyBtn);
        modifyBtn.setBounds(1010, 380, 170, 30);

        approveBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        approveBtn.setText("Approve");
        approveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                approveBtnActionPerformed(evt);
            }
        });
        jPanel1.add(approveBtn);
        approveBtn.setBounds(830, 420, 170, 30);

        rejectBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rejectBtn.setText("Reject");
        rejectBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectBtnActionPerformed(evt);
            }
        });
        jPanel1.add(rejectBtn);
        rejectBtn.setBounds(830, 380, 170, 30);

        topBar3.setBackground(new java.awt.Color(0, 0, 0));
        topBar3.setMinimumSize(new java.awt.Dimension(1300, 60));

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

        exitIcon3.setToolTipText("Exit");
        exitIcon3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitIcon3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitIcon3MouseClicked(evt);
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

        jSeparator11.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator11.setToolTipText("");

        jSeparator12.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator12.setToolTipText("");

        manageRentNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        manageRentNav.setForeground(new java.awt.Color(255, 255, 255));
        manageRentNav.setText("Manage Rents");
        manageRentNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageRentNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageRentNavMouseClicked(evt);
            }
        });

        jSeparator13.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator13.setToolTipText("");

        generateReportNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        generateReportNav.setForeground(new java.awt.Color(255, 255, 255));
        generateReportNav.setText("Generate Report");
        generateReportNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generateReportNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generateReportNavMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout topBar3Layout = new javax.swing.GroupLayout(topBar3);
        topBar3.setLayout(topBar3Layout);
        topBar3Layout.setHorizontalGroup(
            topBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBar3Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel23)
                .addGap(128, 128, 128)
                .addComponent(manageCarNav)
                .addGap(18, 18, 18)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageRentNav)
                .addGap(27, 27, 27)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(manageCusNav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generateReportNav)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 338, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exitIcon3)
                .addGap(36, 36, 36))
        );
        topBar3Layout.setVerticalGroup(
            topBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBar3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(topBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(exitIcon3)
                    .addGroup(topBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(date)
                        .addComponent(manageCarNav)
                        .addComponent(generateReportNav)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(topBar3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBar3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator11)
                    .addComponent(jSeparator12)
                    .addComponent(jSeparator13)
                    .addGroup(topBar3Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(manageRentNav)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBar3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(manageCusNav)
                .addGap(15, 15, 15))
        );

        jPanel1.add(topBar3);
        topBar3.setBounds(0, 0, 1300, 60);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(30, 80, 1240, 610);

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rent ID:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(520, 30, 110, 30);

        rentIdLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rentIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentIdLabel.setText("<<rentID>>");
        getContentPane().add(rentIdLabel);
        rentIdLabel.setBounds(640, 30, 160, 30);

        backBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        backBtn.setText("< Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(60, 40, 110, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_logo.png")));
        getContentPane().add(Background);
        Background.setBounds(0, -60, 1360, 820);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void returnAddInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnAddInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_returnAddInputActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        AdminManageMultiRent amb = new AdminManageMultiRent();
        amb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtnActionPerformed

    private void approveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_approveBtnActionPerformed
        try {
            // TODO add your handling code here:
            amb.chosenRent.setStatus("Approved");
            Data.WriteToText();
            setLabels();
            JOptionPane.showMessageDialog(null, "Rent Approved!", "Success!", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminManageSingleRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_approveBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        try {
            Data.rents.remove(amb.chosenRent);
            Data.WriteToText();
            setLabels();
            JOptionPane.showMessageDialog(null, "Rent Deleted!", "Success!", JOptionPane.INFORMATION_MESSAGE);
            
            AdminManageMultiRent amb = new AdminManageMultiRent();
            amb.setVisible(true);
            this.setVisible(false);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminManageSingleRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void rejectBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectBtnActionPerformed
        try {
            // TODO add your handling code here:
            amb.chosenRent.setStatus("Rejected");
            Data.WriteToText();
            setLabels();
            JOptionPane.showMessageDialog(null, "Rent Rejected!", "Denied!", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminManageSingleRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rejectBtnActionPerformed

    private void modifyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyBtnActionPerformed
        try {
            // TODO add your handling code here:
            String updatedPickupAdd = pickupAddInput.getText().replace("\n", " ");
            String updatedReturnAdd = returnAddInput.getText().replace("\n", " ");
            String updatedReview = reviewInput.getText().replace("\n", " ");
            
            if (updatedPickupAdd.equals("") || updatedReturnAdd.equals("") || updatedReview.equals("")) {
                JOptionPane.showMessageDialog(null, "Please fill in all fields!", "Error!", JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            amb.chosenRent.setPickupAdd(updatedPickupAdd);
            amb.chosenRent.setReturnAdd(updatedReturnAdd);
            amb.chosenRent.setReview(updatedReview);
            
            Data.WriteToText();
            
            JOptionPane.showMessageDialog(null, "Rent Edited!", "Success!", JOptionPane.INFORMATION_MESSAGE);
        } catch (FileNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminManageSingleRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_modifyBtnActionPerformed

    private void backBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtn1ActionPerformed
        // TODO add your handling code here:
        AdminManageMultiRent amb = new AdminManageMultiRent();
        amb.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_backBtn1ActionPerformed

    private void manageCusNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCusNavMouseClicked
        this.setVisible(false);

        AdminManageCust amc = new AdminManageCust();
        amc.setVisible(true);
    }//GEN-LAST:event_manageCusNavMouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMouseClicked

    private void exitIcon3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIcon3MouseClicked

        this.setVisible(false);
        Data.logout();
    }//GEN-LAST:event_exitIcon3MouseClicked

    private void manageCarNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCarNavMouseClicked

        try {
            this.setVisible(false);

            AdminEditCars aec = new AdminEditCars();
            aec.setVisible(true);
        } catch (IOException ex) {
            java.util.logging.Logger.getLogger(AdminManageSingleRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(AdminManageSingleRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminManageSingleRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminManageSingleRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminManageSingleRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
 

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminManageSingleRent().setVisible(true);
            }
        });
    }
    
    public void setLabels() {
        pickupAddInput.setEnabled(false);
        returnAddInput.setEnabled(false);
        reviewInput.setEnabled(false);
        
        rejectBtn.setVisible(false);
        approveBtn.setVisible(false);
        deleteBtn.setVisible(false);
        modifyBtn.setVisible(false);
        
        rentIdLabel.setText(amb.chosenRent.getRentID());

        nameLabel.setText(amb.chosenRent.getName());
        emailLabel.setText(amb.chosenRent.getEmail());
        contactLabel.setText(amb.chosenRent.getContact());

        carLabel.setText(amb.chosenRent.getCar());
        carPlateLabel.setText(amb.chosenRent.getCarPlate());
        pickupAddInput.setText(amb.chosenRent.getPickupAdd());
        returnAddInput.setText(amb.chosenRent.getReturnAdd());

        rentDateLabel.setText(amb.chosenRent.getRentDate());
        pickupDateLabel.setText(amb.chosenRent.getPickupDate());
        returnDateLabel.setText(amb.chosenRent.getReturnDate());
        
        dayRentedLabel.setText(String.valueOf(amb.chosenRent.getDays()));
        totalPaymentLabel.setText(amb.chosenRent.getTotal());
        paymentMethodLabel.setText(amb.chosenRent.getPaymentMethod());

        if (amb.chosenRent.getStatus().equals("Paid") || amb.chosenRent.getStatus().equals("Approved")) {
            pickupAddInput.setEnabled(true);
            returnAddInput.setEnabled(true);
        } else if (amb.chosenRent.getStatus().equals("Completed")) {
            reviewInput.setEnabled(true);
        }
        
        // Review 
        reviewInput.setText(amb.chosenRent.getReview());
        
        // Check which buttons to show
        if (amb.chosenRent.getStatus().equals("Pending")) {
            rejectBtn.setVisible(true);
            approveBtn.setVisible(true);
        } else {
            deleteBtn.setVisible(true);
            modifyBtn.setVisible(true);
        } 

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Background1;
    private javax.swing.JButton approveBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton backBtn1;
    private javax.swing.JLabel carLabel;
    private javax.swing.JLabel carPlateLabel;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dayRentedLabel;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel exitIcon3;
    private javax.swing.JLabel generateReportNav;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JLabel manageCarNav;
    private javax.swing.JLabel manageCusNav;
    private javax.swing.JLabel manageRentNav;
    private javax.swing.JButton modifyBtn;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel paymentMethodLabel;
    private javax.swing.JTextField pickupAddInput;
    private javax.swing.JLabel pickupDateLabel;
    private javax.swing.JButton rejectBtn;
    private javax.swing.JLabel rentDateLabel;
    private javax.swing.JLabel rentIdLabel;
    private javax.swing.JTextField returnAddInput;
    private javax.swing.JLabel returnDateLabel;
    private javax.swing.JTextArea reviewInput;
    private javax.swing.JPanel topBar3;
    private javax.swing.JLabel totalPaymentLabel;
    // End of variables declaration//GEN-END:variables
}
