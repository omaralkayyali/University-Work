public class Person {
    private Name name;
    private int age;
    private String email;

    public Person(Name name, int age, String email) {
        setName(name);
        setAge(age);
        setEmail(email);
    }

    public void setName(Name name) {
        if (name == null) {
            throw new IllegalArgumentException("Name object cannot be null.");
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age must be positive.");
        }
    }

    public void setEmail(String email) {
        if (email != null && email.contains("@")) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email address.");
        }
    }

    public Name getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return String.format("Person [name=%s, age=%d, email=%s]", name, age, email);
    }
}
