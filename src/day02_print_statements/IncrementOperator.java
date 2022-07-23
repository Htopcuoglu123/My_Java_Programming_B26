package day02_print_statements;

public class IncrementOperator {
    public static void main(String[]args){
        int x=5;
        ++x;
        System.out.println(x);

        int y=12;
        y++;
        System.out.println(y);

        int z=14;
        int w=z++;
        System.out.println(z);
        System.out.println(w);

        int h=23;
        int t=++h;
        System.out.println("h:"+h);
        System.out.println("t:"+t);

    }
}
