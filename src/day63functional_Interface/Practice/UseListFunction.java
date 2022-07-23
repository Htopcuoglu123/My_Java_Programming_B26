package day63functional_Interface.Practice;

import day54_abstraction.create.Create;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UseListFunction {
    public static void main(String[] args) {
        //   <T, R>
        //   Use ListFunction functional interface to:
        //  1.1 Create a function that can return the maximum number from a list of Integer
        ListFunction<List<Integer>,Integer> maxNumInList= a->{
            int max=a.get(0);
            for (int i = 0; i <a.size() ; i++) {
                if(a.get(i)>max){
                    max=a.get(i);
                }
            }
           // int max=Collections.max(a);--> short way
            return max;

        };
// 1.2 Create a function that can return the minimum number from a list of Integer
        ListFunction<List<Integer>,Integer>minNumInList=nums->{
          int min=nums.get(0);
            for (int each:nums){
                if(each<min){
                    min=each;
                }
            }
            return min;
            //int min=Collections.min(nums);-->short way
        };
//        1.3 Create a function that can return the longest String from a List of String

        ListFunction<List<String>,String>longestString=words->{
            String longest=words.get(0);
            for (String each:words) {
                if(each.length()>longest.length()){
                    longest=each;
                }
            }
            return longest;
        };

//        1.4 Create a function that can return the shortest String from a List of String
        ListFunction<List<String>,String>shortestWord=list->{
            String shortest=list.get(0);
            for (String each:list) {
                if(each.length()<shortest.length()){
                    shortest=each;
                }
            }
            return shortest;
        };

//        1.5 Create a function that can convert List of integer to int array
        ListFunction<List<Integer>,int[]>convertListToArray=nums->{
            int[]nums1=new int[nums.size()];
            for (Integer each:nums) {
                nums1[each]=each;
            }
            return nums1;
        };


//        1.6 Create a function that can convert List of double to double array
        ListFunction<List<Double>,double[]>convertDListToDArray=doubles->{
            double[]doubleArray=new double[doubles.size()];
            for (int i = 0; i <doubles.size() ; i++) {
                doubleArray[i]=i;
            }
            return doubleArray;
        };
        List<Integer>nums= Arrays.asList(23,32,12,45,76,87,98);
        List<Double>dNums=Arrays.asList(12.2,21.5,26.7,13.8,9.0,45.3);
        List<String>words= Arrays.asList("Hilal","Tarkan","YusufSalim","AhmetIlgar");
        System.out.println(maxNumInList.apply(nums));
        System.out.println(minNumInList.apply(nums));
        System.out.println(Arrays.toString(convertDListToDArray.apply(dNums)));
        System.out.println(longestString.apply(words));
        System.out.println(shortestWord.apply(words));



    }
}
