package day06_arithmetic_operators;

import java.sql.SQLOutput;

public class DifferentTypes {
    public static void main(String[] args) {
        //both int => int

        System.out.println(10-5);
        System.out.println(10*5);

        //double / int=> double

        System.out.println(10.0/3);

        //double / double=> double
        System.out.println(10.0/5.0);

        //int/double=>double

        System.out.println(10/2.5);

        System.out.println((int)(10.0/5.0));//first the division will be done and then  casting will be done to the result

        System.out.println((int)10.5/5);//casting only the first number

        System.out.println((double)10/5);

        byte b1=10;
        byte b2=20;
        byte byteSum=(byte)(b1+b2);

        //byte sum =b1+b2; This will not work because the values get changed to int during the calculation


    }
}
