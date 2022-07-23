package day64_functional_Interface.InterviewProjects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word="agriculture";
        String checked="";
        for (int i = 0; i <word.length() ; i++) {
            int count=0;
            char letter1=word.charAt(i);
            if(checked.contains(""+letter1)){
                continue;
            }
            for (int j = 0; j <word.length() ; j++) {
                char letter2=word.charAt(j);
                if(letter1==letter2){
                    count++;
                }

            }
            System.out.println(letter1+":"+count);
            checked+=letter1;
        }
        System.out.println("================================================================");

        String str="apple";
        ArrayList<String>chars=new ArrayList<>(Arrays.asList(str.split("")));
        String checked1="";
        for (int i = 0; i <chars.size() ; i++) {
            if(checked1.contains(chars.get(i))){
                continue;
            }
            int count= Collections.frequency(chars,chars.get(i));
            checked1+=chars.get(i)+":"+count+'\n';
        }
        System.out.println(checked1);
    }


}
