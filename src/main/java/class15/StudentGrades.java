package class15;

public class StudentGrades {
    private String name;
    private double grade1;
    private double grade2;
    private double grade3;
    public StudentGrades (String sname, double sMarks1, double sMarks2, double sMarks3) {
        name = sname;
        grade1 = sMarks1;
        grade2 = sMarks2;
        grade3 = sMarks3;
    }

    public void averageGrade() {
        double avgGrade = (grade1 + grade2 + grade3) / 3;
        System.out.println(name + "'s average grade is " + Math.round(avgGrade));
    }

}
