package day34_methods.day19;

import java.util.Scanner;

public class LongestWithA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter 3 words");
        String input1 = scan.next().toLowerCase();
        String input2=scan.next().toLowerCase();
        String input3=scan.next().toLowerCase();
        String longestWord="";


        if (input1.contains("a") && input1.length() > longestWord.length()) {

            longestWord=input1;

        }
        if (input2.contains("a") && input2.length()> longestWord.length()) {

            longestWord=input2;
        }
        if (input3.contains("a")&&input3.length()>longestWord.length()){

           longestWord=input3;
        }
        System.out.println(longestWord.isEmpty()?"No single word with a":longestWord+" is the longest word with a");

    }
}
