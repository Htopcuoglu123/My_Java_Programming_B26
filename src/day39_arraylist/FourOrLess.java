package day39_arraylist;

import java.util.ArrayList;

public class FourOrLess {
    public static void main(String[] args) {
        ArrayList<String> fourOrLess = new ArrayList<>();
        ArrayList<String> words = new ArrayList<>();
        words.add("duck");
        words.add("cat");
        words.add("chicken");
        words.add("sheep");
        words.add("crocodile");
        words.add("cow");

        for (int i = 0; i <words.size(); i++) {
            String temp=words.get(i);
            System.out.println(words.get(i));

            if(temp.length()<=4){
                fourOrLess.add(temp);
            }
        }
        for (int i = 0; i < fourOrLess.size() ; i++) {
            String longWord=fourOrLess.get(i);
            if(words.contains(longWord)){
                words.remove(longWord);
            }
        }
        System.out.println(words);
        System.out.println(fourOrLess);
    }
}