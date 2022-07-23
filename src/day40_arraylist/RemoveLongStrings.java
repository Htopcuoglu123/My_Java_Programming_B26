package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveLongStrings {
    public static ArrayList<String>keepLongString(ArrayList<String>list,int num){

        list.removeIf(word->word.length()<num);

        return list;

    }

    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>(Arrays.asList("one","two","three","four","five","six"));
        int num=4;
        System.out.println(keepLongString(words,num));
    }
}
