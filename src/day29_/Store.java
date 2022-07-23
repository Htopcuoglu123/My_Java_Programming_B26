package day29_;

public class Store {
    public static void main(String[] args) {
        String [] items = { "Shoes", "Jackets","Gloves", "AirPod", "Ipod", "Backpack" };
        double [] prices = { 89.99, 150.0, 99.99, 250.0, 439.5, 39.99 };
        int [] itemIds = { 12345, 12346, 12347, 12348, 12349, 12350 };
        //print the catalog

        for(int i=0;i<items.length;i++){
            System.out.println("Item id:"+itemIds[i]+" are "+items[i]+" and they cost $"+prices[i]);
        }
        System.out.println();

        //Task:Find the index of gloves
       int index=-1;//we cannot put 0 here since we have an item in that index and it is not gloves.
        //also, if glows are not in my array it will give a default negative value
        //we can set to any negative number, it doesn't matter.
        for(int i=0;i<items.length;i++){
            if(items[i].equalsIgnoreCase("Gloves")){
                index=i;
                break;

            }
        }
        System.out.println("Index of gloves: "+index);
        //Task:Find the most expensive item, name,price,id
        double mostExpensive=prices[0];
        int indexOfMostExpensive=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]>mostExpensive){
                mostExpensive=prices[i];
                indexOfMostExpensive=i;
            }
        }
        System.out.println("The most expensive is: ");
        System.out.println("Item: "+items[indexOfMostExpensive]);
        System.out.println("Item ID: "+itemIds[indexOfMostExpensive]);
        System.out.println("Price $"+prices[indexOfMostExpensive]);

    }
}
