public class WeatherDemo {
    public static void main(String[] args) {
        WeatherData current = new WeatherData(22.5, 45, "Amman");
        Forecast forecast = new Forecast(28.0, 60, "Irbid", "Cloudy");

        System.out.println(current.getWeatherSummary());
        System.out.println(forecast);

        try {
            current.setTemperature(55);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
    }
}
