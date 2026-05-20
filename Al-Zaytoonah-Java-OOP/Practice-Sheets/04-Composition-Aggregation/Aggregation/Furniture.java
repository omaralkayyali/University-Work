public class Furniture {
    private String name;
    private String material;
    private double price;

    public Furniture(String name, String material, double price) {
        setName(name);
        setMaterial(material);
        setPrice(price);
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Furniture name cannot be empty.");
        }
        this.name = name;
    }

    public void setMaterial(String material) {
        if (material == null || material.trim().isEmpty()) {
            throw new IllegalArgumentException("Material cannot be empty.");
        }
        this.material = material;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative.");
        }
    }

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Furniture [name=%s, material=%s, price=$%.2f]", name, material, price);
    }
}
