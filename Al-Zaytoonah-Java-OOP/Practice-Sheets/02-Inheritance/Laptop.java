public class Laptop extends Computer {
    private int battery;

    public Laptop() {
        super();
        this.battery = 3500;
    }

    public Laptop(String brand, String processor, int ram, int battery) {
        super(brand, processor, ram);
        setBattery(battery);
    }

    public void setBattery(int battery) {
        if (battery >= 3000 && battery <= 10000) {
            this.battery = battery;
        } else {
            throw new IllegalArgumentException("Battery capacity must be between 3000 and 10000 mAh.");
        }
    }

    public int getBattery() {
        return battery;
    }

    public double getBatteryPrice() {
        return battery * 0.01;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice() + getBatteryPrice() + 100;
    }

    @Override
    public String toString() {
        return String.format("Laptop [%s, battery=%dmAh, totalPrice=$%.2f]",
                super.toString(), battery, getTotalPrice());
    }
}
