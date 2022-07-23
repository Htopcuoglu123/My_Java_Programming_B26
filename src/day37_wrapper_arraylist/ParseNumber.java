package day37_wrapper_arraylist;

import java.util.Scanner;

public class ParseNumber {
    public static void main(String[] args) {
        String year="2022";

        System.out.println("This year "+year);
        System.out.println("Next year will be "+(year+1));

        int numYear=Integer.parseInt(year);
        System.out.println("This year "+numYear);
        System.out.println("Next year will be "+(numYear+1));

       Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your message:I am x years old");
        String str= scanner.nextLine();//
        //in 5 years you will be $agein5Years

        String agePart=str.split(" ")[2];//another way to do this is below;
        //String arr=str.split(" ");
        //String agePart=arr[2];
        //converts my string into array and taking index [2] which is the number in my array
        int age=Integer.parseInt(agePart);//since this is a part of a string we are converting it to int so we can add 5
        //to find the age after 5 years.
        System.out.println("In five years, you will be "+(age+5));
        /*
        I am x years old
        I am 10 years old
        str.split(" ")-->{"I", "am","10","years","old"}-->arr[2]-->10
         */

    }
}
