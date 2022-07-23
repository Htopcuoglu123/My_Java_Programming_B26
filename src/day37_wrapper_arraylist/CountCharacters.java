package day37_wrapper_arraylist;

import java.util.Arrays;

public class CountCharacters {
    /*
    given some string, count the uppercase letters,lowercase letters, numbers and other characters
    aP#572&*jdJU
     */
    public static void main(String[] args) {
        String str="aP#572&*jd@jdJU";
        int countUpper=0;
        int countLower=0;
        int countDigits=0;
        int otherChars=0;
        String uppercaseChars="";
        for (int i = 0; i <str.length() ; i++) {
            char letter=str.charAt(i);
            if(Character.isUpperCase(letter)){
                countUpper++;
                uppercaseChars+=letter;
            }
            else if(Character.isLowerCase(letter)){
                countLower++;
            }
           else if(Character.isDigit(letter)){
                countDigits++;
            }else{
               otherChars++;
            }
        }
        System.out.println("Number of uppercase letters is "+countUpper);
        System.out.println("Uppercase letters "+ Arrays.toString(uppercaseChars.toCharArray()));
        System.out.println("Number of lowercase letters is "+countLower);
        System.out.println("Number of digits is "+countDigits);
        System.out.println("Number of other characters is "+otherChars);
    }

}
