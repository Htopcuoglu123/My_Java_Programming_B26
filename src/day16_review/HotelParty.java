package day16_review;

import java.util.Scanner;

public class HotelParty {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many days are planning to stay in the hotel?");
        int numdays=scanner.nextInt();
        System.out.println("How many people are staying in the room?");
        int numPeople=scanner.nextInt();
        String roomType="";
        double price=0;
        int partySize=numPeople;
        boolean isAvailable=true;
        switch(numPeople){
            case 1:
                roomType="Single Room";
                price=numdays*100;
                break;
            case 2:
                roomType="double room";
                price=numdays*125;
                break;
            case 3: case 4:
                roomType="large room";
                price=numdays*numPeople*150;
                break;

            case 5: case 6: case 7:
                roomType="suite";
                price=numdays*5000;
                break;

            default:
                isAvailable=false;
                System.out.println("Sorry we dont have any available rooms for that size of a party");


        }
        if(isAvailable) {
            System.out.println("Party Size:" + partySize + "\nRoom type: " + roomType + "\nNumber of Days: " + numdays + "\nPrice: " + price);
        }
    }
}
