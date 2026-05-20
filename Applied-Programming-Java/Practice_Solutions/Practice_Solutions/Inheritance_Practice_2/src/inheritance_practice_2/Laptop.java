/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_practice_2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Laptop extends Computer {
    Scanner input=new Scanner (System.in);
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
        } else {
            throw new IllegalArgumentException("Battery capacity must be between 3000 and 10000");
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
        System.out.println("Please enter CPU price..");
        
        return input.nextDouble()+super.getTotalPrice() + getBatteryPrice() + 100;
    }

    @Override
    public String toString() {
        return "Laptop [" + super.toString() + ", Battery=" + battery + "]";
    }
    
}
