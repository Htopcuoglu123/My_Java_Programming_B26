package day32_multiDimensionalArrays;

import java.util.Arrays;

public class AverageOfEachTraditional {
    public static void main(String[] args) {
        int [] [] nums={
                {3,4,5,6},
                { 7,8,9},
                {10,11,12,13},
                {20,21,23,25,26}
        };
        double total=0;
        int totalLength=0;
        for(int i=0;i<nums.length;i++){//going through the 2D array
            double sum=0;
            for(int j=0;j<nums[i].length;i++){
                sum+=nums[i][j];
            }
            System.out.println(Arrays.toString(nums[i])+"the average is: "+(sum/nums[i].length));
            total+=sum;
            totalLength+=nums[i].length;
        }
        System.out.println("Average of my whole 2D array: "+(total/totalLength));
        /*
        int [][] nums={
        {3,4,5,6},
        { 7,8,9},
        {10,11,12,13},
        {20,21,23,25,26}
        };
        int i=0
        int j=0'
        nums[i][j]
        nums[0][0]->3
        nums[0][1]->4
         */
    }
}
