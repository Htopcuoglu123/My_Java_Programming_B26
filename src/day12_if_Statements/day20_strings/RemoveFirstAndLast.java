package day12_if_Statements.day20_strings;

import java.util.Scanner;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter two words");
        String word1 = scanner.next();
        String word2 = scanner.next();
        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0,word2.length()-1));

    }
}
