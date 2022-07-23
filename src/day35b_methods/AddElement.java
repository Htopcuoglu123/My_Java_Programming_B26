package day35b_methods;

import java.util.Arrays;

public class AddElement {
    /*
    Add Element

create a method that will accept an int array and an int number.
 Return an array with the given number added to the end of the array
     */
    public static int[] addElement(int[]nums,int num){

        int[]expand= Arrays.copyOf(nums,nums.length+1);
        expand[nums.length]=num;
        return expand;
    }

    public static void main(String[] args) {
        int[]nums={1,2,3,4,5,6,7};
        int num=8;
        System.out.println(Arrays.toString(addElement(nums,num)));
    }
}
