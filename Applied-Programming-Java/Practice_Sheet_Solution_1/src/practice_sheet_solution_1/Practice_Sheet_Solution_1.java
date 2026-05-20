/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_sheet_solution_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Practice_Sheet_Solution_1 {
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        fillLaptops(laptops);
        searchLaptopsByPrice(laptops);
    }

    public static void fillLaptops(ArrayList<Laptop> laptops) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            System.out.println("\nEnter details for Laptop " + (i + 1) + ":");
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            System.out.print("Processor: ");
            String processor = scanner.nextLine();
            System.out.print("RAM (16/32/64/128): ");
            int ram = scanner.nextInt();
            System.out.print("Battery Capacity (3000-10000 mAh): ");
            int battery = scanner.nextInt();
            scanner.nextLine();

            laptops.add(new Laptop(brand, processor, ram, battery));
        }
    }

    public static void searchLaptopsByPrice(ArrayList<Laptop> laptops) {
        
        System.out.print("\nEnter a maximum laptop price to search for: $");
        double maxPrice = scanner.nextDouble();

        System.out.println("\nLaptops with total price <= $" + maxPrice + ":");
        boolean found = false;
        for (int i = 0; i < laptops.size(); i++) {
            Laptop l = laptops.get(i);
            if (l.getTotalPrice() <= maxPrice) {
                System.out.println("Brand: " + l.getBrand() + ", Total Price: $" + l.getTotalPrice());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No laptops found under the specified price.");
        }
    }
}
