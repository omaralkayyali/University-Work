package array_and_arraylist_part2;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_and_ArrayList_Part2 {

    static Scanner x = new Scanner(System.in);

    public static void FillArrayList(ArrayList<Person> P) {
        System.out.println("Please enter Array List size..");
        int s = x.nextInt();
        for (int i = 0; i < s; i++) {
            System.out.println("Please enter the content of  object " + (i + 1));
            System.out.println("Please enter your name..");
            String n = x.nextLine();
            System.out.println("Please enter your age..");
            int a = x.nextInt();
            x.nextLine();
            System.out.println("Please enter your email..");
            String e = x.nextLine();
            Person PR = new Person(n, a, e);
            P.add(PR);
            /* System.out.println("Please enter your objects' data: name, age, email");
             P.add(new Person (x.nextLine(), x.nextInt(),x.nextLine()));*/

        }
    }

    public static void Print(ArrayList<Person> P) {
        for (int i = 0; i < P.size(); i++) {
            if (P.get(i).getAge() >= 23) {
                System.out.println(P.get(i));
            }
        }
    }

    public static void RemoveObject(ArrayList<Person> P) {
        for (int i = 0; i < P.size(); i++) {
            if (P.get(i).getAge()<23)
                P.remove(i);
        }

    }

    public static void main(String[] args) {
        ArrayList<Person> P = new ArrayList<>();
        ArrayList<Person> P1 = new ArrayList<>();
        ArrayList<Person> P2 = new ArrayList<>();
        System.out.println(P.size());
        // to define new object of type person
        Person Pr = new Person("Assal Ali", 36, "Assal@zuj.edu.jo");
        // add the object of type person to the ArrayLsit
        P.add(Pr);
        P.add(new Person());
        P.add(new Person("Ahamd", 38, "ahmad@yahoo.com"));
        System.out.println(P.size());

        FillArrayList(P);
        FillArrayList(P1);
        FillArrayList(P2);
        Print(P);
        Print(P1);
        RemoveObject(P);
        // System.out.println(P.get(0));

    }
}
