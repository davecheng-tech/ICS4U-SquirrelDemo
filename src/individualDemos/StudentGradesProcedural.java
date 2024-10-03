package individualDemos;

public class StudentGradesProcedural {
    public static void main(String[] args) {
        // Defining student data
        String student1Name = "D. Cheng";
        int student1Grade1 = 95, student1Grade2 = 90, student1Grade3 = 88, student1Grade4 = 93;
        String student2Name = "A. Wong";
        int student2Grade1 = 100, student2Grade2 = 99, student2Grade3 = 100, student2Grade4 = 98;
        String student3Name = "C. Huang";
        int student3Grade1 = 95, student3Grade2 = 95, student3Grade3 = 90, student3Grade4 = 88;
        String student4Name = "J. Wu";
        int student4Grade1 = 99, student4Grade2 = 98, student4Grade3 = 100, student4Grade4 = 90;

        // Calculate averages
        double student1Average = (double) (student1Grade1 + student1Grade2 + student1Grade3 + student1Grade4) / 4;
        double student2Average = (double) (student2Grade1 + student2Grade2 + student2Grade3 + student2Grade4) / 4;
        double student3Average = (double) (student3Grade1 + student3Grade2 + student3Grade3 + student3Grade4) / 4;
        double student4Average = (double) (student4Grade1 + student4Grade2 + student4Grade3 + student4Grade4) / 4;

        // Print student averages
        System.out.println(student1Name + ": " + student1Average + " average");
        System.out.println(student2Name + ": " + student2Average + " average");
        System.out.println(student3Name + ": " + student3Average + " average");
        System.out.println(student4Name + ": " + student4Average + " average");
    }
}