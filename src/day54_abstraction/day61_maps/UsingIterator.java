package day54_abstraction.day61_maps;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UsingIterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("james");
        names.add("emre");
        names.add("bruce");
        System.out.println(names);

        //we basically created a pin and it is places before the first element not on the first element yet
        Iterator<String> it = names.iterator();//this allows us to create a pin
        //to move it to the first element we do this
        System.out.println(it.next());//move the pin and return the element
        System.out.println(it.next());//move the pin and return the element
        System.out.println(it.next());//move the pin and return the element
        //System.out.println(it.next());//there was no 4th element so exception happened

        Set<String> subjects = new HashSet<>();
        subjects.add("Math");
        subjects.add("ELA");
        subjects.add("Science");
        subjects.add("PE");
        subjects.add("Comp.Science");
        System.out.println(subjects);

        Iterator<String> subjNames = subjects.iterator();
        if (subjNames.hasNext()) {
            System.out.println(subjNames.next());
            System.out.println(subjNames.next());
            System.out.println(subjNames.next());
            System.out.println(subjNames.next());
            System.out.println(subjNames.next());
        }
    }
}


