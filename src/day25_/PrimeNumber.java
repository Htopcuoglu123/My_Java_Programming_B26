package day25_;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num = scanner.nextInt();
        int count=0;
        /*
        n%2
        n%3
        n%4
        n%less then n
         */

       for(int i = 2; i <= num/2; i++) {
           if (num % i == 0) {
              count++;
           }
       }
       if(count==0){
           System.out.println(num+" is prime");

        }else{
           System.out.println(num+ " is not a prime");
       }

    }
}
