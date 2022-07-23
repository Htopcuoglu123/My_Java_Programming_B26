package day15_switchStatements;

import java.util.Scanner;

public class JoinArmy {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you a citizen?");
        boolean isCitizen= scanner.nextBoolean();
        System.out.println("Are you a resident?");
        boolean isResident=scanner.nextBoolean();
        System.out.println("Do you have a high school diploma?");
        boolean hasHighDip= scanner.nextBoolean();
        System.out.println("Please enter your age:");
        int age= scanner.nextInt();

        if((isCitizen||isResident)&&hasHighDip&&(age>=18&&age<=35)){
            System.out.println("You are qualified for the army");

        }else{
            if(!isCitizen&&!isResident){
                System.out.println("You need to be a citizen or a resident");
            }
            if(age<18||age>35){
                System.out.println("Your age needs to be between 18 and 35");
            }
            if(!hasHighDip){
                System.out.println("You must to have a high school diploma to join the army");
            }

        }
    }

}
