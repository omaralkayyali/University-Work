public class Battery {
    private int capacity; // mAh
    private int health; // percentage

    public Battery(int capacity, int health) {
        setCapacity(capacity);
        setHealth(health);
    }

    public void setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
        } else {
            throw new IllegalArgumentException("Battery capacity must be positive.");
        }
    }

    public void setHealth(int health) {
        if (health >= 0 && health <= 100) {
            this.health = health;
        } else {
            throw new IllegalArgumentException("Battery health must be between 0 and 100.");
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public String toString() {
        return String.format("Battery [%dmAh, health=%d%%]", capacity, health);
    }
}
