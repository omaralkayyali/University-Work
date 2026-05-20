public class WeatherData {
    private double temperature;
    private int humidity;
    private String location;

    public WeatherData() {
        this.temperature = 25.0;
        this.humidity = 50;
        this.location = "Unknown";
    }

    public WeatherData(double temperature, int humidity, String location) {
        setTemperature(temperature);
        setHumidity(humidity);
        this.location = location;
    }

    public void setTemperature(double temperature) {
        if (temperature >= -50 && temperature <= 50) {
            this.temperature = temperature;
        } else {
            throw new IllegalArgumentException("Temperature must be between -50 and 50.");
        }
    }

    public void setHumidity(int humidity) {
        if (humidity >= 0 && humidity <= 100) {
            this.humidity = humidity;
        } else {
            throw new IllegalArgumentException("Humidity must be between 0 and 100.");
        }
    }

    public void setLocation(String location) {
        this.location = (location == null || location.isEmpty()) ? "Unknown" : location;
    }

    public double getTemperature() {
        return temperature;
    }

    public int getHumidity() {
        return humidity;
    }

    public String getLocation() {
        return location;
    }

    public String getWeatherSummary() {
        return String.format("Location: %s | Temperature: %.1f°C | Humidity: %d%%", location, temperature, humidity);
    }

    @Override
    public String toString() {
        return getWeatherSummary();
    }
}
