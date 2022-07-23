package day_35.day31_arrays;

import java.util.Arrays;

public class ArraysIntro {
    /*
Write a program that accepts start and end numbers. Given start and end
          numbers, return a new array containing the sequence of integers from start up to
          but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].

                Input:
                        start = 5    end = 10
                Output
                        int[] a → [5, 6, 7, 8, 9]
                Input:
                        start = 11    end = 18
                Output
                        int[] b → [11, 12, 13, 14, 15, 16, 17]

     */
    public static void main(String[] args) {
       int start=11;
       int end=18;
       int [] newArray=new int[end-start];//end number(18)-start(11)=7 so the length is 7
        for (int i = 0; i < newArray.length; i++) {
           newArray[i]=start++;

        }
        System.out.println(Arrays.toString(newArray));
//increase all value of element by 1
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=1;
        }
        System.out.println(Arrays.toString(newArray));
        // same thing with for each loop
        for (int each :newArray) {//for each loop does not give any permission to do any change on the value so the numbers will
            //print the same value

            each+=1;
            //each is a temporary variable so it will not affect the values we can just use for each loop to
            // read the values from left to right

        }
        System.out.println(Arrays.toString(newArray));

    }

}
