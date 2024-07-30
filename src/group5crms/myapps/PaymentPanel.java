
package group5crms.myapps;

import group5crms.mylibs.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class PaymentPanel extends javax.swing.JFrame {
    public static Car carChosen = null;
    public PaymentPanel() throws ParseException {
        initComponents();
        String path = null;
        
        
        nameField.setText(RentPayment.rentChosen.getName());
        phoneNumField.setText(String.valueOf(RentPayment.rentChosen.getContact()));
        emailField.setText(RentPayment.rentChosen.getEmail());
        
        carTxt.setText(RentPayment.rentChosen.getCar());
        plateTxt.setText(RentPayment.rentChosen.getCarPlate());
        
        carPlateField.setText(RentPayment.rentChosen.getCarPlate());
        carField.setText(RentPayment.rentChosen.getCar());
        
        pickupDateField.setText(RentPayment.rentChosen.getPickupDate());
        returnDateField.setText(RentPayment.rentChosen.getReturnDate());
        
        date.setText(WheelScape.toDate());
        
        dayField.setText(String.valueOf(RentPayment.rentChosen.getDays()));
        totalField.setText(RentPayment.rentChosen.getTotal());
        
        Car chosenCar = Data.chosenCar(plateTxt.getText());
                
        PaymentPanel.carChosen = chosenCar;
        
        String type = PaymentPanel.carChosen.getType();
        
        switch (type) {
            case "SUV":
                path = "src/resource/suv-car.png";
                break;
            case "Sedan":
                path = "src/resource/sedan.png";
                break;
            case "Hatchback":
                path = "src/resource/hatchback.png";
                break;
            case "Van":
                path = "src/resource/van.png";
                break;
            case "Roadster":
                path = "src/resource/roadster.png";
                break;
        }
        
        
        File resourcesDirectory = new File(path);
        typeImg.setIcon(new ImageIcon(resourcesDirectory.getAbsolutePath()));
        
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        paymentMethod = new javax.swing.ButtonGroup();
        topBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel18 = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        carTxt = new javax.swing.JLabel();
        plateTxt = new javax.swing.JLabel();
        confirmRentBtn = new javax.swing.JButton();
        typeImg = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        pickupTxt = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        returnTxt = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cardRadio = new javax.swing.JRadioButton();
        ecashRadio = new javax.swing.JRadioButton();
        f2fRadio = new javax.swing.JRadioButton();
        paymentTxt = new javax.swing.JLabel();
        paymentField = new javax.swing.JTextField();
        rentBtn = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nameField = new javax.swing.JLabel();
        emailField = new javax.swing.JLabel();
        phoneNumField = new javax.swing.JLabel();
        carPlateField = new javax.swing.JLabel();
        pickupDateField = new javax.swing.JLabel();
        returnDateField = new javax.swing.JLabel();
        dayField = new javax.swing.JLabel();
        carField = new javax.swing.JLabel();
        totalField = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1310, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));
        topBar.setPreferredSize(new java.awt.Dimension(1300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_smalllogo.png")));

        date.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("Date");
        date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dateMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Payment");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel18.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Main Menu");
        jLabel18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
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

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addGap(12, 12, 12)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 838, Short.MAX_VALUE)
                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(exitIcon)
                .addGap(31, 31, 31))
        );
        topBarLayout.setVerticalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(topBarLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel2)
                                .addGap(0, 8, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                        .addGap(0, 7, Short.MAX_VALUE)
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                                    .addComponent(exitIcon)
                                    .addGap(15, 15, 15))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap()))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, topBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addGap(15, 15, 15))
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 60);

        jPanel2.setLayout(null);

        carTxt.setFont(new java.awt.Font("Perpetua", 0, 40)); // NOI18N
        carTxt.setText("<<carName>>");
        jPanel2.add(carTxt);
        carTxt.setBounds(50, 130, 340, 39);

        plateTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        plateTxt.setText("<<carPlate>>");
        jPanel2.add(plateTxt);
        plateTxt.setBounds(50, 170, 140, 28);

        confirmRentBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        confirmRentBtn.setText("Confirm Address");
        confirmRentBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        confirmRentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmRentBtnActionPerformed(evt);
            }
        });
        jPanel2.add(confirmRentBtn);
        confirmRentBtn.setBounds(290, 530, 179, 35);

        typeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/suv-car.png"))); // NOI18N
        jPanel2.add(typeImg);
        typeImg.setBounds(50, 10, 480, 120);

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel3.setText("Pickup Address:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 210, 120, 30);

        jLabel11.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        jLabel11.setText("Return Address:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(50, 370, 110, 30);

        pickupTxt.setColumns(20);
        pickupTxt.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        pickupTxt.setRows(5);
        jScrollPane2.setViewportView(pickupTxt);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(180, 210, 290, 140);

        returnTxt.setColumns(20);
        returnTxt.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        returnTxt.setRows(5);
        jScrollPane3.setViewportView(returnTxt);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(180, 370, 290, 140);

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(570, 20, 10, 540);

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel4.setText("Rent Summary");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(600, 10, 260, 42);

        jLabel5.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel5.setText("Name:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(600, 70, 80, 21);

        jLabel6.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel6.setText("Phone Number:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(840, 70, 130, 21);

        jLabel7.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel7.setText("Email:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(600, 120, 80, 21);

        jLabel8.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel8.setText("Car Plate:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(600, 190, 90, 21);

        jLabel9.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel9.setText("Car:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(840, 190, 100, 21);

        jLabel14.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel14.setText("Pickup Date:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(600, 240, 110, 21);

        jLabel15.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel15.setText("Return Date:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(840, 240, 110, 21);

        jLabel16.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        jLabel16.setText("Days:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(600, 290, 80, 21);

        jLabel17.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel17.setText("Total:");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(600, 360, 100, 42);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(590, 350, 487, 10);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(600, 160, 487, 10);

        paymentMethod.add(cardRadio);
        cardRadio.setEnabled(false);
        cardRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cardRadioMousePressed(evt);
            }
        });
        jPanel2.add(cardRadio);
        cardRadio.setBounds(600, 440, 20, 20);

        paymentMethod.add(ecashRadio);
        ecashRadio.setEnabled(false);
        ecashRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ecashRadioMousePressed(evt);
            }
        });
        jPanel2.add(ecashRadio);
        ecashRadio.setBounds(720, 440, 19, 20);

        paymentMethod.add(f2fRadio);
        f2fRadio.setEnabled(false);
        f2fRadio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                f2fRadioMousePressed(evt);
            }
        });
        jPanel2.add(f2fRadio);
        f2fRadio.setBounds(840, 440, 19, 20);

        paymentTxt.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        paymentTxt.setText("Account Number:");
        jPanel2.add(paymentTxt);
        paymentTxt.setBounds(610, 530, 140, 21);

        paymentField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        paymentField.setEnabled(false);
        paymentField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentFieldActionPerformed(evt);
            }
        });
        jPanel2.add(paymentField);
        paymentField.setBounds(750, 520, 180, 40);

        rentBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rentBtn.setText("Rent");
        rentBtn.setEnabled(false);
        rentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentBtnActionPerformed(evt);
            }
        });
        jPanel2.add(rentBtn);
        rentBtn.setBounds(940, 520, 160, 40);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/account.png")));
        jPanel2.add(jLabel19);
        jLabel19.setBounds(870, 420, 70, 60);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/card.png")));
        jPanel2.add(jLabel10);
        jLabel10.setBounds(630, 420, 70, 60);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/ecash.png")));
        jPanel2.add(jLabel13);
        jLabel13.setBounds(750, 420, 70, 60);

        nameField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        nameField.setText("<<name>>");
        jPanel2.add(nameField);
        nameField.setBounds(670, 70, 150, 20);

        emailField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        emailField.setText("<<email>>");
        jPanel2.add(emailField);
        emailField.setBounds(670, 120, 150, 21);

        phoneNumField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        phoneNumField.setText("<<phoneNum>>");
        jPanel2.add(phoneNumField);
        phoneNumField.setBounds(970, 70, 120, 20);

        carPlateField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        carPlateField.setText("<<carPlate>>");
        jPanel2.add(carPlateField);
        carPlateField.setBounds(710, 190, 100, 20);

        pickupDateField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        pickupDateField.setText("<<pickUp>>");
        jPanel2.add(pickupDateField);
        pickupDateField.setBounds(710, 240, 100, 21);

        returnDateField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        returnDateField.setText("<<return>>");
        jPanel2.add(returnDateField);
        returnDateField.setBounds(950, 240, 110, 21);

        dayField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        dayField.setText("<<days>>");
        jPanel2.add(dayField);
        dayField.setBounds(710, 290, 80, 21);

        carField.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        carField.setText("<<car>>");
        jPanel2.add(carField);
        carField.setBounds(950, 190, 120, 21);

        totalField.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        totalField.setText("<<total>>");
        jPanel2.add(totalField);
        totalField.setBounds(690, 360, 240, 42);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(80, 70, 1120, 580);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 1310, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked

    }//GEN-LAST:event_dateMouseClicked

    private void paymentFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paymentFieldActionPerformed

    private void confirmRentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmRentBtnActionPerformed
        String pickupAdd = pickupTxt.getText();
        String returnAdd = returnTxt.getText();
        
        if(!pickupAdd.equals("") && !returnAdd.equals("")) {
            cardRadio.setEnabled(true);
            ecashRadio.setEnabled(true);
            f2fRadio.setEnabled(true);
            paymentField.setEnabled(true);
            rentBtn.setEnabled(true);
            pickupTxt.setEnabled(false);
            returnTxt.setEnabled(false);
            confirmRentBtn.setEnabled(false);
         
        } else {
            JOptionPane.showMessageDialog(null, "Please Input Valid Address.", "Error!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_confirmRentBtnActionPerformed

    private void rentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentBtnActionPerformed
        String paymentInfo = paymentField.getText();
        
        try {
            
            String payMethod = null;
            boolean Error = false;
            if(cardRadio.isSelected()){
                payMethod = "Debit/Credit Card";
            } else if(ecashRadio.isSelected()){
                payMethod = "E-Cash";
            } else if(f2fRadio.isSelected()) {
                payMethod = "Face To Face";
            } else {
                Error = true;
            }
            
            if(!Error) {
                double paymentInfoDob = Double.parseDouble(paymentInfo);
                if(paymentInfo.length() >= 10 && paymentInfo.length() <= 16) {
                    
                
                    if (paymentInfoDob >= 0) {
                    
                        RentPayment.rentChosen.setPickupAdd(pickupTxt.getText().replace("\n", " "));
                        RentPayment.rentChosen.setReturnAdd(returnTxt.getText().replace("\n", " "));
                        RentPayment.rentChosen.setPaymentMethod(payMethod);
                        RentPayment.rentChosen.setPaymentDetails(paymentInfo);
                        RentPayment.rentChosen.setStatus("Paid");

                        Data.WriteToText();

                        JOptionPane.showMessageDialog(null, "Rent Made Successfully. Total Paid: " + totalField.getText()+ ".");

                        this.setVisible(false);
                        MainMenu mm = new MainMenu();
                        mm.setVisible(true);
                    } else {
                        JOptionPane.showMessageDialog(null, "Negative value is not allowed!", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                    
                } else {
                    JOptionPane.showMessageDialog(null, "Payment Number must be 10 - 16 digits!", "Error!", JOptionPane.ERROR_MESSAGE);
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Please Select Atleast one Payment Method.", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }  catch (NumberFormatException e){ 
           JOptionPane.showMessageDialog(null, "Please Input Valid Payment Info.", "Error!", JOptionPane.ERROR_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
        
       
    }//GEN-LAST:event_rentBtnActionPerformed

    private void cardRadioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardRadioMousePressed
        paymentTxt.setText("");

        paymentTxt.setText("Card Number:");
    }//GEN-LAST:event_cardRadioMousePressed

    private void ecashRadioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ecashRadioMousePressed
        paymentTxt.setText("");

        paymentTxt.setText("Account Number:");
    }//GEN-LAST:event_ecashRadioMousePressed

    private void f2fRadioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_f2fRadioMousePressed
        paymentTxt.setText("");
        
        paymentTxt.setText("Phone Number:");
    }//GEN-LAST:event_f2fRadioMousePressed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        this.setVisible(false);
        
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_jLabel18MouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        this.setVisible(false);
        Data.logout();
    }//GEN-LAST:event_exitIconMouseClicked
    
    
    public static void main(String string) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PaymentPanel().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carField;
    private javax.swing.JLabel carPlateField;
    private javax.swing.JLabel carTxt;
    private javax.swing.JRadioButton cardRadio;
    private javax.swing.JButton confirmRentBtn;
    private javax.swing.JLabel date;
    private javax.swing.JLabel dayField;
    private javax.swing.JRadioButton ecashRadio;
    private javax.swing.JLabel emailField;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JRadioButton f2fRadio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel nameField;
    private javax.swing.JTextField paymentField;
    private javax.swing.ButtonGroup paymentMethod;
    private javax.swing.JLabel paymentTxt;
    private javax.swing.JLabel phoneNumField;
    private javax.swing.JLabel pickupDateField;
    private javax.swing.JTextArea pickupTxt;
    private javax.swing.JLabel plateTxt;
    private javax.swing.JButton rentBtn;
    private javax.swing.JLabel returnDateField;
    private javax.swing.JTextArea returnTxt;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel totalField;
    private javax.swing.JLabel typeImg;
    // End of variables declaration//GEN-END:variables
}
