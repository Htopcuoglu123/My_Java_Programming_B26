package day54_abstraction.day61_maps;

import day42_custom_Classes.Item;

import java.util.HashMap;
import java.util.Map;

public class MapPractice {
    public static void main(String[] args) {
        Map<String,Double>groceryShopping=new HashMap<>();
        groceryShopping.put("Milk",3.99);
        groceryShopping.put("OliveOil",5.75);
        groceryShopping.put("Apple",1.50);
        groceryShopping.put("Bread",2.99);
        groceryShopping.put("Gum",1.99);
        groceryShopping.put("Candy",3.25);
        System.out.println(groceryShopping);

        System.out.println("Items that starts with or has 'a': ");
        for (String each:groceryShopping.keySet()){
            if(each.startsWith("a")||each.contains("a")){
                System.out.println(each);
            }
        }
        System.out.println("Items that costs more than 1.99: ");
        for (Double each:groceryShopping.values()){
            if(each>=1.99){
                System.out.println("Price"+each);
        }


            System.out.println();
            for (Map.Entry<String,Double>entry:groceryShopping.entrySet())
                  {
                      System.out.println(entry.getValue()+entry.getKey());

            }


        }
    }
}
