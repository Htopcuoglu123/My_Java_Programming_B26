package March29th;

public class Fibonacchi {
/*
   Task 2 : Fibonacci

				Create a method that will give you the Fibonacci numbers up to the x value. Where x is the given parameter.
				Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum of the previous 2 numbers

				Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1, 2nd value is 1, etc

				    Ex:
				        Input:
				            8
				        Output:
				            0, 1, 1, 2, 3, 5, 8, 13, 21
				            index      value
				            0           0
				            1           1
				            2           1 index0+index1
				            3           2 index1+index2
				            4           3 index2+index3
				            5           5 index3+index4
				            6           8 index4+index5
				            7           13 index5+index6
				            8           21 index6+index7





 */
    public static void fibonacchi(int num){
        int num1=0, num2=1;
        int counter=0;
         while(counter>num){
             System.out.println(num1+" ");

             int num3=num1+num2;
             num1=num2;
             num2=num3;
             counter=counter+1;
         }

    }


}
