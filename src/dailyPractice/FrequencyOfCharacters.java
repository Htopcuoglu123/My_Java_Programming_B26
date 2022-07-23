package dailyPractice;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    /*
    String - Frequency of Characters
Write a return method that can find the frequency of characters
Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
     */
public static String frequency(String s){
    ArrayList<String>chars=new ArrayList<>(Arrays.asList(s.split("")));
    String checked="";
    for (int i = 0; i <chars.size() ; i++) {
        if(checked.contains(chars.get(i))){
            continue;
        }
        int count=Collections.frequency(chars,chars.get(i));
        checked+=chars.get(i)+":"+count+" ";
    }
    return checked;
}

    public static void main(String[] args) {
        System.out.println(frequency("AAABBCDD"));
    }
    }

