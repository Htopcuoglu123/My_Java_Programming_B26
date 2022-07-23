package day17_string;

public class StringMethods {
    public static void main(String[] args) {
        String name="james";
        String name1="jack";
        String name2="Jack";

        //How to compare String values--->use  .equals()

        System.out.println(name.equals("james"));
        System.out.println("cat".equals("dog"));
        System.out.println(name.equals(name1));

        String a=new String("hello");
        String b=new String("hello");
        String c="hello";
        System.out.println(a .equals(b));//true because it is just checking/comparing the characters they are both "hello"
        System.out.println(a.equals(c));

        System.out.println(name1.length());

        System.out.println(name1.equalsIgnoreCase(name2));

        String last="today was fun";
        System.out.println(last.length());
        System.out.println(last.equals("today"));
        System.out.println(last.equalsIgnoreCase("TODAY WAS FUN"));
    }
}
