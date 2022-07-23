package day13_if_statements;

public class classCalculator {
    public static void main(String[] args) {
        int num1=20;
        int num2=5;
        char operator='+';
       if(operator=='+'){
           System.out.println(num1+num2);
       }
        else if(operator=='-'){
           System.out.println(num1-num2);

       }
        else if(operator=='*'){
           System.out.println(num1*num2);
       }
        else if(operator=='/'){
           System.out.println(num1/num2);

        }
        else{
           System.out.println("invalid operator");
       }

    }
}
