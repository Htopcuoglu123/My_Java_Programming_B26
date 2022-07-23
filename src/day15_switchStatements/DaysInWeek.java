package day15_switchStatements;

import java.util.Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Give me number 1 to 7 and I will tell you what day it is");
        int numDay= scanner.nextInt();
        String day="";
        switch(numDay){
            case 1:
                day="Monday";
                break;
            case 2:
                day="Tuesday";
                break;
            case 3:
                day="Wednesday";
                break;
            case 4:
                day="Thursday";
                break;
            case 5:
               day="Friday";
                break;
            case 6:
                day="Saturday";
                break;
            case 7:
                day="Sunday";
                break;
            default:
                System.out.println("Invalid input");

        }
        System.out.println(day);

    }
}
