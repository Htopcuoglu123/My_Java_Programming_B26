package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        String [] items={"Shoes","Jacket","Gloves","Airpods","IPad"};
        //check if items contain jackets etc
        boolean hasJacket=false;

        for(int i=0;i<items.length;i++){
            if (items[i].equalsIgnoreCase("jacket")){
                hasJacket=true;
                break;
            }
        }
        System.out.println(hasJacket?"Jackets in stock":"Jackets out pof stock");
        System.out.println(Arrays.toString(items).toLowerCase().contains("jacket"));


        Scanner input=new Scanner(System.in);
        System.out.println("Which item are you looking for?");
        String item=input.nextLine();
        boolean inStock=false;
        for(int i=0;i<items.length;i++){
            if(items[i].equalsIgnoreCase(item)){
                inStock=true;
                break;
            }
        }
        System.out.println(item+(inStock?" In stock":" Out of stock"));
    }
}
