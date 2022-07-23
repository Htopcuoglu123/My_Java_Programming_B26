package day14_if_statemnts;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your username:");
        String userName= scan.next();
        System.out.println("Please enter your password:");
        int password= scan.nextInt();
        String expectedUserName="Htopcuoglu";
        int expectedPassword=2222;
        boolean validUsername=userName==expectedUserName;
        boolean validPassword=password==expectedPassword;

        if(validUsername&&validPassword){
            System.out.println("Username and password matched! Welcome to your account!");
        }else{
            System.out.println("Unsuccessful entry! Please try again!");
            if(!validUsername){
                System.out.println("Invalid username");

            }
            if(!validPassword){
                System.out.println("invalid password!");
            }
        }

    }
}
