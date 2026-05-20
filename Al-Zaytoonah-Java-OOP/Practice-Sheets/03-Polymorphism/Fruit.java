public class Fruit extends Food {
    private int sweetnessLevel;

    public Fruit(String name, double calories, int sweetnessLevel) {
        super(name, calories);
        setSweetnessLevel(sweetnessLevel);
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        if (sweetnessLevel >= 1 && sweetnessLevel <= 10) {
            this.sweetnessLevel = sweetnessLevel;
        } else {
            throw new IllegalArgumentException("Sweetness level must be between 1 and 10.");
        }
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    @Override
    public String getNutritionalInfo() {
        return String.format("Fruit: %s | Calories: %.0f | Sweetness: %d/10", getName(), getCalories(), sweetnessLevel);
    }
}
