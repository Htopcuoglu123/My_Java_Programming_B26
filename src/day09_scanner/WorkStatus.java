package day09_scanner;

import java.util.Scanner;

public class WorkStatus {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String name=input.next();
        System.out.println("Please enter your lastname: ");
        String lastname=input.next();
        System.out.println("Are you employed? ");
        boolean areYouEmployed=input.nextBoolean();
        System.out.println("Are you a student?");
        boolean areYouAStudent=input.nextBoolean();
        System.out.println("Your name is "+name+" and"+" your last name is "+lastname+" You are employed is: "+areYouEmployed+" and"+" You are a student is:"+areYouAStudent);
    }
}
