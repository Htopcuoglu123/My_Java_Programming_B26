package day23_loops.day26_nested_loops;

public class MultiplicationTable {
    public static void main(String[] args) {

//Separate hard coded loops

//        for(int i=1; i<=10; i++){
//            System.out.print(1+"x"+i+"="+(1*i)+" | ");
//
//        }
//        for(int i=1; i<=10; i++){
//            System.out.print(1+"x"+i+"="+(1*i)+" | ");

        for(int num=1;num<=10;num++){

            for(int multi=1;multi<=10;multi++){

                System.out.print(num+"X"+multi+"="+(num*multi)+" | ");

            }//the end of the inner loop
            System.out.println(); // we have this so it can go to next line for each number
        }

    }
}
