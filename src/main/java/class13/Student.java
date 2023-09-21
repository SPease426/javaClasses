package class13;

public class Student {
    private String name;
    private int ID;
    static int numOfStudents = 0;

    Student(String name, int ID) {
        this.name = name;
        this.ID = ID;
        numOfStudents++;
    }
    void printInfo() {
        System.out.println(name + " is a student with ID: " + ID);
        System.out.print("This student is one of " + numOfStudents);
        System.out.println(" students currently enrolled as students");
    }
    public static void main(String[] args) {
        Student shawn = new Student("Shawn Pease", 200432432);
        Student tim = new Student("Tim Avery", 400324213);
        Student felicia = new Student("Felicia Hardy", 500324246);

        felicia.printInfo();
    }
}
