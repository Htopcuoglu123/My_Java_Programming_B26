package my_utilities;

public class StringUtil {
    /*
    reverse
    create a method that will accept a String and return the reversed version
     */

    public static String reverse(String str){
        String reversed="";
        for (int i = str.length()-1; i>=0 ; i--) {
            reversed+=str.charAt(i);

        }
        return reversed;
    }
    public static int frequencyOfCharacter(String word,char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {


            if (word.charAt(i)==letter) {
                count++;
            }

        }
        return count;
    }
    /*
    Fix Format

create a method will accept a String and return a String in proper format. Proper format is:
First character starting as uppercase and the rest as lowercase

Ex:
	Input:
		jamES

	Output:
		James
     */
    public static String fixFormat(String word){
        word=word.toLowerCase();
        return word.substring(0,1).toUpperCase()+word.substring(1);
    }


    public static String camelCase(String sent){
        sent=sent.toLowerCase().trim();
        String fixed=sent.substring(0,1)+"";
        for (int i = 1; i <sent.length() ; i++) {
            if(sent.charAt(i-1)==' '){
                fixed+=sent.substring(i,i+1).toUpperCase();

            }else{
                fixed+=sent.charAt(i);
            }

        }

        return fixed.replace(" ","");
    }

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
        for (int i = 0; i <word.length() ; i++) {
            int count=0;
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

    /*
  Duplicate Characters

create a method that will accept a word(String) and return a String with all the duplicate characters. A character is duplicate if it only appears in the String multiple times

Hint: use your frequency method to do some of the work

Ex:
  Input:
      aaaaabcccdeeff

  Output:
      acef
   */
    public static String duplicates(String word) {
        String duplicate="";
        String checked = "";
        for (int i = 0; i < word.length(); i++) {

            if (!checked.contains(word.charAt(i) + "")) {


                int count = 0;
                for (int j = 0; j < word.length(); j++) {
                    if (word.charAt(i) == word.charAt(j)) {
                        count++;
                    }
                }
                checked += word.charAt(i);
                if (count >= 2) {
                    duplicate+=word.charAt(i);

                }

            }


        }
        return duplicate;
    }

}
