package day16_review;

import java.util.Scanner;

public class SeasonFinder {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Tell me the month number,I will tell you season so you can dress up appropriately");
        int monthNumber=input.nextInt();
        String message="";

        switch(monthNumber){
            case 12: case 1: case 2:
                message="It is winter, so wear a winter jacket,hat and gloves.";
                break;
            case 3: case 4: case 5:
                message="It is spring. You can wear a light jacket and get an umbrella!";
                break;
            case 6: case 7: case 8:
                message="Summer! It is a great day to go to the beach!";
                break;
            case 9: case 10: case 11:
                message="Fall! You can go on a hike or find a scenic road to see the beautiful scenes!";
                break;
            default:
                message="invalid entry";

        }
        System.out.println(message);
    }
}
