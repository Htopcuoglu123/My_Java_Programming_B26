package day35b_methods;

public class DuplicateCharacters {
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

    public static void main(String[] args) {
        System.out.println(duplicates("beautiful"));
    }
}