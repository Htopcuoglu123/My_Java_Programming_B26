package day14_if_statemnts;

public class AmazonPrime {
    public static void main(String[] args) {
        double price=15.99;
        boolean hasPrime=false;
        String shipping;
        if(hasPrime){
            shipping="Eligible for regular 2 day shipping";

        }else{
            if(!hasPrime&&price>=25){
                shipping="Eligible for regular free shipping";
            }else{
                shipping="Not eligible for free shipping.Shipping fee is 3.99";
                price+=3.99;
            }
        }
        System.out.println(shipping);
        System.out.println("The total price will be " + price);
    }
}
