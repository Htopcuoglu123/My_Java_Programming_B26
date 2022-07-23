package day58_exceptions.bank;

public class UserAccounts {
    public static void main(String[] args) {
        Bank accountOne=new Bank();
        accountOne.balance=1000;
        accountOne.withDraw(500);
        System.out.println(accountOne.balance);

        //accountOne.withDraw(2000);//uncomment this to see the exception
      //valid username
        try {
            accountOne.login("jamesbond", "007");
        }catch(InvalidCredentialsExceptions e){
            System.out.println(e.getMessage());
        }
        //invalid username
        try {
            accountOne.login("james", "007");
        }catch(InvalidCredentialsExceptions e){
            System.out.println(e.getMessage());
        }
        //invalid password
        try {
            accountOne.login("james", "something");
        }catch(InvalidCredentialsExceptions e){
            System.out.println(e.getMessage());
        }
    }
    }

