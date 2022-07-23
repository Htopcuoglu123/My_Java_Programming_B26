package day58_exceptions.bank;

public class InvalidCredentialsExceptions extends Exception {
    //this is checked exception now because the parent is the
    // Exception class
    public InvalidCredentialsExceptions(String msg){
        super(msg);
    }
}
