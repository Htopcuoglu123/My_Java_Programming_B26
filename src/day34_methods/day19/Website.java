package day34_methods.day19;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the url:");
        String url=scanner.nextLine();
        System.out.println(url.substring(4,url.length()-4));
    }
}
