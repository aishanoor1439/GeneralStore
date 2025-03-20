package com.mycompany.mavenproject28;

public class Cosmetics extends Item {

    private String brand;

    public Cosmetics(String name, double price, String brand) {
        super(name, price);
        this.brand = brand;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Brand: " + brand);
    }
}
