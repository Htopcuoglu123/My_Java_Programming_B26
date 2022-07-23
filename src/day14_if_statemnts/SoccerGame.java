package day14_if_statemnts;

import java.util.Scanner;

public class SoccerGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much time is left in the soccer game?");
        int time = scanner.nextInt();
        String message = "";
        if (time >= 0 && time <= 90) {
            if (time >= 75) {
                message = "Just starting";
            } else if (time >= 60) {
                message = "Players are doing their best";
            } else if (time >= 30) {
                message = "Middle of the game is going great!";
            } else {
                message = "The end of the game is approaching";
            }

        } else {
            //System.out.println(time<0?"Minutes cannot be less than zero":"Games cannot be more than 90 minutes");
            if (time < 0) {
                message = "minutes cannot be less than zero";
            } else {
                message = "Games cannot be longer than 90 minutes";

            }

        }
        System.out.println(message);
    }
}
