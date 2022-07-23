package day60_collections;

import java.util.*;

public class SetVsList {
    public static void main(String[] args) {
        List<Integer>list=new ArrayList<>();
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println("First: " + list.get(0));
        System.out.println("Last: " + list.get(list.size() - 1));

        Set<Integer>set=new HashSet<>();
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);
        set.add(4);
        System.out.println(set);
//        System.out.println("First: " + set.get(0));
//        System.out.println("Last: " + set.get(set.size() - 1));
//         Set does not have index numbers

// because Set does not have indexes we can use loop to go through the elements
        for(int each:set){
            System.out.println(each);
        }

        //sort my HashSet
        System.out.println(new TreeSet<>(set));//this will sort my list from smallest to largest

        //converting list to set
        System.out.println(new LinkedHashSet<>(list));

        System.out.println(new HashSet<>(Arrays.asList(1,5,2,1,4,2,5,1)));//asList method return List
        // type which can have the reference of the collection interface
        // so we are able to make an object of HshSet with these initial values

        String s="aaabbbcccdddeee";
        //converted String to ArrayList by splitting it.That Array is the argument of the Arrays.asList method

        //than converted it back to String
        //than replaced the unwanted elements
        System.out.println(new HashSet<>(Arrays.asList(s.split(""))).toString()
                .replace(" ,","")
                .replace("[","")
                .replace("]",""));


        /* above we convert the String s to an array
            that array is the argument of the Arrays.asList method()
               that array is converted to as List type which is allowed in the HashSet constructor
               because List is a Collection and Collection is the parameter type
               convert the Hashset - which removed the duplicates, to a String and did String manipulation

         */


    }
}
