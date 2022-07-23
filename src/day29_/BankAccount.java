package day29_;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {
        /*
        0-full name
        1-account type
        2-account number
        3-balance
         */
        String [] bankAccountOne={"Brad Smith","checking","100219482","100,000,000"};
        System.out.println(bankAccountOne.length);
        System.out.println(Arrays.toString(bankAccountOne));
        System.out.println("Name: "+bankAccountOne[0]);
        System.out.println("Account type: "+bankAccountOne[1]);
        System.out.println("Account number: "+bankAccountOne[2]);
        System.out.println("Balance: "+bankAccountOne[3]);

        String []bankAccount2=new String[4];
        System.out.println(Arrays.toString(bankAccount2));
        bankAccount2[0]="Jamie Fox";
        bankAccount2[1]="Savings Account";
        bankAccount2[2]="123456321";
        bankAccount2[3]="100,000,000";
        System.out.println(Arrays.toString(bankAccount2));



        String[]bankAccountThree=new String[4];
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name");
        String firstName= input.nextLine();
        bankAccountThree[0]=firstName;//we prefer line 36
        System.out.println("Enter your account type");
        bankAccountThree[1]= input.nextLine();// we prefer this way
        System.out.println("Enter your account number");
        bankAccountThree[2]= input.nextLine();
        System.out.println("Enter your balance");
        bankAccountThree[3]= input.nextLine();
        System.out.println(Arrays.toString(bankAccountThree));

        //Most Efficient Way

        String [] bankAccountFour=new String[4];
        String [] questions={"Full Name","Account Type","Account Number","Balance"};
        for(int i=0;i<bankAccountFour.length;i++){
            System.out.println("Enter your "+questions[i]);
            bankAccountFour[i]=input.nextLine();
        }
        System.out.println(Arrays.toString(bankAccountFour));

    }
}
