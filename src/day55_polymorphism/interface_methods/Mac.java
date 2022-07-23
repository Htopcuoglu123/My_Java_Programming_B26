package day55_polymorphism.interface_methods;

public interface Mac {
    String NAME="Mac";//public static final variable(they are static and final so
    // they are constants that's why they are capitalized)
    String OS="IOS";

    void turnOn();//public abstract method

    //How do you create a method with implementation in an interface?(Int question)

    //one way
    public static void company(){
        System.out.println("Apple");
        System.out.println("HQ in LA");
    }

    //another way
    default void faceTime(){
        System.out.println("Opening facetime");
        System.out.println("Calling someone");
    }

}
