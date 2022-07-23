package day_35.day31_arrays;

import java.util.Arrays;

public class sortExample {
    public static void main(String[] args) {
        // in this code there is only one object and it is nums.Line 10 does not make a new object.This is another reference to it.
        // If we print nums and notSorted they will both print the same thing.
        //we have only two ways of creating an array and line 10 is not one of them.
        int[]nums={3,6,2,68,32,-2,24};
        int [] notSorted=nums;//this is not creating another array
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //Max and Min from Array
        System.out.println("Min: "+nums[0]);
        System.out.println("Max: "+nums[nums.length-1]);
    }
}
