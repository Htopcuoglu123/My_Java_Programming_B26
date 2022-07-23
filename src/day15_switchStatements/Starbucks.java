package day15_switchStatements;

import java.util.Scanner;

public class Starbucks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Starbucks! What size drink would you like to buy?");
        String size = scanner.next();
        String sizes = "";
        double price = 0;
        int calories = 0;
        boolean validOrder = true;
        switch (size) {
            case "tall":
                sizes = "tall";
                price = 2.50;
                calories = 100;
                break;
            case "grande":
                sizes = "Grande";
                price = 4.50;
                calories = 200;
                break;
            case "venti":
                sizes = "Venti";
                price = 4.00;
                calories = 150;
                break;
            default:
                System.out.println("We dont have that size");
                validOrder = false;


        }
        if (validOrder) {
            System.out.println("Your order for " + size + " coffee is $"+price+" and has "+calories+" calories.");

        }
    }
}
