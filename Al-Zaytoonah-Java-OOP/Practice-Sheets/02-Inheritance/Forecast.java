public class Forecast extends WeatherData {
    private String condition;

    public Forecast() {
        super();
        this.condition = "Sunny";
    }

    public Forecast(double temperature, int humidity, String location, String condition) {
        super(temperature, humidity, location);
        this.condition = condition;
    }

    public void setCondition(String condition) {
        this.condition = (condition == null || condition.isEmpty()) ? "Unknown" : condition;
    }

    public String getCondition() {
        return condition;
    }

    public double calculateComfortIndex() {
        double tempFactor = 37.0 - Math.abs(getTemperature() - 25.0);
        double humidityFactor = 100 - Math.abs(getHumidity() - 50);
        return Math.max(0, (tempFactor + humidityFactor) / 2.0);
    }

    @Override
    public String toString() {
        return String.format("Forecast [location=%s, temp=%.1f°C, humidity=%d%%, condition=%s, comfortIndex=%.2f]",
                getLocation(), getTemperature(), getHumidity(), condition, calculateComfortIndex());
    }
}
