package day64_functional_Interface.InterviewProjects;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharsWithMaps {
    public static void frequencyOfEachChar(String input){

        Map<Character,Integer> counter=new LinkedHashMap<>();
        for (int i = 0; i <input.length() ; i++) {
            char key=input.charAt(i);
            if(counter.containsKey(key)){
                counter.put(key,counter.get(key)+1);
            }else{
                counter.put(key,1);
            }
        }
        System.out.println(counter);
    }
    public static void main(String[] args) {
        frequencyOfEachChar("bananas");
    }
}


