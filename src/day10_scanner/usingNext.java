package day10_scanner;

import java.util.Scanner;

public class usingNext {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("What is today:");
        String day=scan.nextLine();
        System.out.print("Enter your first name:");
        String firstName=scan.next();
        System.out.print("Enter your last name:");
        String lastName=scan.next();
        scan.nextLine();//the "enter" input from the previous line is absorbed here
        System.out.println("Enter your address: ");
        String address=scan.nextLine();
        System.out.println("Today is: "+day);
        System.out.println("Firstname: "+firstName);
        System.out.println("Lastname: "+lastName);
        System.out.println("Your address is: "+ address);
    }
}
