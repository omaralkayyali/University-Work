import java.util.Scanner;

public class BasicCalculator {
    
    public static double add(double n1, double n2) { return n1 + n2; }
    public static double subtract(double n1, double n2) { return n1 - n2; }
    public static double multiply(double n1, double n2) { return n1 * n2; }
    public static double divide(double n1, double n2) {
        if (n2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN;
        }
        return n1 / n2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        double num1 = input.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = input.nextDouble();
        
        System.out.print("Select operation (+, -, *, /): ");
        char operation = input.next().charAt(0);
        
        double result = 0;
        boolean valid = true;
        
        switch (operation) {
            case '+': result = add(num1, num2); break;
            case '-': result = subtract(num1, num2); break;
            case '*': result = multiply(num1, num2); break;
            case '/': result = divide(num1, num2); break;
            default:
                System.out.println("Invalid operation!");
                valid = false;
        }
        
        if (valid && !Double.isNaN(result)) {
            System.out.println("Result: " + result);
        }
        input.close();
    }
}