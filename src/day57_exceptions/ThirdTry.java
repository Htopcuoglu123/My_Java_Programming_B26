package day57_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThirdTry {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

            try{
                System.out.println("Enter a number");
                int num= input.nextInt();
                System.out.println("Enter number 2");
                int num2= input.nextInt();
                System.out.println(num/num2);
            }catch (InputMismatchException e){
                e.printStackTrace();//shows the exception message in the console
            }catch(ArithmeticException e){
                System.out.println(e.getMessage());//returns only brief information about the exception
            }finally {//this block will run we get exception is handled or not
                System.out.println("Finally block");
                input.close();//for properly closing the scanner method,we won't be
                // able to use the scanner method after closing it
            }
        System.out.println("Done");

    }
}
