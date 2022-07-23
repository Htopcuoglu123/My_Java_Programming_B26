package day52_inheritance.season.hiding;

public class Soccer extends Sports{
    public static void cheer(){
        System.out.println("Cheering form the child class");
    }

    //It looks like we are overriding, but we are not because the method is static. We are hiding the
    //cheer method from the parent class
}
