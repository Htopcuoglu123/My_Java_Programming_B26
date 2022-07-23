package day11_if_statements;

import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        //  Create a double value for the account balance.
        //    Create a double value for how much you want to withdraw
        //
        //    Check the balance after the withdrawal
        //        if you tried to withdraw more money that you had in the account
        //        add a negative overdraft fee to the balance
        //
        //    In both cases print the remaining balance after withdrawing,
        //    with overdraft fee applied if you went over
        Scanner input=new Scanner(System.in);
        System.out.println("How much money you have in your account?");
        double accountBalance= input.nextDouble();
        System.out.println("How much money would you like to withdraw?");
        double withdraw=input.nextDouble();
        double newBalance=accountBalance-withdraw;
        if(withdraw<accountBalance){
            System.out.println("You have $"+newBalance+" left in your account");

        }else{
            System.out.println("Took too much money so $100 Overdraft fee applied");
            System.out.println("Your balance is $"+(newBalance-100));

        }
    }
}
