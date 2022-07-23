package day29_;

import java.util.Scanner;

public class AverageNum {
    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("How many numbers do you want to have?");
//        int numOfNum= scanner.nextInt();
//        int [] nums=new int[numOfNum];
//        int sum=0;
//        for(int i=0;i<numOfNum;i++){
//            System.out.println("Enter your number "+(i+1));
//            nums[i]= scanner.nextInt();
//            sum+=nums[i];
//        }
//        System.out.println("Average:"+sum/numOfNum);
//
        //with Saim

        int [] numbers={10,15,5,6};
        int total=0;
        for(int i=0;i<numbers.length;i++){
           total+=numbers[i];

        }
        System.out.println("Traditional for loop Average: "+(total/numbers.length));

        System.out.println();

        int [] nums1={10,15,5,6};
        int sum1=0;
        for(int eachOne:nums1){
            sum1+=eachOne;

        }
        System.out.println("For each Average:"+(sum1/ nums1.length));

    }
}
