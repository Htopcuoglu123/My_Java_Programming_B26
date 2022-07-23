package day54_abstraction.day61_maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>(Arrays.asList(2,5,6,12,35,6,2,5,6,2,3,1,4,5));

        //traditional loop doesnt work because index/elements get shifted so some elements will be skipped
//        for (int i = 0; i <list.size() ; i++) {
//            if(list.get(i)<5){
//                list.remove(i);
//            }
//        }
//        //removing in a for each loop will not work either because the size is changing
//        for(int each:list){
//            if(each<5){
//                list.remove(i);
//            }
//        }

        Iterator<Integer>it= list.iterator();
        while(it.hasNext()){//checks if there is an element next to it. If not stop the loop
            if(it.next()<5){//move to the next element and then return it
                it.remove();//remove the element from the list
            }
        }
        System.out.println(list);
        it= list.iterator();
    }
}
