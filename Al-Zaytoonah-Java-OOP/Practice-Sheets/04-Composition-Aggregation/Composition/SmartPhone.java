public class SmartPhone {
    private String brand;
    private String model;
    private Battery battery;
    private Screen screen;

    public SmartPhone(String brand, String model, Battery battery, Screen screen) {
        setBrand(brand);
        setModel(model);
        this.battery = battery;
        this.screen = screen;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
        this.brand = brand;
    }

    public void setModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Model cannot be empty.");
        }
        this.model = model;
    }

    public Battery getBattery() {
        return battery;
    }

    public Screen getScreen() {
        return screen;
    }

    public double getTotalPrice() {
        return 500 + battery.getCapacity() * 0.05 + screen.getSize() * 100;
    }

    @Override
    public String toString() {
        return String.format("SmartPhone [brand=%s, model=%s, %s, %s, totalPrice=$%.2f]",
                brand, model, battery, screen, getTotalPrice());
    }
}
