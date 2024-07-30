
package group5crms.myapps;

import group5crms.mylibs.*;
import java.awt.Color;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class RentPayment extends javax.swing.JFrame {
    
    public static Rent rentChosen = null;
    public static String pickup_Date = null;
    public static String return_Date = null;

    
    public RentPayment() {
        initComponents();
        rentTable.setDefaultEditor(Object.class, null);
        date.setText(WheelScape.toDate());
        
        readRentTable();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jButton1 = new javax.swing.JButton();
        topBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        date = new javax.swing.JLabel();
        exitIcon = new javax.swing.JLabel();
        checkDate = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        rentTable = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        backgroundImage = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1300, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1300, 700));
        getContentPane().setLayout(null);

        topBar.setBackground(new java.awt.Color(0, 0, 0));
        topBar.setMinimumSize(new java.awt.Dimension(1300, 60));
        topBar.setPreferredSize(new java.awt.Dimension(1300, 60));

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

        jLabel5.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Payment");

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

        checkDate.setText("jLabel6");

        javax.swing.GroupLayout topBarLayout = new javax.swing.GroupLayout(topBar);
        topBar.setLayout(topBarLayout);
        topBarLayout.setHorizontalGroup(
            topBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topBarLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(88, 88, 88)
                .addComponent(checkDate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 618, Short.MAX_VALUE)
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
                        .addComponent(jLabel5)
                        .addComponent(checkDate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 60);

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Confirm Payment");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 250, 40);

        jLabel6.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("**Double Click to Select an approved Rent to proceed for payment.");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 130, 580, 30);

        rentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RID", "Contact", "Email", "Car", "Car Plate", "Rent Date", "Pick Up Date", "Return Date", "Days", "Total Price", "Status"
            }
        ));
        rentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rentTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 160, 1220, 460);

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
        searchField.setBounds(950, 80, 310, 40);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N
        backgroundImage.setMinimumSize(new java.awt.Dimension(1300, 700));
        backgroundImage.setPreferredSize(new java.awt.Dimension(1300, 700));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(-3, -4, 1300, 710);

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/search.png"))); // NOI18N
        searchBtn.setBorder(null);
        getContentPane().add(searchBtn);
        searchBtn.setBounds(1190, 80, 60, 40);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
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

    
    private void rentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rentTableMouseClicked
        
        
        if (evt.getClickCount() == 2){
            int row = rentTable.getSelectedRow();
            String status = rentTable.getModel().getValueAt(rentTable.convertRowIndexToModel(row), 10).toString();
            String RID = rentTable.getModel().getValueAt(rentTable.convertRowIndexToModel(row), 0).toString();
            
            if(status.equals("Approved")) {
                
                Rent chosenRent = Data.chosenRent(RID);
                
                RentPayment.rentChosen = chosenRent;
                
                this.setVisible(false);
                try {
                    PaymentPanel pay = new PaymentPanel();
                    pay.setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(RentPayment.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            } else {
                    JOptionPane.showMessageDialog(null, "The rent needs to be approved to proceed.", "Invalid", JOptionPane.ERROR_MESSAGE);
            }
  
        }
    }//GEN-LAST:event_rentTableMouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        this.setVisible(false);
        
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void exitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitIconMouseClicked
        this.setVisible(false);
        Data.logout();
    }//GEN-LAST:event_exitIconMouseClicked

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(RentPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentPayment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentPayment().setVisible(true);
            }
        });
    }
    
    public void readRentTable(){
       
        
        DefaultTableModel model = (DefaultTableModel)rentTable.getModel();
        
        if(model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        
        ArrayList<Rent> userRents = Data.userRents(WheelScape.loginCustomer.getUsername());
        
        Object[] tableLines = userRents.toArray();

        for (Object tableLine : tableLines) {
           String line = tableLine.toString().trim();
           //split result with "|"
           String[] dataRow = line.split("\\|");
           //add result in table
           Vector row = new Vector();
           
           int[] Rows = new int[] {0, 2, 3, 4, 5, 8, 9, 10, 11, 12, 16};
           for(int Index : Rows){
               row.add(dataRow[Index]);
           }
           model.addRow(row);
           
        }
        
    }
    
    
        
                
        
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JLabel checkDate;
    private javax.swing.JLabel date;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable rentTable;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
