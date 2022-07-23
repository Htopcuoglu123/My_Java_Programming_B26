package day54_abstraction.animal2;

public class Fish extends Animal2 implements Swimmable{
    String size;
    String color;
    public Fish(String species,String size,String color){
        super(species);
        this.size=size;
        this.color=color;
    }
    @Override
    public void swims(){
        System.out.println("Swimming is all types of fish's favorite activity");
    }
    @Override
    public void lives(){
        System.out.println("Fish can be pet or wild");
    }
    @Override
    public void eat(){
        System.out.println("Fish eat smaller fish");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
