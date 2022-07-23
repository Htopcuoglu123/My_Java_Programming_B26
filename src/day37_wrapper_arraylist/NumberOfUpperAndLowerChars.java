package day37_wrapper_arraylist;

import jdk.swing.interop.SwingInterOpUtils;

public class NumberOfUpperAndLowerChars {
    /*
    Write program that returns true if the total number of uppercase
characters are equal to total number of lowercase characters of a
string

Ex:
	str = "JAVA java";

output:

	true
     */
    public static void main(String[] args) {
        String s="hilal TURAN";
        int countUpper=0;
        int countLower=0;
        for (int i = 0; i <s.length() ; i++) {
            char letter=s.charAt(i);
            if(Character.isUpperCase(letter)){
                countUpper++;
            }else if(Character.isLowerCase(letter)){
                countLower++;
            }
        }
        if(countUpper==countLower){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
        System.out.println(countUpper);
        System.out.println(countLower);
    }
}
