package day08_relational_operators;

public class UpdateVariable {
    public static void main(String[] args) {
        //Adding 1 to a variable
        int a=10;
        a=11;
        a++;
        ++a;
        a=a+1;



        //Add 10 to a variable

        int b=4;
        b=14;
        b=b+10;
        b+=10;

        //Shorthand Operators

        int count=0;
        count+=5;
        System.out.println(count);
        count-=10;
        System.out.println(count);
        count*=2;
        System.out.println(count);
        count/=2;
        System.out.println(count);

    }
}
