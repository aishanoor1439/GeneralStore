package com.mycompany.mavenproject28;

class Cloth extends Item {

    private String size;

    public Cloth(String name, double price, String size) {
        super(name, price);
        this.size = size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Size: " + size);
    }
}
