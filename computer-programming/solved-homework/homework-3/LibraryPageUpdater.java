import java.util.Scanner;

public class LibraryPageUpdater {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the number of books in the library section: ");
        int numBooks = input.nextInt();
        
        int[] pages = new int[numBooks];
        int totalPages = 0;
        
        for (int i = 0; i < numBooks; i++) {
            System.out.print("Enter page count for book " + (i + 1) + ": ");
            pages[i] = input.nextInt();
            totalPages += pages[i];
        }
        
        double increasePercentage = (totalPages > 10000) ? 0.10 : 0.05;
        
        System.out.println("\nUpdated page counts:");
        for (int i = 0; i < numBooks; i++) {
            double updatedPage = pages[i] * (1 + increasePercentage);
            System.out.printf("Book %d: %.1f pages\n", (i + 1), updatedPage);
        }
        
        input.close();
    }
}