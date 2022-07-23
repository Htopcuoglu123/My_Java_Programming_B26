package dailyPractice;

import java.util.Arrays;

public class sortDescending {
    public static int[]sortDescending(int[]arr){
        int min=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]<arr[j]){
                    min=arr[i];
                    arr[i]=arr[j];
                    arr[j]=min;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortDescending(new int[]{2,5,9,1,4,8,3,10})));
    }
}
