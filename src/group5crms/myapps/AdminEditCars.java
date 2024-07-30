
package group5crms.myapps;

import group5crms.mylibs.*;
import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AdminEditCars extends javax.swing.JFrame {

    public static Car carChosen = null;
    boolean checkDate = false;

    public AdminEditCars() throws IOException {
        initComponents();
        showCars();
        
        date.setText(WheelScape.toDate());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pickupDate = new com.toedter.calendar.JDateChooser();
        pickupLabel = new javax.swing.JLabel();
        returnDate = new com.toedter.calendar.JDateChooser();
        returnLabel = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        filterBtn = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BrandInput = new javax.swing.JTextField();
        ModelInput = new javax.swing.JTextField();
        ColorInput = new javax.swing.JTextField();
        SpeedInput = new javax.swing.JTextField();
        PaxInput = new javax.swing.JTextField();
        PriceInput = new javax.swing.JTextField();
        typeComboBox = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        carPlateInput = new javax.swing.JTextField();
        statusComboBox = new javax.swing.JComboBox<>();
        actionLabel = new javax.swing.JLabel();
        actionButton1 = new javax.swing.JButton();
        switchActionButton = new javax.swing.JButton();
        topBar = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        manageUserNav = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        manageCarNav = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        manageRentNav = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        generateReportNav = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carsTable = new javax.swing.JTable();
        AdminBgMain = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cars List");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(490, 90, 130, 40);

        pickupDate.setToolTipText("Pick Up Date");
        getContentPane().add(pickupDate);
        pickupDate.setBounds(800, 100, 200, 30);

        pickupLabel.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        pickupLabel.setForeground(new java.awt.Color(255, 255, 255));
        pickupLabel.setText("Pick Up Date");
        getContentPane().add(pickupLabel);
        pickupLabel.setBounds(800, 80, 90, 20);
        getContentPane().add(returnDate);
        returnDate.setBounds(1010, 100, 200, 30);

        returnLabel.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        returnLabel.setForeground(new java.awt.Color(255, 255, 255));
        returnLabel.setText("Return Date");
        getContentPane().add(returnLabel);
        returnLabel.setBounds(1020, 80, 100, 20);

        backBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        backBtn.setText("Reset");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        getContentPane().add(backBtn);
        backBtn.setBounds(670, 100, 110, 30);

        filterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/funnel.png"))); // NOI18N
        filterBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                filterBtnMousePressed(evt);
            }
        });
        filterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(filterBtn);
        filterBtn.setBounds(1230, 100, 40, 30);

        searchField.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        searchField.setForeground(new java.awt.Color(153, 153, 153));
        searchField.setText(" Search...");
        searchField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                searchFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                searchFieldFocusLost(evt);
            }
        });
        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        getContentPane().add(searchField);
        searchField.setBounds(70, 90, 300, 40);

        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel2.setText("km/h");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(270, 260, 50, 30);

        jLabel8.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel8.setText("Brand:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 100, 80, 30);

        jLabel9.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel9.setText("Model:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(20, 140, 80, 30);

        jLabel10.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel10.setText("Type:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(20, 180, 80, 30);

        jLabel11.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel11.setText("Color:");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(20, 220, 80, 30);

        jLabel12.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel12.setText("Status:");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(20, 380, 80, 30);

        jLabel13.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel13.setText("Speed:");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(20, 260, 80, 30);

        jLabel14.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel14.setText("Seats:");
        jPanel2.add(jLabel14);
        jLabel14.setBounds(20, 300, 80, 30);

        jLabel15.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel15.setText("Price:");
        jPanel2.add(jLabel15);
        jLabel15.setBounds(20, 340, 80, 30);

        BrandInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        BrandInput.setForeground(new java.awt.Color(51, 51, 51));
        BrandInput.setToolTipText("");
        jPanel2.add(BrandInput);
        BrandInput.setBounds(100, 100, 220, 30);

        ModelInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        ModelInput.setForeground(new java.awt.Color(51, 51, 51));
        ModelInput.setToolTipText("");
        jPanel2.add(ModelInput);
        ModelInput.setBounds(100, 140, 220, 30);

        ColorInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        ColorInput.setForeground(new java.awt.Color(51, 51, 51));
        ColorInput.setToolTipText("");
        jPanel2.add(ColorInput);
        ColorInput.setBounds(100, 220, 220, 30);

        SpeedInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        SpeedInput.setForeground(new java.awt.Color(51, 51, 51));
        SpeedInput.setToolTipText("");
        jPanel2.add(SpeedInput);
        SpeedInput.setBounds(100, 260, 160, 30);

        PaxInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        PaxInput.setForeground(new java.awt.Color(51, 51, 51));
        PaxInput.setToolTipText("");
        jPanel2.add(PaxInput);
        PaxInput.setBounds(100, 300, 220, 30);

        PriceInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        PriceInput.setForeground(new java.awt.Color(51, 51, 51));
        PriceInput.setToolTipText("");
        jPanel2.add(PriceInput);
        PriceInput.setBounds(100, 340, 220, 30);

        typeComboBox.setBackground(new java.awt.Color(204, 204, 204));
        typeComboBox.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        typeComboBox.setForeground(new java.awt.Color(51, 51, 51));
        typeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SUV", "Sedan", "Hatchback", "Van", "Roadster" }));
        typeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboBoxActionPerformed(evt);
            }
        });
        jPanel2.add(typeComboBox);
        typeComboBox.setBounds(100, 180, 220, 30);

        jLabel16.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel16.setText("Car Plate:");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(20, 60, 80, 30);

        carPlateInput.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        carPlateInput.setForeground(new java.awt.Color(51, 51, 51));
        carPlateInput.setToolTipText("");
        carPlateInput.setEnabled(false);
        jPanel2.add(carPlateInput);
        carPlateInput.setBounds(100, 60, 220, 30);

        statusComboBox.setBackground(new java.awt.Color(204, 204, 204));
        statusComboBox.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        statusComboBox.setForeground(new java.awt.Color(51, 51, 51));
        statusComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Available", "Rented", "Unavailable" }));
        jPanel2.add(statusComboBox);
        statusComboBox.setBounds(100, 380, 220, 30);

        actionLabel.setFont(new java.awt.Font("Perpetua", 1, 24)); // NOI18N
        actionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actionLabel.setText("Modify Car");
        jPanel2.add(actionLabel);
        actionLabel.setBounds(0, 10, 340, 30);

        actionButton1.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        actionButton1.setText("Modify");
        actionButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actionButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(actionButton1);
        actionButton1.setBounds(20, 440, 300, 31);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(50, 180, 340, 500);

        switchActionButton.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        switchActionButton.setText("Switch to Add Car");
        switchActionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchActionButtonActionPerformed(evt);
            }
        });
        getContentPane().add(switchActionButton);
        switchActionButton.setBounds(50, 140, 340, 30);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_mediumlogo.png")));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        manageUserNav.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        manageUserNav.setForeground(new java.awt.Color(255, 255, 255));
        manageUserNav.setText("Manage Users");
        manageUserNav.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        manageUserNav.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manageUserNavMouseClicked(evt);
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
                .addComponent(jLabel3)
                .addGap(128, 128, 128)
                .addComponent(manageCarNav)
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(manageRentNav)
                .addGap(27, 27, 27)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(manageUserNav)
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
                .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(topBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jSeparator2)
                            .addComponent(jSeparator3)
                            .addComponent(jSeparator4)))
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
                                .addGap(15, 15, 15)
                                .addComponent(manageRentNav)))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(manageUserNav)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 70);

        carsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Plate", "Brand", "Model", "Type", "Color", "Speed", "Seats", "Price", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        carsTable.getTableHeader().setReorderingAllowed(false);
        carsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carsTable);
        if (carsTable.getColumnModel().getColumnCount() > 0) {
            carsTable.getColumnModel().getColumn(0).setResizable(false);
            carsTable.getColumnModel().getColumn(1).setResizable(false);
            carsTable.getColumnModel().getColumn(2).setResizable(false);
            carsTable.getColumnModel().getColumn(3).setResizable(false);
            carsTable.getColumnModel().getColumn(4).setResizable(false);
            carsTable.getColumnModel().getColumn(5).setResizable(false);
            carsTable.getColumnModel().getColumn(6).setResizable(false);
            carsTable.getColumnModel().getColumn(7).setResizable(false);
            carsTable.getColumnModel().getColumn(8).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(420, 140, 850, 500);

        AdminBgMain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_logo.png")));
        AdminBgMain.setText("jLabel1");
        getContentPane().add(AdminBgMain);
        AdminBgMain.setBounds(0, 60, 1300, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void switchActionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchActionButtonActionPerformed
        // TODO add your handling code here:
        String currentAction = actionLabel.getText();
        
        if (currentAction.equals("Add Car")) {
            switchActionButton.setText("Switch to Add Car");
            actionLabel.setText("Modify Car");
            actionButton1.setText("Modify");
            clearFields();
            carPlateInput.setEnabled(false);
            
        } else {
            switchActionButton.setText("Switch to Modify Car");
            actionLabel.setText("Add Car");
            actionButton1.setText("Add");
            clearFields();
            carPlateInput.setEnabled(true);
        }
    }//GEN-LAST:event_switchActionButtonActionPerformed

    private void generateReportNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generateReportNavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminGenReport agr = new AdminGenReport();
        agr.setVisible(true);
    }//GEN-LAST:event_generateReportNavMouseClicked

    private void manageRentNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageRentNavMouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        AdminManageMultiRent amb = new AdminManageMultiRent();
        amb.setVisible(true);
    }//GEN-LAST:event_manageRentNavMouseClicked

    private void manageCarNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageCarNavMouseClicked
        try {
            this.setVisible(false);

            AdminEditCars aec;

            aec = new AdminEditCars();

            aec.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminEditCars.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_manageCarNavMouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked

        this.setVisible(false);
        Data.logout();
    }//GEN-LAST:event_exitIconMouseClicked

    private void dateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dateMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_dateMouseClicked

    private void manageUserNavMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manageUserNavMouseClicked
        this.setVisible(false);

        AdminManageCust amc = new AdminManageCust();
        amc.setVisible(true);
    }//GEN-LAST:event_manageUserNavMouseClicked

    private void typeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_typeComboBoxActionPerformed

    private void carsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carsTableMouseClicked
         // TODO add your handling code here:
        switchActionButton.setText("Switch to Add Car");
        actionLabel.setText("Modify Car");
        actionButton1.setText("Modify");
        clearFields();
        carPlateInput.setEnabled(false);

        DefaultTableModel model = (DefaultTableModel)carsTable.getModel();

        int row = carsTable.getSelectedRow();
        String car_plate = model.getValueAt(carsTable.convertRowIndexToModel(row), 0).toString();

        Car chosenCar = Data.chosenCar(car_plate);
        carChosen = chosenCar;

        int index = carChosen.getSpeed().indexOf("km/h");
        String newCarSpeed = carChosen.getSpeed().substring(0, index);


        String newCarPrice = carChosen.getPrice().substring(2);

        carPlateInput.setText(carChosen.getCarPlate());
        BrandInput.setText(carChosen.getBrand());
        ModelInput.setText(carChosen.getModel());
        typeComboBox.setSelectedItem(carChosen.getType());
        ColorInput.setText(carChosen.getColor());
        SpeedInput.setText(newCarSpeed);
        PaxInput.setText(String.valueOf(carChosen.getSeat()));
        PriceInput.setText(newCarPrice);
        statusComboBox.setSelectedItem(carChosen.getStatus());
        
    }//GEN-LAST:event_carsTableMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void searchFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusGained
        if(searchField.getText().equals(" Search...")){
            searchField.setText("");
            searchField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_searchFieldFocusGained

    private void searchFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_searchFieldFocusLost
        if(searchField.getText().equals("")){
            searchField.setText(" Search...");
            searchField.setForeground(new Color(153,153,153));
        }
    }//GEN-LAST:event_searchFieldFocusLost

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        carsTable.setRowSorter(tr);

        tr.setRowFilter(new RowFilter<DefaultTableModel, Object>() {
            @Override
            public boolean include(Entry<? extends DefaultTableModel, ? extends Object> entry) {
                String searchTerm = searchField.getText().trim().toLowerCase();
                for (int i = 0; i < entry.getValueCount(); i++) {
                    if (entry.getStringValue(i).toLowerCase().contains(searchTerm)) {
                        return true;
                    }
                }
                return false;
            }
        });
    }//GEN-LAST:event_searchFieldKeyReleased

    private void filterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBtnActionPerformed
        if(pickupDate.getDate()!= null && returnDate.getDate() != null){
            Date today = new Date();

            if(pickupDate.getDate().compareTo(today) >= 0 && returnDate.getDate().compareTo(today) >= 0){

                if(pickupDate.getDate().compareTo(returnDate.getDate()) < 0){

                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    String pickup_date = sdf.format(pickupDate.getDate());
                    String return_date = sdf.format(returnDate.getDate());

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
                    LocalDate pickupdate = LocalDate.parse(pickup_date, formatter);
                    LocalDate returndate = LocalDate.parse(return_date, formatter);

                    ArrayList<Car> filterRentedCars = Data.filterRentedCar(pickupdate, returndate);

                    DefaultTableModel model = (DefaultTableModel)carsTable.getModel();

                    while (model.getRowCount() > 0) {
                        model.removeRow(0);
                    }

                    Object[] tableLines = filterRentedCars.toArray();

                    for (Object tableLine : tableLines) {
                        String line = tableLine.toString().trim();
                        String[] dataRow = line.split("\\|");
                        if (dataRow[8].equals("Available")) {
                            dataRow[8] = "Rented";
                            model.addRow(dataRow);
                        }
                        
                        else
                            model.addRow(dataRow);

                    }
                    checkDate = true;
                    JOptionPane.showMessageDialog(null, "Result Filtered.");

                } else {

                    JOptionPane.showMessageDialog(null, "Pick Up Date Cannot be After Return Date. Please Try Other Date.", "Invalid Date", JOptionPane.ERROR_MESSAGE);
                    checkDate = false;
                }

            } else{

                JOptionPane.showMessageDialog(null, "Date is not valid. Please Try Another Date.", "Invalid Date", JOptionPane.ERROR_MESSAGE);
                checkDate = false;
            }

        } else {

            JOptionPane.showMessageDialog(null, "Please Input Date.", "Error!", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_filterBtnActionPerformed

    private void filterBtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filterBtnMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_filterBtnMousePressed

    private void actionButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionButton1ActionPerformed
        String getAction = actionButton1.getText();
        
        if (getAction.equals("Modify")) {
            try {
                boolean safeData = checkFields();
                
                if (safeData) {
                    modifyCar();
                }
            } catch (IOException ex) {
                Logger.getLogger(AdminEditCars.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        } else if (getAction.equals("Add")) {
            try {
                boolean safeData = checkFields();
                
                if (safeData) {
                    addCar();
                }
            } catch (IOException ex) {
                Logger.getLogger(AdminEditCars.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_actionButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        try {
            this.setVisible(false);

            AdminEditCars aec;

            aec = new AdminEditCars();

            aec.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(AdminEditCars.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_backBtnActionPerformed

    public static void main(String string) {
   
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminEditCars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AdminEditCars().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AdminEditCars.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }
    
    public boolean checkFields() throws IOException {
        
        boolean flag = true;
        
        String action = actionButton1.getText();

        if (carChosen == null && action.equals("Modify")) {
            JOptionPane.showMessageDialog(null, "Please Select a car to modify.", "Error!", JOptionPane.ERROR_MESSAGE);
            flag = false;
        }
        
        return flag;
    }
    
    public void modifyCar() {
        String brand = BrandInput.getText().replace("\n", " ");
        String model = ModelInput.getText().replace("\n", " ");
        String type = typeComboBox.getSelectedItem().toString();
        String color = ColorInput.getText().replace("\n", " ");
        String speed = SpeedInput.getText().replace("\n", " ");
        String pax = PaxInput.getText().replace("\n", " ");
        String price = PriceInput.getText().replace("\n", " ");
        String status = statusComboBox.getSelectedItem().toString();
        
        int paxInt = 0;
        
        if (brand.equals("") || model.equals("") || color.equals("") || speed.equals("") || pax.equals("") || price.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                paxInt = Integer.parseInt(pax);
                int speedInt = Integer.parseInt(speed);
                double priceDob = Double.valueOf(price);
                
                if (speedInt <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Speed!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (paxInt <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Seats!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (priceDob <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Price!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                               
                carChosen.setBrand(brand);
                carChosen.setModel(model);
                carChosen.setType(type);
                carChosen.setColor(color);
                carChosen.setSpeed(speed + "km/h");
                carChosen.setSeat(paxInt);
                carChosen.setPrice("P. " + String.format("%.2f", priceDob));
                carChosen.setStatus(status);
                
                Data.WriteToText();
                clearFields();
                showCars();
                
                JOptionPane.showMessageDialog(null, "Car successfully modified!", "Success!", JOptionPane.INFORMATION_MESSAGE);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid fields entered!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void addCar() {
        Car existingCar = null;
        
        String carPlate = carPlateInput.getText().replace("\n", " ");
        String brand = BrandInput.getText().replace("\n", " ");
        String model = ModelInput.getText().replace("\n", " ");
        String type = typeComboBox.getSelectedItem().toString();
        String color = ColorInput.getText().replace("\n", " ");
        String speed = SpeedInput.getText().replace("\n", " ");
        String pax = PaxInput.getText().replace("\n", " ");
        String price = PriceInput.getText().replace("\n", " ");
        String status = statusComboBox.getSelectedItem().toString();
        
        int paxInt = 0;
        
        if (carPlate.equals("") || brand.equals("") || model.equals("") || color.equals("") || speed.equals("") || pax.equals("") || price.equals("")) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields", "Error!", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                paxInt = Integer.parseInt(pax);
                int speedInt = Integer.parseInt(speed);
                double priceDob = Integer.parseInt(price);
                
                if (speedInt <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Speed!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (paxInt <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Seats!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (priceDob <= 0) {
                    JOptionPane.showMessageDialog(null, "Invalid Price!", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                existingCar = Data.chosenCar(carPlate);
                
                if (existingCar == null) {
                    String newSpeed = speed + "km/h";
                    String newPrice = "P. " + String.format("%.2f", priceDob);
                    
                    Car newCar = new Car.CarBuilder()
                        .carPlate(carPlate)
                        .brand(brand)
                        .model(model)
                        .type(type)
                        .color(color)
                        .speed(newSpeed)
                        .seat(paxInt)
                        .price(newPrice)
                        .status(status)
                        .build();
                    
                    Data.cars.add(newCar);
                    Data.WriteToText();
                    clearFields();
                    showCars();
                    
                    JOptionPane.showMessageDialog(null, "Car successfully added!", "Success!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Car already exist!", "Add fail!", JOptionPane.ERROR_MESSAGE);
                }
 
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Invalid fields entered!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    public void clearFields() {
        carChosen = null;
        
        carPlateInput.setText("");
        BrandInput.setText("");
        ModelInput.setText("");
        typeComboBox.setSelectedItem("SUV");
        ColorInput.setText("");
        SpeedInput.setText("");
        PaxInput.setText("");
        PriceInput.setText("");
        statusComboBox.setSelectedItem("Available");
    }
    
    public void showCars() {
        DefaultTableModel model = (DefaultTableModel)carsTable.getModel();
        
        if(model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        
        Object[] tableLines = Data.cars.toArray();

        for (Object tableLine : tableLines) {
           String line = tableLine.toString().trim();
         
           String[] dataRow = line.split("\\|");
           
           model.addRow(dataRow);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminBgMain;
    private javax.swing.JTextField BrandInput;
    private javax.swing.JTextField ColorInput;
    private javax.swing.JTextField ModelInput;
    private javax.swing.JTextField PaxInput;
    private javax.swing.JTextField PriceInput;
    private javax.swing.JTextField SpeedInput;
    private javax.swing.JButton actionButton1;
    private javax.swing.JLabel actionLabel;
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField carPlateInput;
    private javax.swing.JTable carsTable;
    private javax.swing.JLabel date;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JButton filterBtn;
    private javax.swing.JLabel generateReportNav;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel manageCarNav;
    private javax.swing.JLabel manageRentNav;
    private javax.swing.JLabel manageUserNav;
    private com.toedter.calendar.JDateChooser pickupDate;
    private javax.swing.JLabel pickupLabel;
    private com.toedter.calendar.JDateChooser returnDate;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> statusComboBox;
    private javax.swing.JButton switchActionButton;
    private javax.swing.JPanel topBar;
    private javax.swing.JComboBox<String> typeComboBox;
    // End of variables declaration//GEN-END:variables
}
