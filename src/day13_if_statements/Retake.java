package day13_if_statements;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your grade?");
        int grade=scan.nextInt();
        System.out.println("What is the attempt number?");
        int attempt= scan.nextInt();
        if(attempt==1){
            System.out.println("Your final grade is:"+ (grade-grade*.10)+"after the first attempt");
        }
        else if(attempt==2){
            System.out.println("Your final grade is:"+ (grade-grade*.20)+"after the second attempt");

        }
        else if(attempt==3){
            System.out.println("Your final grade is:"+ (grade-grade*.35)+"after the third attempt");
        }
        else
            System.out.println("You cannot have more than 3 attempts");
    }
}
