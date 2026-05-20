import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter integer number " + i + ": ");
            int num = input.nextInt();
            
            if (num < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long factorial = 1;
                for (int j = 1; j <= num; j++) {
                    factorial *= j;
                }
                System.out.println("Factorial of " + num + " (" + num + "!) = " + factorial);
            }
        }
        input.close();
    }
}