import java.util.ArrayList;

public class Room {
    private String name;
    private ArrayList<Furniture> furniture;

    public Room(String name) {
        setName(name);
        furniture = new ArrayList<>();
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Room name cannot be empty.");
        }
        this.name = name;
    }

    public void addFurniture(Furniture item) {
        furniture.add(item);
    }

    public boolean removeFurniture(String itemName) {
        return furniture.removeIf(item -> item.getName().equalsIgnoreCase(itemName));
    }

    public Furniture findFurniture(String itemName) {
        for (Furniture item : furniture) {
            if (item.getName().equalsIgnoreCase(itemName)) {
                return item;
            }
        }
        return null;
    }

    public double getTotalCost() {
        double total = 0;
        for (Furniture item : furniture) {
            total += item.getPrice();
        }
        return total;
    }

    public void listFurniture() {
        System.out.println("Furniture list for room: " + name);
        for (Furniture item : furniture) {
            System.out.println("- " + item);
        }
        System.out.printf("Total cost: $%.2f\\n", getTotalCost());
    }

    @Override
    public String toString() {
        return String.format("Room [name=%s, items=%d]", name, furniture.size());
    }
}
