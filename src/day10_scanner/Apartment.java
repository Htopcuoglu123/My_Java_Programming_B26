package day10_scanner;

import java.util.Scanner;

public class Apartment {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("The address of the apartment: ");
        String address= input.nextLine();
        System.out.println("Name of the owner:");
        String nameOfOwner=input.nextLine();
        System.out.println("Number of the units: ");
        int numOfUnits= input.nextInt();
        System.out.println("Size of the unit: ");
        double sizeOfUnit= input.nextDouble();
        System.out.println("Monthly Rent:");
        double rent= input.nextDouble();
        System.out.println("Number of washers and driers:");
        int numWasherDrier=input.nextInt();
        System.out.println("Are pets allowed? ");
        boolean allowsPets= input.nextBoolean();
        System.out.println("Is there a pool?");
        boolean hasAPool= input.nextBoolean();
        System.out.println("What is the length of the lease?");
        int lengthOfLease= input.nextInt();
        System.out.println("What is the total number of residents?");
        int numOfResidents= input.nextInt();
        System.out.println("Phone Number: ");
        input.nextLine();
        String phoneNumber= input.nextLine();
        System.out.println("is it near the gas station?");
        boolean nearGasStation= input.nextBoolean();
        System.out.println("What is the number of the floors?");
        int numOfFloors= input.nextInt();
        System.out.println("Does it have a basement?");
        boolean hasBasement= input.nextBoolean();
        System.out.println("Does it have any available units?");
        boolean availableUnits= input.nextBoolean();
        System.out.println("Does it have air conditioning?");
        boolean airConditioning= input.nextBoolean();
        System.out.println("Number od parking spaces:");
        int numOfParking= input.nextInt();
        System.out.println("Does it have wheelchair access?");
        boolean wheelChair= input.nextBoolean();
        System.out.println("Number of stars:");
        int numOfStars= input.nextInt();
        double myRentAfter3Years=rent-(rent*0.10);
        double myRentAfter6Years=rent-(rent*0.20);
        int averageNumResidents=numOfResidents/numOfUnits;
        int averageParkingSpace= numOfParking/numOfUnits;
        int numOfUnitPerFloor=numOfUnits/numOfFloors;
        System.out.println("address = " + address);
        System.out.println("nameOfOwner = " + nameOfOwner);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("numOfUnits = " + numOfUnits);
        System.out.println("sizeOfUnit = " + sizeOfUnit);
        System.out.println("numOfFloors = " + numOfFloors);
        System.out.println("numOfUnitPerFloor = " + numOfUnitPerFloor);
        System.out.println("numOfResidents = " + numOfResidents);
        System.out.println("averageNumResidents = " + averageNumResidents);
        System.out.println("numWasherDrier = " + numWasherDrier);
        System.out.println("allowsPets = " + allowsPets);
        System.out.println("hasAPool = " + hasAPool);
        System.out.println("lengthOfLease = " + lengthOfLease);
        System.out.println("nearGasStation = " + nearGasStation);
        System.out.println("hasBasement = " + hasBasement);
        System.out.println("airConditioning = " + airConditioning);
        System.out.println("numOfParking = " + numOfParking);
        System.out.println("averageParkingSpace = " + averageParkingSpace);
        System.out.println("wheelChair = " + wheelChair);
        System.out.println("rent = " + rent);
        System.out.println("myRentAfter3Years = " + myRentAfter3Years);
        System.out.println("myRentAfter6Years = " + myRentAfter6Years);
        System.out.println("numOfUnitPerFloor = " + numOfUnitPerFloor);




    }
}
