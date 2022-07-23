package HilalPractice;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the password:");
        String password= scanner.next();
        if(password.length()>=4&&password.endsWith("aa")){
            if(password.charAt(0)>'A'||password.charAt(0)<'Z'){
                System.out.println("You are logged in");
            }
        }else{
            System.out.println("incorrect password");
        }
    }
}
