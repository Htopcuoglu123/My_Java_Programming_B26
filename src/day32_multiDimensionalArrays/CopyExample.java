package day32_multiDimensionalArrays;

import java.util.Arrays;

public class CopyExample {
    public static void main(String[] args) {
        int [] a={1,2,3};
        int [] b=a;//b is a new name but the array is the same one 'a'.Both references/names are pointing
        // to the same array.It does not create a new array.

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        a[0]=100;
        b[1]=200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        int [] z=Arrays.copyOf(a,a.length);//take two arguments; name of the array and the size of the array.
        System.out.println(Arrays.toString(z));//This method creates a new array and copies the values of one
        // array to the new one
        z[0]=500;
        System.out.println("a: "+Arrays.toString(a));
        System.out.println("z: "+Arrays.toString(z));

    }
}
