package day39_arraylist;

import java.util.ArrayList;

public class GetUpperCaseOrLowerCase {
    public static void main(String[] args) {
        ArrayList<Character>upper=new ArrayList<>();
        ArrayList<Character>lower=new ArrayList<>();
        String s="heLLoWoRlD";
        for (int i = 0; i <s.length() ; i++) {
            if(Character.isUpperCase(s.charAt(i))){
                upper.add(s.charAt(i));
            }
            if(Character.isLowerCase(s.charAt(i))){
                lower.add(s.charAt(i));
            }

        }
        System.out.println(lower);
        System.out.println(upper);
    }
}
