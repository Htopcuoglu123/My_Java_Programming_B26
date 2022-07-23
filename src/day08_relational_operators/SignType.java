package day08_relational_operators;

public class SignType {
    public static void main(String[] args) {
        /*
        Task:
        Declare and assign a number
        I want to know if the number positive, negative or the number 0?
         */

        int a=3;
        boolean isPositive=a>0;
        boolean isZero=a==0;
        boolean isNegative=a<0;
        System.out.println("Is "+a+" positive: "+isPositive);
        System.out.println("Is "+ a+" zero: "+isZero);
        System.out.println("Is "+a+" negative: "+isNegative);
    }
}
