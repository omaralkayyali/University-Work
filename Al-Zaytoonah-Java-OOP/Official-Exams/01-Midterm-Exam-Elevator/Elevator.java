public class Elevator {
    private char speed; // 'F' for Fast, 'S' for Slow
    private int floors; // 1-20 floors

    public Elevator() {
        this.speed = 'F';
        this.floors = 4;
    }

    public Elevator(char speed, int floors) {
        setSpeed(speed);
        setFloors(floors);
    }

    public void setSpeed(char speed) {
        char upperSpeed = Character.toUpperCase(speed);
        if (upperSpeed == 'F' || upperSpeed == 'S') {
            this.speed = upperSpeed;
        } else {
            throw new IllegalArgumentException("Speed must be 'F' or 'S'.");
        }
    }

    public void setFloors(int floors) {
        if (floors >= 1 && floors <= 20) {
            this.floors = floors;
        } else {
            throw new IllegalArgumentException("Floors must be between 1 and 20.");
        }
    }

    public char getSpeed() {
        return speed;
    }

    public int getFloors() {
        return floors;
    }

    public int getSpeedCost() {
        return (speed == 'F') ? 3000 : 1500;
    }

    public int getFloorCost() {
        if (floors <= 5) {
            return floors * 2000;
        } else if (floors <= 10) {
            return floors * 1500;
        } else {
            return floors * 1000;
        }
    }

    public int getTotalCost() {
        return getSpeedCost() + getFloorCost() + 100;
    }

    @Override
    public String toString() {
        return String.format(
                "Elevator [speed=%c, floors=%d, speedCost=%d, floorCost=%d, totalCost=%d]",
                speed, floors, getSpeedCost(), getFloorCost(), getTotalCost());
    }
}
