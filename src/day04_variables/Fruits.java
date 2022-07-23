package day04_variables;

public class Fruits {
    public static void main(String[] args) {
        int apples=50;
        int grapes=100;
        int bananas=150;
        int price=20;
        System.out.println("Apples:"+apples);
        System.out.println("Grapes:"+grapes);
        System.out.println("Bananas:"+bananas);
        System.out.println("We have\t"+apples+"\tapples");
        System.out.println("I have sold some of the apples");
        apples=45;
        System.out.println("Apples after selling:\t"+apples);
        System.out.println("The price of my\t"+apples+"\tapples is $" +price);
    }

}
