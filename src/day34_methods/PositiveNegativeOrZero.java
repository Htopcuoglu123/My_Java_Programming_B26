package day34_methods;

public class PositiveNegativeOrZero {
    /*
    create a method that will accept a number. Find and print if it is a
positive number, negative number, or zero
     */
    public static void typeOfNumber(int num){
        if(num>0){
            System.out.println(num+" is a positive number");
        }else if(num<0){
            System.out.println(num+" is a negative number");
        }else{
            System.out.println(num+" is equal to zero");
        }
    }

    public static void main(String[] args) {
        typeOfNumber(0);
    }
}
