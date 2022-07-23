package day54_abstraction.day61_maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMapObjects {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap<>();
        map.put("saim","java");
        map.put("hello","world");
        map.put("james","bond");
        map.put("aysun","ui testing");
        map.put("nadir","soft skills");
        map.put("username","password");
        map.put(null,"nothing");
        System.out.println(map);


        Map<String,String>linked=new LinkedHashMap<>();
        linked.put("saim","java");
        linked.put("hello","world");
        linked.put("james","bond");
        linked.put("aysun","ui testing");
        linked.put("nadir","soft skills");
        linked.put("username","password");
        linked.put(null,"nothing");
        System.out.println(linked);

        Map<String,String>treeMap=new TreeMap<>();
        treeMap.put("saim","java");
        treeMap.put("hello","world");
        treeMap.put("james","bond");
        treeMap.put("aysun","ui testing");
        treeMap.put("nadir","soft skills");
        treeMap.put("username","password");
       // treeMap.put(null,"nothing");//TreeMap does not accept null as a key
        System.out.println(treeMap);
    }
}
