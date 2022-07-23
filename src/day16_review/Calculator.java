package day16_review;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number one");
        double num1=scanner.nextDouble();
        System.out.println("Pick an operator?");
        String operator=scanner.next();
        System.out.println("Enter number two");
        double num2=scanner.nextInt();
        double result=0;
        boolean validCalc=true;
        switch(operator){
            case "+":
                result=num1+num2;
                break;
            case "-":
                result=num1-num2;
                break;
            case "*":
                result=num1*num2;
                break;
            case "/":
                if(num2!=0) {
                    result = num1 / num2;
                }else{
                    System.out.println("Cannot divide by zero");
                    validCalc=false;
                }
                break;
            case "%":
                if(num2!=0) {
                    result = num1 % num2;
                }else{
                    System.out.println("Cannot divide by zero");
                    validCalc=false;
                }
                break;
            default:
                validCalc=false;
                System.out.println(operator+" is not a valid operator for this calculator");


        }
        if(validCalc) {
            System.out.println(num1 + "" + operator + "" + num2 + "=" + result);
        }


    }
}
