package day39_arraylist;

import java.util.ArrayList;

public class AddAndRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Computer");
        list.add("Screen");
        list.add("mouse");
        list.add("keyboard");

        list.remove(0);
        String item = list.remove(0);//since remove method returns
        // the item that is removed we can assign it to a string if we want
        System.out.println(item);
        System.out.println(list);

        boolean bool=list.remove("mouse");
        System.out.println(bool);
        System.out.println(list);
    }
}
