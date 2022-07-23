package day34_methods;

public class EvenOddNumbers {
    /*
    create a method that can print odd numbers between 1-100 in the
same line saperated by space
create a method that can print even numbers between 1-100 in the
same line saperated by space
     */
    public static void odds(int nums) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }
        public static void evens(int num2){
            for (int i = 0; i <= 100; i++) {
                if (i % 2 ==0) {
                    System.out.print(i+" ");
                }

            }

        }

    public static void main(String[] args) {
        odds(100);
        evens(100);
    }
    }

