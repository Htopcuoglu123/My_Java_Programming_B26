package day55_polymorphism.shopping;
/*
Create a concrete class Amazon
    - Make the class final
    - Inherit OnlineShopping and implement all abstract methods

 */

public final class Amazon extends OnlineShopping {
    @Override
    public void viewCart() {
        System.out.println("Two elements in the cart");
    }

    @Override
    public void paidForShipping(boolean b) {
        System.out.println(b?"Pay for shipping":"Free shipping");

    }

    @Override
    public void buyItem() {
        System.out.println("Buying Mother's Day gift!");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning the headsets");
    }
}
