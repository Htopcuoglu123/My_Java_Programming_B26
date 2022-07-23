package day35b_methods;

import java.util.Arrays;

public class MaxNumber {
    /*
    Max Number

create a method that will accept an int array and return the biggest number from the array

     */
    public static int maxNum(int[]nums){
    Arrays.sort(nums);
    return nums[nums.length-1];
    //int max=nums[0];
    //for(int num:nums){
        //if(num>max){
        //max=num;
        //return max;
}

    public static void main(String[] args) {
        int [] nums={34,21,45,53,12,19,20};
        System.out.println(maxNum(nums));
    }
}

