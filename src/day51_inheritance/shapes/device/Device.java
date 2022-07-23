package day51_inheritance.shapes.device;

public class Device {
    /*
    Create a class called device:
- attributes: brand, model, price, wireless
- methods: toString(), useDevice()
     */
    String brand;
    String model;
    double price;
    boolean isWireless;

    public Device(String brand,String model,double price,boolean isWireless){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.isWireless=isWireless;
    }

    @Override
    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", isWireless=" + isWireless +
                '}';
    }

    public String useDevice(){
       return " ";
    }
}
