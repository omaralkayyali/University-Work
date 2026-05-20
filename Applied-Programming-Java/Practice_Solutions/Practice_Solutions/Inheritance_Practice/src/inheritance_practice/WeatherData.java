/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_practice;

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
        this.location = location;
        
    }

    public void setTemperature(double temperature) {
        if (temperature >= -50.0 && temperature <= 50.0) {
            this.temperature = temperature;
        } else {
            System.out.println("Temperature must be between -50.0 and 50.0");
            
        }
    }

    public double getTemperature() {
        return temperature;
    }

    public void setHumidity(int humidity) {
        if (humidity >= 0 && humidity <= 100) {
            this.humidity = humidity;
        } else {
            System.out.println("Humidity must be between 0 and 100");
            
        }
    }

    public int getHumidity() {
        return humidity;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public String getWeatherSummary() {
        return "Location: " + location + ", Temperature: " + temperature + ", Humidity: " + humidity;
    }

    @Override
    public String toString() {
        return "WeatherData [Temperature=" + temperature + ", Humidity=" + humidity + ", Location=" + location + "]";
    }

}
