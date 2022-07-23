package day55_polymorphism.interface_methods;

public class MacbookPro implements Mac{
    @Override
    public void turnOn() {
        System.out.println("Mac is turning on");
    }
}

class Runner{
    public static void main(String[] args) {
        System.out.println(Mac.NAME);//calling by interface
        System.out.println(Mac.OS);
     //   System.out.println(MacbookPro.NAME);=>calling by the classname that was
     //   System.out.println(MacbookPro.OS);
        //You can access the static variables from child class reference
        // but, you should use the interface to access
        Mac.company();
        //Mac.faceTime();the default method needs to be called from the object

        //Mac.turnOn(); not valid, we need an object to call theis method

        MacbookPro obj=new MacbookPro();
        obj.turnOn();
        obj.faceTime();
        //obj.company(); static methods from an interface are not
        // inherited,so they cannot be accessed from
        //objects, only by the interface
    }
}
