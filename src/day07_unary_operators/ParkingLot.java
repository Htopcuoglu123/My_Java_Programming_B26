package day07_unary_operators;

public class ParkingLot {
    public static void main(String[] args) {
        int cars=10;
        System.out.println("2 cars drove into the parking lot");

        cars=cars+2;
        System.out.println(cars);
        System.out.println("Two more cars drive in");
//Approach 2
        cars++;
        cars++;

        System.out.println(cars);
        System.out.println("Five cars left");
        cars=cars-5;
        System.out.println(cars);
    }
}
