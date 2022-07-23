package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArraysPractice1 {
    public static void main(String[] args) {
        ArrayList<String>names=new ArrayList<>();
        System.out.println(names);
        names.add("Tarkan");
        for(int i=0;i<=30;i++){
            names.add("Tarkan"+i);
        }
        System.out.println(names);
        for(int i=20;i<names.size();i++){
            System.out.println(names.get(i));
        }
    }


}
