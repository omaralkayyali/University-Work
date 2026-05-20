/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author admin
 */
public class Food {
    private String name;
    private double calories;

    public Food() {
        this.name = "Generic Food";
        this.calories = 0.0;
    }

    public Food(String name, double calories) {
        setName(name);
        setCalories(calories);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCalories(double calories) {
        if (calories >= 0) {
            this.calories = calories;
        } else {
            throw new IllegalArgumentException("Calories must be non-negative");
        }
    }

    public double getCalories() {
        return calories;
    }

    public String getNutritionalInfo() {
        return "Basic food information available.";
    }

    @Override
    public String toString() {
        return "Food [Name=" + name + ", Calories=" + calories + "]";
    }
    
}
