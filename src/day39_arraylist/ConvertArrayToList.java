package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {
        Integer[]arr={1,2,3};//We made an Integer array because ArrayList does not accept primitive types
        Arrays.asList(arr);//converts the array to a collection type(ArrayList)

        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(arr));//creating an arrayList with values from a collection type
        System.out.println(nums);

        //better way to da that is;
        //Creating an ArrayList with some initial values

        //This is the one that we will use;
        ArrayList<Integer> other=new ArrayList<>(Arrays.asList(4,5,6,7));
        System.out.println(other);
        ArrayList<String>words=new ArrayList<>(Arrays.asList("Hilal","Tarkan","Ahmet","Yusuf"));
        System.out.println(words);

    }
}
