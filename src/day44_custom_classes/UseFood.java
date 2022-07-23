package day44_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;

public class UseFood {
    public static void main(String[] args) {

       ArrayList<String>startsWithA=new ArrayList<>();
       ArrayList<String>over20=new ArrayList<>();

        Food food1=new Food("milk",8,3.50);
        System.out.println(food1);
        Food food2=new Food("Apples",3,1.99);
        System.out.println(food2);
        Food food3=new Food("Bread",11,3.85);
        System.out.println(food3);
        Food food4=new Food("Avocado",9,2.99);
        System.out.println(food4);
        Food[]foods={food1,food2,food3,food4};

        for(int i=0;i<foods.length;i++){
            if(foods[i].name.startsWith("A")){
                startsWithA.add(foods[i].name);
            }
        }

        for(int i=0;i<foods.length;i++){
            if(foods[i].totalPrice>20){
                over20.add(foods[i].name);

            }
        }

        System.out.println("Foods that starts with a: "+startsWithA);
        System.out.println("Foods that costs more than $20: "+over20);
        }


    }

