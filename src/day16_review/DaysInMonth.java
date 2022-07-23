package day16_review;

import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the name of the month and I will tell you how many days in it");
        String monthName= input.next();
        switch(monthName){
            case "January": case "March": case"May": case"July": case"August": case"October": case"December":
                System.out.println(monthName+":31 days");
                break;
            case "April": case"June": case"September": case"November":
                System.out.println(monthName+":30 days");
                break;
            case "February":
                System.out.println(monthName+":28 days");
                break;
            default:
                System.out.println("invalid entry");



        }
    }
}
