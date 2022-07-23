package day34_methods;

public class PalindromeWithMethods {
    /*
    create a method that will accept a String and find if it is
Palindrome or not
     */
    public static void isPalindrome(String word){
        String reverse="";
        for (int i =word.length()-1; i>=0 ; i--) {
            reverse+=word.charAt(i);
        }
        if(word.equals(reverse)){
            System.out.println(word+" is a Palindrome");
        }else{
            System.out.println(word+ " is not a Palindrome");
        }
    }

    public static void main(String[] args) {
        isPalindrome("tacocat");
    }
}
