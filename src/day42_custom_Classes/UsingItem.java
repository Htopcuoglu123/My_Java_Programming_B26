package day42_custom_Classes;

public class UsingItem {
    public static void main(String[] args) {
        Item item1=new Item();
        item1.name="Apples";
        item1.price=3.99;

        System.out.println(item1);//if we do not have the instance
        // toString method this will print just the memory location so
        //we can't print it like this
        Item item2=new Item();
        item2.name="Bananas";
        item2.price=0.68;
        System.out.println(item2);
    }
}
