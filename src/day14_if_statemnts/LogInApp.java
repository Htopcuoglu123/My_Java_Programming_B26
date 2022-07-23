package day14_if_statemnts;

import java.util.Scanner;

public class LogInApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int expectedPin = 1552;
        int expectedSSN = 1234;
        System.out.println("Please enter your pin number:");
        int Pin = scanner.nextInt();
        System.out.println("Please enter the last 4 digits of your SSN:");
        int SSN = scanner.nextInt();
        boolean validPin=Pin==expectedPin;
        boolean validSSN=SSN==expectedSSN;

        if (validPin&&validSSN) {
            System.out.println("Autentication successfull");

            } else {
            System.out.println("Autentication failed!");

                if (!validPin) {

                    System.out.println("incorrect pin");
            }

                if (!validSSN){
                    System.out.println("incorrect SSN");
            }

        }
    }
}
