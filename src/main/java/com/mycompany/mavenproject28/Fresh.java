package com.mycompany.mavenproject28;

class Fresh extends Produce {

    private String expiryDate;

    public Fresh(String name, double price, String type, String expiryDate) {
        super(name, price, type);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Expiry Date: " + expiryDate);
    }
}
