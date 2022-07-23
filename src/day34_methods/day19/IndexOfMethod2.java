package day34_methods.day19;

public class IndexOfMethod2 {
    public static void main(String[] args) {
        String s="java";
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        String s2="abcbcb";
        System.out.println(s2.indexOf('b'));//1
        System.out.println(s2.lastIndexOf('b'));//5
        System.out.println(s2.indexOf("cb"));//2
        System.out.println(s2.indexOf("bd"));//-1
        System.out.println(s2.indexOf('z'));//-1
    }
}
