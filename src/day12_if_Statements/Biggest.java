package day12_if_Statements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter 3 numbers. Hit enter after each number.");
        int num1=scan.nextInt();
        int num2= scan.nextInt();
        int num3=scan.nextInt();

        if(num1>=num2&&num1>=num3){
            System.out.println("The biggest number is "+num1);
        }
        else if(num2>=num1&&num2>=num3){
            System.out.println("The biggest number is "+num2);
        }
        else{
            System.out.println("The biggest number is "+num3);
        }
    }
}
