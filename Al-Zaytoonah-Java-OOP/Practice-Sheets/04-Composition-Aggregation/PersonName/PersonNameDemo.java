import java.util.ArrayList;

public class PersonNameDemo {
    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Person(new Name("Omar", "Ali"), 21, "omar@example.com"));
        people.add(new Person(new Name("Mona", "Hassan"), 19, "mona@example.com"));

        System.out.println("=== Composition Demo: Person & Name ===");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
