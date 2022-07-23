package day25_;

import java.util.Scanner;

public class withSpace2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a word");
        String str= scanner.nextLine();
        String fixed="";

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                fixed+="_";
            }else{
                fixed+=str.charAt(i)+" ";
            }
        }
        System.out.println(fixed.trim());
    }
}
