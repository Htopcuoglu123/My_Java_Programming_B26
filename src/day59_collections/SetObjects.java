package day59_collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    //Set;
    //duplicates not allowed
    //insertion order is not maintained
    //does not have index
    public static void main(String[] args) {
        Set<String>set=new HashSet<>();
        //maintains random order
        //accepts null value
        set.add(null);
        set.add("hello");
        set.add("$4.5");
        set.add("hello");
        set.add("%");
        System.out.println(set);

        Set<String>set2=new LinkedHashSet<>();
        //maintains the insertion order
        //accepts null values
        set2.add(null);
        set2.add("hello");
        set2.add("$4.5");
        set2.add("hello");//nothing is changed, duplicate not allowed
        set2.add("%");
        System.out.println(set2);

        Set<String>set3=new TreeSet<>();

       // set3.add(null);null is not allowed in ThreeSet
        set3.add("hello");
        set3.add("$4.5");
        set3.add("hello");//nothing is changed, duplicate not allowed
        set3.add("%");
        set.add("WORLD");
        System.out.println(set3);


    }
}
