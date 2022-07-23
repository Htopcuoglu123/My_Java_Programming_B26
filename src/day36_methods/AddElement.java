package day36_methods;

import java.util.Arrays;

public class AddElement {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = addElement(a, 4);
        System.out.println(Arrays.toString(b));

        int [] y={5,23,6,21};
        int []z={3,23,6};
        System.out.println(Arrays.toString(addElement(y,z)));
    }

    public static int[] addElement(int[] original, int elementToAdd) {
        int[] newArray = new int[original.length + 1];
        for (int i = 0; i < original.length; i++) {
            newArray[i] = original[i];

        }
        //instead of doing a loop ourselves we could have used Arrays.copyOf()
        newArray[newArray.length - 1] = elementToAdd;
        return newArray;
    }

    public static String[] addElement(String[] original, String element) {
        return null;
    }


    public static int[] addElement(int[] original, int[] elementsToAdd) {
        int[] newArray = new int[original.length + elementsToAdd.length];
        for (int i = 0, j = 0; i < newArray.length; i++) {//we cannot do j++ here j will be increased
            // at the same time as i increased
            if (i < original.length) {
                //add the elements from original array to the new array
                newArray[i] = original[i];
            } else {
                //add the new elements to the new array
                newArray[i] = elementsToAdd[j++];
            }

        }

        return newArray;
    }
}
