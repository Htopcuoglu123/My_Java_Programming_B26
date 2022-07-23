package day48_encapsulation.Book;

import day48_encapsulation.Book.Book;

import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    /*
    Create a class named Library
        -create Book objects
        -find the number off all books in the
        library with the help of "static" feature
        -create allBooks arrayList
        -create fantasyBooks arraylist by using allBooks collection

     */
    public static void main(String[] args) {

        System.out.println(Book.bookCount);
        ArrayList<Book>allBooks=new ArrayList<>();
        allBooks.addAll(Arrays.asList(
                new Book("Moby Dick","Adventure","Charles Dickens"),
                new Book( "Pride and Prejudice","Classic","Jane Austen"),
                new Book(" To Kill a Mockingbird","Adventure","Harper Lee"),
                new Book("Moby Dick","Adventure","Charles Dickens"),
                new Book("Jane Eyre","Classic","Charlotte Bronte")));

       ArrayList<Book>classics=new ArrayList<>(allBooks);
       classics.removeIf(each->!each.category.equalsIgnoreCase("classic"));
       System.out.println(classics);
       ArrayList<Book>adventure=new ArrayList<>(allBooks);
       adventure.removeIf(each->!each.category.equalsIgnoreCase("adventure"));
        System.out.println(adventure);
        System.out.println(Book.bookCount);



    }
}
