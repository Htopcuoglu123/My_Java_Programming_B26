package day32_multiDimensionalArrays;

import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("How many numbers do you want to start with?");
        int size=input.nextInt();
        int[]nums=new int[size];
        for (int i = 0;  i<nums.length ; i++) {
            System.out.println("Enter a number");
            nums [i]=input.nextInt();

        }
        System.out.println("Arrays so far: "+Arrays.toString(nums));
        int[]expanded=Arrays.copyOf(nums,nums.length+1);
        System.out.println("Enter the last number");
        expanded[expanded.length-1]=input.nextInt();
        System.out.println(Arrays.toString(expanded));
        int [] narrowed=Arrays.copyOf(nums,nums.length-1);
        System.out.println(Arrays.toString(narrowed));

    }
}
