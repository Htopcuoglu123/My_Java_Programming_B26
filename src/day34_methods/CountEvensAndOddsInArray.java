package day34_methods;

import java.util.Arrays;

public class CountEvensAndOddsInArray {
    /*
    Create a method that accepts an int array. Count how many even and odd
numbers there is. Print an array at the end where the first element is how
many even numbers there was and the second element in the number of odd
elements
Ex:
input: ( {1, 2, 3, 4}) -> [ 2, 2 ]
input: ( {1, 3, 5, 2}) -> [ 1, 3 ]
     */
    public static void countEvensAndOdds(int[]nums){
        int oddsCount=0;
        int evensCount=0;
        for (int i = 0; i <nums.length ; i++) {

            if(nums[i]%2==0){
                evensCount++;
            }else if(nums[i]%2==1){
                oddsCount++;
            }
        }
        int[]evensAndOdds={evensCount,oddsCount};
        System.out.println(Arrays.toString(evensAndOdds));
    }

    public static void main(String[] args) {
     int []nums={1,2,3,4,5,6,7,8,9,10,11,12,20,30};
        countEvensAndOdds(nums);
    }
}
