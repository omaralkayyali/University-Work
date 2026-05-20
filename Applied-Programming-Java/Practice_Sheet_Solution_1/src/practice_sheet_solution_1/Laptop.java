/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_sheet_solution_1;

/**
 *
 * @author admin
 */
public class Laptop extends Computer {

    private int battery;

    public Laptop() {
        super();
        this.battery = 3500;
    }

    public Laptop(String brand, String processor, int ram, int battery) {
        super(brand, processor, ram);
        setBattery(battery);
    }

    public void setBattery(int battery) {
        if (battery >= 3000 && battery <= 10000) {
            this.battery = battery;
        }
    }

    public int getBattery() {
        return battery;
    }

    public double getBatteryPrice() {
        return battery * 0.01;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice() + getBatteryPrice() + 100;
    }

    @Override
    public String toString() {
        return "Laptop [" + super.toString() + ", Battery=" + battery + "mAh, Total Price=$" + getTotalPrice() + "]";
    }
}
