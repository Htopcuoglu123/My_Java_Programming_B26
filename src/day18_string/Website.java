package day18_string;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the website url:");
        String webSite= scanner.next();
        webSite=webSite.toLowerCase();
        boolean validStart=webSite.startsWith("www.");

        boolean validEnd=webSite.endsWith(".com")||webSite.endsWith(".edu")||webSite.endsWith(".gov")||webSite.endsWith(".net");

        if(validStart&&validEnd){
            System.out.println(webSite+" is a valid website");
        }
        else{
            if(!validStart) {
                System.out.println(webSite + " needs to start with www.");
            }
            if(!validEnd){
                System.out.println("Website url needs to end with .com or .edu or .gov or.net");

            }
        }
    }
}
