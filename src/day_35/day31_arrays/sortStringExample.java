package day_35.day31_arrays;

import java.util.Arrays;

public class sortStringExample {
    public static void main(String[] args) {
        String [] arr={"java","Hello","$Dollar","Zell","4four","five5","Zebra","SIX","6six"};
        Arrays.sort(arr);//the elements will be sorted according to ascii table
        //ascii order -special characters
              //      -numbers
             //       -capital letters
            //        -lowercase letters

        System.out.println(Arrays.toString(arr));
    }
}
