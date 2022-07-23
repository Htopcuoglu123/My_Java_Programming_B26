package day07_unary_operators;

public class Shopping {
    public static void main(String[] args) {
        int numberOfItems=0;
        double price=0.0;

        System.out.println("We pick up 1 water");
        System.out.println("How many items in the cart: "+ ++numberOfItems);//preincrement so
        // the number of items increases right away
        price=price+2.5;
        System.out.println("We pick up two eggs");
        System.out.println("How many items in the cart: "+ ++numberOfItems);
        System.out.println("How many items in the cart: "+ ++numberOfItems);
        System.out.println(numberOfItems);

    }
}
