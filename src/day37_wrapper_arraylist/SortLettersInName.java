package day37_wrapper_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortLettersInName {
    public static void main(String[] args) {
        String name="sumeyra";
        String []lettersOfName=name.split("");
        System.out.println(Arrays.asList(lettersOfName));
        ArrayList<String>letters1=new ArrayList<>();
        for (String s : lettersOfName) {
            letters1.add(s);
        };
        Collections.sort(letters1);
        System.out.println(letters1);
        System.out.println();

        List letters=Arrays.asList(lettersOfName);
        Collections.sort(letters);
        System.out.println(letters);
    }
}
