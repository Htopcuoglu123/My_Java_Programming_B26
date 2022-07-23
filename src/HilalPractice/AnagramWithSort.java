package HilalPractice;

import javax.swing.*;
import java.util.Arrays;

public class AnagramWithSort {
    public static void main(String[] args) {
        String a = "a gentelman";
        String b = "elegant man";
        a.replace(" ","").toLowerCase();
        b.replace(" ","").toLowerCase();

//        if(a.length()==b.length()){
//            for (int i = 0; i <a.length() ; i++) {
//                char each=a.charAt(i);
//                b=b.replaceFirst(each+"","");
//
//            }
//            if(b.isEmpty()){
//                System.out.println("anagram");
//            }else{
//                System.out.println("Not anagram");
//            }
//        }else{
//            System.out.println("Not anagram");
//        }
        System.out.println("__________________________________________________________________");

        char[] first=a.toCharArray();
        char[]second=b.toCharArray();
        Arrays.sort(first);
        System.out.println(first);
        Arrays.sort(second);
        System.out.println(second);
        if(Arrays.equals(first,second)){
            System.out.println("anagram");
        }else{
            System.out.println("Not anagram");
        }

    }
}

