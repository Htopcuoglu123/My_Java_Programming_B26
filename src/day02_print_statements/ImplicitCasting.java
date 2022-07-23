package day02_print_statements;

public class ImplicitCasting {
    public static void main(String[]args){
        short x=23;
        int y=123;
        int result=x+y;
        System.out.println(result);

        double z=2.3;
        int w=65;
        double result1=z+w;
        System.out.println(result1);

        double h=2.65;
        double t=h+13;
        System.out.println(t);

        //explicit Casting Sample

        double a=23.45;
        int b=(int)a+12;
        System.out.println(b);

        double tt=123.09;
        double hh=144.98;
        int thay=(int)tt+(int)hh;
        System.out.println(thay);
    }
}
