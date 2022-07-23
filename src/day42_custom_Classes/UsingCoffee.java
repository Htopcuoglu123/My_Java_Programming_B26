package day42_custom_Classes;

public class UsingCoffee {
    public static void main(String[] args) {
        Coffee coffee1=new Coffee();
        coffee1.brand="Starbucks";
        coffee1.size=7.7;
        coffee1.price=4.99;
        coffee1.type="Cappuchino";
        System.out.println(coffee1);
        coffee1.drink();
        coffee1.drink();
        coffee1.drink();
        coffee1.refill(2);
        System.out.println(coffee1);
    }
}
