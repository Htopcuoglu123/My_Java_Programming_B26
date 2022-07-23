package day25_;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a three word sentence");
        String s= scanner.nextLine().toLowerCase().trim();
        int space=s.indexOf(' ');
        int lastSpace=s.lastIndexOf(' ');
        String firstWord=s.substring(0,space);
        String secondWord=s.substring(space+1,lastSpace+1);
        secondWord=secondWord.substring(0,1).toUpperCase()+secondWord.substring(1,secondWord.length()-1);
        String lastWord=s.substring(lastSpace+1);
        lastWord=lastWord.substring(0,1).toUpperCase()+lastWord.substring(1);
        String result=firstWord+secondWord+lastWord;

        System.out.println(result);

    }
}
