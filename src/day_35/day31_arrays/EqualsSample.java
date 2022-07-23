package day_35.day31_arrays;

import java.util.Arrays;

public class EqualsSample {
    public static void main(String[] args) {
        int[] a={1,2,3};
        int[] b={1,2,3};
        int[] c=a;
        //another option
        //boolean isEqual=Arrays.equals(a,b);
        //System.out.println(isEqual);
        System.out.println(Arrays.equals(a,b));
        int [] d={3,2,1};
        System.out.println(Arrays.equals(a,d));//false since the order of the elements are different
    }
}
