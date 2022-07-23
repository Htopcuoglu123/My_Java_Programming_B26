package day11_if_statements.day22_loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number 1-10");
        int n= scanner.nextInt();
        int result=1;
        while(n>=1){
            result*=n;
            n--;
        }
        System.out.println(result);
    }


}
