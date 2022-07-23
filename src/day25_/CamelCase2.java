package day25_;

import java.util.Scanner;

public class CamelCase2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a three word sentence");
        String s= scanner.nextLine().toLowerCase().trim();
        String camelCase=s.substring(0,1);
        for(int i=1;i<s.length();i++){
            if(s.charAt(i-1)==' '){
               camelCase+=s.substring(i,i+1).toUpperCase();
            }else{
                camelCase+=s.charAt(i);
            }
        }
        System.out.println(camelCase.replace(" ",""));
    }
}
