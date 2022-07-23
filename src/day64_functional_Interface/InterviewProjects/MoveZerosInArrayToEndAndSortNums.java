package day64_functional_Interface.InterviewProjects;

import java.util.Arrays;

public class MoveZerosInArrayToEndAndSortNums {
    /*
    3) Array - Move Zeros to the End
Write a method that can move all the zeros to  last indexes of the array (Do Not Use Sort Method)
Ex:
input:  {1,0,2,0,3,0,4,0};
output: [1, 2, 3, 4, 0, 0, 0, 0]
     */
    public static int [] moveZerosAndSort (int [] nums){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp = 0;
                if (nums[i] > nums[j]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        int [] moveZero = new int[nums.length];
        int index = 0;
        for(int each : nums) {
            if (each != 0) {
                moveZero[index] = each;
                index++;
            }
        }
        return moveZero;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZerosAndSort(new int [] {1,3,0, 8,0,2,0})));


    }
}




