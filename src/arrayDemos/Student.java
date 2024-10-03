package arrayDemos;

import java.util.Arrays;

public class Student {
    private String name;
    private int[] grades;

    // Constructor to accept a name and any number of grades (varargs)
    public Student(String name, int... grades) {
        this.name = name;
        this.grades = grades;  // store grades as an array
    }

    // Getter for the name
    public String getName() {
        return name;
    }

    // Calculate the average of the grades
    public double getAverage() {
        if (grades.length == 0) {
            return 0;  // Avoid division by zero if no grades are provided
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    // toString method to print student details
    @Override  // Optional -- indicates overriding the toString() method in Object superclass
    public String toString() {
        return name + ": " + Arrays.toString(grades);
    }
}