package day13_if_statements;

import java.util.Scanner;

public class Diver {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is the oxygen level?");
        int oxLevel=scan.nextInt();
        // String message;
        if(oxLevel>90){
            System.out.println("Your tank is full");
            //message="Your tank is full";
        }
        else if(oxLevel>80){
            //message="Still OK";
            System.out.println("Still OK");
        }
        else if(oxLevel>70){
            //message="Don't go too far";
            System.out.println("Don't go too far");
        }
        else if(oxLevel>60){
            //message="Start to head back";
            System.out.println("Start to head back");
        }
        else if(oxLevel>50){
            //message="Be careful!Now you are at 50!";
            System.out.println("Be careful!Now you are at 50%!");
        }
        else{
            //message="You do not have enough oxygen!Make sure your oxygen tank is full!";
            System.out.println("You do not have enough oxygen!Make sure your oxygen tank is full!");
        }
        //System.out.println(message);

    }
}
