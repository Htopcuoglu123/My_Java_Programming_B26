package day16_review;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What floor do you want to go? ");
        int floor= scanner.nextInt();
        String message="";
        switch(floor){
            case 1:
                message="On the first floor we have;\nLobby\nStarbucks\nAmazon Pick Up";
                break;
            case 2:
                message="On the second floor we have;\nNASA\nCydeo\nDiscover";
                break;
            case 3:
               message="On the third floor we have;\nUber\nLyft\nChase";
                break;
            case 4:
              message="On the forth floor we have;\nRooftop\nLounge";
                break;
            default:
               message="invalid floor selected";
        }
        System.out.println(message);
    }
}
