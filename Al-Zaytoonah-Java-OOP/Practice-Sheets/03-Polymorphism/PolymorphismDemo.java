import java.util.ArrayList;

public class PolymorphismDemo {
    public static void main(String[] args) {
        ArrayList<Food> foods = new ArrayList<>();
        foods.add(new Fruit("Apple", 52, 7));
        foods.add(new Fruit("Banana", 89, 8));
        foods.add(new Vegetable("Carrot", 41, 3.4));
        foods.add(new Vegetable("Spinach", 23, 2.9));

        System.out.println("=== Nutritional Information ===");
        for (Food food : foods) {
            System.out.println(food.getNutritionalInfo());
        }

        double totalCalories = 0;
        for (Food food : foods) {
            totalCalories += food.getCalories();
        }

        System.out.printf("\\nTotal Calories: %.0f\\n", totalCalories);
    }
}
