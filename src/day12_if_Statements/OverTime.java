package day12_if_Statements;

import java.util.Scanner;

public class OverTime {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your hourly rate?");
        double hourlyRate= scanner.nextDouble();
        System.out.println("How many hours did you work this week?");
        double hoursWorked= scanner.nextDouble();
        double netPay=hoursWorked*hourlyRate;

        if(hoursWorked<=40){
            System.out.println("Your net pay will be $"+netPay);
        }else{
            netPay=40*hourlyRate;
            double overtime=hoursWorked-40;
            double overTimeRate=hourlyRate*1.5;
            double result=netPay+(overtime*overTimeRate);
            System.out.println("Your net pay will be $"+result);
        }

    }

}
