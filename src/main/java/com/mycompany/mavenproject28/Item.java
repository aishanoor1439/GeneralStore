package com.mycompany.mavenproject28;

public class Item {

    protected String name;
    protected double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayInfo() {
        System.out.println("Item Name: " + name);
        System.out.println("Price: $" + price);
    }
}
