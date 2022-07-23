package day12_if_Statements.day20_strings;

import java.util.Scanner;

public class OfficeHourCarpetShop {
    public static void main(String[] args) {
     Scanner scanner=new Scanner(System.in);
        System.out.println("Which room do you need carpet for?\n\tList of rooms:\n\t\tBedroom\n\t\tKitchen");
        String roomType= scanner.nextLine().toLowerCase();
        boolean isValid=roomType.equals("bedroom")||roomType.equals("kitchen");
        double area=0;
        double unitPrice=3.92;

        if(isValid){
            System.out.println("Calculating.......");

            switch(roomType){
                case"bedroom":
                    System.out.println("Please enter your "+roomType+" dimensions");
                    double width= scanner.nextDouble();
                    double length=scanner.nextDouble();
                    area=width*length;
                    break;
                case "kitchen":
                    System.out.println("Please enter your "+roomType+" dimensions");
                    double radius=scanner.nextDouble();
                    area=radius*radius*3.14;
                    break;
            }
            double totalCost=unitPrice*area;
            scanner.nextLine();
            System.out.println("Please enter your address:");
            String address= scanner.nextLine();
            System.out.println("Total cost for your carper is "+totalCost+" It will be delivered to your home at "+address);
            } else {
            System.out.println("invalid room type");
        }
        }
    }


