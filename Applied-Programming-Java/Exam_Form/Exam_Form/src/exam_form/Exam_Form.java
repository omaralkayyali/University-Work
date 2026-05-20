/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_form;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Exam_Form {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CosmeticStore store1 = new CosmeticStore();
        CosmeticStore store2 = new CosmeticStore(124000);
        
        fillStoreWithTwoMusks(store1);
        fillStoreWithTwoMusks(store2);
        searchAndDisplayMusksByPrice(store1);
        searchAndDisplayMusksByPrice(store2);
    }
    public static void fillStoreWithTwoMusks(CosmeticStore store) {
        Musk musk1 = new Musk(101, "White", 50, 'W');
        Musk musk2 = new Musk(102, "Black", 70, 'T');
        store.addMusk(musk1);
        store.addMusk(musk2);
    }
    
    public static void searchAndDisplayMusksByPrice(CosmeticStore store) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter maximum price to search for Musks:");
        double maxPrice = scanner.nextDouble();
        System.out.println("Musks with total price <= " + maxPrice + ":");
        store.displayMuskByPrice(maxPrice);
    }
}
