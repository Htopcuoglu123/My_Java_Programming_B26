package day15_switchStatements;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What day is it?");
        String day= scan.next();
        String message="";
        switch(day){
            case "Monday":
            case "monday":
                message="Java with Saim starts at 7:00pm";
           break;

            case "Tuesday":
            case "tuesday":
                message="Java with Saim starts at 7:00pm";
            break;

            case "Wednesday":
            case "wednesday":
                message="Java with Saim starts at 7:00pm";
            break;

            case "Thursday":
            case "thursday":
                message="Soft Skills with Nadir at 7:00pm";
                break;

            case "friday":
            case "Friday":
                message="No class today!Enjoy!";
                break;
            case "Saturday":
            case "saturday":
                message="Java with Saim starts at 10:00AM";
                break;

            case "Sunday":
            case "sunday":
                message="Java with Saim starts at 10:00am";
                break;

            default:
                message="invalid day";

        }
        System.out.println(message);
    }
}
