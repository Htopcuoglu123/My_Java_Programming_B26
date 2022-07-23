package day32_multiDimensionalArrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {
        int [] n={5,10,20,10};
        int [] m={5,10,100,39,19};

        int [][] all={n,m};
        System.out.println(Arrays.toString(all));//this would not work for multi arrays
        System.out.println(Arrays.deepToString(all));
        System.out.println("First array: "+Arrays.toString(all[0]));//to print the first array separately
        System.out.println("Second array: "+Arrays.toString(all[1]));//to print the second array separately
        System.out.println();
        int [][] multi={
                {90,80,70},//index 0 array
                {19,51,1129,12},//index 1 array
                {10,1900},//index 2 array
                {14}//index 3 array
        };
        System.out.println(multi.length);
        System.out.println(multi[0].length);//to get the length of the first array
        System.out.println(multi[0][1]);//to get the index 1 of the first array
        System.out.println(multi[3].length);
    }
}
