package day07_unary_operators;

/*
create a class Pizza
add a main method
declare and assign these variables:

   type of pizza,  the number of slices,  the number of people eating

calculate how many slices each person will get
calculate how many slices are left over

Sample print statement:

   We ordered cheese pizza with 8 slices, 4 people ate 2 slices each with 0 left over
 */

public class Pizza {
    public static void main(String[] args) {
        String typeOfPizza="Cheese";
        int numOfSlices=12;
        int numOfPeople=4;
        int eachEats=numOfSlices/numOfPeople;
        int leftOver=numOfSlices%numOfPeople;
        String report="We ordered a "+typeOfPizza+" pizza with "+numOfSlices+" slices, "+numOfPeople+" people ate "+eachEats+" slices each with "+leftOver+" leftover.";
        System.out.println(report);


        System.out.println("\nWe ordered a "+typeOfPizza+" pizza with "+numOfSlices+" slices, "+numOfPeople+" people ate "+eachEats+" slices each with "+leftOver+" leftover.");


    }
}
