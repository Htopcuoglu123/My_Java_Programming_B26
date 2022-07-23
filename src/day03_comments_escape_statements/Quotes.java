package day03_comments_escape_statements;

public class Quotes {
    /*How can you put this?
    I like "Java" programming
     */

    public static void main(String[] args) {
        System.out.println("I like \"Java\" programming.");
        System.out.println("\"I like Java programming\"");
        System.out.println("\\I want to print backslash\\");

        /*The first backslash is for the syntax of escape character
        the second backslash is for the backslash character to be output
         */
        System.out.println("abc\\\\def");// This will print two backslashes
    }
}
