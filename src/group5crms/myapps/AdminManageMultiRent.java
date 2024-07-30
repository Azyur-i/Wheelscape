package group5crms.myapps;

import group5crms.mylibs.*;
import java.io.IOException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class AdminManageMultiRent extends javax.swing.JFrame {

    public static Rent chosenRent = null;
    

    public AdminManageMultiRent() {
        initComponents();
        readRentTable();
        
        date.setText(WheelScape.toDate());
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        rentTable = new javax.swing.JTable();
        modifyRentBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        rentIdLabel = new javax.swing.JLabel();
        someLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
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
        getContentPane().setLayout(null);

        rentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rent ID", "Contact", "Email", "Car", "Car Plate", "Rent Date", "Pick Up Date", "Return Date", "Days", "Total Price", "Payment Method", "Review", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        rentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rentTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 110, 1249, 430);

        modifyRentBtn.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        modifyRentBtn.setText("Modify Rent");
        modifyRentBtn.setEnabled(false);
        modifyRentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyRentBtnActionPerformed(evt);
            }
        });
        getContentPane().add(modifyRentBtn);
        modifyRentBtn.setBounds(570, 590, 140, 35);

        jLabel1.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rent Selected :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(510, 550, 132, 28);

        rentIdLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        rentIdLabel.setForeground(new java.awt.Color(255, 255, 255));
        rentIdLabel.setText("<<rentid>>");
        getContentPane().add(rentIdLabel);
        rentIdLabel.setBounds(690, 550, 140, 28);

        someLabel.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        someLabel.setForeground(new java.awt.Color(255, 255, 255));
        someLabel.setText("Search:");
        getContentPane().add(someLabel);
        someLabel.setBounds(40, 70, 70, 30);

        searchField.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });
        getContentPane().add(searchField);
        searchField.setBounds(130, 70, 220, 30);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/wheelscape_mediumlogo.png")));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

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
        Background.setText("jLabel1");
        getContentPane().add(Background);
        Background.setBounds(0, 0, 1300, 16);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)rentTable.getModel();
        
        int row = rentTable.getSelectedRow();
        String rentId = model.getValueAt(rentTable.convertRowIndexToModel(row), 0).toString();
        rentIdLabel.setText(rentId);
        
        modifyRentBtn.setEnabled(true);
        
        Rent rent = Data.chosenRent(rentId);
        chosenRent = rent;
    }//GEN-LAST:event_rentTableMouseClicked

    private void modifyRentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyRentBtnActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        AdminManageSingleRent amib = new AdminManageSingleRent();
        amib.setVisible(true);
    }//GEN-LAST:event_modifyRentBtnActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel)rentTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        rentTable.setRowSorter(tr);

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
            Logger.getLogger(AdminManageMultiRent.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
        AdminPanel ap = new AdminPanel();
        ap.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(AdminManageMultiRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminManageMultiRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminManageMultiRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminManageMultiRent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminManageMultiRent().setVisible(true);
            }
        });
    }
    
    public void readRentTable() {
        DefaultTableModel model = (DefaultTableModel)rentTable.getModel();
        
        if(model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        
        Object[] tableLines = Data.rents.toArray();

        for (Object tableLine : tableLines) {
           String line = tableLine.toString().trim();
           
           String[] dataRow = line.split("\\|");
         
           Vector row = new Vector();
           
           int[] Rows = new int[] {0, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 15, 16};
           for(int Index : Rows){
               row.add(dataRow[Index]);
           }
           model.addRow(row);
           
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel date;
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
    private javax.swing.JButton modifyRentBtn;
    private javax.swing.JLabel rentIdLabel;
    private javax.swing.JTable rentTable;
    private javax.swing.JTextField searchField;
    private javax.swing.JLabel someLabel;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
