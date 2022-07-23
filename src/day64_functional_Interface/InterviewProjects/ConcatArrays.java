package day64_functional_Interface.InterviewProjects;

import java.util.Arrays;

public class ConcatArrays {
/*
4) Array - Concat two arrays
Write a return method that can concat two arrays
 */
public static int [] concatArrays (int [] n1, int[] n2){
    int [] concat = new int[n1.length+ n2.length];
    for (int i = 0; i < n1.length; i++) {
        concat[i] = n1[i];

    }
//        int indx = 0;
//        for (int i = n1.length; i < concat.length; i++) {
//            concat[i] = n2[indx];
//            indx++;
//        }

    int index = n1.length;
    for(int each : n2){
        concat[index] = each;
        index++;
    }

    return concat;
}

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concatArrays(new int[] {1,2,3}, new int[] {4,5,6})));
    }
}

