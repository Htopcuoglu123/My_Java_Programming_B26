package day64_functional_Interface.InterviewProjects;

public class PalindromeEx {
    public static void main(String[] args) {
        String s="tacocat";
        String reverse="";
        for (int i =s.length()-1; i>=0 ; i--) {
            reverse+=s.charAt(i);

        }
        if (reverse.equals(s)) {

            System.out.println("palindrome");
        }else{
            System.out.println("not a palindrome");
        }
        System.out.println(reverse.equals(s)?"Palindrome":"Not a palindrome");
    }
}
