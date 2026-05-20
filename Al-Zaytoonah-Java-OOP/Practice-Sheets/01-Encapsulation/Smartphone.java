public class Smartphone {
    private String brand;
    private int storage; // in GB

    public Smartphone() {
        this.brand = "Generic";
        this.storage = 32;
    }

    public Smartphone(String brand, int storage) {
        setBrand(brand);
        setStorage(storage);
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            throw new IllegalArgumentException("Brand cannot be empty.");
        }
        this.brand = brand;
    }

    public void setStorage(int storage) {
        if (storage >= 32 && storage <= 1024) {
            this.storage = storage;
        } else {
            throw new IllegalArgumentException("Storage must be between 32 and 1024 GB.");
        }
    }

    public String getBrand() {
        return brand;
    }

    public int getStorage() {
        return storage;
    }

    public int getBrandCost() {
        if (brand.equalsIgnoreCase("Apple")) {
            return 1000;
        } else if (brand.equalsIgnoreCase("Samsung")) {
            return 800;
        } else {
            return 500;
        }
    }

    public int getStorageCost() {
        if (storage <= 128) {
            return 100;
        } else if (storage <= 256) {
            return 200;
        } else if (storage <= 512) {
            return 300;
        } else {
            return 400;
        }
    }

    public void upgradeStorage(int extraGB) {
        if (extraGB <= 0) {
            throw new IllegalArgumentException("Upgrade amount must be positive.");
        }
        setStorage(this.storage + extraGB);
    }

    public int getTotalPrice() {
        return getBrandCost() + getStorageCost();
    }

    @Override
    public String toString() {
        return String.format("Smartphone [brand=%s, storage=%dGB, totalPrice=$%d]",
                brand, storage, getTotalPrice());
    }
}
