package day42_custom_Classes;

public class Coffee {
    /*
    Create a coffee class with these instance variables;
    price,size(oz),brand,types

    instance methods:
    make a toString to print all the information of the coffee objects

    drink:print "trying type of coffee"
    refill(amount in oz):refilling x oz
    add the number of oz to the total size
     */

    double price;
    double size;
    String brand;
    String type;

    @Override
    public String toString() {
        return
                type+" from "+brand+" size of "+size+" oz for a total price of "+price;
    }

    public void drink(){
        System.out.println("Trying "+type);
        size-=1.5;
    }
    public void refill(double amount){
        System.out.println("Refilling "+amount+" oz of coffee");
        size+=amount;
    }
/*
public void refill(double size){
        System.out.println("Refilling "+size+" oz of coffee");
        size+=size;
    }
 */
}
