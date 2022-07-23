package day43_custom_classes;

import day43_custom_classes.Car;

public class UsingCar {
    public static void main(String[] args){
        Car car1=new Car();
        System.out.println(car1);
        car1.model="Toyota Highlander";
        car1.year=2019;
        car1.color="White";
        car1.fuelLevel=45;

        System.out.println(car1);
        car1.drive();
        car1.drive();
        System.out.println(car1.fuelLevel);
        System.out.println();
        car1.fillTank();
        System.out.println(car1.fuelLevel);
        car1.isLow();

    }

}
