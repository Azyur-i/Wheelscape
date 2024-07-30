
package group5crms.myapps;

import group5crms.mylibs.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


public class CarDetails extends javax.swing.JFrame {

    public CarDetails() {
        initComponents();
        String path = null;
        
        carTxt.setText(RentCar.carChosen.getBrand() + " " + RentCar.carChosen.getModel());
        priceTxt.setText(RentCar.carChosen.getPrice());
        colorTxt.setText(RentCar.carChosen.getColor());
        speedTxt.setText(RentCar.carChosen.getSpeed());
        typeTxt.setText(RentCar.carChosen.getType());
        seaterTxt.setText(String.valueOf(RentCar.carChosen.getSeat()));
        statusTxt.setText(RentCar.carChosen.getStatus());
        plateTxt.setText(RentCar.carChosen.getCarPlate());
        date.setText(WheelScape.toDate());
        
        String type = RentCar.carChosen.getType();
        
        if(type.equals("SUV")) {
            path = "src/resource/suv-car.png";
            
        } else if(type.equals("Sedan")) {
            path = "src/resource/sedan.png";
            
        } else if(type.equals("Hatchback")) {
            path = "src/resource/hatchback.png";
            
        } else if(type.equals("Van")) {
            path = "src/resource/van.png";
            
        } else {
            path = "src/resource/roadster.png";
        }
        
        
        File resourcesDirectory = new File(path);
        typeImg.setIcon(new ImageIcon(resourcesDirectory.getAbsolutePath()));
        
        showReview();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        topBar = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        rentCarBtn = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        typeImg = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        carTxt = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        typeTxt = new javax.swing.JLabel();
        colorTxt = new javax.swing.JLabel();
        speedTxt = new javax.swing.JLabel();
        seaterTxt = new javax.swing.JLabel();
        plateTxt = new javax.swing.JLabel();
        statusTxt = new javax.swing.JLabel();
        priceTxt = new javax.swing.JLabel();
        rentCarNowBtn = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        reviewTxt = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));
        topBar.setPreferredSize(new java.awt.Dimension(1300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_mediumlogo.png")));

        jLabel10.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Main Menu");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Car Details");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setToolTipText("");

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

        rentCarBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rentCarBtn.setForeground(new java.awt.Color(255, 255, 255));
        rentCarBtn.setText("View Car");
        rentCarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rentCarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentCarBtnMouseClicked(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator2.setToolTipText("");

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rentCarBtn)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 586, Short.MAX_VALUE)
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
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(exitIcon)
                    .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(date)
                        .addComponent(rentCarBtn)))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 60);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        typeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/suv-car.png"))); // NOI18N
        jPanel1.add(typeImg);
        typeImg.setBounds(-20, 50, 230, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(100, 90, 210, 210);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        carTxt.setFont(new java.awt.Font("Perpetua", 0, 40)); // NOI18N
        carTxt.setText("<<carName>>");
        jPanel2.add(carTxt);
        carTxt.setBounds(23, 16, 673, 39);

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel4.setText("Type:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(23, 90, 68, 28);

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel5.setText("Color:");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(23, 130, 58, 28);

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel6.setText("Speed:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(23, 170, 59, 28);

        jLabel7.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel7.setText("Seater:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(433, 87, 61, 28);

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel8.setText("Car Plate:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(431, 127, 88, 28);

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel9.setText("Status:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(431, 170, 59, 28);

        typeTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        typeTxt.setText("<<carType>>");
        jPanel2.add(typeTxt);
        typeTxt.setBounds(111, 90, 147, 28);

        colorTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        colorTxt.setText("<<carColor>>");
        jPanel2.add(colorTxt);
        colorTxt.setBounds(111, 130, 147, 28);

        speedTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        speedTxt.setText("<<carSpeed>>");
        jPanel2.add(speedTxt);
        speedTxt.setBounds(111, 170, 147, 28);

        seaterTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        seaterTxt.setText("<<carSeats>>");
        jPanel2.add(seaterTxt);
        seaterTxt.setBounds(552, 87, 160, 28);

        plateTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        plateTxt.setText("<<carPlate>>");
        jPanel2.add(plateTxt);
        plateTxt.setBounds(552, 127, 160, 28);

        statusTxt.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        statusTxt.setText("<<carStaus>>");
        jPanel2.add(statusTxt);
        statusTxt.setBounds(552, 170, 140, 28);

        priceTxt.setFont(new java.awt.Font("Felix Titling", 0, 40)); // NOI18N
        priceTxt.setText("<<carPrice>>");
        jPanel2.add(priceTxt);
        priceTxt.setBounds(550, 10, 320, 48);

        rentCarNowBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rentCarNowBtn.setText("Rent Car Now");
        rentCarNowBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rentCarNowBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rentCarNowBtnActionPerformed(evt);
            }
        });
        jPanel2.add(rentCarNowBtn);
        rentCarNowBtn.setBounds(706, 167, 157, 34);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(330, 90, 880, 210);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel17.setText("Reviews");

        reviewTxt.setEditable(false);
        reviewTxt.setBackground(new java.awt.Color(255, 255, 255));
        reviewTxt.setColumns(20);
        reviewTxt.setFont(new java.awt.Font("Perpetua", 0, 18)); // NOI18N
        reviewTxt.setRows(5);
        jScrollPane1.setViewportView(reviewTxt);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(100, 320, 1110, 310);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-3, -4, 1310, 710);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
       this.setVisible(false);
        
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_jLabel10MouseClicked

    private void rentCarNowBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rentCarNowBtnActionPerformed
        
        
        try {
            String days = countDays(RentCar.pickup_Date, RentCar.return_Date);
            String total = "PHP " + calcTotal(days, RentCar.carChosen.getPrice());
            String review = "-";
            String status = "Pending";
            String LatestRID = Data.checkLatestRent();
            String RID = "R" + (Integer.parseInt(LatestRID.substring(1,LatestRID.length()))+1);
            if (JOptionPane.showConfirmDialog(null, "The rent will be " + total + " for " + days + " day/s\nDo you want to make this rent?", "Rent Confirmation",
            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                Rent rent = new Rent.RentBuilder()
                        .RentID(RID)
                        .name(WheelScape.loginCustomer.getUsername())
                        .contact(WheelScape.loginCustomer.getPhoneNum())
                        .email(WheelScape.loginCustomer.getEmail())
                        .car(carTxt.getText())
                        .carPlate(plateTxt.getText())
                        .pickupAdd(null)
                        .returnAdd(null)
                        .rentDate(WheelScape.toDate())
                        .pickupDate(RentCar.pickup_Date)
                        .returnDate(RentCar.return_Date)
                        .days(Integer.parseInt(days))
                        .total(total)
                        .paymentMethod(null)
                        .paymentDetails(null)
                        .review(review)
                        .status(status)
                        .build();
                
                Data.rents.add(rent);
                Data.WriteToText();

                JOptionPane.showMessageDialog(null, "Rent placed, please wait for admin approval to proceed for payment.\n");

                this.setVisible(false);
                MainMenu mm = new MainMenu();
                mm.setVisible(true);
            } 
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PaymentPanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(CarDetails.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_rentCarNowBtnActionPerformed

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11MouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
       this.setVisible(false);
       Data.logout();
    }//GEN-LAST:event_exitIconMouseClicked

    private void rentCarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentCarBtnMouseClicked
        this.setVisible(false);
        
        RentCar rent = new RentCar();
        rent.setVisible(true);
    }//GEN-LAST:event_rentCarBtnMouseClicked
    
    private void showReview(){
        ArrayList<Rent> reviews = Data.getReview(RentCar.carChosen.getCarPlate());
 
        Collections.shuffle(reviews);
        Object[] lines = reviews.toArray();

        for (Object line : lines) {
           int counter = 0;
           String dataline = line.toString().trim();
      
           String[] dataRow = dataline.split("\\|");
           
           if(!dataRow[15].equals("-") && counter <= 3) {
                reviewTxt.append(
                     dataRow[15] + " - " + dataRow[1] + "\n\n"
                );
                
                counter++;
           }
        }
        
        if(reviewTxt.getText().equals("")) {
            reviewTxt.setText("No reviews yet.");
        }
    }
    
    private static String countDays(String pickupdate, String returndate) throws ParseException{
        
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date pickupD = sdf.parse(pickupdate);
        Date returnD = sdf.parse(returndate);
        
        long diff = returnD.getTime() - pickupD.getTime();
        float daysdiff = (diff / (1000*60*60*24));
        int dayInt = (int) daysdiff;
        String day = String.valueOf(dayInt + 1);
        
        return day;
    }
    
    private static String calcTotal(String day, String price) {
        int dayInt = Integer.parseInt(day);
        String priceOnly = price.substring(2);
        double priceDob = Double.parseDouble(priceOnly);
        
        return String.format("%.2f", dayInt * priceDob);
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
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CarDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

   
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CarDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carTxt;
    private javax.swing.JLabel colorTxt;
    private javax.swing.JLabel date;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel plateTxt;
    private javax.swing.JLabel priceTxt;
    private javax.swing.JLabel rentCarBtn;
    private javax.swing.JButton rentCarNowBtn;
    private javax.swing.JTextArea reviewTxt;
    private javax.swing.JLabel seaterTxt;
    private javax.swing.JLabel speedTxt;
    private javax.swing.JLabel statusTxt;
    private javax.swing.JPanel topBar;
    private javax.swing.JLabel typeImg;
    private javax.swing.JLabel typeTxt;
    // End of variables declaration//GEN-END:variables
}
