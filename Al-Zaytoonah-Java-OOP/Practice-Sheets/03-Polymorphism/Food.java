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
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Food name cannot be empty.");
        }
        this.name = name;
    }

    public void setCalories(double calories) {
        if (calories >= 0) {
            this.calories = calories;
        } else {
            throw new IllegalArgumentException("Calories must be non-negative.");
        }
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }

    public String getNutritionalInfo() {
        return String.format("Food: %s | Calories: %.0f", name, calories);
    }

    @Override
    public String toString() {
        return getNutritionalInfo();
    }
}
