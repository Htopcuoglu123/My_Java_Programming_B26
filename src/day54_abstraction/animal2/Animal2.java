package day54_abstraction.animal2;

public abstract class Animal2 {
    String species;
    public Animal2(String species){
        this.species=species;
    }

   public abstract void lives();
   public abstract void eat();
}
