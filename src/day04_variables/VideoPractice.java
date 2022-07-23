package day04_variables;

public class VideoPractice {
    public static void main(String[] args) {
        /*Implicit casting si dane when we need to assign smaller primitive types to larger primitive types.
        Implicit Casting is done automatically

        Here are some Samples
         */

        byte a=3;
        int  b=a;
        System.out.println(b);

        short c=3000;
        long  d=(long)c;
        System.out.println(c);

        // or

        short e=2030;
        long  f=e;
        System.out.println(f);

        /*Explicit casting is done when you need to assign a larger primitive type to a smaller primitive type.
        Explicit Casting is done manually.
         */

        double g=3.45;
        int    h=(int)g;
        System.out.println(g);
        System.out.println(h);
    }
}
