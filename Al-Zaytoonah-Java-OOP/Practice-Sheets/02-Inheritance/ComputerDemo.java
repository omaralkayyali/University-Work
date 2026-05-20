public class ComputerDemo {
    public static void main(String[] args) {
        Computer desktop = new Computer("HP", "Intel i5", 32);
        Laptop laptop = new Laptop("Lenovo", "AMD Ryzen 7", 64, 6000);

        System.out.println(desktop);
        System.out.println(laptop);

        try {
            Laptop invalidLaptop = new Laptop("Acer", "Intel i3", 24, 4000);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
