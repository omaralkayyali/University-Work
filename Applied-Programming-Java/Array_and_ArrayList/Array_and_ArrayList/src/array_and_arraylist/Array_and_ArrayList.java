package array_and_arraylist;

import java.util.Scanner;

public class Array_and_ArrayList {

    static Scanner x = new Scanner(System.in);
// Method to Fill objects of type Person
    public static void FillPerson(Person[] P) {
        for (int i = 0; i < P.length; i++) {
            System.out.println("Please enter the data for object " + (i + 1));
            System.out.println("Please enter your name:");
            String n = x.nextLine();
            System.out.println("Please enter your age:");
            int a = x.nextInt();
            x.nextLine();
            System.out.println("Please enter your email:");
            String e = x.nextLine();
            P[i] = new Person(n, a, e);
            /* System.out.println("Please enter the data for object "+(i+1)+ "as follows:Name, age, email");
             P[i]= new Person (x.nextLine(),x.nextInt(),x.nextLine());*/
        }
    }
// Method to Print objects of type Person
    public static void PrintPerson(Person[] P) {

        for (int i = 0; i < P.length; i++) {
            System.out.println("This is the data for object " + (i + 1));
            if (P[i].getAge() >= 23 && P[i].getName().startsWith("A")) {
                System.out.println(P[i]);
            }
        }


    }

    public static void main(String[] args) {
        // Create Arrays PE , PE1
        Person[] PE = new Person[10];
        Person[] PE1 = new Person[20];
        // Use the method Fill Person with PE ane PE1 
        FillPerson(PE);
        FillPerson(PE1);
        // Use the method Fill Person with PE ane PE1 
        PrintPerson(PE);
        PrintPerson(PE1);







    }
}
