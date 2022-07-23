package day27_nested_loops;

public class UniqueCharacters3 {
    /*
     Unique characters

Given a String, find and print the unique characters. A character is unique if it only appears once in the String.

Ex:
	Input:
		AAABCCDEEF
	Output:
		BDF

	-> the characters B D and F are only found in the String once so they are unique
     */
    public static void main(String[] args) {

        String str="AAABCCDEEF";
        for (int i = 0; i <str.length() ; i++) {

            char letter=str.charAt(i);
            int count=0;
            for (int j = 0; j <str.length() ; j++) {

                char inner=str.charAt(j);
                //System.out.println(letter+" - "+inner );
                if(letter==inner){
                    count++;
                }

            }
            if(count==1){//counter will be one when the character occurs only one time in the string. If the character show more than once
                //the counter will show 2 or more.
                System.out.print(letter);
            }

        }



    }




}
