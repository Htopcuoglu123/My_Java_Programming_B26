package day25_;

import java.util.Scanner;

public class ReverseOnlySecondWord {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your three words");
        String s= input.nextLine().trim();
        int space=s.indexOf(" ");
        int lastSpace=s.lastIndexOf(" ");
        String secWord=s.substring(space,lastSpace);
        String reverse="";
        for(int i=secWord.length()-1;i>=0;i--){
            reverse+=secWord.charAt(i);
        }
        System.out.println(s.substring(0,space)+" "+reverse+ s.substring(lastSpace,s.length()));
    }
}
