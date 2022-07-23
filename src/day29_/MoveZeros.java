package day29_;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {10, 0, 5, 0, 1, 0};
        int[] fixed = new int[nums.length];
        int index = 0;//variable to keep track of indexes of the fixed array
//        for(int i=0;i<nums.length;i++){
//            if(nums[i]!=0){
//                fixed[index++]=nums[i];//reading the element at position i of the nums array and sorting it
//                //into the fixed array and position index.After sorting the value index variable is incremented by 1
//            }
//    }

        //another way to do the same task

            for(int each:nums){
                if(each!=0){
                    fixed[index]=each;
                    index++;
                }
            }

        System.out.println(Arrays.toString(fixed));
    }
}
