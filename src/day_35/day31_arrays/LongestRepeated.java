package day_35.day31_arrays;

import java.util.Arrays;

public class LongestRepeated {
    public static void main(String[] args) {
        /*

    Write a program if some substring K that can be repeated N>1 times to produce the input string exactly as it appears.
    Your program should return longest substring K, and
    if there is none it should be return "There is no repetitive substring"

    		For Example is str ="abcababcababcab"  			   output should be abcab
    					   str ="abcdefabcdef"     			   output should be abcdef

    					   str ="abcdefabcdef abcdefabcdef"    output should be abcdefabcdef
    					   str ="abcdefxabcdef"				   output should be "There is no repetitive substring"

         */
        String word="abcdefabcdefabcdefabcdef";
        String[]split=word.split("a");
      //  System.out.println(split.length);
        //System.out.println(Arrays.toString(split));


        String temp="";
        String longest="";
        for (int i = 0; i <word.length()/2 ; i++) {
            //temp=word.substring(0,i+1);
            temp+=word.charAt(i);
            String [] s=word.split(temp);//we have new array based on our array
           // System.out.println(Arrays.toString(s));

            if(s.length==0&&longest.length()<temp.length()){
               longest=temp;
            }

        }
        System.out.println(!longest.isEmpty()?longest:"There is no repetitive substring");
    }
}
