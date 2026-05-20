/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Composition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create Battery and Screen objects
        Battery battery1 = new Battery(4000, "Lithium-Polymer");
        Battery battery2 = new Battery(5000, "Nickel-Metal Hydride");

        Screen screen1 = new Screen(6.5, "1440x3200");
        Screen screen2 = new Screen(5.8, "720x1520");

        // Create Smartphone objects
        ArrayList<SmartPhone> smartphones = new ArrayList<>();
        smartphones.add(new SmartPhone("Samsung", "Galaxy S21", battery1, screen1));
        smartphones.add(new SmartPhone("Apple", "iPhone 12", battery2, screen2));
        smartphones.add(new SmartPhone()); // Default smartphone

        // Display all smartphones
        displaySmartphones(smartphones);

        // Find smartphones by brand
        findSmartphonesByBrand(smartphones, "Samsung");

        // Calculate and display average battery capacity
        calculateAverageBatteryCapacity(smartphones);
    }

    public static void displaySmartphones(ArrayList<SmartPhone> smartphones) {
        System.out.println("\nAll Smartphones:");
        for (int i=0; i<smartphones.size();i++) {
            System.out.println(smartphones.get(i).toString());
        }
    }

    public static void findSmartphonesByBrand(ArrayList<SmartPhone> smartphones, String brand) {
        System.out.println("\nSmartphones by brand: " + brand);
        for (int i=0; i<smartphones.size();i++) {
            if (smartphones.get(i).getBrand().equalsIgnoreCase(brand)) {
                System.out.println(smartphones.get(i).toString());
            }
        }
    }

    public static void calculateAverageBatteryCapacity(ArrayList<SmartPhone> smartphones) {
        int totalCapacity = 0;
        int count = 0;

        for (int i=0; i<smartphones.size();i++) {
            totalCapacity += smartphones.get(i).getBattery().getCapacity();
            count++;
        }

        double average = (double) totalCapacity / count;
        System.out.println("\nAverage Battery Capacity: " + average + " mAh");
    }
}
