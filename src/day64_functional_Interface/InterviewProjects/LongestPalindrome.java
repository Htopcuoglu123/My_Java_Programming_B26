package day64_functional_Interface.InterviewProjects;

public class LongestPalindrome {
    public static void main(String[] args) {
       /*
        [IQ] Longest Palindrome
        Given a String array. Find the longest Palindrome String in your array.
        Ex:
        Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
        Output: racecar
        Ex:
        Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
        Output: No palindrome
     */
        String[]s= {"java","longer word","apple","mom","anna","civic","racecar"};

        String longestPalindrome="";

        for (int i = 0; i <s.length; i++) {

            String reverse="";

            for (int j=s[i].length()-1; j>=0; j--) {

                reverse+=s[i].charAt(j);

            }

            if(s[i].equals(reverse)&&reverse.length()>longestPalindrome.length()){
                longestPalindrome=reverse;

            }

        }
        System.out.println(longestPalindrome);
    }
}
