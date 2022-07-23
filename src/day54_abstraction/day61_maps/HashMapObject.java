package day54_abstraction.day61_maps;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {
        //keys are Integer and values are String
        Map<Integer,String>map=new HashMap<>();
        map.put(1,"one");
        map.put(3,"three");
        map.put(10,"ten");
        map.put(5,"five");
        map.put(2,"two");
        System.out.println(map);//hashmap element order is random.Even though it looks like it is sorted,
        // it is not insertion order or sorted

        //read the key/value from map
        System.out.println(map.get(10));//it will check the map, find the key that is 10 and return the value.
        //so the 10 argument is the key not the index number
        String value=map.get(5);
        System.out.println(value);
        map.remove(1);
        System.out.println(map);
        System.out.println(map.containsKey(1));//returns true or false
        System.out.println(map.containsKey(3));
        System.out.println(map.containsValue("five"));
        System.out.println(map.containsValue("10"));//we have 10 as key not as value, so it will return false
        map.put(null,null);
        System.out.println(map);
        map.put(null,"hello world");//null key exist, the value will be updated to hello world
        System.out.println(map);
        map.put(3,"March");//3 key exist, the value gets updated to March
        System.out.println(map);
        map.put(7,"March");//we can have duplicate of value but not the key
        System.out.println(map);



    }
}
