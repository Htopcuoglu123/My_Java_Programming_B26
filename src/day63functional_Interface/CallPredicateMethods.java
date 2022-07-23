package day63functional_Interface;

public class CallPredicateMethods {
    public static void main(String[] args) {
        //UsePredicate.isPalindrome.test("racecar");will not return anything we need to use it like below
        boolean b= UsePredicate.isPalindrome.test("racecar");
        System.out.println(b);

        System.out.println(UsePredicate.isPalindrome.test("abc"));
        System.out.println(UsePredicate.isPrime.test(23));

        System.out.println(UsePredicate.isArmstrong.test(153));
        //or
        boolean a=UsePredicate.isArmstrong.test(153);
        System.out.println(a);
    }
}
