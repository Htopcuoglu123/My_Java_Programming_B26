package day09_scanner;

import java.util.Scanner;

public class FirstScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number= input.nextInt();
        System.out.println("You entered: "+ number);
    }
}
