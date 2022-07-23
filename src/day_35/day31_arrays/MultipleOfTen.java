package day_35.day31_arrays;

import java.util.Arrays;

public class MultipleOfTen {
    /*
    Write a program that accepts and array. For each multiple of 10 in the given array, change all
          the values following it to be that multiple of 10, until encountering another multiple of 10.

           Input  :
           int[] newArray = {5, 4, 40, 1, 60, 2, 30, 34, 70, 43, 2,80,67};

           Output :         [5, 4, 40, 40, 60, 60, 30, 30, 70, 70, 70, 80, 80]
     */
    public static void main(String[] args) {
        int[] newArray = {5, 4, 40, 1, 60, 2, 30, 34, 70, 43, 2,80,67};
        int factor=0;

        for (int i = 0; i <newArray.length ; i++) {

            if(newArray[i]%10==0){
                factor=newArray[i]/10;
            }
            if(factor>0){
                newArray[i]=factor*10;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
