package day38_arraylist;

import java.util.ArrayList;

public class ClassroomTwo {
    public static void main(String[] args) {
        ArrayList<String>group=new ArrayList<>();
        group.add("Ziba");
        System.out.println(group);
        group.add(0,"Victor");
        System.out.println(group);
        group.add("Ozi");
        System.out.println(group);
        group.add(1,"Hilal");
        System.out.println(group);
        System.out.println(group.add("Tarkan"));//this will return boolean type true(which os hardcoded in JDK) and if I print it again
        // I will see the result that have "Tarkan" at the end of the ArrayList.
        System.out.println(group);
    }
}
