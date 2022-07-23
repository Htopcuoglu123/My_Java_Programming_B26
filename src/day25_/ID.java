package day25_;

import java.util.Scanner;

public class ID {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your first name");
        String first= scanner.nextLine().toLowerCase().trim();
        System.out.println("Enter your last name");
        String last= scanner.nextLine().toLowerCase().trim();
        String iD=first.substring(0,1)+last.substring(0,1).toUpperCase()+last.substring(1,3);
        //String id=first.substring(0,1);
        //id+=last.substring(0,1).toUpperCase()+last.substring(1,3);
        //id+=first.length()*2;
        //System.out.println(id)
        System.out.println("ID:"+iD+(first.length()*2));
    }
}
