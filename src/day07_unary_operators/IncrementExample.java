package day07_unary_operators;

public class IncrementExample {
    public static void main(String[] args) {
        int x=0;
        System.out.println(x);//0

        x=x+1;//take value of x, which is 0 than I add 1
        System.out.println(x);
        System.out.println(++x);
        System.out.println(x++);
        System.out.println(x);
        System.out.println("_________________________________________________________________");


        x++;//post increment
        System.out.println(x);//1
        System.out.println("________________________________________________________________");

        ++x;
        System.out.println(x);
        System.out.println(++x);// because this is a pre-increment it will add the value right away so 4 is printed

        System.out.println(x++);//statement will run first because it is a post increment we will se 4
        System.out.println(x);//5



    }

}
