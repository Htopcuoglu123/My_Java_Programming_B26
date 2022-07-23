package day58_exceptions.outOfInkException;

public class OutOfInkException extends  RuntimeException{
    //This is a runtime exception
    /*
    Create a class OutOfInkException
    inherit the RuntimeException class to create an unchecked exception

    create a constructor that accepts a String parameter. Use the String argument to the call the super constructor


     */
   public OutOfInkException(String msg){
       super(msg);
   }

}
