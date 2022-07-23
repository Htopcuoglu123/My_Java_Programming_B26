package collectionsPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Remove100AndAboveFromArrayList {
    /*
    Given an ArrayList of numbers, remove all the numbers more than 100
- Think about how many different ways you can do this
     */
    public static void main(String[] args) {
        ArrayList<Integer>nums=new ArrayList<>(Arrays.asList(123,23,76,234,111,101,100,98,99,109,102));
        for (int i = 0; i <nums.size() ; i++) {
            if(nums.get(i)>100){
                nums.remove(nums.get(i));
            }
        }
        System.out.println(nums);
        Iterator<Integer>removed=nums.iterator();
        while(removed.hasNext()){
            if(removed.next()>100){
                removed.remove();
            }
        }
        System.out.println(nums);

    }
}
