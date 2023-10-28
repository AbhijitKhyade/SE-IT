package StrategyDesignPattern;

import java.util.ArrayList;

public class ShoppingCart {
    //Arraylist to add items
    ArrayList<Item> items = new ArrayList<Item>();

    //Constructor
    ShoppingCart() {
        this.items = items;
    }

    //Function to add items
    void addItem(Item item) {
        items.add(item);
    }

    //Function to calculate the total price
    int CalculateTotal() {
        int total = 0;
        for (Item item : items) {
            total = total + item.getPrice();
        }
        return total;
    }
}



