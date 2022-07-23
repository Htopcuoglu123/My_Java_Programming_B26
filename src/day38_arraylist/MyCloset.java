package day38_arraylist;

import java.util.ArrayList;

public class MyCloset {
    public static void main(String[] args) {
        ArrayList<String> myCloset=new ArrayList<>();
        myCloset.add("Hat");
        myCloset.add("Shoes");
        myCloset.add(1,"Jacket");
        myCloset.add(0,"Towel");
        myCloset.add(1,"Car");
        System.out.println(myCloset);

    }
}
