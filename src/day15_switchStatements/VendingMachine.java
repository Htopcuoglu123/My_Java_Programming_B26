package day15_switchStatements;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
       System.out.println("Welcome to the vending machine. Please select one of the following options:" +
               "\n\tDrinks\n\tSnacks\n\tGum");
       String selection= input.next();
       String item="";
       switch(selection){
           case "Drinks":
               System.out.println("You choose drinks:press a number:\n\t1)Water\n\t2)Soda\n\t3)Juice");
               int drinkNumber= input.nextInt();
               if(drinkNumber==1){
                   item="Water";
               }
               else if(drinkNumber==2){
                   item="Soda";
               }
               else if(drinkNumber==3){
                   item="Juice";

               }
               break;

           case "Snacks":
               System.out.println("You choose snacks:Press a number:\n\t4)Chips\n\t5)Cookies");
               int snackNum= input.nextInt();
               if(snackNum==4){
                   item="Chips";
               }
               else if(snackNum==5){
                   item="Cookies";
               }
               break;


           case "Gum":
               item="Generic Gum";



       }
        System.out.println("Vending....."+item);


    }
}
