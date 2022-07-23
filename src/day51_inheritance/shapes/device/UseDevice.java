package day51_inheritance.shapes.device;

public class UseDevice {
    /*
    Create a class UseDevice

	create an object of TV and Phone and verify if constructor, toString(), and useDevice() are working properly for each class

	List the relations of all the classes
     */
    public static void main(String[] args) {
        TV obj1=new TV("NEO QLED",1200.0,true);
        System.out.println(obj1);
        System.out.println(obj1.useDevice());
        System.out.println("_____________________________");
        Phone obj3=new Phone("IPhone12",1000.0,true);
        System.out.println(obj3);
        System.out.println(obj3.useDevice());
    }
}
