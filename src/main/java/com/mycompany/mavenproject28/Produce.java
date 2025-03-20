package com.mycompany.mavenproject28;

class Produce extends Item {

    protected String type;

    public Produce(String name, double price, String type) {
        super(name, price);
        this.type = type;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: " + type);
    }
}
