import java.util.ArrayList;
import java.util.Scanner;

public class CosmeticStore {
    private ArrayList<Musk> inventory;

    public CosmeticStore() {
        this.inventory = new ArrayList<>();
    }

    public void addMusk(Musk musk) {
        if (musk != null) {
            inventory.add(musk);
        }
    }

    public void addMuskFromScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Musk ID: ");
        int id = scanner.nextInt();
        System.out.print("Enter Musk Name (White/Black): ");
        String name = scanner.next();
        System.out.print("Enter Musk Price: ");
        double price = scanner.nextDouble();
        System.out.print("Enter Musk Scent (O/F/W/T): ");
        char scent = scanner.next().charAt(0);

        Musk musk = new Musk(id, name, price, scent);
        addMusk(musk);
    }

    public void displayAllMusks() {
        System.out.println("\\n=== Musk Inventory ===");
        if (inventory.isEmpty()) {
            System.out.println("No musks available.");
            return;
        }
        for (Musk musk : inventory) {
            System.out.println(musk.getMuskInfo());
        }
    }

    public void displayMusksByMaxPrice(double maxPrice) {
        System.out.println("\\n=== Musks with price <= " + maxPrice + " ===");
        boolean found = false;
        for (Musk musk : inventory) {
            if (musk.getTotalPrice() <= maxPrice) {
                System.out.println(musk.getMuskInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No musks found under the specified price.");
        }
    }

    public Musk searchByName(String name) {
        for (Musk musk : inventory) {
            if (musk.getName().equalsIgnoreCase(name)) {
                return musk;
            }
        }
        return null;
    }
}
