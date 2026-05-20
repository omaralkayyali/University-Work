/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practice_sheet_solution_1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Computer {
     Scanner scanner = new Scanner(System.in);

    private String brand;
    private String processor;
    private int ram;

    public Computer() {
        this.brand = "Dell";
        this.processor = "Intel";
        this.ram = 16;
    }

    public Computer(String brand, String processor, int ram) {
        setBrand(brand);
        setProcessor(processor);
        setRam(ram);
    }

    public void setBrand(String brand) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setProcessor(String processor) {
        if (processor != null && !processor.isEmpty()) {
            this.processor = processor;
        }
    }

    public void setProcessor() {
       
        System.out.print("Enter processor manufacturer: ");
        String input = scanner.nextLine();
        setProcessor(input);
    }

    public String getProcessor() {
        return processor;
    }

    public void setRam(int ram) {
        if (ram == 16 || ram == 32 || ram == 64 || ram == 128) {
            this.ram = ram;
        }
    }

    public int getRam() {
        return ram;
    }

    public double getRamPrice() {
        return ram * 5;
    }

    public double getTotalPrice() {
        return getRamPrice() + 50;
    }

    @Override
    public String toString() {
        return "Computer [Brand=" + brand + ", Processor=" + processor + ", RAM=" + ram + "GB, Total Price=$" + getTotalPrice() + "]";
    }
}
