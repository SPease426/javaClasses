package class16;

public class Student {
    private String name;
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Student's name is " + name + " and address is " +  address);
    }

    public static void main(String[] args) {
        Student s1 = new Student("Peter", "4324 Queen's Drive");
        s1.displayInfo();
    }
}
