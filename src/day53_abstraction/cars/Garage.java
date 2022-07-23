package day53_abstraction.cars;

public class Garage {
    public static void main(String[] args) {
        //Car obj1=new Car();Car is abstract
        // so we cannot make an object of that class

        Toyota obj2=new Toyota();
        obj2.start();

        System.out.println();

        Honda obj3=new Honda();
        obj3.start();

        //Both Toyota and Honda were concrete classes,
        // because they were not abstract
        //so we had to implement the start method

    //    ElectricCar obj4=new ElectricCar();ElectricCar is abstract,
        //    so we cannot create an object of that class

        Tesla obj5=new Tesla();
        obj5.start();//Defined in the Car class
        obj5.charge();//Defined in the ElectricCar class

        //Tesla was a non-abstarct class so it was concrete,which means it had to
        // override all abstract methods from the super class

    }
}
