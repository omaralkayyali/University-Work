import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double EXCHANGE_RATE = 0.92;
        
        System.out.print("Enter amount in US Dollars (USD): ");
        double usdAmount = input.nextDouble();
        
        double eurAmount = usdAmount * EXCHANGE_RATE;
        
        System.out.println("Equivalent amount in Euros (EUR): " + eurAmount);
        input.close();
    }
}