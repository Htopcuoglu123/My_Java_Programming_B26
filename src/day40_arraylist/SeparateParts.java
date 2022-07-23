package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {
    public static void main(String[] args) {
        String s="ABCD123$%#@&456EFG!";
        ArrayList<String>list=new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(list);
        ArrayList<String>numbers=new ArrayList<>(list);
        numbers.retainAll(Arrays.asList("1","2","3","4","5","6","7","8","9","0"));
        System.out.println(numbers);
        ArrayList<String>specialChars=new ArrayList<>(list);
        specialChars.retainAll(Arrays.asList("!","@","#","$","%","^","&","*","(",")","~"));//these are a part of the String s
        //that's why we use Arrays.asList
        System.out.println(specialChars);
        ArrayList<String>letters=new ArrayList<>(list);
        letters.removeAll(numbers);//allows only one
        letters.removeAll(specialChars);//since these are already arraylists we do not use Arrays.asList
        System.out.println(letters);
    }
}
