package day29_;

import java.util.Arrays;

public class OneHundredArray {
    public static void main(String[] args) {
        int [] arr=new int[100];
        for(int i=0;i<arr.length;i++){

            arr[i]=i+1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
