package day10_scanner;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Approach 2
        System.out.println("Please enter 3 angle numbers");
         */
        System.out.println("Please enter an angle number:");
        double angle1= scan.nextDouble();
        System.out.println("Please enter your second angle number:");
        double angle2=scan.nextDouble();
        System.out.println("Please enter your last angle number:");
        double angle3=scan.nextDouble();
        double sum=angle1+angle2+angle3;
        boolean isTriangle=sum==180;
        boolean isCircle=sum==360;
        //second approach
        //boolean isTriangle=angle1+angle2+angle3==180;
        //boolean isCircle=angle1+angle2+angle3==360;
        System.out.println("Using the numbers you entered do you have a triangle: "+isTriangle);
        System.out.println("Do you have a circle: "+isCircle);
    }
}
