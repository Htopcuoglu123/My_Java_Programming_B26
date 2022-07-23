package day43_custom_classes;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        int remains=amount;
        for(int i=0;i<3;i++){

            remains-=(remains*0.10);
        }
        System.out.println(remains);
    }
}
