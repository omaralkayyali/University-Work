/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author admin
 */
public class Battery {
 private int capacity;
    private String type;

    // Default constructor
    public Battery() {
        this.capacity = 3000;
        this.type = "Lithium-Ion";
    }

    // Parameterized constructor
    public Battery(int capacity, String type) {
        setCapacity(capacity);
        setType(type);
    }

    // Getters and Setters
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            System.out.println("Capacity must be greater than 0.");
         
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if (type != null && !type.isEmpty()) {
            this.type = type;
        } else {
            System.out.println("Type must not be empty.");
            
        }
    }

    @Override
    public String toString() {
        return "Battery [Capacity=" + capacity + ", Type=" + type + "]";
    }

    
}
