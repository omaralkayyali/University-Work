
package polymorphism;

import java.util.ArrayList;
import java.util.Scanner;


public class Polymorphism {
static Scanner scanner= new Scanner (System.in);
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();
        populateFoods(foods);
        displayFoods(foods);
        filterFoodsByCalories(foods);
    }
    private static void populateFoods(ArrayList<Food> foods) {
        foods.add(new Fruit("Apple", 95.0, 7));
        foods.add(new Fruit("Banana", 105.0, 6));
        foods.add(new Vegetable("Carrot", 25.0, 1.5));
        foods.add(new Vegetable("Spinach", 23.0, 2.0));
    }

    private static void displayFoods(ArrayList<Food> foods) {
        System.out.println("Details of all foods:");
        for (Food food : foods) {
            System.out.println(food);
        }
    }

    private static void filterFoodsByCalories(ArrayList<Food> foods) {
        System.out.print("Enter minimum calorie value: ");
        double minCalories = scanner.nextDouble();

        System.out.print("Enter maximum calorie value: ");
        double maxCalories = scanner.nextDouble();

        System.out.println("Foods within calorie range:");
        for (int i=0; i<foods.size();i++) {
            if (foods.get(i).getCalories() >= minCalories && foods.get(i).getCalories() <= maxCalories) {
                System.out.println(foods.get(i).getNutritionalInfo());
            }
        }
    }
}
