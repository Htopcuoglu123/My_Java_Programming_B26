package day58_exceptions.outOfInkException;

public class InvalidColorException extends Exception{
    //This is a checked class now because the parent is Exception
    /*
    Create a class InvalidColorException
    inherit the Exception class to create a checked exception

    create a constructor that accepts a String parameter. Use the String argument to the call the super constructor


     */
    public InvalidColorException (String msg){super(msg);}
}
