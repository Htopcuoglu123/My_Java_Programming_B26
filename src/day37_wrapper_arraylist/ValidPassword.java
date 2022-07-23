package day37_wrapper_arraylist;

import java.util.Scanner;

public class ValidPassword {
    public static void main(String[] args) {
        /*
        Valid Password

	Given a String password find out if it is a valid password

	Requirements:

		Must have at least 8 characters
		Must have at least 1 uppercase letter
		Must have at least 1 lowercase letter
		Must have at least 1 number
		Must have one of the follow special characters:
			! @ # $ % ^ & *
         */
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your 8 digit password");
        String password=scanner.next();
        int countLower=0;
        int countUpper=0;
        int digit=0;
        int countSpecs=0;
        if(password.length()>=8){

            for (int i = 0; i <password.length() ; i++) {
                char letter=password.charAt(i);
                if(Character.isUpperCase(letter)){
                    countUpper++;
                }
                else if(Character.isLowerCase(letter)){
                    countLower++;
                }
                else if(Character.isDigit(letter)){
                    digit++;
                }else {
                    countSpecs++;
                }
            }
            if(countLower>=1&&countUpper>=1&&countSpecs>=1){
                System.out.println("Correct password!Your page is loading");
            }
        }else{
            System.out.println("Invalid password");
        }

    }
}
