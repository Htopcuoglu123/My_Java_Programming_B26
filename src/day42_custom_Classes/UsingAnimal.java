package day42_custom_Classes;

public class UsingAnimal {
    public static void main(String[] args) {
        Animal bird=new Animal();
        bird.population=100000000;
        bird.species="Bird";

        System.out.println(bird);
        System.out.println(bird.toString());//not how we will use it
    }
}
