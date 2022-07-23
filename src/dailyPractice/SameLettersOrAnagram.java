package dailyPractice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SameLettersOrAnagram {
    //    2) String - Same letters
//    Write a return method that check if a string is build out of the same letters as another string.
//    Ex:  same("abc",  "cab"); -> true
//    same("abc",  "abb"); -> false:
    public static boolean isSame(String a,String b){
        char[]a1=a.toCharArray();
        char[]b1=b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        if(Arrays.equals(a1,b1)){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isSame("listen","silent"));
    }
}
