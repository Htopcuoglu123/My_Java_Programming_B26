package day28_array;

import java.util.Arrays;
import java.util.Scanner;

public class SelectMonth {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number for a month 1-12");
        int num= scanner.nextInt();
        String []month={"January","February","March","April","May","June","July","August","September",
                "October","November","December"};

        System.out.println(month[num-1]);//or we can make the first element"" an empty space so the numbers allign

    }
}
