package day09_scanner;

import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name?");
        String name= scanner.next();
        System.out.println("Your name is: "+name);
    }
}
