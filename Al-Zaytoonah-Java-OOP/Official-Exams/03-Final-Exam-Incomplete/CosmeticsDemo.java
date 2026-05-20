import java.util.Scanner;

public class CosmeticsDemo {
    public static void main(String[] args) {
        CosmeticStore store = new CosmeticStore();
        store.addMusk(new Musk(101, "White", 40, 'O'));
        store.addMusk(new Musk(102, "Black", 55, 'W'));
        store.addMusk(new Musk(103, "White", 70, 'T'));

        store.displayAllMusks();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter maximum musk price to search: ");
        double maxPrice = scanner.nextDouble();
        store.displayMusksByMaxPrice(maxPrice);

        System.out.print("Enter musk name to search (White/Black): ");
        String searchName = scanner.next();
        Musk found = store.searchByName(searchName);
        if (found != null) {
            System.out.println("Found musk: " + found.getMuskInfo());
        } else {
            System.out.println("No musk found with name " + searchName);
        }
    }
}
