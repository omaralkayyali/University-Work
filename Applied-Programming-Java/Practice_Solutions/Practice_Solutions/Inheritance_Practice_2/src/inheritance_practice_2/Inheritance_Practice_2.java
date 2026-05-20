package inheritance_practice_2;

import java.util.ArrayList;
import java.util.Scanner;

public class Inheritance_Practice_2 {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        fillLaptops(laptops);
        searchLaptopsByPrice(laptops);
    }

    private static void fillLaptops(ArrayList<Laptop> laptops) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Enter details for Laptop " + (i + 1) + ":");

            System.out.print("Brand: ");
            String brand = scanner.next();

            System.out.print("Processor: ");
            String processor = scanner.next();

            System.out.print("RAM (16, 32, 64, 128): ");
            int ram = scanner.nextInt();

            System.out.print("Battery Capacity: ");
            int battery = scanner.nextInt();

            laptops.add(new Laptop(brand, processor, ram, battery));
        }
    }
    /*private static void fillLaptops(ArrayList<Laptop> laptops) {
     for (int i = 0; i < 4; i++) {
     System.out.println("Enter details for Laptop " + (i + 1) + "as:brand, processor, Ram, capacity");

     laptops.add(new Laptop(scanner.next(), scanner.next(), scanner.nextInt(), scanner.nextInt()));
     }
     }*/

    private static void searchLaptopsByPrice(ArrayList<Laptop> laptops) {
        System.out.print("Enter a price to search for laptops: ");
        double price = scanner.nextDouble();

        boolean found = false;
        for (int i = 0; i < laptops.size(); i++) {
            if (laptops.get(i).getTotalPrice() <= price) {
                System.out.println("Brand: " + laptops.get(i).getBrand() + ", Total Price: " + laptops.get(i).getTotalPrice());
            } else {
                System.out.println("No laptops found with price less than or equal to " + price);
            }
        }
    }
}
