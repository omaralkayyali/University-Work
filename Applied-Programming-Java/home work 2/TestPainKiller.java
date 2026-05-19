import java.util.Scanner;

public class TestPainKiller {
    static Scanner in = new Scanner(System.in);

    // Static method to fill array from user input
    public static void DataFill(Painkiller[] p) {
        for (int i = 0; i < p.length; i++) {
            p[i] = new Painkiller();
            System.out.print("Enter ID: ");
            p[i].setId(in.nextInt());
            System.out.print("Enter Name: ");
            p[i].setName(in.next());
            System.out.print("Enter Price: ");
            p[i].setPrice(in.nextDouble());
            System.out.print("Enter Type: ");
            p[i].setType(in.next().charAt(0));
            System.out.println("---------------------");
        }
    }

    // Static method to print specific painkiller data based on criteria
    public static void DataPrint(Painkiller[] p) {
        System.out.println("\n*** Filtered Painkiller Results (Type 'p' & Price > 20) ***");
        boolean found = false;
        for (Painkiller x : p) {
            // Filters: type must be 'p' and total price must be greater than 20
            if (x.getType() == 'p' && x.getTotalPrice() > 20) {
                System.out.println(x.getPainKillerInfo());
                found = true;
            }
        }
        if (!found) {
            System.out.println("No painkillers matched the criteria.");
        }
    }

    public static void main(String[] args) {
        // Creates an array capable of holding 3 Painkiller objects
        Painkiller[] p = new Painkiller[3];

        System.out.println("--- Populate Painkiller Data ---");
        DataFill(p);

        DataPrint(p);
    }
}