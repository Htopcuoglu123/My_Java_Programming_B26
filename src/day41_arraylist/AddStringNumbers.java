package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class AddStringNumbers {
    public static ArrayList<Integer>sumFromString(ArrayList<String>list){
        ArrayList<Integer>sums=new ArrayList();
        for (String each:list) {
            int currentSum = getCurrentSum(each);
            sums.add(currentSum);

        }
        return sums;

    }

    private static int getCurrentSum(String each) {
        int currentSum=0;
        for (String eachDigit: each.split("")) {//I am converting the String, each, to an array by split with an empty space.
            //It means each String will be separated with each character as separate String elements.
            //"123"-->["1","2","3"] and than you loop through that array
            currentSum+=Integer.parseInt(eachDigit);
        }
        return currentSum;
    }

    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<>(Arrays.asList("123","1111","34"));
        System.out.println(sumFromString(list));
    }
}
