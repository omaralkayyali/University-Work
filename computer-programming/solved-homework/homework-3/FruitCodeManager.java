import java.util.Scanner;

public class FruitCodeManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] fruitCodes = new char[12];
        int countAB = 0;
        
        System.out.println("Enter 12 fruit codes (A, B, O, or X):");
        for (int i = 0; i < fruitCodes.length; i++) {
            System.out.print("Code " + (i + 1) + ": ");
            fruitCodes[i] = input.next().toUpperCase().charAt(0);
            
            if (fruitCodes[i] == 'A' || fruitCodes[i] == 'B') {
                countAB++;
            }
        }
        
        System.out.println("Fruit codes A or B appeared: " + countAB + " times.");
        
        // استبدال الـ X بحرف U
        for (int i = 0; i < fruitCodes.length; i++) {
            if (fruitCodes[i] == 'X') {
                fruitCodes[i] = 'U';
            }
        }
        
        System.out.print("Updated fruit codes: ");
        for (char code : fruitCodes) {
            System.out.print(code + " ");
        }
        System.out.println();
        input.close();
    }
}