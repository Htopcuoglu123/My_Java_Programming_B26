package day30_array;

public class LongestPalindrome {
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
        String[] words = {"java", "longer word", "civic", "apple", "racecar", "mom", "anna"};
        String longestPalindrome="";
        //outer loop is iterating through the array
        for(String each:words){

           boolean isPalindrome=true;
           //inner loop is iterating through each word
           for(int i=0;i<each.length()/2;i++){
               if(each.charAt(i)!=each.charAt(each.length()-1-i)){
                   isPalindrome=false;
                   break;
               }
           }
           if(isPalindrome&&each.length()>longestPalindrome.length()){
               longestPalindrome=each;
           }

        }
        System.out.println(longestPalindrome.isEmpty()?"No Palindrome":longestPalindrome);

        }
    }




