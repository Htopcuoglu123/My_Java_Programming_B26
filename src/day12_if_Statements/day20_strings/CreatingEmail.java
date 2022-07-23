package day12_if_Statements.day20_strings;

import java.util.Scanner;

public class CreatingEmail {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two 6 character words");
        String word1= scanner.next();
        String word2= scanner.next();
        boolean invalid=word1.length()<6||word2.length()<6;

        if(invalid){
            System.out.println("invalid data");

        }else{
            System.out.println(word1.substring(0,4)+word2.substring(word2.length()-4,word2.length()));
        }
    }
}
