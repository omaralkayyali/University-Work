/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism_prctice_sheet;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Polymorphism_Prctice_Sheet {

    static Scanner scanner = new Scanner(System.in);

    public static void populateFoodList(ArrayList<Food> foodList) {

        System.out.print("How many fruits do you want to add? ");
        int fruitCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < fruitCount; i++) {
            System.out.println("Enter fruit name: ");
            String name = scanner.nextLine();
            System.out.println("Enter calories: ");
            double calories = scanner.nextDouble();
            System.out.println("Enter sweetness level (1-10): ");
            int sweetness = scanner.nextInt();
            scanner.nextLine();
            foodList.add(new Fruit(name, calories, sweetness));
        }
        System.out.print("How many vegetables do you want to add? ");
        int vegCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < vegCount; i++) {
            System.out.println("Enter vegetable name: ");
            String name = scanner.nextLine();
            System.out.println("Enter calories: ");
            double calories = scanner.nextDouble();
            System.out.println("Enter fiber content: ");
            double fiber = scanner.nextDouble();
            scanner.nextLine();
            foodList.add(new Vegetable(name, calories, fiber));
        }
    }

    public static void displayFoods(ArrayList<Food> foodList) {
        System.out.println("\nAll Foods:");
        for (int i = 0; i < foodList.size(); i++) {
            System.out.println(foodList.get(i));
        }
    }

    public static void filterFoodsByCalories(ArrayList<Food> foodList) {

        System.out.print("\nEnter minimum calories: ");
        double min = scanner.nextDouble();
        System.out.print("Enter maximum calories: ");
        double max = scanner.nextDouble();

        System.out.println("\nFoods within calorie range:");
        for (int i = 0; i < foodList.size(); i++) {
            Food f = foodList.get(i);
            if (f.getCalories() >= min && f.getCalories() <= max) {
                System.out.println(f);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Food> foodList = new ArrayList<>();
        populateFoodList(foodList);
        displayFoods(foodList);
        filterFoodsByCalories(foodList);
    }
}
