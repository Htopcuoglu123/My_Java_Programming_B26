package day10_scanner;

import java.util.Scanner;

public class Revenue {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is the price?");
        double price= input.nextDouble();
        System.out.println("What is the quantity?");
        int quantity=input.nextInt();
        double revenue=price*quantity;
        System.out.println("Your revenue is: $"+revenue);
    }
}
