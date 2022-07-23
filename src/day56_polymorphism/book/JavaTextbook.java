package day56_polymorphism.book;

public class JavaTextbook extends EBook{
    /*
    Create a concrete class JavaTextbook
    - Inherits EBook
    - Declare a fun variable
    - Override all abstract methods

     */
    String isFun(boolean a) {
        return(a? "Java is fun":"Java is not easy");
    }

    //int fun;

    @Override
    public void read() {
        System.out.println("Reading a book");
    }

    @Override
    public void download() {
        System.out.println("Downloading a book");

    }

    @Override
    public void open() {
        System.out.println("Opening the EBook ");
    }
}
