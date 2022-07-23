package day39_arraylist;

import java.util.ArrayList;

public class TargetWord {
    public static void main(String[] args) {
        int count=0;
        ArrayList<String>words=new ArrayList<>();
        words.add("java");
        words.add("html");
        words.add("css");
        words.add("java");
        words.add("javascript");
        words.add("selenium");
        System.out.println(words);

        for(int i=0;i<words.size();i++){
            words.get(i);
            if(words.get(i).equalsIgnoreCase("java")){
                count++;
            }
        }
        System.out.println(count);
    }
}
