public class Student {
    // Attributes (Class Members) - Part 1
    private String name;         // to store the student's name
    private int studentId;       // to store the student ID number
    private double[] grades;     // to store multiple grades as an array
    private double average;      // to store the calculated average grade

    // Constructor - Part 1
    public Student(String name, int studentId, double[] grades) {
        // Use 'this' keyword to assign parameter values to the class attributes
        this.name = name;
        this.studentId = studentId;
        this.grades = grades;
        // Calls the calculateAverage() method to set the average attribute
        this.average = calculateAverage();
    }

    // Getter Methods - Part 1
    public String getName() {
        return name; // returns the student's name
    }

    public int getStudentId() {
        return studentId; // returns the student ID
    }

    public double[] getGrades() {
        return grades; // returns the grades array
    }

    public double getAverage() {
        return average; // returns the average
    }

    // calculateAverage() Method (Non-void) - Part 1
    public double calculateAverage() {
        // Is a non-void method (returns a double value)
        double sum = 0;
        // Uses a loop to go through all grades in the grades array
        for (double grade : grades) {
            sum += grade; // Calculates the sum of all grades
        }
        // Returns the average (sum divided by number of grades)
        return sum / grades.length;
    }

    // displayStudentInfo() Method (Void) - Part 1
    public void displayStudentInfo() {
        // Is a void method (doesn't return anything)
        System.out.println("--- Student Information ---");
        // Prints the student's ID and name
        System.out.println("ID: " + studentId + " | Name: " + name);
        System.out.print("Grades: ");
        // Uses a loop to print all grades in the grades array
        for (double grade : grades) {
            System.out.print(grade + " ");
        }
        System.out.println();
        // Prints the calculated average
        System.out.printf("Average Grade: %.2f\n", average);
        System.out.println("---------------------------");
    }
}