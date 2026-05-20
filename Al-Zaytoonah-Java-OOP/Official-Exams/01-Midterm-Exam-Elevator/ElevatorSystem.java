import java.util.Scanner;

public class ElevatorSystem {

    public static void fillArray(Elevator[] elevators) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < elevators.length; i++) {
            System.out.println("\\n--- Elevator " + (i + 1) + " ---");
            System.out.print("Enter speed (F/S): ");
            char speed = scanner.next().charAt(0);
            System.out.print("Enter number of floors (1-20): ");
            int floors = scanner.nextInt();
            try {
                elevators[i] = new Elevator(speed, floors);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input: " + e.getMessage());
                i--;
            }
        }
    }

    public static void displayExpensiveElevators(Elevator[] elevators) {
        System.out.println("\\n=== Elevators with total cost > 5000 ===");
        boolean found = false;
        for (Elevator elevator : elevators) {
            if (elevator.getTotalCost() > 5000) {
                System.out.println(elevator);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No elevators exceed total cost 5000.");
        }
    }

    public static void main(String[] args) {
        Elevator[] elevators = new Elevator[5];
        fillArray(elevators);
        System.out.println("\\n=== All Elevators ===");
        for (Elevator elevator : elevators) {
            System.out.println(elevator);
        }
        displayExpensiveElevators(elevators);
    }
}
