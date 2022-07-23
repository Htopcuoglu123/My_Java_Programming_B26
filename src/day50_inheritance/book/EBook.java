package day50_inheritance.book;

public class EBook extends Book {
    /*
     - EBook class inherits Book class

    - create additional variables:
        size, pages

    - create method:
        read()
            Example output: prints Reading a digital copy of $title
     */
    double size;
    int numOfPages;

    public void read(){
        System.out.println("Reading a digital copy of "+title);
    }



}
