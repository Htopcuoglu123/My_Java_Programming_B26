package HilalPractice;

public class LongestPalindromeWithForEach {
    public static void main(String[] args) {
        String[]s= {"java","longer word","apple","mom","anna","civic","racecar"};
        String longestPalindrome="";
        String shortest=s[0];
        for(String each:s){
            String reverse="";

            for (int i=each.length()-1;i>=0; i--) {
                reverse+=each.charAt(i);

            }
            if(reverse.equals(each)&&each.length()>longestPalindrome.length()){
                longestPalindrome=each;
            }
            if(reverse.equals(each)&&each.length()<shortest.length()){
                shortest=each;
            }

        }
        System.out.println(longestPalindrome);
        System.out.println(shortest);

    }
}
