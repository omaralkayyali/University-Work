package inheritance_practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Inheritance_Practice {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Forecast> forecasts = new ArrayList<>();
        populateForecasts(forecasts);
        searchAndPrintForecasts(forecasts);
    }
private static void populateForecasts(ArrayList<Forecast> forecasts) {
    for (int i = 0; i < 5; i++) {
        System.out.println("Please enter data for Forecast " + (i + 1) + ":");

        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();

        System.out.print("Enter humidity: ");
        int humidity = scanner.nextInt();

        System.out.print("Enter location: ");
        String location = scanner.next(); // Assumes a single word for location.

        System.out.print("Enter precipitation probability: ");
        double precipitationProbability = scanner.nextDouble();

        System.out.print("Enter wind speed: ");
        double windSpeed = scanner.nextDouble();

        // Add the new Forecast object to the list.
        forecasts.add(new Forecast(temperature, humidity, location, precipitationProbability, windSpeed));
    }
}
/*
    private static void populateForecasts(ArrayList<Forecast> forecasts) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter Forcast data...");
            forecasts.add(new Forecast(scanner.nextDouble(), scanner.nextInt(), scanner.next(), scanner.nextDouble(), scanner.nextDouble()));
            
        }

    }*/

    private static void searchAndPrintForecasts(ArrayList<Forecast> forecasts) {
        System.out.println("Please enter location...");
        String location = scanner.next();

        for (int i = 0; i < forecasts.size(); i++) {
            if (forecasts.get(i).getLocation().equalsIgnoreCase(location)) {
                System.out.println(forecasts.get(i).getWeatherSummary());
            } else {
                System.out.println("No forecasts found for the location: " + location);
            }
        }
    }
}
