package day64_functional_Interface;

import java.util.Arrays;
import java.util.function.BiPredicate;
//1.1 Create a function that can check if two array are equal and contains the same elements
////        ex: arr1 = {3,2,1}
////        arr2 = {2,1,3}
////        output: true

public class ArraysEqualOrNot {
    public static void main(String[] args) {
        BiPredicate<Integer[], Integer[]>isEqual=(arr1,arr2)->{
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);
        };
      Integer[]arr1={1,2,3,4};
      Integer[]arr2={3,2,4,1};
        System.out.println(isEqual.test(arr1,arr2));


        /*
        1.2 Create a function that can check if the first array contains all the elemnts of the second array:
                ex: arr1 = {1,2,3,4,5,6}
                    arr2 = {7,8}

                output: false
         */
        BiPredicate<Integer[],Integer[]>contains=(nums1,nums2)->{
            int num=0;
            for (int i = 0; i <nums1.length ; i++) {
                for (int j = 0; j <nums2.length ; j++) {
                    if(nums1[i]==nums2[j]){
                        num++;
                    }
                }
            }
            return(num==nums2.length)?true:false;

        };
        Integer[]nums1={1,2,3,4,5,6,7};
        Integer[]nums2={8,0,9,7,2};
        System.out.println(contains.test(nums1,nums2));
    }
}
