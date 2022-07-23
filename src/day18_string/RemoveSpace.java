package day18_string;

public class RemoveSpace {
    public static void main(String[] args) {
        String s="Saturday    ";
        System.out.println(s.length());
        s.trim();
        System.out.println(s.length());//since we did not assign it, it will show the same number of the characters

        s=s.trim();
        System.out.println(s.trim());
        System.out.println(s.length());

        String str="    java is fun   ";
        System.out.println(str.startsWith("Java"));
        str=str.trim();
        System.out.println(str.startsWith("java"));



    }
}
