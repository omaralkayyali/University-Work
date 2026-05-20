/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

/**
 *
 * @author admin
 */
public class Fruit extends Food{
    private int sweetnessLevel;

    public Fruit() {
        super();
        this.sweetnessLevel = 5;
    }

    public Fruit(String name, double calories, int sweetnessLevel) {
        super(name, calories);
        setSweetnessLevel(sweetnessLevel);
    }

    public void setSweetnessLevel(int sweetnessLevel) {
        if (sweetnessLevel >= 1 && sweetnessLevel <= 10) {
            this.sweetnessLevel = sweetnessLevel;
        } else {
            throw new IllegalArgumentException("Sweetness level must be between 1 and 10");
        }
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    @Override
    public String getNutritionalInfo() {
        return super.getNutritionalInfo() + " Sweetness Level: " + sweetnessLevel;
    }

    @Override
    public String toString() {
        return "Fruit [" + super.toString() + ", Sweetness Level=" + sweetnessLevel + "]";
    }
}
