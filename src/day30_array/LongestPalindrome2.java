package day30_array;

public class LongestPalindrome2 {
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
    public static void main(String[] args) {
        String[] words = {"java", "longer word","apple","mom","anna","civic","racecar"};

        String longestPalindrome="";
        for(int i=0;i<words.length;i++){
            String reversed="";
            for (int j =words[i].length()-1; j>=0; j--) {
                reversed+=words[i].charAt(j);

            }
            if(words[i].equals(reversed)&&reversed.length()>longestPalindrome.length()){
                longestPalindrome=reversed;
           }
        }

        System.out.println(longestPalindrome);
    }
}
