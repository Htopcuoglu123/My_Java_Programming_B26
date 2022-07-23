package day64_functional_Interface.InterviewProjects;

public class DivideWithoutOperator {
    /*
     Numbers - Divide without / operator
Write a method that can divide two numbers without using division operator
     */
    public static int result(int num1,int num2){
       int count=0;
       while(num1>num2){
           num1=num1-num2;
           count++;
       }
       return count;
    }

    public static void main(String[] args) {
        System.out.println("result:"+result(18,4));
    }
}
