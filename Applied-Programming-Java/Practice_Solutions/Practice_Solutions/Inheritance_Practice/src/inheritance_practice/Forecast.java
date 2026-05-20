
package inheritance_practice;


public class Forecast extends WeatherData {
     private double precipitationProbability;
    private double windSpeed;

    public Forecast() {
        super();
        this.precipitationProbability = 0.0;
        this.windSpeed = 5.0;
    }

    public Forecast(double temperature, int humidity, String location, double precipitationProbability, double windSpeed) {
        super(temperature, humidity, location);
        setPrecipitationProbability(precipitationProbability);
        setWindSpeed(windSpeed);
    }

    public void setPrecipitationProbability(double precipitationProbability) {
        if (precipitationProbability >= 0.0 && precipitationProbability <= 1.0) {
            this.precipitationProbability = precipitationProbability;
        } else {
            throw new IllegalArgumentException("Precipitation probability must be between 0.0 and 1.0");
        }
    }

    public double getPrecipitationProbability() {
        return precipitationProbability;
    }

    public void setWindSpeed(double windSpeed) {
        if (windSpeed >= 0.0 && windSpeed <= 150.0) {
            this.windSpeed = windSpeed;
        } else {
            throw new IllegalArgumentException("Wind speed must be between 0.0 and 150.0");
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
        return super.getWeatherSummary() + ", Precipitation Probability: " + precipitationProbability + ", Wind Speed: " + windSpeed + ", Comfort Index: " + calculateComfortIndex();
    }

    @Override
    public String toString() {
        return "Forecast [" + super.toString() + ", Precipitation Probability=" + precipitationProbability + ", Wind Speed=" + windSpeed + ", Comfort Index=" + calculateComfortIndex() + "]";
    }
    
}
