package day05_variables;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Samsung";
        String model="Galaxy 10";
        String color="soft pink";
        double price=1000.50;
        int storage=128;
        boolean hasCamera=true;
        char sim='A';
        System.out.println("brand = " + brand);
        System.out.println("model = " + model);
        System.out.println("color = " + color);
        System.out.println("price = " + price);
        System.out.println("storage = " + storage);
        System.out.println("hasCamera = " + hasCamera);
        System.out.println("sim = " + sim);

        //approach 2 creating a string variable so we can call it by printing only one variable

        String myFullMessage="I have a "+model+"from "+brand+"\nIt came in the color" +color+" and it has "+storage;
        System.out.println(myFullMessage);

    }
}
