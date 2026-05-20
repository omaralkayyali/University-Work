/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exam_form;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class CosmeticStore {
    private int serialNum;
    private ArrayList<Musk> muskP;

    // Default Constructor
    public CosmeticStore() {
        this.serialNum = 123456;
        this.muskP = new ArrayList<>();
    }

    // Parameterized Constructor
    public CosmeticStore(int serialNum) {
        setSerialNum(serialNum);
        this.muskP = new ArrayList<>();
    }

    public void setSerialNum(int serialNum) {
        if (serialNum >= 123 && serialNum <= 123999) {
            this.serialNum = serialNum;
        } else {
            throw new IllegalArgumentException("Serial number must be between 123 and 123999.");
        }
    }

    public int getSerialNum() {
        return serialNum;
    }

    public void addMusk(Musk musk) {
        muskP.add(musk);
    }

    public void addMuskFromInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Musk ID:");
        int id = scanner.nextInt();
        System.out.println("Enter Musk Name (White/Black):");
        String name = scanner.next();
        System.out.println("Enter Musk Price:");
        double price = scanner.nextDouble();
        System.out.println("Enter Musk Scent (O/F/W/T):");
        char scent = scanner.next().charAt(0);

        Musk musk = new Musk(id, name, price, scent);
        addMusk(musk);
    }

    public void displayMuskByPrice(double maxPrice) {
        for (Musk musk : muskP) {
            if (musk.getTotalPrice() <= maxPrice) {
                System.out.println(musk.getMuskInfo());
            }
        }
    }
    
}
