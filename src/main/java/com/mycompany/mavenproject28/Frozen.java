package com.mycompany.mavenproject28;

class Frozen extends Produce {

    private double storageTemp;

    public Frozen(String name, double price, String type, double storageTemp) {
        super(name, price, type);
        this.storageTemp = storageTemp;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Storage Temperature: " + storageTemp + "°C");
    }
}
