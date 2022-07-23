package day35b_methods;

public class UniqueCharacters {
    /*
    Unique Characters

create a method that will accept a word(String) and return a String with all the unique characters. A character is unique if it only appears in the String once.

Hint: use your frequency method to do some of the work

Ex:
	Input:
		aaaaabcccdeeff

	Output:
		bd
     */
    public static String uniqueCharacters(String word){
        String unique="";
        String checked="";
        for (int i = 0; i <word.length() ; i++) {
            if(checked.contains(""+word.charAt(i))){
                continue;
            }
         int count=0;
            checked+=word.charAt(i);
           // int count=StringUtil.frequencyOfCharacter(word,word.charAt(i));
            char letter1=word.charAt(i);
            for (int j = 0; j <word.length() ; j++) {
                char letter2=word.charAt(j);
                if(letter1==letter2){
                    count++;
                }

            }
            if(count==1){
                unique+=word.charAt(i);
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        System.out.println(uniqueCharacters("hiillaalu"));
    }

}
