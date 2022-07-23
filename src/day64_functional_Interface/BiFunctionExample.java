package day64_functional_Interface;

import java.util.*;
import java.util.function.BiFunction;

public class BiFunctionExample {
    public static void main(String[] args) {
        //compare two numbers and return the biggest one
        //first two types are the parameter types and the third one is the return type
        BiFunction<Integer,Integer,Integer>maxNum=(one,two)->{
            return one>two?one:two;
        };
        System.out.println(maxNum.apply(5, 2));


        /*
        List<Integer> -->keys->first parameter
        List<String>--->values-->second param
        Map<Integer,String>  --> final map that will be returned
         */


        //this function will take two lists(numbers and names) and combine them together in a new List
       BiFunction<List<Integer>,List<String>,Map<Integer,String>>createMap=(keys,values)->{
           Map<Integer,String>map=new HashMap<>();
           for (int i = 0; i <keys.size() ; i++) {
               map.put(keys.get(i),values.get(i));

           }
           return map;
       };
       List<Integer>keys=new ArrayList<>(Arrays.asList(1,2,3,4));
       List<String>values=new ArrayList<>(Arrays.asList("James","Ana","Gina"));
        System.out.println(createMap.apply(keys,values));
    }
}
