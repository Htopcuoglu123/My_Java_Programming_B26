package day14_if_statemnts;

import java.util.Scanner;

public class TernaryExample {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        String biggerNumber=(num1>num2)?"Num1 is bigger":"Num2 is bigger";
        System.out.println(biggerNumber);

        System.out.println("Is it weekend?");
        boolean isWeekend= scanner.nextBoolean();
        boolean Weekend=(isWeekend)?true:false;
        System.out.println(isWeekend);

        System.out.println("______________________________________________________________");

        int age=16;
        boolean oldEnough=(age>=18)?true:false;
        System.out.println("Is old enough?:"+oldEnough);
        System.out.println("___________________________________________________");
        int timeLeft=30;
        boolean enoughTime=(timeLeft==60)?true:false;
        System.out.println("Is there enough time?:"+enoughTime);


    }
}
