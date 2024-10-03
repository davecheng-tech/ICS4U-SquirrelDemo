package individualDemos;

public class Student {
    private String name;
    private int grade1;
    private int grade2;
    private int grade3;
    private int grade4;
    
    public Student(String name, int grade1, int grade2, int grade3, int grade4) {
        this.name = name;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.grade3 = grade3;
        this.grade4 = grade4;
    }

    public String getName() {
        return name;
    }

    public double getAverage() {
        return (double) (grade1 + grade2 + grade3 + grade4) / 4;
    }

    public String toString() {
        return name + ": " + grade1 + " " + grade2 + " " + grade3 + " " + grade4;
    }
}
