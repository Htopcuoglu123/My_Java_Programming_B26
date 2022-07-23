package day14_if_statemnts;

import java.util.Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age=scanner.nextInt();
        String message="";
        if(age>=0&&age<=120){
            if(age<=2&&age>=0){
                message="Baby";
            }else if(age>=3&&age<=5){
                message="Toddler";
            }else if(age>=6&&age<=9){
                message="Kid";
            }else if(age>=10&&age<=12){
                message="Pre-teen";
            }else if(age>=13&&age<=17){
                message="Teenager";
            }else if(age>=18&&age<=17){
                message="Young adult";
            }else if(age>=21&&age<=35){
                message="Adult";
            }else if(age>=35&&age<=55){
                message="Middle aged adult";
            }else if(age>=55){
                message="Senior citizen";
            }

        }else{
            System.out.println("invalid age");
        }
        System.out.println(message);
    }
}
