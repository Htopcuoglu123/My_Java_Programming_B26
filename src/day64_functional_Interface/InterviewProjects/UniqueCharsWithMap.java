package day64_functional_Interface.InterviewProjects;

import javax.imageio.stream.ImageInputStream;
import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;

public class UniqueCharsWithMap {
    public static void uniqueChars(String word) {
        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] wordAsCharArray = word.toCharArray();
        for (char eachChar : wordAsCharArray) {
            if (map.get(eachChar) == null) {
                map.put(eachChar, 1);
            } else {
                map.put(eachChar, map.get(eachChar) + 1);
            }

        }
        for (Map.Entry<Character, Integer> unique : map.entrySet()) {
            if (unique.getValue() == 1) {
                System.out.println(unique.getKey()+" : "+unique.getValue());

            }
        }


    }
    public static void main(String[] args) {
        uniqueChars("hilal");
    }
}
