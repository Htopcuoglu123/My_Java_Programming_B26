package march22nd;

import java.util.Arrays;
/*
  Create a method that can print out the combination of two integer arrays
                int[] array1 = {1,2,3,4};
                int[] array2 = {5,6,7,8,9,10};

                Output:   [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
 */

public class MergeTwoArrays {


    public static void main(String[] args) {
        int []array1={1,2,3,4};
        int []array2={5,6,7,8,9,10};

       mergeTwoArrays(array1,array2);

    }

    public static void mergeTwoArrays(int[] array1, int[] array2) {
        int[]arr3=new int[array1.length+array2.length];
        int i=0;
        for (int each:array1) {
            arr3[i++]=each;
            /*
        arr3[0]=1
        arr3[1]=2
        arr3[2]=3
        arr3[3]=4
         */

        }
        for (int each:array2) {
            arr3[i++]=each;
        }

        System.out.println(Arrays.toString(arr3));

    }
}
