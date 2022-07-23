package day34b_methods;

import java.util.Scanner;

public class numberAsWord {
    public static void main(String[] args) {
        System.out.println(numberAsWord(3));
        System.out.println(numberAsWord(10));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        System.out.println(numberAsWord(input.nextInt()));
        /*
        Why can't I do this? int num=numberAsWord(input.nextInt());

        this method returns the number as a word so it is a String. We must store it into a String variable
        String num=numberAsWord(input.nextInt());
         */

    }

    public static String numberAsWord(int num) {
        if (num < 1 || num > 10) {
            return num + "invalid number";//return type also stops the code if the condition is true
        }
        String[] words = {"One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        return words[num - 1];//-1 will convert the number to the index number
    }
}

