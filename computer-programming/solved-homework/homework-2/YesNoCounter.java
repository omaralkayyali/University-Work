import java.util.Scanner;

public class YesNoCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yesCount = 0;
        
        System.out.println("Please enter responses to 20 yes-or-no questions:");
        for (int i = 1; i <= 20; i++) {
            System.out.print("Response to question #" + i + ": ");
            String response = input.next().trim().toLowerCase();
            
            if (response.equals("yes")) {
                yesCount++;
            }
        }
        
        System.out.println("Total number of 'yes' responses: " + yesCount);
        input.close();
    }
}