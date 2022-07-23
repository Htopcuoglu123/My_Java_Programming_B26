package day63functional_Interface;

import java.util.function.Predicate;

public class UsePredicate {
//Represents a function which takes one argument (any object) and returns boolean
//predicate is one parameter and boolean return
    public static Predicate<String> isPalindrome = str -> {
        String reverse = new StringBuilder(str).reverse().toString();//The object type is StringBuilder,
        // so we use toString method to convert it to String
        // reverse() is a built-in method of StringBuilder class(it is a mutable String)
        return str.equals(reverse);
    };
    public static Predicate<Integer> isPrime = n -> {
        if(n==0||n==1)return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    };

    public static Predicate<Integer>isArmstrong=num->{
        int originalNum=num;
        int result=1;
        while(num>1){
            int remainder=num%10;
            result+=remainder*remainder*remainder;
            num=num/10;
        }
        if(originalNum==result){
            return true;
        }else {
            return false;
        }
    };
}

