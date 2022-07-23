package day62_maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        Map<String,Double>store=new HashMap<>();
        store.put("water",1.5);
        store.put("coffe",2.5);
        store.put("apples",0.99);
        store.put("bread",2.35);
        store.put("cucumber",3.89);
        System.out.println("Store inventory");
        for (String key:store.keySet()){//returns the set of keys, then we use those keys to get info from map
            System.out.println("\tItem: "+key+"for $"+store.get(key));//using get method from the map to get the value
            //based on the key
        }
        //another way by using getValue() method
//        for (Map.Entry<String,Double>each:store.entrySet()){
//            System.out.println("\tItem: "+each.getKey()+"for $"+each.getValue());//get value method
//            is the method from the Entry
        //which gives value of the current entry
//        }

        System.out.println(store.values());

        Scanner scanner=new Scanner(System.in);
        System.out.println("WHat item do you want?");
        String item=scanner.next();

        System.out.println(store.containsKey(item)?item+" is in stock for $"+store.get(item):"Not available in the store");
    }
}
