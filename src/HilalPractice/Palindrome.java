package HilalPractice;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter a word");
        String word= input.next();
        String reverse="";

        for (int i = word.length()-1; i>=0; i--) {

            reverse+=word.charAt(i);

        }
        if(reverse.equalsIgnoreCase(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        }

    }

