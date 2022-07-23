package day08_relational_operators;

import java.sql.SQLOutput;

public class AllOperators {
    public static void main(String[] args) {
        System.out.println(5+2*3);
        //2*3=6
        //5+6=11

        System.out.println(5*2+4/2);
        //5*2=10
        //4/2=2
        //10+2=12

        System.out.println(5+2>4-3);
        //5+2=7
        //4-3=1
        //7>1=true

        int a=20;//-20-> 19->20->->19->18
        int b=-a-- + a++ + --a * a--;
      

    }
}
