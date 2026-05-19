public class Drug {
    private double price;
    private char type;

    // Default Constructor
    public Drug() {
    }

    // Parameterized Constructor
    public Drug(double price, char type) {
        this.price = price;
        this.type = type;
    }

    // Setters and Getters
    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setType(char type) {
        this.type = type;
    }

    public char getType() {
        return type;
    }

    // Calculate discount based on drug type
    public double getDiscount() {
        if (type == 'p')
            return price * 0.1; // 10% discount
        else
            return price * 0.05; // 5% discount
    }

    // Calculate total price after discount
    public double getTotalPrice() {
        return price - getDiscount();
    }

    @Override
    public String toString() {
        return "Price: " + price + ", Type: " + type;
    }
}
