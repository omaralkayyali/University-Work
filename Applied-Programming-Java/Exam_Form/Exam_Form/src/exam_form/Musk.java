/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_form;

/**
 *
 * @author admin
 */
public class Musk extends Perfume{
    private int id;
    private String name;

    // Default Constructor
    public Musk() {
        super();
        this.id = 111;
        this.name = "White";
    }

    // Parameterized Constructor
    public Musk(int id, String name, double price, char scent) {
        super(price, scent);
        this.id = id;
        setName(name);
    }

    public void setName(String name) {
        if ("White".equalsIgnoreCase(name) || "Black".equalsIgnoreCase(name)) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name must be White or Black.");
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public double getTotalPrice() {
        double baseTotal = super.getTotalPrice();
        if ("White".equalsIgnoreCase(name)) {
            return baseTotal + 10;
        } else if ("Black".equalsIgnoreCase(name)) {
            return baseTotal + 30;
        } else {
            return baseTotal;
        }
    }

    public String getMuskInfo() {
        return id + "**" + name + "**" + getScent() + "**" + getPrice() + "**" + getExtraDiscount() + "**" + getTotalPrice();
    }
    
}
