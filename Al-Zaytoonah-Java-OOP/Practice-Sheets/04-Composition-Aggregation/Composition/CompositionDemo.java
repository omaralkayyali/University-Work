import java.util.ArrayList;

public class CompositionDemo {
    public static void main(String[] args) {
        Battery battery1 = new Battery(4500, 95);
        Battery battery2 = new Battery(5000, 90);
        Screen screen1 = new Screen(6.5, "2340x1080");
        Screen screen2 = new Screen(5.8, "1920x1080");

        SmartPhone phone1 = new SmartPhone("Samsung", "Galaxy S20", battery1, screen1);
        SmartPhone phone2 = new SmartPhone("Apple", "iPhone 12", battery2, screen2);

        ArrayList<SmartPhone> phones = new ArrayList<>();
        phones.add(phone1);
        phones.add(phone2);

        System.out.println("=== Composition Demo ===");
        for (SmartPhone phone : phones) {
            System.out.println(phone);
        }
    }
}
