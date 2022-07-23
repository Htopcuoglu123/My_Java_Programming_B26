package day35b_methods;
import my_utilities.ArrayUtil;

import java.util.Arrays;

public class UsingArrayUtil {
    public static void main(String[] args) {
        int[]a={3,2,4,5,73,8,32,89,23};
        System.out.println(ArrayUtil.maxNum(a));
        System.out.println(ArrayUtil.minNum(a));
        System.out.println(ArrayUtil.contains(a,12));
    }
}
