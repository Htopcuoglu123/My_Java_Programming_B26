package day09_scanner;

import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        Scanner compareNumbers=new Scanner(System.in);
        System.out.print("Please enter a number:");
        int num1=compareNumbers.nextInt();
        System.out.print("Please enter another number: ");
        int num2=compareNumbers.nextInt();
        boolean theyAreEqual=num1==num2;
        System.out.println("Your two numbers are equal: "+theyAreEqual);

        //Aproach 2
        //System.out.println("Your two numbers are equal: "+(num1==num2));
    }
}
