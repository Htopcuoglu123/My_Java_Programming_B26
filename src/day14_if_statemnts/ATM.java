package day14_if_statemnts;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("***Welcome to ATM***/\nPlease enter your card and then enter your pin number");
        int pinCode= input.nextInt();
        int expectedPin=1234;
        if(pinCode==expectedPin){
            System.out.println("Logged in");
            System.out.println("Please select an option");
            System.out.println("\t1:Check balance");
            System.out.println("\t2:Withdraw");
            System.out.println("\t3:Deposit");
           int option=input.nextInt();
           if(option==1){
               System.out.println("Your current balance is $10_000_000");
           }
           else if(option==2){
               System.out.println("Please enter the amount you want to withdraw:");
               double withdrawAmount= input.nextDouble();
               System.out.println("Withdrawing:$"+withdrawAmount);
           }
           else if(option==3){
               System.out.println("Please deposit your money");
           }
           else{
               System.out.println("Invalid selection. Exiting the account");
           }
        }else{
            System.out.println("Invalid pin code. Please try again!");
        }

    }
}
