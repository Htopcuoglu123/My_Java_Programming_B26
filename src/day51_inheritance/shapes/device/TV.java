package day51_inheritance.shapes.device;

public class TV extends Device {
    /*
    Create a class called TV:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using TV

     */
    public TV(String model,double price,boolean isWireless){
        super("Samsung", model, price, isWireless);
    }
    @Override
    public String useDevice(){
      return "Using the television";
    }

    @Override
    public String toString() {
        return "TV{" +
                "\nbrand='" + brand + '\'' +
                "\nmodel='" + model + '\'' +
                "\nprice= $" + price +
                "\nisWireless=" + isWireless +
                '}';
    }
}
