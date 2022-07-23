package day56_polymorphism.book;

public abstract class EBook extends Book implements Downloadable {
    /*
    Create an abstract class EBook
    - Inherits Book and implements Downloadable
    - Declare a size variable
    - Declare an abstract methods:
        open()
     */
    int size;
    public abstract void open();

}
