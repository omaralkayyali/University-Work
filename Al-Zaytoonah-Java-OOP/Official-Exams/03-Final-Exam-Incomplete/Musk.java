public class Musk extends Perfume {
    private int id;
    private String name;

    public Musk() {
        super();
        this.id = 1;
        this.name = "White";
    }

    public Musk(int id, String name, double price, char scent) {
        super(price, scent);
        setId(id);
        setName(name);
    }

    public void setId(int id) {
        if (id >= 1) {
            this.id = id;
        } else {
            throw new IllegalArgumentException("ID must be positive.");
        }
    }

    public void setName(String name) {
        if (name != null && (name.equalsIgnoreCase("White") || name.equalsIgnoreCase("Black"))) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name must be White or Black.");
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getTotalPrice() {
        double base = super.getTotalPrice();
        if (name.equalsIgnoreCase("White")) {
            return base + 10;
        } else {
            return base + 30;
        }
    }

    public String getMuskInfo() {
        return String.format("Musk [id=%d, name=%s, scent=%c, totalPrice=%.2f]", id, name, getScent(), getTotalPrice());
    }

    @Override
    public String toString() {
        return getMuskInfo();
    }
}
