package day62_maps;

import java.util.LinkedHashMap;
import java.util.Map;
 /*
        Given a String count how many times each character is in the String
        a-1
        p-2
        l-1
        e-1
     */


public class FrequencyOfCharactersWithMaps {
    public static void frequencyOfEachChar(String input){

        Map<Character,Integer>counter=new LinkedHashMap<>();
        for (int i = 0; i <input.length() ; i++) {
            char key=input.charAt(i);
            if(counter.containsKey(key)){
             //the letter/char was found before this is a duplicate occurance,
                // so we will need to update the counter for it which is the value in our map
                counter.put(key,counter.get(key)+1);//counter.get()the method from the map to get the value of the
                //previous counter then we add 1 to that number
                //then assigns that result as the new value linked to that key

            }else{
                //The map does not contain the letter/char-> which means
                // this is the first time the character was found, so we should add it to the map
            counter.put(key,1);

            }

        }
        System.out.println(counter);
    }

    public static void main(String[] args) {
        frequencyOfEachChar("bananas");
    }
}
