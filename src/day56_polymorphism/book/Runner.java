package day56_polymorphism.book;

public class Runner {
    public static void main(String[] args) {


        JavaTextbook book1=new JavaTextbook();
        System.out.println("book1.isFun(true) = " + book1.isFun(true));
        book1.download();
        book1.open();
        book1.read();
        book1.name="Java";
        book1.size=165;
//        System.out.println("book1.size = " + book1.size);
//        System.out.println("book1.name = " + book1.name);

        System.out.println();

       EBook book2=new JavaTextbook();
        book2.size = 120;
        book2.name = "Learn Java";
        book2.download();
        book2.open();
        book2.read();
       // book2.fun();EBook reference does not have access to the fun variable
        ((JavaTextbook)book2).isFun(true);//cast the reference from the parent EBook
        // to the child reference of JavaTextBook
        // and that allows us to access the fun variable


        System.out.println();
        Book book3 = new JavaTextbook();
        book3.name= "why we sleep";
        book3.read();
        System.out.println(book3.name);

        System.out.println();

        Downloadable book4=new JavaTextbook();
        book4.download();
//        book4.name()="Learn Java";
//        book4.size()=20.5;
//        book4.fun();
//        book4.read();
//        book4.open();







    }
}
