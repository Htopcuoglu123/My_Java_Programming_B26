package day39_arraylist;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;

public class SeparateParts {
    public static void main(String[] args) {

        String str = "ABCD123$%#@&456EFG!";
        String specials = "$, %, #, @, &, !";

        ArrayList<Character> upper = new ArrayList<>();
        ArrayList<Character> numbers = new ArrayList<>();
        ArrayList<Character> signs = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(Character.isUpperCase(c)){
                upper.add(c);

            }else if(Character.isDigit(c)){
                numbers.add(c);

            }else if (specials.contains(c + ""))  {
                signs.add(c);
            }
        }
        System.out.println(upper);
        System.out.println(numbers);
        System.out.println(signs);
    }
}
