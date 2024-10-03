package individualDemos;

import java.util.ArrayList;

public class StudentGradesArrayVersion {
    public static void main(String[] args) {
        // Create ArrayList to store students
        ArrayList<Student> allStudents = new ArrayList<>();

        // Add new students
        allStudents.add(new Student("D. Cheng", 95, 90, 88, 93));
        allStudents.add(new Student("A. Wong", 100, 99, 100, 98));
        allStudents.add(new Student("C. Huang", 95, 95, 90, 88));
        allStudents.add(new Student("J. Wu", 99, 98, 100, 90));
        
        // Iterate through list and output average
        for (Student student : allStudents) {
            System.out.println(student.getName() + ": " + student.getAverage() + " average");
        }
    }
}

