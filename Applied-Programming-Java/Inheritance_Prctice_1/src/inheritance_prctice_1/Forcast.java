/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_prctice_1;

/**
 *
 * @author admin
 */
public class Forcast extends WeatherData {

    private double precipitationProbability;
    private double windSpeed;

    public Forcast() {
        super();
        this.precipitationProbability = 0.0;
        this.windSpeed = 5.0;
    }

    public Forcast(double temperature, int humidity, String location, double precipitationProbability, double windSpeed) {
        super(temperature, humidity, location);
        setPrecipitationProbability(precipitationProbability);
        setWindSpeed(windSpeed);
    }

    public void setPrecipitationProbability(double precipitationProbability) {
        if (precipitationProbability >= 0.0 && precipitationProbability <= 1.0) {
            this.precipitationProbability = precipitationProbability;
        }
    }

    public double getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setWindSpeed(double windSpeed) {
        if (windSpeed >= 0.0 && windSpeed <= 150.0) {
            this.windSpeed = windSpeed;
        }
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public double calculateComfortIndex() {
        return (100 - getHumidity()) - (windSpeed * 0.1) + (getTemperature() * 0.2);
    }

    @Override
    public String getWeatherSummary() {
        return super.getWeatherSummary() + ", Precipitation: " + (precipitationProbability * 100) + "%, Wind: " + windSpeed + " km/h, Comfort Index: " + String.format("%.2f", calculateComfortIndex());
    }

    @Override
    public String toString() {
        return "Forecast [" + getWeatherSummary() + "]";
    }
}
