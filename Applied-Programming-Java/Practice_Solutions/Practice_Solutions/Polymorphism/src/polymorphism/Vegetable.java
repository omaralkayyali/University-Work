
package polymorphism;


public class Vegetable extends Food{
    private double fiberContent;

    public Vegetable() {
        super();
        this.fiberContent = 1.0;
    }

    public Vegetable(String name, double calories, double fiberContent) {
        super(name, calories);
        setFiberContent(fiberContent);
    }

    public void setFiberContent(double fiberContent) {
        if (fiberContent >= 0) {
            this.fiberContent = fiberContent;
        } else {
            throw new IllegalArgumentException("Fiber content must be non-negative");
        }
    }

    public double getFiberContent() {
        return fiberContent;
    }

    @Override
    public String getNutritionalInfo() {
        return super.getNutritionalInfo() + " Fiber Content: " + fiberContent;
    }

    @Override
    public String toString() {
        return "Vegetable [" + super.toString() + ", Fiber Content=" + fiberContent + "]";
    }
    
}
