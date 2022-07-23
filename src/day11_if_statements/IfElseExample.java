package day11_if_statements;

public class IfElseExample {
    public static void main(String[] args) {
       int score=80;
       if(score>=75){
           System.out.println("Passing");
       }else{
           System.out.println("Failing");
       }
       int year=2021;
       boolean lockDown=year==2020||year==2021;
       if(lockDown){
           System.out.println("Stay at home");
           System.out.println("Practice Java");
           System.out.println("Wear a mask");
       }else{
           System.out.println("Party");
           System.out.println("Still practice Java");
           System.out.println("Travel");
       }

    }
}
