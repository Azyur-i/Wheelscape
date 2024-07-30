
package group5crms.myapps;

import group5crms.mylibs.*;
import java.awt.Color;
import java.awt.print.PrinterException;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ViewRent extends javax.swing.JFrame {
    
    

    
    public ViewRent() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        rentTable = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        receiptTxt = new javax.swing.JTextArea();
        backgroundImage = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1500, 770));
        setResizable(false);
        setSize(new java.awt.Dimension(1500, 770));
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
        jLabel5.setText("Rent History");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        date.setFont(new java.awt.Font("Perpetua", 0, 24)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setText("<<date>>");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 785, Short.MAX_VALUE)
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
        topBar.setBounds(0, 0, 1500, 60);

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Rent History");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 60, 260, 50);

        rentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "RID", "Contact", "Email", "Car", "Car Plate", "Rent Date", "Pick Up Date", "Return Date", "Days", "Total Price", "Payment Method", "Review"
            }
        ));
        rentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rentTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(rentTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 120, 1040, 550);

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
        searchField.setBounds(750, 70, 310, 40);

        receiptTxt.setColumns(20);
        receiptTxt.setRows(5);
        jScrollPane2.setViewportView(receiptTxt);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(1080, 70, 390, 600);

        backgroundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/car.png"))); // NOI18N
        backgroundImage.setMinimumSize(new java.awt.Dimension(1300, 700));
        backgroundImage.setPreferredSize(new java.awt.Dimension(1300, 700));
        getContentPane().add(backgroundImage);
        backgroundImage.setBounds(-3, -4, 1510, 760);

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

        receiptTxt.setText("");
        
        DefaultTableModel model = (DefaultTableModel)rentTable.getModel();

        int selectedRowIndex = rentTable.getSelectedRow();
        String rentID = model.getValueAt(selectedRowIndex, 0).toString();

        Rent chosenRent = Data.chosenRent(rentID);
        
        receiptTxt.append(
                "\t\t Receipt \n\n" +

                "Rent ID: \t\t" + chosenRent.getRentID() + "\n" +
                "\n--------------------------------------------------------------------------------------------\n" +
                "Name:\t\t" + chosenRent.getName() + "\n\n" + 
                "Contact:\t\t" + chosenRent.getContact() + "\n\n" + 
                "Email:\t\t" + chosenRent.getEmail() + "\n" + 
                "\n--------------------------------------------------------------------------------------------\n" +
                "Car:\t\t" + chosenRent.getCarPlate() + " - " + chosenRent.getCar() + "\n\n" + 
                "Pick Up Address:\t" + chosenRent.getPickupAdd() + "\n\n" + 
                "Return Address:\t" + chosenRent.getReturnAdd() + "\n" + 
                "\n--------------------------------------------------------------------------------------------\n" +
                "Rent Date:\t\t" + chosenRent.getRentDate() + "\n\n" + 
                "Pick Up Date:\t\t" + chosenRent.getPickupDate() + "\n\n" + 
                "Return Date:\t\t" + chosenRent.getReturnDate() + "\n\n" + 
                "Days:\t\t" + chosenRent.getDays() + "\n" + 
                "\n--------------------------------------------------------------------------------------------\n" +
                "Payment Method:\t" + chosenRent.getPaymentMethod() + "\n\n" +    
                "Payment Details:\t" + "*".repeat(chosenRent.getPaymentDetails().length()) + "\n\n" + 
                "Total:\t\t" + chosenRent.getTotal() + "\n\n" + 
                
                "\tThank you, Please come again!\n" +
                "\tGenerated on " + WheelScape.toDate()
        );
        
        String review = model.getValueAt(selectedRowIndex, 11).toString();
        String returnDate = model.getValueAt(selectedRowIndex, 7).toString();
        
        if(evt.getClickCount() == 2 && review.equals("-")){
            
            try {
                Date return_date = new SimpleDateFormat("dd-MM-yyyy").parse(returnDate);
                Date toDate = new Date();
                
                if(return_date.compareTo(toDate) < 0) {
                    
                    String feedback = JOptionPane.showInputDialog(this, "Give Review", "Review",JOptionPane.INFORMATION_MESSAGE);
            
                    if(feedback != null && !feedback.equals("")){

                        chosenRent.setReview(feedback);
                        try {
                            Data.WriteToText();

                            model.setRowCount(0);

                            readRentTable();
                        } catch (FileNotFoundException ex) {

                            Logger.getLogger(ViewRent.class.getName()).log(Level.SEVERE, null, ex);
                        }


                    }
                } else {
                    JOptionPane.showMessageDialog(null, "The car rental need to be completed to review.", "Invalid", JOptionPane.ERROR_MESSAGE);
                }
                
            } catch (ParseException ex) {
                Logger.getLogger(ViewRent.class.getName()).log(Level.SEVERE, null, ex);
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
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewRent().setVisible(true);
            }
        });
    }
    
    public void readRentTable(){
       
        
        DefaultTableModel model = (DefaultTableModel)rentTable.getModel();
        
        if(model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        
        ArrayList<Rent> userRents = Data.userRents(WheelScape.loginCustomer.getUsername(), "Paid", "Completed");
        
        Object[] tableLines = userRents.toArray();

        for (Object tableLine : tableLines) {
           String line = tableLine.toString().trim();

           String[] dataRow = line.split("\\|");

           Vector row = new Vector();
           
           int[] Rows = new int[] {0, 2, 3, 4, 5, 8, 9, 10, 11, 12, 13, 15};
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
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea receiptTxt;
    private javax.swing.JTable rentTable;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
