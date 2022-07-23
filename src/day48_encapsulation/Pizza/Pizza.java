package day48_encapsulation.Pizza;

public class Pizza {
    /*
     create a class called Pizza

        - data:

            size (String), number of toppings

        - constructor

            - create a constructor that creates a Pizza object with the length and the width

            	call setters here

        - encapsulate the Pizza class

        	- setter condition:
        		size can only be:
        			small, medium, or large

        		number of toppings must be a positive number

        - other methods methods:

            - calculatePrice()
            		calculate the price of the pizza based on:

            			small base: $4
            			medium base: $6
            			large base: $8

            			each topping adds $0.75 to the price

            			calculate the total price and return the cost

            - toString()
                print the size, number of toppings, and cost of the pizza

    Create a separate class to create and test the Pizza objects
     */
    private String size;
    private int numOfToppings;
    private double totalPrice;

    public Pizza(String size,int numOfToppings){
       setSize(size);
       setNumOfToppings(numOfToppings);
       calculatePrice();
    }
    public void setSize(String size){
        switch(size.toLowerCase()) {
            case "small":
            case "medium":
            case "large":
            this.size=size;
            break;
            default:
                System.out.println("Size can only be small, medium or large");
        }
    }
    public void setNumOfToppings(int numOfToppings){
        if(numOfToppings>0){
            this.numOfToppings=numOfToppings;
        }else{
            System.out.println("You cannot enter a negative number");
        }
    }
    public String getSize(){
        return size;
    }
    public int getNumOfToppings(){
        return numOfToppings;
    }

    public double calculatePrice(){
        switch(size){
            case "small":
                totalPrice=4+(numOfToppings*0.75);
                break;
            case "medium":
                totalPrice=6+(numOfToppings*0.75);
                break;
            case "large":
                totalPrice=8+(numOfToppings*0.75);

        }
        return totalPrice;
    }

    //public double calculatePrice(){
//        if(size=="null"){
//            return -1;
//        }
//        double price=size.equalsIgnoreCse("small")?4:size.equalsIgnoreCase("medium")?6:8;
//        return price+(numOfToppings*0.75);
//    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numOfToppings=" + numOfToppings +
                ", totalPrice= $" + totalPrice +
                '}';
    }
}
