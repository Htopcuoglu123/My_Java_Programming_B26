package day11_if_statements;

public class SingleIfExamples {
    public static void main(String[] args) {
        if(false){
            System.out.println("Hello world");
        }
        System.out.println("Second Line");

        if(true){
            System.out.println("Today is Monday");
        }
        int score=60;
        if(score>=75){
            System.out.println("Passing");
        }
        if(score<75){
            System.out.println("Failing");
        }
        int year=2022;
        boolean lockDown= year == 2020 || year==2021 ;
        if(lockDown){
            System.out.println("Stay at home!");
            System.out.println("Practice Java");
            System.out.println("Wear a mask");

        }

        if(!lockDown){
            System.out.println("Party");
            System.out.println("Practice Java");
            System.out.println("Travel");
        }
    }
}
