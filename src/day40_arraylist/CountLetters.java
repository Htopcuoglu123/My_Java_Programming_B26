package day40_arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String>words=new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("css");
        words.add("java");
        words.add("javascript");
        words.add("selenium");

        char letter='a';
        System.out.println(num(words,letter));
    }
    public static int num(ArrayList<String>words,char letter){
        int count=0;
        for (int i = 0; i <words.size() ; i++) {
            for (int j = 0; j < words.get(i).length() ; j++) {
                if(words.get(i).charAt(j)==letter){
                    count++;

            }
        }
        }

        return count;
    }
}
