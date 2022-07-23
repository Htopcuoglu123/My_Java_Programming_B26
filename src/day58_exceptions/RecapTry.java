package day58_exceptions;

import java.util.ArrayList;

public class RecapTry {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("bye");
        try {
            System.out.println(list.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Index out of bounds catch block");
            System.out.println(e.getMessage());//this method will print the message on the console
        }catch(NullPointerException e){
            System.out.println("No object");
            e.printStackTrace();
        }
        System.out.println(list);

        System.out.println();

        try{
            Thread.sleep(3000);
        }catch(InterruptedException|IllegalArgumentException e){//handles both exceptions
            System.out.println("Wrong numbers");
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Last line for the sleep try");
        }
    }
}
