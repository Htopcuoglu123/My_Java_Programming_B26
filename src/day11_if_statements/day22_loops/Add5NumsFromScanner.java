package day11_if_statements.day22_loops;

import java.util.Scanner;

public class Add5NumsFromScanner {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        int repNumber=1;
        int total=0;
        while(repNumber<=5){
            System.out.println("Please enter number "+repNumber);
            repNumber++;

            total+=input.nextInt();
        }
        System.out.println(total);

        }

    }

