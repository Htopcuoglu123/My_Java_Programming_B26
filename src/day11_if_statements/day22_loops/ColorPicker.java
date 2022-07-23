package day11_if_statements.day22_loops;

import java.util.Scanner;

public class ColorPicker {
    public static void main(String[] args) {
        /*
        You are making some art piece
        this program will help you pick some colors
        flow:ask for a color
        get 3 unique colors by ens
         */
        Scanner input=new Scanner(System.in);
        int numColorsPicked=0;

        String uniqueColors="";

        while(numColorsPicked<3){
            System.out.println("Pick a color");
            String color= input.nextLine();

            if(uniqueColors.contains(color)){
                System.out.println("You already have that color");
            }else{
                uniqueColors+=color+" ";
                numColorsPicked++;

            }

        }
        System.out.println(uniqueColors);
    }
}
