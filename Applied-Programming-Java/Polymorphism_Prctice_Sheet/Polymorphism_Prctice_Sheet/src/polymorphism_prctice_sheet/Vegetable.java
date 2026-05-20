/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism_prctice_sheet;

/**
 *
 * @author admin
 */
public class Vegetable extends Food {

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
        }
    }

    public double getFiberContent() {
        return fiberContent;
    }

    @Override
    public String getNutritionalInfo() {
        return "Fiber Content: " + fiberContent + "g";
    }

    @Override
    public String toString() {
        return "Vegetable [name=" + getName() + ", calories=" + getCalories() + ", fiberContent=" + fiberContent + "g]";
    }
}
