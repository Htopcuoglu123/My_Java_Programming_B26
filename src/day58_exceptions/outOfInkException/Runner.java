package day58_exceptions.outOfInkException;

public class Runner {
    public static void main(String[] args){
        Pen pen = new Pen();
        pen.inkColor="red";

        try{
            pen.inkLevel=15;
            pen.write();
            System.out.println(pen.inkLevel);
        }catch (OutOfInkException e){

            System.out.println(e.getMessage());
            System.out.println("Ink level cannot be lower than 10");
        }


        try {

            pen.changeColor("red");

        }catch (InvalidColorException e){
            System.out.println(e.getMessage());
        }

    /*
    Create a class Runner

    create an object of the Pen and try to call both methods. Handle any Exceptions you need to
     */
    }
}
