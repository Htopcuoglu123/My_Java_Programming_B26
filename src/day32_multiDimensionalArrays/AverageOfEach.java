package day32_multiDimensionalArrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        /*
        given a 2D array find the average of each inner array and extra:average of the whole array
         */
        int [] [] nums={
                {3,4,5,6},
                { 7,8,9},
                {10,11,12,13},
                {20,21,23,25,26}
        };
        double total=0;
        int totalLength=0;
       for(int [] eachArray:nums){
           double sum=0;
           for(int eachNumber:eachArray){
               sum+=eachNumber;
           }
           System.out.println(Arrays.toString(eachArray)+"the average is: "+(sum/eachArray.length));
            total+=sum;
            totalLength+=eachArray.length;
       }
        System.out.println("Average of my whole 2D array: "+(total/totalLength));
    }
}
