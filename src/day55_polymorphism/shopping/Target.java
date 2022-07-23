package day55_polymorphism.shopping;
/*
Create a concrete class Target
    - Make the class final
    - Inherit Shopping and implement all abstract methods
 */

public final class Target extends Shopping {
    @Override
    public void buyItem() {
        System.out.println("Buying beauty products from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning two items to Target");
    }
}
