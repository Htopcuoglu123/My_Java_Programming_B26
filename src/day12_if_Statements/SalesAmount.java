package day12_if_Statements;

import java.util.Scanner;

public class SalesAmount {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("What is your sales amount?");
        double salesAmount= input.nextDouble();
        if(salesAmount<10000){
            System.out.println("Sorry No Bonus!");
        }
        else if(salesAmount>=10000&&salesAmount<15000){
            System.out.println("Great!You will receive $5000 bonus");
        } else {
            System.out.println("Amazing!You will receive $7000 bonus for your hard work!");
        }
    }
}
