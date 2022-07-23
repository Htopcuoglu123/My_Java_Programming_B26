package day32_multiDimensionalArrays;

import java.util.Arrays;

public class BinarySearchExample {
    public static void main(String[] args) {
        int[]nums={4,10,30,100};

        System.out.println(Arrays.binarySearch(nums,4));//in order for this method to work array must be sorted!
        System.out.println(Arrays.binarySearch(nums,100));
        System.out.println(Arrays.binarySearch(nums,200));//it is not in the array but if it was it would be in index 5 so it will show -5
       // so whenever the number doesn't exist it will show a negative number
        System.out.println(Arrays.binarySearch(nums,6));//if 6 was in the array it would be in index 2 so the result will be -2


    }
}
