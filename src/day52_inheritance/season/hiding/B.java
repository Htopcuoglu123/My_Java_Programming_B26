package day52_inheritance.season.hiding;

public class B extends A {
    @Override
    public void instanceMethodA(){
       staticMethod();
    }

 //   @Override--> We cannot override the static method
 //   but we can declare this method and the staticMethod
 //   from the parent clas will become hidden
    public static void staticMethod(){
        System.out.println("Static method from the CHILD class");
    }
}
