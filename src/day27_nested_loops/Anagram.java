package day27_nested_loops;

public class Anagram {
    public static void main(String[] args) {
        /*
         Anagram

                Given two Strings determine if they are anagram or not. Strings are anagram if
                        they are built up of the same characters
                 Ex:
                    listen vs silent
                    funeral vs  real fun
                    a gentleman vs elegant man

                 -> anagram
                 Hint: look up and use replaceFirst() method
         */

        String a="a gentleman";
        String b="elegant man";
        a=a.toLowerCase().replace(" ","");//remove the space in word
        b=b.toLowerCase().replace(" ","");//remove the space in the word

        if(a.length()==b.length()){//check the lengths of the words first

            for (int i = 0; i < a.length(); i++) {

                char each=a.charAt(i);

                b=b.replaceFirst(each+"","");//this will replace each letter at each with "" so basically it will remove it
                 //we use replaceFirst instead of replace because we try to check if both words have exactly the same letters, the same number of letters
            }
            if(b.isEmpty()){
                System.out.println("Anagram");
            }else{
                System.out.println("Not Anagram");
            }
        }else{
            System.out.println("Not Anagram");
        }

    }
}
