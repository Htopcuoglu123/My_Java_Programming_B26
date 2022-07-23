package day64_functional_Interface.InterviewProjects;

import java.util.Arrays;

public class MaxNumInArray {
    //5.Array -- Find Maximum
    //Write a method that can find the maximum number from an int Array
    public static int max(int[]nums){
        int max=nums[0];
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]>=max){
                max=nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[]nums={21,455,56,3323,64,78,4,344,5644,5463};
        System.out.println(max(nums));
    }
}
