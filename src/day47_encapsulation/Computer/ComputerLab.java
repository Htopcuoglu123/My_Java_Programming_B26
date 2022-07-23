package day47_encapsulation.Computer;

import day47_encapsulation.Computer.Computer;

public class ComputerLab {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Computer comp=new Computer("HP",500,"Silver");
        System.out.println(Computer.hasBattery);
       // System.out.println(Computer.brand);this is invalid because brand
        // is an instance variable, and we are trying to access it by the class name.
        // I need an object to be able to use it
        //I can use it like this
        System.out.println(comp.brand);
        System.out.println(comp.hasMemory);//You can access static members from
        // an object reference because the object comes from
        //the class.but in general you want to access static members by the class name
    }
}
