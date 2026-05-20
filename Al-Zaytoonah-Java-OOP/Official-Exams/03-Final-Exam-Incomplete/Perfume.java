public class Perfume {
    private double price;
    private char scent;

    public Perfume() {
        this.price = 20;
        this.scent = 'O';
    }

    public Perfume(double price, char scent) {
        setPrice(price);
        setScent(scent);
    }

    public void setPrice(double price) {
        if (price >= 20 && price <= 180) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price must be between 20 and 180.");
        }
    }

    public void setScent(char scent) {
        char upper = Character.toUpperCase(scent);
        if (upper == 'O' || upper == 'F' || upper == 'W' || upper == 'T') {
            this.scent = upper;
        } else {
            throw new IllegalArgumentException("Scent must be O, F, W, or T.");
        }
    }

    public double getPrice() {
        return price;
    }

    public char getScent() {
        return scent;
    }

    public double getTotalPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("Perfume [price=%.2f, scent=%c]", price, scent);
    }
}
