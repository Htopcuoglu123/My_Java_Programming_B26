package day64_functional_Interface.InterviewProjects;

import java.util.Arrays;

public class ReverseArray {
    /*
     Write a method that will take an array as an argument and reverse it.
     */
   // public static void main(String[] args) {
//       int[]arr={13,12,4,53,22};
//       int j=arr.length-1;
//        for (int i = 0; i <arr.length/2 ; i++) {
//            int temp=arr[i];
//            arr[i]=arr[j-i];
//            arr[j-i]=temp;
//        }
//        System.out.println(Arrays.toString(arr));
        public static int[]reversed(int[]nums){
            int j=nums.length-1;
            for (int i = 0; i <nums.length/2 ; i++) {
                int temp=nums[i];
                nums[i]=nums[j-i];
                nums[j-i]=temp;
            }
            return nums;
        }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6};
        System.out.println(Arrays.toString(reversed(nums)));
    }
}
