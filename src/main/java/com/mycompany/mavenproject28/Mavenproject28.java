package com.mycompany.mavenproject28;

public class Mavenproject28 {

    public static void main(String[] args) {
        Cosmetics lipstick = new Cosmetics("Lipstick", 20.5, "Maybelline");
        Pharmacy medicine = new Pharmacy("Painkiller", 15.0, true);
        Electronics laptop = new Electronics("Laptop", 1200.0, 2);
        Cloth shirt = new Cloth("T-Shirt", 25.0, "Medium");
        Frozen iceCream = new Frozen("Ice Cream", 5.0, "Dairy", -18);
        Fresh apple = new Fresh("Apple", 2.5, "Fruit", "2025-04-01");

        System.out.println("\n--- Cosmetics Item ---");
        lipstick.displayInfo();

        System.out.println("\n--- Pharmacy Item ---");
        medicine.displayInfo();

        System.out.println("\n--- Electronic Item ---");
        laptop.displayInfo();

        System.out.println("\n--- Cloth Item ---");
        shirt.displayInfo();

        System.out.println("\n--- Frozen Produce ---");
        iceCream.displayInfo();

        System.out.println("\n--- Fresh Produce ---");
        apple.displayInfo();
    }
}
