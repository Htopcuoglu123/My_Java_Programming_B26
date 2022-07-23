package day12_if_Statements.day20_strings;

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your first name: ");
        String firstName= scanner.next();
        firstName=firstName.trim().toLowerCase();
        String fixedFirst=firstName.substring(0,1).toUpperCase();
        fixedFirst+=firstName.substring(1);

        System.out.println("Enter your last name: ");
        String lastName=scanner.next();
        lastName=lastName.trim().toLowerCase();
        lastName.substring(0,1).toUpperCase();
        String fixedLast=lastName.substring(0,1).toUpperCase()+lastName.substring(1);
        System.out.println(fixedFirst+" "+fixedLast);



    }
}
