public class Painkiller extends Drug {
    private int id;
    private String name;

    // Default Constructor
    public Painkiller() {
    }

    // Parameterized Constructor using super()
    public Painkiller(int id, String name, double price, char type) {
        super(price, type); // Invokes parent class constructor
        this.id = id;
        this.name = name;
    }

    // Setters and Getters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Method Overriding
    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }

    // Custom info method incorporating parent's toString()
    public String getPainKillerInfo() {
        return "ID: " + id + ", Name: " + name + ", " + super.toString();
    }
}
