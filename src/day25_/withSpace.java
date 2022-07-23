package day25_;

import java.util.Scanner;

public class withSpace {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a word");
        String s= scanner.nextLine().replace(' ','-');
        String result="";
        for(int i=0;i<s.length();i++){
            result+=s.charAt(i)+" ";
            }
        System.out.println(result.trim());
        }

    }

