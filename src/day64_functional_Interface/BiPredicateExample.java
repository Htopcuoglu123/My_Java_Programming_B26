package day64_functional_Interface;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args) {
        BiPredicate<Integer[],Integer>contains=(arr,num)->{
            for (int each:arr) {
             if(each==num){
                 return true;//if this if statement is ever true then my array contain the number
                 // that we were looking for so we return true
             }
            }
            return false;//if the loop finishes and compares the number with every number in array
            // the array does not contain the num, returning false
        };
        Integer[]arr={4,5,12,10,24};
        System.out.println(contains.test(arr,12));
        System.out.println(contains.test(arr,50));
        System.out.println(contains.test(arr,4));
        System.out.println(contains.test(arr,43));

        BiPredicate<String,String>anagram=(one,two)->{
            char[]oneArr=one.toCharArray();
            char[]twoArr=two.toCharArray();
            Arrays.sort(oneArr);
            Arrays.sort(twoArr);
            return Arrays.equals(oneArr,twoArr);
        };
        System.out.println(anagram.test("listen","silent"));
    }
}
