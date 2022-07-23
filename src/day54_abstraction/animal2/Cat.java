package day54_abstraction.animal2;

public class Cat extends Animal2 implements Swimmable,Hoppy{
    boolean hasLongHair;

    public Cat(String species,boolean hasLongHair){
        super(species);
        this.hasLongHair=hasLongHair;
    }
    @Override
    public void eat(){
        System.out.println("Cats eat cat food");
    }
    public void lives(){
        System.out.println("Cats are mostly pets so they live at home with people");
    }
    @Override
    public void hops(){
        System.out.println("Cats are playful so they walk, run and hop everywhere!");
    }
    @Override
    public void swims(){
        System.out.println("Cats hate water so they dont usually swim unless they have to!");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "hasLongHair=" + hasLongHair +
                ", species='" + species + '\'' +
                '}';
    }
}
