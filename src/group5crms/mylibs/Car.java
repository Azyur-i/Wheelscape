
package group5crms.mylibs;

public class Car {
    private String carPlate;
    private String brand;
    private String model;
    private String type;
    private String color;
    private String speed;
    private int seat;
    private String price;
    private String status;

    Car(CarBuilder builder) {
        this.carPlate = builder.carPlate;
        this.brand = builder.brand;
        this.model = builder.model;
        this.type = builder.type;
        this.color = builder.color;
        this.speed = builder.speed;
        this.seat = builder.seat;
        this.price = builder.price;
        this.status = builder.status;
    }

    public String getCarPlate() {
        return carPlate;
    }

    public void setCarPlate(String carPlate) {
        this.carPlate = carPlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public int getSeat() {
        
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getCar(){
        return brand + " " + model;
    }
    
    @Override
    public String toString() {
        return carPlate + "|" + brand + "|" + model + "|" + type + "|" + color + "|" + speed + "|" + seat + "|" + price + "|" + status;
    }
    
    public static class CarBuilder {
    private String carPlate;
    private String brand;
    private String model;
    private String type;
    private String color;
    private String speed;
    private int seat;
    private String price;
    private String status;
    
    public CarBuilder carPlate(String carPlate) {
        this.carPlate = carPlate;
        return this;
    }
    
    public CarBuilder brand(String brand) {
        this.brand = brand;
        return this;
    }
    
    public CarBuilder model(String model) {
        this.model = model;
        return this;
    }
    
    public CarBuilder type(String type) {
        this.type = type;
        return this;
    }
    
    public CarBuilder color(String color) {
        this.color = color;
        return this;
    }
    
    public CarBuilder speed(String speed) {
        this.speed = speed;
        return this;
    }
    
    public CarBuilder seat(int seat) {
        this.seat = seat;
        return this;
    }
    
    public CarBuilder price(String price) {
        this.price = price;
        return this;
    }
    
    public CarBuilder status(String status) {
        this.status = status;
        return this;
    }
    
    public Car build() {
        return new Car(this);
        }
    }
}
