package day32_multiDimensionalArrays;

import java.util.Arrays;

public class Recap {
    public static void main(String[] args) {
        int [] arr={30,90,60,360,180};
        int [] arr2={180,360,30,90,60};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("Before sorting: "+Arrays.equals(arr,arr2));
        Arrays.sort(arr);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr2));
        System.out.println("After sorting: "+Arrays.equals(arr,arr2));
        String [] words={"hello","java","Saturday"};
        System.out.println(String.join(" ",words));
        String sent="Today is a beautiful rainy Saturday";
        System.out.println(Arrays.toString(sent.split(" "))); //returns String array
        System.out.println(Arrays.toString(sent.toCharArray()));//returns char array
    }
}
