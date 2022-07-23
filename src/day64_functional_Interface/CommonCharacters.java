package day64_functional_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class CommonCharacters {
    /*
    Use BiFunction functional interface to:
        1.1 Create a fucntion that can returns the common characters of two strings
                ex: str1 = "Python"
                    str2 = "Wooden Spoon"

                output: on

     */
    public static void main(String[] args) {
        BiFunction<String,String,String>commonChars=(str1,str2)->{

            String common="";
            for (int i = 0; i <str1.length() ; i++) {

                for (int j = 0; j <str2.length() ; j++) {
                    if(str1.charAt(i)==str2.charAt(j)&&(!common.contains(str1.charAt(i)+""))){
                        common+=str1.charAt(i);
                    }
                }
            }
            return common;
        };
        System.out.println(commonChars.apply("hilal","tarkan"));

        // 1.2 Create a function that can return the common elements of two Lists of Integers
        BiFunction<List<Integer>,List<Integer>,List<Integer>>commonInList=(list1,list2)->{
          List<Integer>commons=new ArrayList<>();
            for (int i = 0; i <list1.size() ; i++) {
                for (int j = 0; j <list2.size() ; j++) {
                    if(list1.get(i)==list2.get(j)&&!commons.contains(list1.get(i))){
                        commons.add(list1.get(i));
                    }
                }
            }
            return commons;
        };
        List<Integer>list1=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        List<Integer>list2=new ArrayList<>(Arrays.asList(2,7,8,9,3,1,1));
        System.out.println(commonInList.apply(list1,list2));
    }
}
