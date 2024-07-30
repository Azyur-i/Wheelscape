
package group5crms.mylibs;

import group5crms.myapps.*;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WheelScape {
   
    public static Customer loginCustomer;
    public static Admin loginAdmin;

    public static void main(String string) throws FileNotFoundException {
        // TODO code application logic here
        Data.readFromTextFile();
        Data.updateRent();
        CustomerLogin start = new CustomerLogin();
        start.setVisible(true);
    }
    
    public static String toDate(){
        String todate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        
        return todate;
    }
    
}
