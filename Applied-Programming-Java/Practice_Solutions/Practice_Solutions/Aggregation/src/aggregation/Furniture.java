
package aggregation;


public class Furniture {
    private String name;
    private String material;
    private double price;

    public Furniture() {
        this.name = "Unknown";
        this.material = "Unknown";
        this.price = 10.0;
    }

    public Furniture(String name, String material, double price) {
        setName(name);
        setMaterial(material);
        setPrice(price);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setMaterial(String material) {
        if (!material.isEmpty()) {
            this.material = material;
        } else {
            System.out.println("Material cannot be empty");
       
        }
    }

    public String getMaterial() {
        return material;
    }

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        } else {
            System.out.println("Price must be greater than 0.0");
           
        }
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Furniture [Name=" + name + ", Material=" + material + ", Price=" + price + "]";
    }
    
}
