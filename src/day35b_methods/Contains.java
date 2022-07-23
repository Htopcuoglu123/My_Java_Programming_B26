package day35b_methods;

import java.util.Arrays;

public class Contains {
    /*
    Contains

create a method that will accept an int array and an int number. Check and return if the given number is in the array.
     */
    public static boolean contains(int[] nums, int num){

       Arrays.sort(nums);
       int result=Arrays.binarySearch(nums,num);
            return  result>0;
            //return false;
        //for(int each:muns){
      //  if(each==num){
       // return true;
        }


    public static void main(String[] args) {
        int[]nums={12,23,13,4,54,67,78,42};
        int num=12;
        System.out.println(contains(nums,num));
    }
}
