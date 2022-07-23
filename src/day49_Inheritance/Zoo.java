package day49_Inheritance;

public class Zoo {
    public static void main(String[] args) {
        Animal animal=new Animal();
        animal.species="Generic Animal";
        animal.numberOfLegs=0;
        animal.walk();

        Dog dog=new Dog();
        dog.species="Dog";
        dog.numberOfLegs=4;
        dog.walk();

        Lion lion=new Lion();
        lion.roar();
        lion.species="lion";
        lion.walk();



    }
}
