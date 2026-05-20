import java.util.Scanner;

public class ArrayOperationsPractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] dataset = new int[5];
        
        System.out.println("Enter 5 numbers for structural dataset tracking:");
        for (int i = 0; i < dataset.length; i++) {
            System.out.print("Index [" + i + "]: ");
            dataset[i] = input.nextInt();
        }
        
        int totalSum = 0;
        int maxVal = dataset[0];
        int minVal = dataset[0];
        
        for (int value : dataset) {
            totalSum += value;
            if (value > maxVal) maxVal = value;
            if (value < minVal) minVal = value;
        }
        
        double calculationMean = (double) totalSum / dataset.length;
        
        System.out.print("\nEnter a target value to search: ");
        int trackingTarget = input.nextInt();
        int searchResultIndex = -1;
        
        for (int i = 0; i < dataset.length; i++) {
            if (dataset[i] == trackingTarget) {
                searchResultIndex = i;
                break;
            }
        }
        
        System.out.println("\n============= DATA DATASET STATISTICS =============");
        System.out.println("Calculated Sum: " + totalSum);
        System.out.println("Calculated Mean (Average): " + calculationMean);
        System.out.println("Highest Peak Value: " + maxVal);
        System.out.println("Lowest Base Value: " + minVal);
        System.out.println((searchResultIndex != -1) ? "Target found at index: " + searchResultIndex : "Target element not found.");
        System.out.println("==================================================");
        
        input.close();
    }
}