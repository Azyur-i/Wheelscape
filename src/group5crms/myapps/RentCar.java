
package group5crms.myapps;

import group5crms.mylibs.*;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class RentCar extends javax.swing.JFrame {
    
    public static Car carChosen = null;
    public static String pickup_Date = null;
    public static String return_Date = null;
    boolean checkDate = false;
    
    public RentCar() {
        initComponents();
        
        carTable.setDefaultEditor(Object.class, null);
        date.setText(WheelScape.toDate());
        
        readCarTable();
        
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
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        carTable = new javax.swing.JTable();
        searchField = new javax.swing.JTextField();
        pickupLabel = new javax.swing.JLabel();
        returnLabel = new javax.swing.JLabel();
        pickupDate = new com.toedter.calendar.JDateChooser();
        returnDate = new com.toedter.calendar.JDateChooser();
        filterBtn = new javax.swing.JButton();
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
        jLabel5.setText("Rent Car");

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
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 744, Short.MAX_VALUE)
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
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(topBar);
        topBar.setBounds(0, 0, 1300, 60);

        jLabel2.setFont(new java.awt.Font("Perpetua", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Available Cars");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 80, 200, 50);

        jLabel4.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("**Double Click to Select a Car After entering Pickup and Return Date.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 140, 580, 30);

        carTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Car Plate", "Brand", "Model", "Type", "Color", "Speed", "Seat", "Price", "Status"
            }
        ));
        carTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(carTable);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 180, 1220, 440);

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
        searchField.setBounds(950, 90, 310, 40);

        pickupLabel.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        pickupLabel.setForeground(new java.awt.Color(255, 255, 255));
        pickupLabel.setText("Pick Up Date");
        getContentPane().add(pickupLabel);
        pickupLabel.setBounds(240, 60, 100, 30);

        returnLabel.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        returnLabel.setForeground(new java.awt.Color(255, 255, 255));
        returnLabel.setText("Return Date");
        getContentPane().add(returnLabel);
        returnLabel.setBounds(470, 60, 110, 30);

        pickupDate.setToolTipText("Pick Up Date");
        getContentPane().add(pickupDate);
        pickupDate.setBounds(240, 90, 210, 40);
        getContentPane().add(returnDate);
        returnDate.setBounds(470, 90, 210, 40);

        filterBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/funnel.png"))); // NOI18N
        filterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterBtnActionPerformed(evt);
            }
        });
        getContentPane().add(filterBtn);
        filterBtn.setBounds(690, 90, 50, 40);

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
        DefaultTableModel model = (DefaultTableModel)carTable.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        carTable.setRowSorter(tr);
        
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

    
    private void carTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carTableMouseClicked
        
        if (evt.getClickCount() == 2){
            
            if (pickupDate.getDate()!= null && returnDate.getDate() != null) {
            
                if(WheelScape.loginCustomer != null) {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    String pickup_date = sdf.format(pickupDate.getDate());
                    String return_date = sdf.format(returnDate.getDate());

                    int row = carTable.getSelectedRow();
                    String carPlate = carTable.getModel().getValueAt(carTable.convertRowIndexToModel(row), 0).toString();

                    Car chosenCar = Data.chosenCar(carPlate);

                    carChosen = chosenCar;
                    pickup_Date = pickup_date;
                    return_Date = return_date;

                    this.setVisible(false);
                    CarDetails cd = new CarDetails();
                    cd.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(null, "Please register to access the feature.");
                }
                
            }
        }
    }//GEN-LAST:event_carTableMouseClicked

    private void filterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterBtnActionPerformed
        
        if(pickupDate.getDate()!= null && returnDate.getDate() != null){
            Date todate = new Date();
            
            if(pickupDate.getDate().compareTo(todate) >= 0 && returnDate.getDate().compareTo(todate) >= 0){
                
                if(pickupDate.getDate().compareTo(returnDate.getDate()) < 0){
                    
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
                    String pickup_date = sdf.format(pickupDate.getDate());
                    String return_date = sdf.format(returnDate.getDate());

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
                    LocalDate pickupdate = LocalDate.parse(pickup_date, formatter);
                    LocalDate returndate = LocalDate.parse(return_date, formatter);

                    ArrayList<Car> filterCars = Data.filterCar(pickupdate, returndate);

                    DefaultTableModel model = (DefaultTableModel)carTable.getModel();

                    while (model.getRowCount() > 0) {
                            model.removeRow(0);
                    }

                    Object[] tableLines = filterCars.toArray();

                    for (Object tableLine : tableLines) {
                       String line = tableLine.toString().trim();
                       
                       String[] dataRow = line.split("\\|");
                       if(dataRow[8].equals("Available")) {
                           model.addRow(dataRow);
                       }
                       
                    }
                    checkDate = true;
                    JOptionPane.showMessageDialog(null, "Result Filtered.");
                    
                } else {
                    
                    JOptionPane.showMessageDialog(null, "Pick Up Date Cannot be After Return Date. Please Try Other Date.", "Invalid Date", JOptionPane.ERROR_MESSAGE);
                    checkDate = false;
                    readCarTable();
                }
                
            } else{
                
                JOptionPane.showMessageDialog(null, "Date is not valid. Please Try Another Date.", "Invalid Date", JOptionPane.ERROR_MESSAGE);
                checkDate = false;
                readCarTable();
            }
            
        } else {
            
            JOptionPane.showMessageDialog(null, "Please Input Date.", "Error!", JOptionPane.ERROR_MESSAGE);
            
            readCarTable();
        }
    }//GEN-LAST:event_filterBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentCar().setVisible(true);
            }
        });
    }
    
    public void readCarTable(){
       
        
        DefaultTableModel model = (DefaultTableModel)carTable.getModel();
        
        if(model.getRowCount() > 0) {
            model.setRowCount(0);
        }
        
        ArrayList<Car> cars = Data.availableCars();
        Object[] tableLines = cars.toArray();

        for (Object tableLine : tableLines) {
           String line = tableLine.toString().trim();
           //split result with "|"
           String[] dataRow = line.split("\\|");
           //add result in table
           model.addRow(dataRow);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backgroundImage;
    private javax.swing.JTable carTable;
    private javax.swing.JLabel date;
    private javax.swing.JLabel exitIcon;
    private javax.swing.JButton filterBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser pickupDate;
    private javax.swing.JLabel pickupLabel;
    private com.toedter.calendar.JDateChooser returnDate;
    private javax.swing.JLabel returnLabel;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchField;
    private javax.swing.JPanel topBar;
    // End of variables declaration//GEN-END:variables
}
