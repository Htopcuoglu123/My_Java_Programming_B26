package day30_array;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        char[]letters={'j','a','v','a'};
        String str=new String(letters);
        System.out.println(letters);
        System.out.println();
        String word="java";
        char[] java=word.toCharArray();
        for(char eachChar:java){

            System.out.println(eachChar);
            System.out.println(Arrays.toString(letters));
            System.out.println(Arrays.toString(java));
            System.out.println();

            char []day={'m','o','n','d','a','y'};
            System.out.println(Arrays.toString(day));
            String strDay=new String(day);
            System.out.println(strDay);

        }
    }
}
