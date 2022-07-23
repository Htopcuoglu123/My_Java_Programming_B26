package day50_inheritance.book;

public class LovesReading {
    public static void main(String[] args) {
        AudioBook audio1=new AudioBook();
        audio1.title="Jane Eyre";
        audio1.author="Charlotte Bronte";
        audio1.genre="classics";
        audio1.price=14.99;
        audio1.hasMovie=true;
        audio1.narrator="Hilal Topcuoglu";
        audio1.duration=1.5;
        audio1.chapter=3;
        audio1.listen();

        EBook ebook1=new EBook();
        ebook1.title="Moby Dick";
        ebook1.author="Charles Dickens";
        ebook1.genre="Adventure";
        ebook1.chapter=4;
        ebook1.hasMovie=true;
        ebook1.numOfPages=150;
        ebook1.price=10.50;
        ebook1.read();

    }

}
