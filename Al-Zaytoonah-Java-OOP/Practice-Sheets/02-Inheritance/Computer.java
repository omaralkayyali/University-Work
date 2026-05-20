public class Computer {
    private String brand;
    private String processor;
    private int ram;

    public Computer() {
        this.brand = "Dell";
        this.processor = "Intel";
        this.ram = 16;
    }

    public Computer(String brand, String processor, int ram) {
        setBrand(brand);
        setProcessor(processor);
        setRam(ram);
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.trim().isEmpty()) {
            this.brand = brand;
        } else {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
    }

    public void setProcessor(String processor) {
        if (processor != null && !processor.trim().isEmpty()) {
            this.processor = processor;
        } else {
            throw new IllegalArgumentException("Processor cannot be empty.");
        }
    }

    public void setRam(int ram) {
        if (ram == 16 || ram == 32 || ram == 64 || ram == 128) {
            this.ram = ram;
        } else {
            throw new IllegalArgumentException("RAM must be 16, 32, 64 or 128.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }

    public double getRamPrice() {
        return ram * 5;
    }

    public double getTotalPrice() {
        return getRamPrice() + 50;
    }

    @Override
    public String toString() {
        return String.format("Computer [brand=%s, processor=%s, ram=%dGB, totalPrice=$%.2f]",
                brand, processor, ram, getTotalPrice());
    }
}
