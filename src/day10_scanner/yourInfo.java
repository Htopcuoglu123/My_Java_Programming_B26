package day10_scanner;

import java.util.Scanner;

public class yourInfo {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Your favorite book: ");
        String favBook=scan.nextLine();
        System.out.print("Your age: ");
        byte age=scan.nextByte();
        System.out.print("Your favorite number: ");
        long favNumber=scan.nextLong();
        System.out.println("Your favorite book is "+favBook+" You are "+age+" years old "+ " and your favorite number is "+favNumber);






    }
}
