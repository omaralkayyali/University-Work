import java.util.Scanner;

public class VehicleSpeedAnalyzer {
    
    public static void calculateHighSpeeds() {
        Scanner input = new Scanner(System.in);
        double[] speeds = new double[10];
        double sum = 0;
        int count = 0;
        
        System.out.println("Enter the speeds of 10 vehicles (in km/h):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Vehicle " + (i + 1) + ": ");
            speeds[i] = input.nextDouble();
            
            if (speeds[i] > 80) {
                sum += speeds[i];
                count++;
            }
        }
        
        if (count > 0) {
            double average = sum / count;
            System.out.printf("Average of speeds greater than 80 km/h: %.2f km/h\n\n", average);
        } else {
            System.out.println("No vehicles had speeds greater than 80 km/h.\n");
        }
    }

    public static void main(String[] args) {
        // استدعاء الدالة ثلاث مرات متتالية بناءً على الطلب
        System.out.println("--- Run 1 ---");
        calculateHighSpeeds();
        
        System.out.println("--- Run 2 ---");
        calculateHighSpeeds();
        
        System.out.println("--- Run 3 ---");
        calculateHighSpeeds();
    }
}