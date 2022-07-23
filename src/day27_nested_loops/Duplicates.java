package day27_nested_loops;

public class Duplicates {
    public static void main(String[] args) {
        /*
        Given a String, find and print the duplicate characters. A character is duplicate if it appears more than once in the String.

Ex:
    Input:
        AAABCCDEEF
    Output:
        ACE

    -> the characters A C and E are found in the String multiple times so they are duplicates
         */
        String s="AAABCCDEEF";
        String unique="";
        for (int i = 0; i <s.length() ; i++) {
            int count=0;
            for (int j = 0; j <s.length() ; j++) {
                if (s.charAt(j) == s.charAt(i)) {
                    count++;
                }
            }
            if(count>1&&!unique.contains(""+s.charAt(i))){
                unique+=s.charAt(i);

            }

        }

        System.out.println(unique);
    }
}
