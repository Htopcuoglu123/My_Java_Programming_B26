package day14_if_statemnts;

import java.util.Scanner;

public class Movie {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("How long is the movie?");
        double duration= scanner.nextDouble();
        if(duration>0&&duration<=4.0){
            if(duration>=1.0&&duration<1.5){
                System.out.println("The price is $8.99");
            }
            else if(duration>=1.5&&duration<2.0){
                System.out.println("The price is $10.50");
            }
            else if(duration>=2.0&&duration<2.5){
                System.out.println("The price is $12.99");
            }
            else if(duration>=2.5&&duration<3){
                System.out.println("The price is $14.50");
            }
            else{
                System.out.println("The price is $15.99");
            }

        }else{
            if(duration<=0){
                System.out.println("Movies cannot be less than zero minutes");
            }
            else if(duration>4.0){
                System.out.println("Movies cannot be more than 4 hours.");
            }
        }

    }
}
