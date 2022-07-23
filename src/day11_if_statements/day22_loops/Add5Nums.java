package day11_if_statements.day22_loops;

import java.util.Scanner;

public class Add5Nums {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter 5 numbers:");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        int num4= scanner.nextInt();
        int num5= scanner.nextInt();
        int total=num1+num2+num3+num4+num5;
        System.out.println("Total is: "+total);
    }
}
