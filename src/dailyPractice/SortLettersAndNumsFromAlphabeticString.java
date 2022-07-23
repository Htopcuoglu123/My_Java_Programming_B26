package dailyPractice;

import java.util.Arrays;

public class SortLettersAndNumsFromAlphabeticString {
    /*
    2.String -- Sort Letters and Numbers from alphanumeric String
Given alphanumeric String, we need to split the string into substrings of consecutive letters or numbers, sort the individual string and append them back together
Ex:
Input:  "DC501GCCCA098911"
OutPut: "CD015ACCCG011899"

     */
    public static String sortLettersAndNums(String s) {
        String result = "";
        String upper = "";
        String digit = "";
        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                upper+=s.charAt(i);
            }else{
                char[]up=upper.toCharArray();
                Arrays.sort(up);
                result+=String.valueOf(up);
                upper="";
            }
            if(Character.isDigit(s.charAt(i))){
                digit+=s.charAt(i);
            }else{
                char[]dig=digit.toCharArray();
                Arrays.sort(dig);
                result+=String.valueOf(dig);
                digit="";
            }

        }
        if(digit.isEmpty()||upper.isEmpty()){
            char[]up=upper.toCharArray();
            Arrays.sort(up);
            result+=String.valueOf(up);

            char[]dig=digit.toCharArray();
            Arrays.sort(dig);
            result+=String.valueOf(dig);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sortLettersAndNums("DC501GCCCA098911"));
    }
}