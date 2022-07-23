package day55_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {
        //all possible reference/object of Lizard
        //itself
        Lizard lizard=new Lizard();
        lizard.eat();
        lizard.name="lizard";
        lizard.numberOfClaws=10;
        lizard.skinColor="camo";
        System.out.println(lizard.name);
        System.out.println(lizard.numberOfClaws);
        System.out.println(lizard.skinColor);


        //super class-reptile
        Reptile reptile=new Lizard();
        reptile.eat();
        reptile.name="lizard";
        reptile.numberOfClaws=10;
        //reptile.skinColor="camo";//skinColor was made in Lizard class so
        // reptile reference doesn't know what skinColor is
        //so reference does not have access to it
        System.out.println( reptile.name);
        System.out.println( reptile.numberOfClaws);
       // System.out.println( reptile.skinColor);//reference does not have access to  skinColor variable

        //super class-animal
         Animal animal=new Lizard();
         animal.eat();
         animal.name="lizard";
      // animal.numberOfClaws=10;animal  reference does not have access to  numberOfClaws variable
        //animal.skinColor="camo";animal reference does not have access to  skinColor variable
        System.out.println(animal.name);
        //System.out.println(animal.numberOfClaws); animal  reference does not have access to  numberOfClaws variable
        //System.out.println(animal.skinColor);animal reference does not have access to  skinColor variable

         /*
         we made 3 different lizard objects with 3 different references.
         Lizard(itself),reptile(super class) and animal(super class) but
         when it comes to execution the object implementation is run.Whatever
         eat method we have for Lizard object it will be running for all 3 of them
         since execution happens on the object side

         The reference of an object must have access to the variable or method, otherwise the code will not compile
         The execution happens on the object side
         ex: if a method is overridden the implementation of the object is executed
          */
    }
}
