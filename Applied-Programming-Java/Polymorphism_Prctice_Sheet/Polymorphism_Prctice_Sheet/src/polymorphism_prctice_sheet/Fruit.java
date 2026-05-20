/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism_prctice_sheet;

/**
 *
 * @author admin
 */
public class Fruit extends Food {

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
        }
    }

    public int getSweetnessLevel() {
        return sweetnessLevel;
    }

    @Override
    public String getNutritionalInfo() {
        return "Sweetness Level: " + sweetnessLevel;
    }

    @Override
    public String toString() {
        return "Fruit [name=" + getName() + ", calories=" + getCalories() + ", sweetnessLevel=" + sweetnessLevel + "]";
    }
}
