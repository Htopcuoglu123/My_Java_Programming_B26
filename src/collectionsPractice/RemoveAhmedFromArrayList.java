package collectionsPractice;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class RemoveAhmedFromArrayList {
    /*
    Given an ArrayList of names, remove all the names that are 'Ahmed'
- Think about how many different ways you can do this
     */
    public static void main(String[] args) {
     ArrayList<String> names = new ArrayList<>(Arrays.asList("Ali", "Ahmed","Ahmed","Ahmed", "Ayse", "Turgut", "Salim", "Ahmed","Ahmed", "Yusuf", "Ahmed","Ahmed"));
//       for (int i = 0; i <names.size() ; i++) {
//            names.remove("Ahmed");
//      }
//         System.out.println(names);
//
//        System.out.println();

        Iterator<String>list=names.iterator();
        while(list.hasNext()){
            if(list.next().equals("Ahmed")){
                list.remove();
            }
        }
        System.out.println(names);

  }
}
