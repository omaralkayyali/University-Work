public class Vegetable extends Food {
    private double fiberContent;

    public Vegetable(String name, double calories, double fiberContent) {
        super(name, calories);
        setFiberContent(fiberContent);
    }

    public void setFiberContent(double fiberContent) {
        if (fiberContent >= 0) {
            this.fiberContent = fiberContent;
        } else {
            throw new IllegalArgumentException("Fiber content must be non-negative.");
        }
    }

    public double getFiberContent() {
        return fiberContent;
    }

    @Override
    public String getNutritionalInfo() {
        return String.format("Vegetable: %s | Calories: %.0f | Fiber: %.1fg", getName(), getCalories(), fiberContent);
    }
}
