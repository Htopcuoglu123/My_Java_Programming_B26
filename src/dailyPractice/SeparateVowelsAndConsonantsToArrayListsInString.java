package dailyPractice;

import java.util.ArrayList;

public class SeparateVowelsAndConsonantsToArrayListsInString {
    public static void main(String[] args) {
        String a="HTtopcuOglu";
        a=a.toLowerCase();
        ArrayList<Character>vowels=new ArrayList<>();
        ArrayList<Character>consonants=new ArrayList<>();
       for(int i=0;i<a.length();i++){
           if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='o'||a.charAt(i)=='u'){
               vowels.add(a.charAt(i));
           }else{
               consonants.add(a.charAt(i));
           }
       }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
