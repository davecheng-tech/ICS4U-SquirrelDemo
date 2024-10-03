package individualDemos;

public class StudentGrades {
    public static void main(String[] args) {
        // Add new students
        Student student1 = new Student("D. Cheng", 95, 90, 88, 93);
        Student student2 = new Student("A. Wong", 100, 99, 100, 98);
        Student student3 = new Student("C. Huang", 95, 95, 90, 88);
        Student student4 = new Student("J. Wu", 99, 98, 100, 90);
        
        System.out.println(student1.getName() + ": " + student1.getAverage() + " average");
        System.out.println(student2.getName() + ": " + student2.getAverage() + " average");
        System.out.println(student3.getName() + ": " + student3.getAverage() + " average");
        System.out.println(student4.getName() + ": " + student4.getAverage() + " average");

    }
}

