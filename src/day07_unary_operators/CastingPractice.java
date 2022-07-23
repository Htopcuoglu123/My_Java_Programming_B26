package day07_unary_operators;

public class CastingPractice {
    public static void main(String[] args) {
        short num1=120;
        byte num2=(byte)num1;
        System.out.println(num1);
        System.out.println(num2);

        float num3=123.23f;
        double num4=num3;
        System.out.println(num3);
        System.out.println(num4);

        double num5=1234.456;
        int num6=(int)num5;
        System.out.println(num5);
        System.out.println(num6);

        long num7=123456892345L;
        int num8=(int)num7;
        System.out.println(num7);
        System.out.println(num8);



    }
}
