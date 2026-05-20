/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance_practice_2;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Computer {
    private String brand;
    private String processor;
    private int ram;

    public Computer() {
        this.brand = "Dell";
        this.processor = "Intel";
        this.ram = 16;
    }

    public Computer(String brand, String processor, int ram) {
        this.brand = brand;
        setRam(ram);
        this.processor = processor;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setRam(int ram) {
        if (ram == 16 || ram == 32 || ram == 64 || ram == 128) {
            this.ram = ram;
        } else {
            throw new IllegalArgumentException("RAM must be 16, 32, 64, or 128");
        }
    }

    public int getRam() {
        return ram;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public void setProcessor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter processor manufacturer: ");
        this.processor = scanner.nextLine();
    }

    public String getProcessor() {
        return processor;
    }

    public double getRamPrice() {
        return ram * 5;
    }

    public double getTotalPrice() {
        return getRamPrice() + 50;
    }

    @Override
    public String toString() {
        return "Computer [Brand=" + brand + ", Processor=" + processor + ", RAM=" + ram + "]";
    }
    
}
