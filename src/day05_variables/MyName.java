package day05_variables;

public class MyName {
    public static void main(String[] args) {
        char letter1='H';
        char letter2='i';
        char letter3='l';
        char letter4='a';

        System.out.println(letter1);
        System.out.println(letter2);
        System.out.println(letter3);
        System.out.println(letter4);
        System.out.println(letter3);
        System.out.println("May name is  "+letter1+letter2+letter3+letter4+letter3);
        String name=""+letter1+letter2+letter3+letter4+letter3;
        System.out.println(name);
        System.out.println(letter1+letter2+letter3+letter4+letter3);//it adds the ascii values of the letters
    }
}
