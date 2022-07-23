package day64_functional_Interface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {
        BiConsumer<String,Integer>printNTimes=(str,n)->{
            for (int i = 0; i <n ; i++) {
                System.out.println(str);
            }
        };
        printNTimes.accept("java",5);
        printNTimes.accept("selenium",7);

        Map<String,Integer>map=new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);
        map.forEach((key,value)->{
            System.out.println(key+" "+value);
        });
        //for Each is a  method  defined in map interface which allows
        // you to define the BiConsumer implementation  ypu want to execute with the keys and values.
       // Internally it uses foreach loop to iterate through the entry set
        map.forEach((key,value)->{
            System.out.println(value+key.length());
        });


    }
}
