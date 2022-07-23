package day06_arithmetic_operators;

public class House {
    public static void main(String[] args) {
        String houseType="Single Family";
        int numberOfBedrooms=3;
        int numberOfBathrooms=3;
        int numberOfKitchens=1;
        boolean isThereABasement=true;
        boolean isThereAnAttic=true;
        boolean isThereAPool=false;
        boolean isTheHouseForSale=false;
        double costOfTheHouse=510.999;
        String address="88 Jennie Circle";
        int zipCode=1001;
        boolean isAParkNearby=true;
        double ratingOfSchools=3.7;
        String houseInfo= "\nThe "+houseType+ " on "+address+", "+zipCode+" costs $ "+costOfTheHouse+"\nThe "+houseType+ " has "+numberOfBedrooms+", "+numberOfBathrooms+" bathrooms "+numberOfKitchens+ " kitchen.";
        System.out.println("The house type is: " + houseType);
        System.out.println("The number of bedrooms is: "+numberOfBedrooms);
        System.out.println("The number of bathrooms is: "+ numberOfBathrooms);
        System.out.println("The number of kitchens is: "+numberOfKitchens);
        System.out.println("Is there a basement: "+isThereABasement);
        System.out.println("Is there an attic: "+isThereAnAttic);
        System.out.println("Is there a pool: "+ isThereAPool);
        System.out.println("Is it fpr sale: "+isTheHouseForSale);
        System.out.println("The price of the house is: "+costOfTheHouse);
        System.out.println("The address of the house is: "+address);
        System.out.println("The zipcode is: "+zipCode);
        System.out.println("Is there a park nearby: "+isAParkNearby);
        System.out.println("The rating of the nearby schools is: "+ratingOfSchools);
        System.out.println(houseInfo);


    }
}
