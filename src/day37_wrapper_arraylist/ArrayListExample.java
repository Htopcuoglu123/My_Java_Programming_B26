package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        System.out.println(numbers);
        numbers.add(100);//adds the number to the end of the arrayList
        System.out.println(numbers);
        numbers.add(-100);
        System.out.println(numbers);
        numbers.add(50);
        numbers.add(23);
        System.out.println(numbers);

        //how to access each element in arrayList?
        numbers.get(0);//will return the element in the first index
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(1));
      //System.out.println(numbers.get(30));//if the arrayList is not that long it will show out of bounds notice

        //How do you know how many elements in the arrayList?
        //numbers.size();
        System.out.println(numbers.size());
    }
}
