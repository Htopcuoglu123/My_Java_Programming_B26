package day32_multiDimensionalArrays;

import java.util.Scanner;

public class Age {
    public static void age (int birthYear){
        System.out.println("You are "+(2022-birthYear)+" years old");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your birthyear?");
//        int birthyear= scan.nextInt();
//        age(birthyear);
        age(scan.nextInt());
        System.out.println();
        age(2000);
    }

}
