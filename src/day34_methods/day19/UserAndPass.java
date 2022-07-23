package day34_methods.day19;

import java.util.Scanner;

public class UserAndPass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your username:");
        String userName= input.nextLine();
        userName=userName.toLowerCase();
        System.out.println("Please enter your password:");
        String passWord= input.nextLine();
        boolean validPass=!(passWord.contains(userName));
        if(passWord.length()>=5&&validPass){
            System.out.println("Valid password");
        }else{
            if(passWord.length()<5){
                System.out.println("Password cannot be less than 5 characters!");
            }
            if(passWord.contains(userName)){
                System.out.println("invalid password, username should not be in it");
            }


        }

    }
}
