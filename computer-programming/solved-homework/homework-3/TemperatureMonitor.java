import java.util.Scanner;

public class TemperatureMonitor {
    
    public static String FREEZING(double celsius) {
        if (celsius <= 0) {
            return "freezing point or below";
        } else {
            return "above freezing point";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter temperatures in Celsius (Enter less than -100 to stop):");
        while (true) {
            double temp = input.nextDouble();
            if (temp < -100) {
                break;
            }
            String status = FREEZING(temp);
            System.out.println("Result: " + status);
        }
        input.close();
    }
}