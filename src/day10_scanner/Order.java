package day10_scanner;

import java.util.Scanner;

public class Order {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the product name:");
        String product= scan.nextLine();
        System.out.println("What is the price of the "+product+"?");
        double price= scan.nextDouble();
        System.out.println("What is the quantity?: ");
        int quantity= scan.nextInt();
        double totalPrice=price*quantity;
        scan.nextLine();
        System.out.println("Your full name: ");
        String name=scan.nextLine();
        String fullOrder=name+" your order for "+quantity+" "+ product+ " has been placed."+" The total price of your order is $"+totalPrice;
        System.out.println(fullOrder);
    }
}
