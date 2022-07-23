package day55_polymorphism.shopping;

public class UseShopping {
    public static void main(String[] args) {
        System.out.println("\tAmazon");
        Amazon item1=new Amazon();
        item1.price=15;
        item1.buyItem();
        item1.returnItem();
        item1.viewCart();
        item1.paidForShipping(true);
        System.out.println(Shipping.country);//proper way to access information in the interface
        System.out.println("\n\tTarget");
        Target item2=new Target();
        item2.price=10;
        item2.buyItem();
        item2.returnItem();
        //item2.payForShipping(true);Target class does not implement the HSipping interface
        System.out.println("\n\tEbay");
        Ebay item3=new Ebay();
        item3.buyItem();
        item3.returnItem();
        item3.paidForShipping(false);
        item3.viewCart();
        //item3.uploadProduct();

    }
}
