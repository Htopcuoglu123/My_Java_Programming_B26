package day40_arraylist;

import my_utilities.StringUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseAll {
    /*
    Reverse All
Create a method that will take an ArrayList of Strings and
reverse each element and return an ArrayList of
all reversed words
@param words - Given ArrayList of Strings
@return - ArrayList of Strings
Ex:
Input: {"ted", "talk", "learn"}
Output: {"det", "klat", "nrael"}
     */
    public static ArrayList<String>reverseAll(ArrayList<String>words){

        ArrayList<String>reverseWords=new ArrayList<>();
        for(String each :words){

            reverseWords.add(StringUtil.reverse(each));
            // We call the reverse method in StringUtil class to reverse each word, each element, then we are adding the reversed word into the 'reverseWords' ArrayList
        }

        return reverseWords;

    }

//
//        for (int i=0;i<words.size(); i++) {
//            String reversed="";
//            String s=words.get(i);
//            for (int j=s.length()-1; j>=0 ; j--) {
//                reversed+=s.charAt(j);
//
//            }
//            reverseWords.add(reversed);
//        }
//        return reverseWords;
//        }
        /*

         */



    public static void main(String[] args) {
    ArrayList<String>words=new ArrayList<>(Arrays.asList("hilal","tarkan","ahmet","yusuf"));
        System.out.println(reverseAll(words));
        System.out.println(reverseAll(ArrayListWithMethods.getDaysOfWeek()));
    }

}

