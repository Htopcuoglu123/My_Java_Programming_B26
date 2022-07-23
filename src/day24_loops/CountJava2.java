package day24_loops;

public class CountJava2 {
    public static void main(String[] args) {
        String s="java is a java language.java";
        int count=0;
        while(s.contains("java")){
           s= s.replaceFirst("java","*");
           count++;
           System.out.println(s);
        }
        System.out.println(count);
        System.out.println(s);
    }
}
