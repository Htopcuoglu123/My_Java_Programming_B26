package day51_inheritance.shapes.device;

public class Phone extends Device {
    /*
    Create a class called Phone:
- attributes: brand, model, price, wireless
- methods: toString(),
	useDevice(): Override to print Using Phone
     */
    public Phone(String model,double price,boolean isWireless) {
        super("IPhone", model, price, isWireless);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "\nbrand='" + brand + '\'' +
                "\nmodel='" + model + '\'' +
                "\nprice=$" + price +
                "\nisWireless=" + isWireless +
                '}';
    }
    @Override
    public String useDevice(){
        return "Buying a new phone";
    }

}
