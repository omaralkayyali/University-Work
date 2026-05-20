/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package composition;

/**
 *
 * @author admin
 */
public class Screen {
    private double size;
    private String resolution;

    // Default constructor
    public Screen() {
        this.size = 6.0;
        this.resolution = "1080x2400";
    }

    // Parameterized constructor
    public Screen(double size, String resolution) {
        setSize(size);
        setResolution(resolution);
    }

    // Getters and Setters
    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Size must be greater than 0.");
           
        }
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        if (resolution != null && !resolution.isEmpty()) {
            this.resolution = resolution;
        } else {
            System.out.println("Resolution must not be empty.");
            
        }
    }

    @Override
    public String toString() {
        return "Screen [Size=" + size + " inches, Resolution=" + resolution + "]";
    }
    
}
