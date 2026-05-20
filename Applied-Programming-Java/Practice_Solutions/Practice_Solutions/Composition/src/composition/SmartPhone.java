/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author admin
 */
public class SmartPhone {
    private String brand;
    private String model;
    private Battery battery;
    private Screen screen;

    // Default constructor
    public SmartPhone() {
        this.brand = "Generic";
        this.model = "Model X";
        this.battery = new Battery();
        this.screen = new Screen();
    }

    // Parameterized constructor
    public SmartPhone(String brand, String model, Battery battery, Screen screen) {
        this.brand = brand;
        this.model = model;
        this.battery = battery;
        this.screen = screen;
    }

    // Getters and Setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Battery getBattery() {
        return battery;
    }

    public Screen getScreen() {
        return screen;
    }

    @Override
    public String toString() {
        return "Smartphone [Brand=" + brand + ", Model=" + model + ", " + battery + ", " + screen + "]";
    }
    
}
