package class17;

public class Teacher {

    protected String name;
    protected String grade;
    protected String className;

    public Teacher(String name, String grade, String className) {
        this.name = name;
        this.grade = grade;
        this.className = className;
    }

    public void printInfo() {
        System.out.println(name + " " + grade + " " + className);
    }
}
