package day28_array;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {
        double [] arr = new double[4];//size is fixed to 4 now. We cannot add more than 4 elements in this array
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        arr[0]=30.99;
        System.out.println(Arrays.toString(arr));
        arr[1]=12.55;
        arr[2]=10.20;
        arr[3]=5;
        System.out.println(Arrays.toString(arr));

        //Reassigning
        arr[2]=2000;
        System.out.println(Arrays.toString(arr));
        arr=new double[5];//we did not reassigned.This creates a new array with 5 elements and reassigns
        // the arr reference the new object below
        System.out.println(Arrays.toString(arr));
    }
}
