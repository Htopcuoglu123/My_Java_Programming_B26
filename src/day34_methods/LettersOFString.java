package day34_methods;

public class LettersOFString {
    /*
    create a method that accepts a String and print each character of the
String on a separate line
     */
    public static void stringCharacters(String word){
        for (int i = 0; i <word.length() ; i++) {
            System.out.println(word.charAt(i));
        }

        }

    public static void main(String[] args) {
        stringCharacters("Hilal");
    }
    }

