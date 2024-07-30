package group5crms.mylibs;

import java.io.*;
import group5crms.myapps.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Data {
   
    public static ArrayList<User> customers = new ArrayList<>();
    public static ArrayList<User> admins = new ArrayList<>();
    public static ArrayList<Car> cars = new ArrayList<>();
    public static ArrayList<Rent> rents = new ArrayList<>();
    
    public static void readFromTextFile(){
        
        try{
            
            FileReader f1 = new FileReader("C:\\School\\Mapua\\First Year\\Term 4\\CSS123\\Group5CRMS\\Group5CRMSFinal\\Group5CRMS\\customer.txt"); 
            BufferedReader b1 = new BufferedReader(f1);
            String l1 = b1.readLine().trim(); 
           
            while((l1 = b1.readLine()) != null){
                String [] dataRow = l1.split("\\|");
                String username = dataRow[0];
                String password = dataRow[1];
                String gender = dataRow[2];
                int age = Integer.parseInt(dataRow[3]);
                String phoneNum = dataRow[4];
                String email = dataRow[5];
                String address = dataRow[6];
                
                User customer = new Customer.CustomerBuilder()
                                .username(username)
                                .password(password)
                                .gender(gender)
                                .age(age)
                                .phoneNum(phoneNum)
                                .email(email)
                                .address(address)
                                .build();
                
                    customers.add(customer);
            }
            b1.close();
            
            FileReader f2 = new FileReader("C:\\School\\Mapua\\First Year\\Term 4\\CSS123\\Group5CRMS\\Group5CRMSFinal\\Group5CRMS\\admin.txt"); 
            BufferedReader b2 = new BufferedReader(f2);
            String l2 = b2.readLine().trim();
            while((l2 = b2.readLine()) != null){
                String [] dataRow = l2.split("\\|");
                String username = dataRow[0];
                String password = dataRow[1];
                
                User admin = new Admin(username, password);
                admins.add(admin);
            }
            b2.close();
           
            FileReader f3 = new FileReader("C:\\School\\Mapua\\First Year\\Term 4\\CSS123\\Group5CRMS\\Group5CRMSFinal\\Group5CRMS\\cars.txt"); 
            BufferedReader b3 = new BufferedReader(f3);
            String l3 = b3.readLine().trim(); 
            while((l3 = b3.readLine()) != null){ 
                String [] dataRow = l3.split("\\|"); 
                String carPlate = dataRow[0];
                String brand = dataRow[1];
                String model = dataRow[2];
                String type = dataRow[3];
                String color = dataRow[4];
                String speed = dataRow[5];
                int seat = Integer.parseInt(dataRow[6]);
                String price = dataRow[7];
                String status = dataRow[8];
                
                
                Car c = new Car.CarBuilder()
                        .carPlate(carPlate)
                        .brand(brand)
                        .model(model)
                        .type(type)
                        .color(color)
                        .speed(speed)
                        .seat(seat)
                        .price(price)
                        .status(status)
                        .build();
                
                cars.add(c);
              
            }
            
            b3.close();

            FileReader f4 = new FileReader("C:\\School\\Mapua\\First Year\\Term 4\\CSS123\\Group5CRMS\\Group5CRMSFinal\\Group5CRMS\\rent.txt"); 
            BufferedReader b4 = new BufferedReader(f3);
            String l4 = b4.readLine().trim(); 
            while((l4 = b4.readLine()) != null){
                String line = b4.readLine().trim();
                String [] dataRow = line.split("\\|");
                String rid = dataRow[0];
                String name = dataRow[1];
                String contact = dataRow[2];
                String email = dataRow[3];
                String car = dataRow[4];
                String carPlate = dataRow[5];
                String pickupAdd = dataRow[6];
                String returnAdd = dataRow[7];
                String rentDate = dataRow[8];
                String pickupDate = dataRow[9];
                String returnDate = dataRow[10];
                int days = Integer.parseInt(dataRow[11]);
                String total = dataRow[12];
                String paymentMethod = dataRow[13];
                String paymentDetails = dataRow[14];
                String review = dataRow[15];
                String status = dataRow[16];
                
                Rent d = new Rent.RentBuilder()
                        .RentID(rid)
                        .name(name)
                        .contact(contact)
                        .email(email)
                        .car(car)
                        .carPlate(carPlate)
                        .pickupAdd(pickupAdd)
                        .returnAdd(returnAdd)
                        .rentDate(rentDate)
                        .pickupDate(pickupDate)
                        .returnDate(returnDate)
                        .days(days)
                        .total(total)
                        .paymentMethod(paymentMethod)
                        .paymentDetails(paymentDetails)
                        .review(review)
                        .status(status)
                        .build();
                        
                        rents.add(d);
                
            }
       b4.close();

        }catch(Exception e){
            System.out.println("Error in read .....");
        }
    }
    
    
    public static void WriteToText() throws FileNotFoundException{
        
        PrintWriter a = new PrintWriter("customer.txt");
        
        for(User cust : customers){
            String Customers = cust.getUsername() + "|" + cust.getPassword() + "|" + cust.getGender() + "|" + cust.getAge() + "|" + cust.getPhoneNum() + "|" + cust.getEmail() + "|" + cust.getAddress();
            
            a.println(Customers);
        }
        
        a.close();

        PrintWriter b = new PrintWriter("admin.txt");
        for(User admin : admins){
            String Admins = admin.getUsername() + "|" + admin.getPassword();
            b.println(Admins);
        }
        b.close();
        
        PrintWriter c = new PrintWriter("cars.txt");
        for(Car car : cars){
            String Cars = car.getCarPlate() + "|" + car.getBrand() + "|" + car.getModel() + "|" + car.getType() + "|" + car.getColor() + "|" + car.getSpeed() + "|" + car.getSeat() + "|" + car.getPrice() + "|" + car.getStatus();
            c.println(Cars);
        }
        c.close();
        
        PrintWriter d = new PrintWriter("rent.txt");
        for(Rent rent : rents){
            String Rent = rent.getRentID() + "|" + rent.getName() + "|" + rent.getContact() + "|" + rent.getEmail() + "|" + rent.getCar()
                    + "|" + rent.getCarPlate() + "|" + rent.getPickupAdd() + "|" + rent.getReturnAdd() + "|" + rent.getRentDate()
                    + "|" + rent.getPickupDate() + "|" + rent.getReturnDate() + "|" + rent.getDays() + "|" + rent.getTotal() + "|" + rent.getPaymentMethod()
                     + "|" + rent.getPaymentDetails() + "|" + rent.getReview() + "|" + rent.getStatus();
            d.println(Rent);
        }
        d.close();
    }
    
    
    public static Customer checkUsername(String username) {
        User found = null;
       
        for(User c : customers){
           
            if(username.equals(c.getUsername())){
                found = c;
                break;
            }
        }
        return (Customer) found;
        
    }
    
    public static Admin checkAdminUsername(String username) {
        User found = null;
        for(User a : admins){
            if(username.equals(a.getUsername())){
                found = a;
                break;
            }
        }
        return (Admin) found;
        
    }
    
    public static Car chosenCar(String carPlate) {
        Car carChosen = null;
        for(Car car : cars){
            if(carPlate.equals(car.getCarPlate())){
                carChosen = car;
                break;
            }
        }
        return carChosen;
    }
    
    
    public static String checkLatestRent() {
        
        String rentID = "";
        if(!rents.isEmpty()){
            Iterator i = rents.iterator();
            for(Rent rent : rents){
                if(i.hasNext()){
                    rentID = rent.getRentID();
                    
                }
            }
        } else {
            rentID = "R0";
        }
        
        return rentID;
    }
    
    public static ArrayList<Car> filterCar(LocalDate pickupDate, LocalDate returnDate) {
        
        ArrayList<String> conflictCar = new ArrayList<String>();

        for(Rent rent : rents){
            
            String RentPickUpDate = rent.getPickupDate();
            String RentReturnDate = rent.getReturnDate(); 
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
            
            LocalDate checkinDate = LocalDate.parse(RentPickUpDate, formatter);
            LocalDate checkoutDate = LocalDate.parse(RentReturnDate, formatter);
            
           
            if(!rent.getStatus().equals("Cancelled")){
                
                if(pickupDate.compareTo(checkoutDate) <= 0 && returnDate.compareTo(checkinDate) >= 0){

                    conflictCar.add(rent.getCarPlate());

                }
            }
            
        }
        
        ArrayList<Car> filteredCars = new ArrayList<Car>();
        
        
        for(Car car : cars){
            filteredCars.add(car);
        }
        
        
        for(String conflict : conflictCar) {
            
            for(int i = 0; i < filteredCars.size(); i++){

                if(filteredCars.get(i).getCarPlate().equals(conflict)){
                    filteredCars.remove(i);
                    i--;
                }

            }
        }
        return filteredCars;
    }
    
    public static ArrayList<Car> filterRentedCar(LocalDate pickupDate, LocalDate returnDate) {
        
        ArrayList<String> conflictCar = new ArrayList<String>();

        for(Rent rent : rents){
            
            String RentPickUpDate = rent.getPickupDate();
            String RentReturnDate = rent.getReturnDate(); 
            
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy", Locale.ENGLISH);
            
            LocalDate checkinDate = LocalDate.parse(RentPickUpDate, formatter);
            LocalDate checkoutDate = LocalDate.parse(RentReturnDate, formatter);
            
           
            if(!rent.getStatus().equals("Cancelled")){
                
                if(pickupDate.compareTo(checkoutDate) >= 0 && returnDate.compareTo(checkinDate) <= 0){

                    conflictCar.add(rent.getCarPlate());

                }
            }
            
        }
        
        ArrayList<Car> filteredCars = new ArrayList<Car>();
        
        
        for(Car car : cars){
            filteredCars.add(car);
        }
        
        
        for(String conflict : conflictCar) {
            
            for(int i = 0; i < filteredCars.size(); i++){

                if(filteredCars.get(i).getCarPlate().equals(conflict)){
                    filteredCars.remove(i);
                    i--;
                }

            }
        }
        return filteredCars;
    }
    
    public static ArrayList<Car> availableCars() {
        
        ArrayList<Car> availableCars = new ArrayList<Car>();
        for(Car car : cars){

            if(car.getStatus().equals("Available") || car.getStatus().equals("Rented")){
                availableCars.add(car);  
            }
        }
        
        return availableCars;
        
    }
    
   
    public static ArrayList<Rent> userRents(String username) {
        
        ArrayList<Rent> userRents = new ArrayList<Rent>();
        for(Rent rent : rents){
            
            if(username.equals(rent.getName()) && 
                    (rent.getStatus().equals("Rejected") || rent.getStatus().equals("Approved") || rent.getStatus().equals("Pending") || rent.getStatus().equals("Cancelled"))){
                userRents.add(rent);  
            }
        }
        
        return userRents;
        
    }
    
    public static ArrayList<Rent> userRents(String username, String status, String status2) {
        
        ArrayList<Rent> userRents = new ArrayList<Rent>();
        for(Rent rent : rents){
            
            if(username.equals(rent.getName()) && (rent.getStatus().equals(status) || rent.getStatus().equals(status2))){
                userRents.add(rent);  
            }
        }
        
        return userRents;
        
    }
    
        public static Rent chosenRent(String RID) {
        Rent chosenRent = null;
        for(Rent rent : rents){
            if(RID.equals(rent.getRentID())){
                chosenRent = rent;
                break;
            }
        }
        return chosenRent;
    }
    
 
    public static ArrayList<Rent> getReview(String carPlate) {

        ArrayList<Rent> reviewCars = new ArrayList<Rent>();
        
        for(Rent rent: rents) {
            if(carPlate.equals(rent.getCarPlate())) {
                reviewCars.add(rent);
            }
        }
        
        return reviewCars;
    }
    

    public static void updateRent() throws FileNotFoundException {
        Date todate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
          
            for(int i = 0; i < rents.size(); i++){
                  
                    if(rents.get(i).getStatus().equals("Approved")){
                        
                        String sdate = rents.get(i).getPickupDate();
                        Date pdate = sdf.parse(sdate);
                       
                        if(pdate.compareTo(todate) < 0) {
                            rents.get(i).setStatus("Cancelled");
                        }
                      
                    } else if (rents.get(i).getStatus().equals("Pending")) {
                        
                        Calendar c = Calendar.getInstance();
                        String sdate = rents.get(i).getRentDate();
                        Date bdate = sdf.parse(sdate);
                        c.setTime(bdate);
                        c.add(Calendar.DAY_OF_MONTH, 1);
                        
                       
                        if(c.getTime().compareTo(todate) <= 0) {
                                rents.remove(i);
                                i--;
                        }
                       
                    } else if (rents.get(i).getStatus().equals("Paid")) {
                        Date rdate = sdf.parse(rents.get(i).getReturnDate());
                       
                        if( rdate.compareTo(todate) < 0 ) {
                            
                            rents.get(i).setStatus("Completed");
                        }
                    } else {
                        
                    }
            }
        }catch (ParseException ex) {
                        Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }          
        WriteToText();}
   
    public static void logout() {
        
        String role = null;
        String username = null;

        if(WheelScape.loginAdmin != null) {
            role = "admin";
            username = WheelScape.loginAdmin.getUsername();
        } else if(WheelScape.loginCustomer != null) {
            role = "customer";
            username = WheelScape.loginCustomer.getUsername();
        } else {
            role = "guest";
            username = "guest";
        }

        WheelScape.loginCustomer = null;
        WheelScape.loginAdmin = null;

        CustomerLogin login = new CustomerLogin();
        login.setVisible(true);
 
    }

   
}
        


        
    

