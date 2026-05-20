import java.util.Scanner;

public class ElectricitySurcharge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalConsumption = 0;
        
        System.out.println("Enter electricity usage values in kWh (Type -1 to finish):");
        while (true) {
            double usage = input.nextDouble();
            if (usage == -1) {
                break;
            }
            if (usage < 0) {
                System.out.println("Invalid consumption value. Please enter a valid number.");
                continue;
            }
            totalConsumption += usage;
        }
        
        double surchargePercentage = 0.0;
        if (totalConsumption >= 200 && totalConsumption <= 600) {
            surchargePercentage = 0.10;
        } else if (totalConsumption > 600) {
            surchargePercentage = 0.20;
        }
        
        double finalAmount = totalConsumption * (1 + surchargePercentage);
        
        System.out.println("\n--- Electricity Statement ---");
        System.out.println("Total energy consumed: " + totalConsumption + " kWh");
        System.out.println("Final amount with surcharge included: " + finalAmount);
        input.close();
    }
}