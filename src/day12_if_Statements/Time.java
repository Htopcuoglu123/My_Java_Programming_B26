package day12_if_Statements;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What time is it using 24 hour format?");
        int time= scan.nextInt();
        if(time>=6&&time<=11){
            System.out.println("Good morning!");
        }
        if(time>=12&&time<=16){
            System.out.println("Good evening!");

        }
        if(time>=17&&time<=23){
            System.out.println("Good night!");
        }
    }
}
