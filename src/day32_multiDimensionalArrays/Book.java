package day32_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        /*
        Flow:
        How many chapters is there?
        Make a book with that main chapter
        write each chapters one at a time
          break up each chapter by sentences
         */

        Scanner input=new Scanner(System.in);
        System.out.println("How many chapters is there?");
        String [][] book=new String[input.nextInt()][];//since we will not use that variable
        // (num of chapters)again we can do it that way
        System.out.println(Arrays.deepToString(book));
        input.nextLine();
        for (int i = 0; i <book.length ; i++) {
            System.out.println("Enter chapter "+(i+1));//i+1 since we will start will chapter 1 noy chapter 0
            String chapter= input.nextLine();
            String[]sentences=chapter.split("!");//breaking up by the exclamation point
            book[i]=sentences;

        }
        System.out.println(Arrays.deepToString(book));
    }
}
