package day15_switchStatements;

import java.util.Scanner;

public class Browser {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your browser");
        String browser= input.nextLine();
        System.out.println("Please enter your url:");
        String url= input.nextLine();
        switch(browser){
            case "chrome":
            case "Chrome":
                System.out.println("Opening "+url+" in the Chrome browser");
                System.out.println("Loading...");
                break;
            case "safari":
            case "Safari":
                System.out.println("Opening "+url+"in safari browser");
                System.out.println("Loading...");
                break;


            case"Firefox":
            case"firefox":
                System.out.println("Opening "+url+"in Firefox browser");
                System.out.println("Loading...");
                break;
            default:
                System.out.println(browser+" is not a valid browser");

        }
    }
}
