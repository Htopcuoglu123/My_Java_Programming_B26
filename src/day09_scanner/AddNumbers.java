package day09_scanner;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner addNumbers=new Scanner(System.in);
        System.out.print("Please enter your first number: ");
        int num1=addNumbers.nextInt();
        System.out.print("Please enter your second number: ");
        int num2=addNumbers.nextInt();
        System.out.print("Please enter your last number: ");
        int num3=addNumbers.nextInt();
        //int total=num1+num2+num3;
        //System.out.println("Total of your numbers is: "+total);
        System.out.println("your total is:"+(num1+num2+num3));


    }
}
