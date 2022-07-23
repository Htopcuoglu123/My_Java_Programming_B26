package day23_loops.day26_nested_loops;

import java.util.Scanner;

public class PracticePrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int countPrime = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                countPrime++;
            }
        }
        if (countPrime == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
}
