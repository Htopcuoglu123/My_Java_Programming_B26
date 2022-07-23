package dailyPractice;

import java.util.Arrays;

public class sortAscending {
    public static int[]sortAscending(int[]arr){
        int max=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j =i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    max=arr[i];
                    arr[i]=arr[j];
                    arr[j]=max;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortAscending(new int[]{3,1,6,3,9,0,4,2,8})));
    }
}
