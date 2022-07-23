package day25_;

import java.util.Scanner;

public class MultiplyEnd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a word");
        String word= input.nextLine();
        System.out.println("enter a number 1-5");
        int num= input.nextInt();
        for(int i=0;i<num;i++){
            word+=word.charAt(word.length()-1);

        }
        System.out.println(word);
    }
}
