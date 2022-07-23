package day34_methods.day19;

public class CharMetod {
    public static void main(String[] args) {
        String s="java";
        System.out.println(s.length());
        System.out.println(s.charAt(0));
        System.out.println(s.charAt(1));
        System.out.println(s.charAt(2));
        System.out.println(s.charAt(3));

        int lastIndex=s.length()-1;
        int secondToLast=s.length()-2;
        char secondToLastchar=s.charAt(secondToLast);
        System.out.println("last char:"+s.charAt(lastIndex));//this is the same thing as line 10
        System.out.println("second to last character: "+secondToLastchar);
    }
}
