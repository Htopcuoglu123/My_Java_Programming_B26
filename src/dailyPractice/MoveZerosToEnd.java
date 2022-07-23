package dailyPractice;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(moveZeros(new int[]{2,0,0,4,3,0,9,0,1})));
        System.out.println(Arrays.toString(sortedDescending(new int[]{2, 4, 3, 9, 1, 0, 0, 0, 0})));

    }
    public static int[]moveZeros(int[]arr){
       int[]moveZeroes=new int[arr.length];
        int index=0;
        for (int each:arr) {
            if(each!=0){
               moveZeroes[index]=each;
                index++;
            }
        }
        return moveZeroes;
    }
public static int[]sortedDescending(int[]movedZeros){
        int min=movedZeros[0];
    for (int i = 0; i <movedZeros.length ; i++) {
        for (int j = i+1; j <movedZeros.length ; j++) {
            if(movedZeros[i]!=0&&movedZeros[i]<movedZeros[j]){
                min=movedZeros[i];
                movedZeros[i]=movedZeros[j];
                movedZeros[j]=min;

            }
        }
    }
    return movedZeros;
}

}
