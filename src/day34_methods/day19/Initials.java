package day34_methods.day19;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        /*
        Ask the user to enter their first name
        Ask the user to enter their last name
        print the initials as uppercase letters
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your first name");
        String firstName=scanner.next().toUpperCase();
        System.out.println("Please enter your last name");
        String lastName=scanner.next().toUpperCase();

        System.out.println(""+firstName.charAt(0)+lastName.charAt(0));

    }
}
