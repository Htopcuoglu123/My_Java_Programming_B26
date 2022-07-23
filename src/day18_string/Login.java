package day18_string;

import java.util.Scanner;

public class Login {
    /*
    Ask the user to enter a username. Make sure the username is lowercase
    Ask the user to enter a password.check if the password is more than 8 characters long
    valid password="jamesbond"
    if the entered password matches the system password
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your username:");
        String userName= scanner.next();
        userName=userName.toLowerCase();
        System.out.println("Please enter your password:");
        String password= scanner.next();
        if(password.length()>=8&&password.equals("jamesbond")){
            System.out.println("Logged in with "+userName);
        }else{
            System.out.println("invalid password");
        }
    }
}
