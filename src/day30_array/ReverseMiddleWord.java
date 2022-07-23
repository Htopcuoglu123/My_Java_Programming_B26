package day30_array;

import java.util.Scanner;

public class ReverseMiddleWord {
    public static void main(String[] args) {
        String s="Java always fun";
        String[]words=s.split(" ");
        String reversed="";
        //char[]middleWord=word[1].toCharArray();another way
        //for(int i=middleWord.length()-1;i>=0;i--){
        //reverse+=middleWords[i];
        for(int i=words[1].length()-1;i>=0;i--){
            reversed+=words[1].charAt(i);
        }
        System.out.println(words[0]+" "+reversed+" "+words[2]);
    }
}
