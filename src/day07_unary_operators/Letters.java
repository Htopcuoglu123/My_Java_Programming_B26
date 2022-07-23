package day07_unary_operators;

public class Letters {
    public static void main(String[] args) {
        char letter='A';
        System.out.println(letter);


        System.out.println(++letter);
        System.out.println(++letter);
        System.out.println(++letter);
        System.out.println(++letter);

        char letter1='G';
        System.out.println("Original letter: "+letter++);
        System.out.println("Next four: ");
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);

    }
}
