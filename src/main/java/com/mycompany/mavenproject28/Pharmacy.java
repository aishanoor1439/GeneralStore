package com.mycompany.mavenproject28;

class Pharmacy extends Item {

    private boolean prescriptionRequired;

    public Pharmacy(String name, double price, boolean prescriptionRequired) {
        super(name, price);
        this.prescriptionRequired = prescriptionRequired;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Prescription Required: " + (prescriptionRequired ? "Yes" : "No"));
    }
}
