package day30_array;

import java.util.Arrays;

public class SplitExamples {
    public static void main(String[] args) {
        String s="monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String[]days=s.split(",");
        System.out.println(Arrays.toString(days));
        for(String each:days){
            System.out.println(each);
        }
        String[]withOutDay=s.split("day,");
        for(String each:withOutDay){
            System.out.println(each);
        }
        System.out.println();
        String str="Jan-Feb-Mar-Apr-May-Jun-Jul-Aug-Sep-Oct-Nov-Dec";
        String[]months=str.split("-");
        for(String each:months){
            System.out.println(each);
        }
    }
}
