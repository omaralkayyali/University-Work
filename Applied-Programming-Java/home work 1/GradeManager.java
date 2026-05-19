public class GradeManager {
    // public static method called createStudents() - Part 2
    public static Student[] createStudents() {
        // Is a non-void method that returns a Student array
        
        // Creates grade arrays for at least 3 different students
        double[] grades1 = {85.5, 90.0, 78.5};
        double[] grades2 = {95.0, 92.5, 98.0};
        double[] grades3 = {70.0, 80.0, 75.0};
        
        // Creates Student objects using the constructor
        Student student1 = new Student("Ali Ahmad", 1001, grades1);
        Student student2 = new Student("Sara Moahmed", 1002, grades2);
        Student student3 = new Student("Khaled Hassan", 1003, grades3);
        
        // Returns an array containing all the Student objects
        Student[] studentsArray = {student1, student2, student3};
        return studentsArray;
    }

    // public static method called showAllStudents() - Part 2
    public static void showAllStudents(Student[] students) {
        // Is a void method
        // Takes a Student array as a parameter
        System.out.println("\n*** Displaying All Students' Info ***");
        // Uses a loop to call displayStudentInfo() on each Student object
        for (Student student : students) {
            student.displayStudentInfo();
        }
    }

    // public static method called findBestStudent() - Part 2
    public static Student findBestStudent(Student[] students) {
        // Is a non-void method that returns a Student object
        // Takes a Student array as a parameter
        
        if (students == null || students.length == 0) {
            return null;
        }

        Student bestStudent = students[0];
        // Compares averages of all students to find the one with the highest average
        for (int i = 1; i < students.length; i++) {
            if (students[i].getAverage() > bestStudent.getAverage()) {
                bestStudent = students[i];
            }
        }
        // Returns the Student with the highest average
        return bestStudent;
    }

    // main() method - Part 2 & 3
    public static void main(String[] args) {
        System.out.println("Starting Student Grade Management System...");
        
        // 1. Call createStudents() and store the returned array
        Student[] allStudents = createStudents();
        
        // 2. Call showAllStudents() to display all students
        showAllStudents(allStudents);
        
        // 3. Call findBestStudent() and store the result
        Student topStudent = findBestStudent(allStudents);
        
        // 4. Print the best student's name and average
        if (topStudent != null) {
            System.out.println("\n*** The Best Student ***");
            System.out.println("The student with the highest average is:");
            System.out.printf("Name: %s | Average: %.2f\n", 
                              topStudent.getName(), topStudent.getAverage());
            System.out.println("************************");
        } else {
            System.out.println("\nNo students found.");
        }
    }
}