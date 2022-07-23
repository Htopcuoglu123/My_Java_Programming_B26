package day65_streams;

import day54_abstraction.create.Create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class Recap {
   // /1.1 Create a function that can check if two array are equal and contains the same elements
   //        ex: arr1 = {3,2,1}
    //        arr2 = {2,1,3}
    //        output: true
    public static void main(String[] args) {
        BiPredicate<int[],int[]>arraysEqual=(arr1,arr2)->{
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return  Arrays.equals(arr1,arr2);
        };
        int[]arr1={3,2,1};
        int[]arr2={2,1,3};
        System.out.println(arraysEqual.test(arr1,arr2));

         /*
        1.2 Create a function that can check if the first array contains all the elemnts of the second array:
                ex: arr1 = {1,2,3,4,5,6}
                    arr2 = {7,8}

                output: false
         */

        BiPredicate<int[],int[]>firstContains=(array1,array2)->{
            for (int outer:array2) {
                boolean check=false;
                for (int inner:array1) {
                    if(outer==inner){
                        check=true;
                        break;
                    }
                }
                if(!check){
                    return false;//because the number was not in the first array
                }
            }
            return true;
        };
        int[]arr3 = {1,2,3,4,5,6};
        int[]arr4 = {7,8};
        System.out.println(firstContains.test(arr3,arr4));

//merge two arrays into a list
        //first two generics are for the parameters
        //last generic is for the return type
        //1,2,3
        //4,5,6
        BiFunction<int [], int [],List<Integer>>mergeToList=(array1,array2)->{
            List<Integer>list=new ArrayList<>();
            for (int i = 0; i <array1.length ; i++) {
                list.add(array1[i]);
                list.add(array2[i]);
            }
            return list;
        };
        int[]arr5={1,2,3};
        int[]arr6={4,5,6};
        System.out.println(mergeToList.apply(arr5,arr6));
    }
}
