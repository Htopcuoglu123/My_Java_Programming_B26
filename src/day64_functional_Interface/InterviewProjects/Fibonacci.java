package day64_functional_Interface.InterviewProjects;

import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        fibonacciNums(8);
        finbonacci(11);
    }
    public static void fibonacciNums (int x){

        int n1=0, n2=1, n3;
        System.out.print(n1+" "+n2); //printing 0 and 1
        for(int i=2; i <= x; ++i) //loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2; // 1 -> 2 -> 3
            System.out.print(" "+n3); //1 -> 2 -> 3
            n1=n2; // 0 -> 1 -> 1
            n2=n3; // 1 -> 1 -> 2
        }
    }

        public static String finbonacci(int number){
            int [] arr = new int[number];
            int arrNumber= 1;
            arr[0] = 0;
            for (int i = 1; i < number ; i++) {
                arr[i] = arrNumber;
                arrNumber+=arr[i-1];
            }
            return Arrays.toString(arr);
        }



}
