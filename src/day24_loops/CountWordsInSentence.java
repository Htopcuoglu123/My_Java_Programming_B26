package day24_loops;

import java.util.Scanner;

public class CountWordsInSentence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sentence = input.nextLine().trim();
        int numSpace = 0;

        for (int i = 0; i < sentence.length()-1; i++) {
            if(sentence.charAt(i)==' '){//if(sentence.substring(i,i+1)==' ')
                numSpace++;
            }

        }
        System.out.println("Number of words is: "+(numSpace+1));
    }
}
