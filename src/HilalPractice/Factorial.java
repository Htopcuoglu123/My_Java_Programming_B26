package HilalPractice;

public class Factorial {
    public static void main(String[] args) {
        int n=10;
        int factorial=1;
        while(n>1){
            factorial*=n;
            n--;
            System.out.println(factorial+"X"+n);
        }

    }
}
