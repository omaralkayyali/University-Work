/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_prctice_1;

/**
 *
 * @author admin
 */
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
        setLocation(location);
    }

    public void setTemperature(double temperature) {
        if (temperature >= -50.0 && temperature <= 50.0) {
            this.temperature = temperature;
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setHumidity(int humidity) {
        if (humidity >= 0 && humidity <= 100) {
            this.humidity = humidity;
        }
    }

    public int getHumidity() {
        return humidity;
    }

    public void setLocation(String location) {
        if (location != null && !location.isEmpty()) {
            this.location = location;
        }
    }

    public String getLocation() {
        return location;
    }

    public String getWeatherSummary() {
        return "Location: " + location + ", Temp: " + temperature + "°C, Humidity: " + humidity + "%";
    }

    @Override
    public String toString() {
        return "WeatherData [location=" + location + ", temperature=" + temperature + "°C, humidity=" + humidity + "%]";
    }
}
