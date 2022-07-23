package day23_loops;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max=-2147483648;
        int min= 247483648;
        int numTimes=0;
        while(numTimes<5){
            numTimes++;
            System.out.println("Enter a number:");
            int num= input.nextInt();
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }

        }
        System.out.println("My max number:"+max);
        System.out.println("My min number:"+min);
    }



    }

