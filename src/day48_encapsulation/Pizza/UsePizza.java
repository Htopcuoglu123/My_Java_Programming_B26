package day48_encapsulation.Pizza;

import day48_encapsulation.Pizza.Pizza;

public class UsePizza {
    public static void main(String[] args) {
        Pizza pizza1=new Pizza("small",-5);
        System.out.println(pizza1);
        //pizza1.numOfToppings();we cannot do that
        // because it is a private variable
        pizza1.setNumOfToppings(2);

        Pizza pizza2=new Pizza("medium",-2);
        System.out.println(pizza2);
        pizza2.setNumOfToppings(3);
        pizza2.setSize("large");
        System.out.println(pizza2);

    }
}
