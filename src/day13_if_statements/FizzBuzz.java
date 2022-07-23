package day13_if_statements;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
                Scanner scanner=new Scanner(System.in);
                System.out.println("Please enter a number");
                int number=scanner.nextInt();
                String message=scanner.nextLine();
                if(number%3==0&&number%5==0){
                    message="FizzBuzz";

                }
                else if(number%5==0){
                    message="Buzz";

                }
                else if(number%3==0){
                    message="Fizz";

                }
                else{
                    System.out.println(number);
                }
        System.out.println(message);

            }
}
