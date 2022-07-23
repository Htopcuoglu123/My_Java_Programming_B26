package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SwitchPairs {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("today","is","a","beautiful","day","in","Agawam","MA"));
        for (int i = 0; i <words.size() ; i+=2) {
            String temp=words.get(i);
            words.set(i,words.get(i+1));
            words.set(i+1,temp);

        }
        System.out.println(words);
    }
}
