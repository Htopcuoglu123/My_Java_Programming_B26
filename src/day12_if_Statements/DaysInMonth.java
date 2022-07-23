package day12_if_Statements;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What month is it?");
        int month=scan.nextInt();
        /*
        boolean has31Days=month==1||month==3||month==5||month==7||month==8||month==10||month==12;
        boolean has30Days=month==4||month==6||month==9||month==11;
        boolean has28Days=month==2;
        if(has31Days){
        System.out.println(month);
        System.out.println("31 days");
        }
        if(has30Days){
         System.out.println(month);
         System.out.println("30 days");
         }
         if(has28Days){
         System.out.println(month);
         System.out.println("28 days");
        }
         */


        if(month==1||month==3||month==5||month==7||month==8||month==10||month==12){
            System.out.println(month);
            System.out.println("31 days");
        }
        else if(month==4||month==6||month==9||month==11){
            System.out.println(month);
            System.out.println("30 days");
        }
        else if(month==2){
            System.out.println(month);
            System.out.println("28 days");
        }
        else{
            System.out.println("invalid number");
        }
    }
}
