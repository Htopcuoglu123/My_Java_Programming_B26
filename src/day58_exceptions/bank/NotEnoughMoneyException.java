package day58_exceptions.bank;
//this is an unchecked exception because the parent is the RuntimeException class
public class NotEnoughMoneyException extends RuntimeException{
    public NotEnoughMoneyException(){
        super("Not enough money in the account");
    }
    public NotEnoughMoneyException(String msg){
        super(msg);
    }

}
