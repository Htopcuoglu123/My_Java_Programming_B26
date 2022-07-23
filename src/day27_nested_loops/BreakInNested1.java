package day27_nested_loops;

public class BreakInNested1 {
    public static void main(String[] args) {
        for (int i = 0; i <5 ; i++) {
            System.out.println("i "+i);

           // if(i==3){
               // break;if the break is here it will stop the outer loop which means both will no longer run.
            //We get 3 full iterations of the iterations of the outer loo, including the inner loop running start to finish
            //then when I is equal to 3 the outer loop will stop
            }

            for (int j = 0; j <2 ; j++) {

                System.out.println("j "+j);
               // break;if the break is here the outer loop will iterate fully but the inner loop will execute
                // the first iteration and the break runs
                //which stops the inner loop.Code resumes after the outer loop iterations finishes.

            }

            System.out.println();
            //break;if the break is here the first iteration of the outer loop will run and then the outer loop stops
        }
    }

