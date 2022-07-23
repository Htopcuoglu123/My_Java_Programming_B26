package day12_if_Statements.day20_strings;

import java.util.Scanner;

public class MoveFirstWord2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String sentence= scanner.nextLine().trim();
        int spaceIndex=sentence.indexOf(' ');
        String firstWord=sentence.substring(0,spaceIndex);
        String result=sentence.substring(spaceIndex+1)+" "+firstWord;
        System.out.println(result);

    }
}
