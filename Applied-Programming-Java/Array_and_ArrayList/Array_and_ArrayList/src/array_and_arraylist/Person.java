
package array_and_arraylist;


public class Person {
    private String name;
    private int age;
    private String email;

    public Person() {
    }

    // Constructor with validation
    
    public Person(String name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter with name length check
    public void setName(String name) {
        if (name != null && name.length() > 3) {
            this.name = name;
        } else {
            System.out.println("Name must be longer than 3 characters.");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Setter with age check
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be greater than 0.");
        }
    }

    // Getter for email
    public String getEmail() {
        return email;
    }

    // Setter with basic email format check
    public void setEmail(String email) {
        if (email != null && email.contains("@") ) {
            this.email = email;
        } else {
            System.out.println("Invalid email format.");
        }
    }

    // toString method for easy printing
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Email: " + email;
    }
    
}
