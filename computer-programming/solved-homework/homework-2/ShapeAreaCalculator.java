import java.util.Scanner;

public class ShapeAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the name of a shape (square, circle, rectangle, triangle, or oval): ");
        String shape = input.next().toLowerCase();
        
        switch (shape) {
            case "square":
                System.out.print("Enter the side length: ");
                double side = input.nextDouble();
                System.out.println("Area of Square: " + (side * side));
                break;
                
            case "circle":
                System.out.print("Enter the radius: ");
                double radius = input.nextDouble();
                System.out.println("Area of Circle: " + (Math.PI * radius * radius));
                break;
                
            case "rectangle":
                System.out.print("Enter length: ");
                double length = input.nextDouble();
                System.out.print("Enter width: ");
                double width = input.nextDouble();
                System.out.println("Area of Rectangle: " + (length * width));
                break;
                
            case "triangle":
                System.out.print("Enter base: ");
                double base = input.nextDouble();
                System.out.print("Enter height: ");
                double height = input.nextDouble();
                System.out.println("Area of Triangle: " + (0.5 * base * height));
                break;
                
            case "oval":
                System.out.print("Enter semi-major axis radius (a): ");
                double a = input.nextDouble();
                System.out.print("Enter semi-minor axis radius (b): ");
                double b = input.nextDouble();
                System.out.println("Area of Oval: " + (Math.PI * a * b));
                break;
                
            default:
                System.out.println("Error: Unknown shape entered.");
        }
        input.close();
    }
}