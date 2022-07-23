package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class StringNumsToSum {
    public static ArrayList<Integer> summedNums(ArrayList<String>nums) {
       ArrayList<Integer>result=new ArrayList<>();

        for (String each : nums) {
            int sum = 0;
            for (int i = 0; i < each.length(); i++) {
                sum += Character.getNumericValue(each.charAt(i));
            }
            result.add(sum);
        }
      return result;
    }

    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>(Arrays.asList("123", "34", "513", "245"));
        System.out.println(summedNums(nums));
    }
}