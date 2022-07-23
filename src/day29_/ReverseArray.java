package day29_;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int []reverse=new int[arr.length];
//        for(int i=arr.length-1,j=0;i>=0;i--,j++){
//
//            reverse[j]=arr[i];
//        }

        for(int i=0;i<arr.length;i++){
            reverse[arr.length-1-i]=arr[i];

        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));
        /*
          i=0
          reverse[arr.length-1-i]=arr[i];
          reverse[5-1-0]=arr[0];
          reverse[4]=arr[0]

          i=1
          reverse[arr.length-1-i]=arr[i];
          reverse[5-1-1]=arr[1];
          reverse[3]=arr[1]

          i=2
          reverse[arr.length-1-i]=arr[i];
          reverse[5-1-2]=arr[2];
          reverse[2]=arr[2]


         */
    }
}
