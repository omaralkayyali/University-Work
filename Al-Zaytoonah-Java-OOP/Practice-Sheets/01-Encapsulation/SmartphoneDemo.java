import java.util.Scanner;

public class SmartphoneDemo {
    public static void main(String[] args) {
        Smartphone[] phones = new Smartphone[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < phones.length; i++) {
            System.out.println("\\n--- Smartphone " + (i + 1) + " ---");
            System.out.print("Brand: ");
            String brand = scanner.nextLine();
            System.out.print("Storage (32-1024 GB): ");
            int storage = scanner.nextInt();
            scanner.nextLine();
            phones[i] = new Smartphone(brand, storage);
        }

        System.out.println("\\n=== All Smartphones ===");
        for (Smartphone phone : phones) {
            System.out.println(phone);
        }

        System.out.print("\\nEnter storage upgrade amount: ");
        int upgrade = scanner.nextInt();
        phones[0].upgradeStorage(upgrade);
        System.out.println("Upgraded first smartphone: " + phones[0]);
    }
}
