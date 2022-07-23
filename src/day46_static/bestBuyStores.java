package day46_static;

public class bestBuyStores {
    public static void main(String[] args) {

        //access the static members by the class name
        System.out.println(BestBuy.headquarters);
        System.out.println(BestBuy.day);
        System.out.println(BestBuy.numberOfComputer);

        BestBuy store1=new BestBuy("Oak Drive");
        System.out.println(store1.location);//accessing the instance variable
        System.out.println(store1.numberOfComputer);

        store1.numberOfComputer--;
        System.out.println(BestBuy.numberOfComputer);

        BestBuy store2=new BestBuy("Main Street");

        store2.numberOfComputer-=5;

        System.out.println(store1.numberOfComputer);
        store2.location="Fairfax";
        System.out.println(store1.location);
        System.out.println(store2.location);

        BestBuy.reStock();
        store1.reStock();
        System.out.println(BestBuy.numberOfComputer);

        //BestBuy.openStore();we cannot access this one because it
        //does not belong to class
    }

}
