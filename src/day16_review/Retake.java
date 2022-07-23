package day16_review;

import java.util.Scanner;

public class Retake {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is your original grade?");
        int grade= scanner.nextInt();
        System.out.println("What is your attempt number?");
        int attemptNumber=scanner.nextInt();
        boolean validattempts=true;
        if(attemptNumber==1){
            grade=grade-(int)(grade*0.1);

        }
        else if(attemptNumber==2){
            grade-=grade*.20;
        }
        else if(attemptNumber==3){
            grade-=grade*.35;
        }
        else{
            validattempts=false;
            System.out.println("Not valid attempt number");
        }
        if(validattempts) {
            System.out.println("Your final grade is " + grade);
        }

    }
}
