package day64_functional_Interface.InterviewProjects;

import java.util.Scanner;

public class OddEven {
    /*
    1) Numbers - odd & even
Write  a method which can identifies given number is even or odd
EX:
identify(5) ->  "Odd"
identify(6) ->  "Even"
     */
    public static String oddOrEven(int num){

        String result="";
            if(num%2==0){
               return "Even number";
            }else{
                return "Odd number";
            }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter a number");
        int number=scanner.nextInt();

        System.out.println(oddOrEven(number));
    }
}
