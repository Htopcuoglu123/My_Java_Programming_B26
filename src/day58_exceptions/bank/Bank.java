package day58_exceptions.bank;

public class Bank {
    double balance;
    public void withDraw(double amountToTakeOut){
        if(amountToTakeOut>balance){
            throw new NotEnoughMoneyException("Balance only have "+balance);
        }
        balance-=amountToTakeOut;
    }
    //in this method, we have created checked exceptions,
    // so they must be handled, but we created the class,
    // so we don't want to handle it. We used throws to allow
    // the program to compile so the user of the class handles the exception
    public void login(String userName,String password) throws InvalidCredentialsExceptions{
        if(!userName.equals("jamesbond")){
            throw new InvalidCredentialsExceptions("Invalid username");
        }

        if(!password.equals("007")){
            throw new InvalidCredentialsExceptions("Invalid password");
        }

        System.out.println("LOGIN");
    }
    /*
    if(amountToTakeOut>balance){
     NotEnoughMoneyException e=new NotEnoughMoneyException();
            throw e;
            }
     */
}
