package day05_variables;

public class RecapVariables {
    public static void main(String[] args) {
        //Declare variables

        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalStudentsInClass;

        //We cannot print the variables because they do not have values yet
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalStudentsInClass);

        //Assigning to variables

        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalStudentsInClass = 432;
        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalStudentsInClass);
        System.out.println(totalPriceOfCoffee+"\t"+totalStudentsInClass);//We use concatenation to print the values of two variables at the same time.

        //Declare and assign

        double temp = 20;
        int javaDays = 5;
        System.out.println("\nThis is my temperature: " + temp);
        System.out.println("It is day " + javaDays + " in Java class.");


    }
}
