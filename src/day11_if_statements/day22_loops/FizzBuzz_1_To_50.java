package day11_if_statements.day22_loops;

public class FizzBuzz_1_To_50 {
    public static void main(String[] args) {
        int num = 0;
        while (num <50) {
            num++;


            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println("FizzBuzz");

            }
            else if (num % 3 == 0) {
                    System.out.println("Fizz");

                }
            else if(num%5==0){
                System.out.println("Buzz");

            }
            else{
                System.out.println(num);
            }

            }
            }


        }



