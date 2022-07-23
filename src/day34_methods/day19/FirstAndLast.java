package day34_methods.day19;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str=scanner.nextLine();
        System.out.println("first char:"+str.charAt(0));
        System.out.println("last char:"+str.charAt(str.length()-1));
    }
}
