package class15;

public class StudentReportCard {
    public static void main(String[] args) {

        StudentGrades s1 = new StudentGrades("John", 78.9, 86.5,97.4);
        s1.averageGrade();

        StudentGrades s2 = new StudentGrades("Peter", 98,94,96);
        s2.averageGrade();

        StudentGrades s3 = new StudentGrades("Monica", 100,98,94.8);
        s3.averageGrade();

        StudentGrades s4 = new StudentGrades("Shawn", 100,96.3,95.5);
        s4.averageGrade();

        StudentGrades s5 = new StudentGrades("Katherine", 92,90.3,88.4);
        s5.averageGrade();
    }
}
