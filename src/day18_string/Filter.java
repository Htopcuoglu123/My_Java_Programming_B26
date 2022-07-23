package day18_string;

import java.util.Locale;
import java.util.Scanner;

public class Filter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your message");
        String message= scanner.nextLine();//String message=scanner.nextLine().toLowerCase().trim();(this is called method chaining
        message=message.toLowerCase();
        message=message.trim();
        boolean isBad=message.contains("java is bad")||message.contains("quit")||message.contains("have fun")||message.contains("crying");
        if(isBad){
            System.out.println("message failed to send");
        }else{
            System.out.println("Message sent");
            //if(message.contains("java is bad")||message.contains("quit")||message.contains("crying")){
            //System.out.println("message failed to send")
        }
    }
}
