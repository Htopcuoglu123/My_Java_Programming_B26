package day09_scanner;

public class LogicalOperatorsPractice {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(n > 5);
        System.out.println(n < 10);
        System.out.println(n>5 && n<10);

        System.out.println(4>3 || false);
        System.out.println(3>4 || false);
        System.out.println(!false);
        System.out.println(!true);
    }
}
