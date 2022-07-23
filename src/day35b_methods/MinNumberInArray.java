package day35b_methods;

import java.util.Arrays;

public class MinNumberInArray {
    /*
    Min Number

create a method that will accept an int array and return the smallest number from the array

     */
    public static int  minNum(int[]nums){
        int min=nums[0];
        Arrays.sort(nums);
        return  min;
        //for(int num:nums){
        //if(num<min){
        //min=num;
        //return min;
    }

    public static void main(String[] args) {
        int [] nums={34,21,45,53,12,19,20};
        System.out.println(minNum(nums));
    }
}
