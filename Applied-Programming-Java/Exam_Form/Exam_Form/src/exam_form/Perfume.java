/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_form;

/**
 *
 * @author admin
 */
public class Perfume {
    private double price;
    private char scent;

    // Default Constructor
    public Perfume() {
        this.price = 20;
        this.scent = 'O';
    }

    // Parameterized Constructor
    public Perfume(double price, char scent) {
        setPrice(price);
        setScent(scent);
    }

    public void setPrice(double price) {
        if (price >= 20 && price <= 180) {
            this.price = price;
        } else {
            System.out.println("Price must be between 20 and 180.");
            
        }
    }

    public double getPrice() {
        return price;
    }

    public void setScent(char scent) {
             
        if ("OFWT".indexOf(Character.toUpperCase(scent)) != -1) {
            this.scent = scent;
        } else {
            System.out.println("cent must be O, F, W, or T.");
           
        }
    }

    public char getScent() {
        return scent;
    }

    public double getExtraDiscount() {
        switch (Character.toUpperCase(scent)) {
            case 'O': return price * 0.05;
            case 'F': return price * 0.10;
            case 'W': return price * 0.15;
            case 'T': return price * 0.20;
            default: return 0;
        }
    }

    public double getTotalPrice() {
        return price - getExtraDiscount();
    }

    @Override
    public String toString() {
        return "Perfume [Price=" + price + ", Scent=" + scent + ", Total Price=" + getTotalPrice() + "]";
    }
    
}
