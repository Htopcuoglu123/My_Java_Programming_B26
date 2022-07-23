package day23_loops.day26_nested_loops;

import java.util.Scanner;

public class PracticePalindrome {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a word");
        String word= scanner.next();
        String reverse="";
        for(int i=word.length()-1;i>=0;i--){
          reverse+=word.charAt(i);
            System.out.println(reverse);

        }
        if(reverse.equals(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }


}
