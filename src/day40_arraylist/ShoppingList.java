package day40_arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();
        String keepAsking;
        System.out.println(shoppingList.isEmpty() ? "Shopping list is empty" : "You have some items");
        do {
            System.out.println("Enter the item");
            shoppingList.add(input.nextLine());
            System.out.println("Do you want to continue? yes/no");
            keepAsking = input.nextLine();
        } while (keepAsking.equalsIgnoreCase("yes"));

        System.out.println("Shopping List:" + shoppingList.size() + " items");
        for (String item : shoppingList) {
            System.out.println("*\t" + item);
        }
        System.out.println("--------------------------------------------------------");
        System.out.println(shoppingList.contains("water") ? "Water on the list" : "No water on the list");
        System.out.println("Do you want to remove any items?");
        if (input.nextLine().equals("yes")) {
            System.out.println("What item do you want to remove?");
            String removeItem = input.nextLine();//this will either the item name or item index number
            if (Character.isDigit(removeItem.charAt(0))) {//checks the first character of
                // remove item to see if that is a number
                int number = Integer.parseInt(removeItem);//converts the String into int
                shoppingList.remove(number - 1);//converts the number to an index.If the user wants to remove the first item,
                //they would give 1 so to remove the first index 1 -1=0
            }else{
                shoppingList.remove(removeItem);
            }
        }
        System.out.println("Final list: "+shoppingList);
    }
}
