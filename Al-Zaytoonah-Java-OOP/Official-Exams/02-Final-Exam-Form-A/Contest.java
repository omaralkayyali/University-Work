public class Contest {
    private String name;
    private char level;
    private String location;

    public Contest() {
        this.name = "UNKNOWN";
        this.level = 'A';
        this.location = "Amman";
    }

    public Contest(String name, char level, String location) {
        setName(name);
        setLevel(level);
        this.location = location;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            this.name = "UNKNOWN";
        } else {
            this.name = name.toUpperCase();
        }
    }

    public void setLevel(char level) {
        char upper = Character.toUpperCase(level);
        if (upper == 'A' || upper == 'B' || upper == 'C') {
            this.level = upper;
        } else {
            this.level = 'A';
        }
    }

    public void setLocation(String location) {
        this.location = (location == null || location.isEmpty()) ? "Unknown" : location;
    }

    public String getName() {
        return name;
    }

    public char getLevel() {
        return level;
    }

    public String getLocation() {
        return location;
    }

    public double getRegFee() {
        double fee;
        if (level == 'A') {
            fee = 100;
        } else if (level == 'B') {
            fee = 75;
        } else {
            fee = 50;
        }
        if ("Amman".equalsIgnoreCase(location)) {
            return fee;
        } else if ("Irbid".equalsIgnoreCase(location)) {
            return fee + 20;
        } else {
            return fee + 10;
        }
    }

    @Override
    public String toString() {
        return String.format("Contest [name=%s, level=%c, location=%s, regFee=%.2f]", name, level, location, getRegFee());
    }
}
