package day24_loops;

public class AsciiCodes {
    public static void main(String[] args) {
        String s="java";
        int ascii;
        for(int i=0;i<s.length();i++){
            ascii=s.charAt(i);
            System.out.print(ascii+" ");
        }
        /*
        String 2="java";
        for(int i=0;i<s.length();i++){
        System.out.print((int)s.charAT(i)+" ")
        }

         */
    }
}
