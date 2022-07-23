package day10_scanner;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int num= scan.nextInt();
        boolean even=num % 2 ==0;
        boolean odd=num%2!=0;//or boolean odd=num%2=1;
        //or boolean odd=!even;
        System.out.println(num+" is even: "+even);
        System.out.println(num+" is odd: "+odd);
    }
}
