package arrayDemos;

import java.util.ArrayList;

public class StudentGrades {
    public static void main(String[] args) {
        // Create an ArrayList to store students
        ArrayList<Student> students = new ArrayList<>();

        // Add new students with varying numbers of grades
        students.add(new Student("D. Cheng", 95, 90, 88, 93));  // 4 grades
        students.add(new Student("A. Wong", 100, 99, 100));     // 3 grades
        students.add(new Student("C. Huang", 95, 95, 90, 88));  // 4 grades
        students.add(new Student("J. Wu", 99, 98, 100));        // 3 grades
        students.add(new Student("R. Lee", 85, 92));            // 2 grades
        students.add(new Student("K. Zuo"));                  // No grades

        // Iterate through the ArrayList and print each student's average
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.getAverage() + " average");
        }
    }
}