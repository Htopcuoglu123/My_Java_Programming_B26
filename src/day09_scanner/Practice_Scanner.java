package day09_scanner;

import java.util.Scanner;

public class Practice_Scanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);// We declare it only once during the entire project
        System.out.print("Please enter an integer number: ");
        int number= input.nextInt();
        System.out.println("You entered : "+number);


        System.out.print("Now Please enter a double number: ");
        double number1= input.nextDouble();
        System.out.println("You entered: "+ number1);


        System.out.print("Please enter your name: ");
        String name=input.next();
        System.out.println("Your name is: "+ name);

        input.nextLine();


        System.out.print("Your Full Name: ");
        String nameLastName=input.nextLine();
        System.out.println("fullName = " + nameLastName);


        System.out.print("Address:");
        String address=input.nextLine();
        System.out.println("Your address is: "+address);

    }
}
