package day25_;

import java.util.Scanner;

public class Prime2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number= scanner.nextInt();
        boolean isPrime=true;//boolean number=number>=2;so any whole number bigger than 2 is true for this boolean
        //int count=0;
        for(int i = 2 ; i < number ; i++){
            if(number % i == 0){
                isPrime = false;
                //count++;
                break;
            }
        }
        if(isPrime){//if(count==0)

            System.out.println(number+" is prime");
        }else{
            System.out.println(number+" is not prime");
        }
    }
}
