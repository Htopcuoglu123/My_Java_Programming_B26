package day16_review;

import java.util.Scanner;

public class Author {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter the genre name:");
        String genreName= scanner.nextLine();
        int pageLength=0;
        double profit=0;
        int sequels=0;
        int countries=0;
        boolean isValid=true;
        switch(genreName){
            case "Fantasy": case "fantasy":
                genreName="Fantasy";
                pageLength=500;
                profit=1_000_000;
                sequels=5;
                countries=50;
                break;
            case "Detective": case "detective":
                genreName="Detective";
                pageLength=350;
                profit=700_000;
                sequels=3;
                countries=45;
                break;
            case"Science Fiction": case"science fiction":
                genreName="Science Fiction";
                pageLength=720;
                profit=900_500;
                sequels=4;
                countries=30;
                break;
            case"Short Story": case"short story":
                genreName="Short Story";
                pageLength=150;
                profit=300_000;
                sequels=1;
                countries=40;
                break;
            default:
                isValid=false;
                System.out.println("invalid genre name");
        }
        if(isValid) {
            System.out.println("Genre name is: " + genreName);
            System.out.println("Page length is: " + pageLength);
            System.out.println("Profit is: " + profit);
            System.out.println("Sequels is: " + sequels);
            System.out.println("Countries is: " + countries);
        }

    }
}
