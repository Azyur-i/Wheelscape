
package group5crms.mylibs;


public class Rent {
    
    private String RentID;
    private String name;
    private String contact;
    private String email;
    private String car;
    private String carPlate;
    private String pickupAdd;
    private String returnAdd;
    private String rentDate;
    private String pickupDate;
    private String returnDate;
    private int days;
    private String total;
    private String paymentMethod;
    private String paymentDetails;
    private String review;
    private String status;

    Rent(RentBuilder builder) {
        this.RentID = builder.RentID;
        this.name = builder.name;
        this.contact = builder.contact;
        this.email = builder.email;
        this.car = builder.car;
        this.carPlate = builder.carPlate;
        this.pickupAdd = builder.pickupAdd;
        this.returnAdd = builder.returnAdd;
        this.rentDate = builder.rentDate;
        this.pickupDate = builder.pickupDate;
        this.returnDate = builder.returnDate;
        this.days = builder.days;
        this.total = builder.total;
        this.paymentMethod = builder.paymentMethod;
        this.paymentDetails = builder.paymentDetails;
        this.review = builder.review;
        this.status = builder.status;
    }
    
    public String getRentID() {
        return RentID;
    }

    public void setRentID(String RentID) {
        this.RentID = RentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getPickupAdd() {
        return pickupAdd;
    }

    public void setPickupAdd(String pickupAdd) {
        this.pickupAdd = pickupAdd;
    }

    public String getReturnAdd() {
        return returnAdd;
    }

    public void setReturnAdd(String returnAdd) {
        this.returnAdd = returnAdd;
    }

    public String getRentDate() {
        return rentDate;
    }

    public void setRentDate(String rentDate) {
        this.rentDate = rentDate;
    }

    public String getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    @Override
    public String toString() {
        return RentID + "|" + name + "|" + contact + "|" + email + "|" + car + "|" + carPlate + "|" + pickupAdd + "|" + returnAdd + "|" + rentDate  + "|" + pickupDate  + "|" + returnDate + "|" + days  + "|" + total  + "|" + paymentMethod + "|" + paymentDetails + "|" + review + "|" + status;
    }
    
    public static class RentBuilder {
        
    private String RentID;
    private String name;
    private String contact;
    private String email;
    private String car;
    private String carPlate;
    private String pickupAdd;
    private String returnAdd;
    private String rentDate;
    private String pickupDate;
    private String returnDate;
    private int days;
    private String total;
    private String paymentMethod;
    private String paymentDetails;
    private String review;
    private String status;
    
    public RentBuilder RentID(String RentID) {
        this.RentID = RentID;
        return this;
    }
    
    public RentBuilder name(String name) {
        this.name = name;
        return this;
    }
    
    public RentBuilder contact(String contact) {
        this.contact = contact;
        return this;
    }
    
    public RentBuilder email(String email) {
        this.email = email;
        return this;
    }
    
    public RentBuilder car(String car) {
        this.car = car;
        return this;
    }
    
    public RentBuilder carPlate(String carPlate) {
        this.carPlate = carPlate;
        return this;
    }
    
    public RentBuilder pickupAdd(String pickupAdd) {
        this.pickupAdd = pickupAdd;
        return this;
    }
    
    public RentBuilder returnAdd(String returnAdd) {
        this.returnAdd = returnAdd;
        return this;
    }
    
    public RentBuilder rentDate(String rentDate) {
        this.rentDate = rentDate;
        return this;
    }
    
    public RentBuilder pickupDate(String pickupDate) {
        this.pickupDate = pickupDate;
        return this;
    }
    
    public RentBuilder returnDate(String returnDate) {
        this.returnDate = returnDate;
        return this;
    }
    
    public RentBuilder days(int days) {
        this.days = days;
        return this;
    }
    
    public RentBuilder total(String total) {
        this.total = total;
        return this;
    }
    
    public RentBuilder paymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }
    
    public RentBuilder paymentDetails(String paymentDetails) {
        this.paymentDetails = paymentDetails;
        return this;
    }
    
    public RentBuilder review(String review) {
        this.review = review;
        return this;
    }
    
    public RentBuilder status(String status) {
        this.status = status;
        return this;
    }
    
    public Rent build() {
        return new Rent(this);
        }
    }
    
}
