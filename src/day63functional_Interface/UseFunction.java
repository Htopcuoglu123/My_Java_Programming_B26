package day63functional_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class UseFunction {
    public static void main(String[] args) {
        //<T, R> T refers to the return type and R refers to the parameter
        Function<int[], List<Integer>>convertArrayToList=(nums)->{
            //  List<Integer>list=new ArrayList<>(Arrays.asList());I cannot use this because ArrayList
            //  does not store int type which is a primitive type
            List<Integer>list=new ArrayList<>();
            for (int each:nums) {
                list.add(each);
            }
            return list;
        };

        int[]a={32,5,12,5};
        List<Integer>list=convertArrayToList.apply(a);//Function uses apply
        System.out.println(list);
    }
}
