package day11_if_statements;

import java.util.Scanner;

public class CheckHunger {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Are you hungry? true/false");
        boolean isHungry=scan.nextBoolean();
//        boolean isHungry=true;
        if(isHungry){
            System.out.println("You are hungry so I will get some food for you");
        }else{
            System.out.println("Great,than practice Java");
        }
    }
}
