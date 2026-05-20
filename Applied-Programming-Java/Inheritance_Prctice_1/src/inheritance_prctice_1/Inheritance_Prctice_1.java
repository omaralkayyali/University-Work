/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_prctice_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Inheritance_Prctice_1 {

    static Scanner scanner = new Scanner(System.in);

    public static void populateForecasts(ArrayList<Forcast> forecasts) {

        for (int i = 0; i < 5; i++) {
            System.out.println("\nEnter details for forecast " + (i + 1) + ":");
            System.out.print("Location: ");
            String location = scanner.nextLine();
            System.out.print("Temperature (-50 to 50): ");
            double temp = scanner.nextDouble();
            System.out.print("Humidity (0-100): ");
            int humidity = scanner.nextInt();
            System.out.print("Precipitation Probability (0.0-1.0): ");
            double precip = scanner.nextDouble();
            System.out.print("Wind Speed (0.0-150.0 km/h): ");
            double wind = scanner.nextDouble();
            scanner.nextLine();

            forecasts.add(new Forcast(temp, humidity, location, precip, wind));
        }
    }

    public static void searchByLocation(ArrayList<Forcast> forecasts) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nEnter location to search: ");
        String searchLocation = scanner.nextLine();

        boolean found = false;
        for (int i = 0; i < forecasts.size(); i++) {
            Forcast f = forecasts.get(i);
            if (f.getLocation().equalsIgnoreCase(searchLocation)) {
                System.out.println(f.getWeatherSummary());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No forecasts found for location: " + searchLocation);
        }
    }

    public static void main(String[] args) {
        ArrayList<Forcast> forecasts = new ArrayList<>();
        populateForecasts(forecasts);
        searchByLocation(forecasts);
    }
}
