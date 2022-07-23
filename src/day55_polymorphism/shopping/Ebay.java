package day55_polymorphism.shopping;

public final class Ebay extends OnlineShopping implements AllowUserToSell{
    @Override
    public void sell() {

    }

    @Override
    public void viewCart() {
        System.out.println("Two elements in the cart");
    }

    @Override
    public void paidForShipping(boolean b) {

    }

    @Override
    public void buyItem() {
        System.out.println("Buying two different Mother's Day gifts for both moms :))");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning an item");
    }
}
