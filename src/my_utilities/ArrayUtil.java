package my_utilities;

import java.util.Arrays;

public class ArrayUtil {
    /*
    Min Number

create a method that will accept an int array and return the smallest number from the array

     */
    public static int  minNum(int[]nums){
        int min=nums[0];
        Arrays.sort(nums);
        return  min;
        //for(int num:nums){
        //if(num<min){
        //min=num;
        //return min;
    }
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

//finding the index of an element in String array
    public static int indexOf(String[]str,String element){
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(element)){
                return i;
            }
        }
        return -1;
    }
    //finding the index of an element in int array
    public static int indexOf(int [] nums,int element){
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==element){
                return i;
            }
        }
        return -1;
    }
    //Adding a new element to the array
    public static int [] addElement(int[]original,int elementToAdd){
        int[]newArray=new int[original.length+1];
        for (int i = 0; i <original.length ; i++) {
            newArray[i]=original[i];

        }
        //instead of doing a loop ourselves we could have used Arrays.copyOf()
        newArray[newArray.length-1]=elementToAdd;
        return newArray;
    }
    public static int[] addElement(int[] original, int[] elementsToAdd) {
        int[] newArray = new int[original.length + elementsToAdd.length];
        for (int i = 0, j = 0; i < newArray.length; i++) {//we cannot do j++ here j will be increased
            // at the same time as i increased
            if (i < original.length) {
                //add the elements from original array to the new array
                newArray[i] = original[i];
            } else {
                //add the new elements to the new array
                newArray[i] = elementsToAdd[j++];
            }

        }

        return newArray;
    }

}


