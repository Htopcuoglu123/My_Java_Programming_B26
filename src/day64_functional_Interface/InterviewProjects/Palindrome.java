package day64_functional_Interface.InterviewProjects;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
         /*
        interview question
        palindrome:It is the same reading from the end and beginning
        ex
        mom
        racecar
        madam
        task:Check if the string is a palindrome
        declare some initial string
        think about how to reverse a string
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a word");
        String s= scanner.next();
        String reverse="";
        for (int i =s.length()-1; i>=0 ; i--) {
            reverse+=s.charAt(i);
        }
        if(s.equalsIgnoreCase(reverse)){
            System.out.println(s+" is a palindrome");
        }else{
            System.out.println(s+" is not a palindrome");
        }
    }
}
