package day08_relational_operators;

public class GiftCard {
    public static void main(String[] args) {
        /*
        task:
        declare and assign a gift card with 200
        buy 2 items. buy 1 item for a price you pick and subtract
         and buy item 2 and subtract.
         at the end print the remaining balance of your gift card
         */
        double giftCard=200;
        System.out.println("The amount in my gift card before shopping is $"+giftCard);
        double item1=53.50;
        giftCard-=item1;
        System.out.println("The amount after the first item is $"+ giftCard);
        double item2=34.99;
        giftCard-=item2;
        System.out.println("Remaining balance after buying both items is $"+giftCard);
    }
}
