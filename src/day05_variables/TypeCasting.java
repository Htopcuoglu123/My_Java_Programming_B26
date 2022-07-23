package day05_variables;

public class TypeCasting {
    public static void main(String[] args) {
        //Implicit Casting Sample
        // Since byte is smaller than int it is automatically converted

        byte b = 40;
        int i =b;
        System.out.println(i);
        System.out.println();

        int i3 = 500;
        long l1 =i3;
        System.out.println(l1);
        System.out.println();

        //Explicit Casting sample
        //Since int is bigger than byte we need to cast it manually

        int i2 = 100;
        byte b2=(byte) i2;
        System.out.println(b2);
        System.out.println();

        long l2=200;
        int i4=(int)l2;
        System.out.println(i4);
        System.out.println();
        long num=102131312321312L;
        double num1=(double)num;
        System.out.println("num1 is: "+num1);
        System.out.println(num);
        System.out.println();

        double d =50;
        int i5 =(int)d;
        System.out.println(d);
        System.out.println(i5);



    }
}
