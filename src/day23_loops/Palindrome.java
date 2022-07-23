package day23_loops;

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
        String s="racecar";
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){

            reverse+=s.charAt(i);

           }
        if (s.equals(reverse)) {
            System.out.println("yes, it is a palindrome");
        }else{
            System.out.println("It is not a palindrome");

            System.out.println(s.equals(reverse)?"Palindrome":"Not a palindrome");
        }

        }

    }

