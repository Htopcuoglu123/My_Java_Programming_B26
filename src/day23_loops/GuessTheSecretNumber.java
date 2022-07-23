package day23_loops;

import java.util.Scanner;

public class GuessTheSecretNumber {
    public static void main(String[] args) {
        int secretNum = 11;
        int trial=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("I have a secret number in my mind!Try to guess!");
        int guessNum;
        do {
            System.out.println("What is your guess from 1-100?");
            guessNum = scanner.nextInt();
            trial++;
            if (guessNum > secretNum) {
                System.out.println("Trial:"+trial);
                System.out.println(guessNum+" is too high");
            } else if (guessNum < secretNum) {
                System.out.println("Trial:"+trial);
                System.out.println(guessNum+" is too low");
            }
        }
        while (guessNum != secretNum);
        System.out.println("Trial:"+trial);
        System.out.println("you guessed it");
    }
}




