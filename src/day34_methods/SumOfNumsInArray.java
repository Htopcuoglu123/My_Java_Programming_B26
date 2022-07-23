package day34_methods;

public class SumOfNumsInArray {
    /*
    Create a method that accept an int array. Take the sum of all the numbers
and print the result
_____________________________
     */
    public static void sumOfNums(int[] nums){
        int sum=0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
        }
        System.out.println(sum);
    }

    public static void main(String[] args)
    {
        int[]nums={30,40,25,55,60,10};
       sumOfNums(nums);
    }
}
