package day64_functional_Interface.InterviewProjects;

public class Reverse {
    /*
    5) String - Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */
    public static String reverse(String s){
        String reverse="";
        for (int i = s.length()-1; i>=0 ; i--) {
            reverse+=s.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        System.out.println(reverse("hilal"));
    }
}
