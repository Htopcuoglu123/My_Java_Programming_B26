package day32_multiDimensionalArrays.day33_methods;

public class MyMathClass {
    public static void add(double num1,double num2){//we need to put the data type for each parameter/
        // they don't have to match
        //we can use any data type(double num,String name etc)
        System.out.println(num1+"+"+num2+"="+(num1+num2));

    }
    public static void subtract(double num1,double num2){

        System.out.println(num1+"-"+num2+"="+(num1-num2));

    }
    public static void multiply(double num1,double num2){
        System.out.println(num1+"x"+num2+"="+(num1*num2));

    }
    public static void divide(double num1,double num2) {
        if (num2 != 0) {
            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));

        } else {
            System.out.println("Cannot divide by 0");
        }
    }


    public static void main(String[] args) {
        add(4.5,6.1);
        subtract(10,6);
        divide(10,2);
        multiply(10,3);

        //int a=add(3.4,12.2);We cannot assign anything, because this is a void method and there is no return value
    }
}
