package day_35.day31_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class NameIntoCharAr {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your name?");
        String name= scanner.next();
        char [] lettersOfName=name.toCharArray();
        System.out.println(Arrays.toString(lettersOfName));
        System.out.println("What is your last name?");
        String lastName= scanner.next();
        char []letterOfLast=lastName.toCharArray();
        System.out.println(Arrays.toString(letterOfLast));


    }
}
