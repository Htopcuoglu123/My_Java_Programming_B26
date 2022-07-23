package day42_custom_Classes;

public class Item {
    String name;
    double price;

    @Override//you can ignore or delete this line
    public String toString() {
        return
                "name: " + name +
                ", price: " + price;
    }
}

