package day11_if_statements;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is the temperature?");
        int temp=input.nextInt();
        if(temp>=70){
            System.out.println("It is a nice day");
            System.out.println("Lets go outside, but with your laptop to code Java!");
        }else{
            System.out.println("It is too cold!");
            System.out.println("Code more Java");
        }
    }
}
