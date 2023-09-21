package class17;

import org.checkerframework.checker.units.qual.C;

public class TeacherTester {
    public static void main(String[] args) {

        Teacher sub = new Teacher("Shawn", "1st Grade to 6th Grade", "Supplementary Substitute");
        MathTeacher math = new MathTeacher("Herman", "11th grade", "Trigonometry");
        ChemistryTeacher science = new ChemistryTeacher("Bill Nuy", "8th Grade", "Chemistry");
        PianoTeacher piano = new PianoTeacher("Chucho Valdes", "College", "Jazz");

        sub.printInfo();
        math.printInfo();
        science.printInfo();
        piano.printInfo();
    }
}
