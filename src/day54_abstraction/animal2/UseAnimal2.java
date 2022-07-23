package day54_abstraction.animal2;

public class UseAnimal2 {
    public static void main(String[] args) {
        Cat cat=new Cat("Van",true);
        cat.eat();
        cat.lives();
        cat.hops();
        cat.swims();
        System.out.println(cat);
        System.out.println();
        Fish fish=new Fish("Goldfish","small","orange");
        fish.swims();
        fish.lives();
        fish.eat();
        System.out.println(fish);

    }
}
