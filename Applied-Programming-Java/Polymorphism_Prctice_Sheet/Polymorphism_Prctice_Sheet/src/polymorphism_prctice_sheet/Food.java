/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism_prctice_sheet;

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
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public String getName() {
        return name;
    }

    public void setCalories(double calories) {
        if (calories >= 0) {
            this.calories = calories;
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
        return "Food [name=" + name + ", calories=" + calories + "]";
    }
}
