package day_35.day31_arrays;

import java.util.Arrays;

public class AnagramWithSort {
    public static void main(String[] args) {
        /*
    given two strings
    find if they are anagram or not
    Anagram means if the characters are the same but the order is different
    anna & naan   or  & silent
     */
        String word="listen";
        String word2="silent";
        char[] letters=word.toCharArray();
        char[] letters2=word2.toCharArray();
        Arrays.sort(letters);
        Arrays.sort(letters2);
        System.out.println(letters);
        System.out.println(letters2);

        if (Arrays.equals(letters, letters2)) {

            System.out.println("Anagram");
        }else{
            System.out.println("not anagram");
        }
        System.out.println(Arrays.equals(letters,letters2)?"Anagram":"Not anagram");
    }
}


