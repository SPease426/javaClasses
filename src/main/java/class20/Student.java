package class20;

import org.checkerframework.checker.units.qual.C;

public class Student {

    public void study() {
        System.out.println("I study to learn what I lack in my education");
    }

    public void tutoring() {
        System.out.println("Tutoring can help you learn the subject better from a student's perspective");
    }

    public void eat() {
        System.out.println("Need food to be at your best when you aren't starving");
    }
}

class SyntaxStudent extends Student {
    public void tutoring() {
        System.out.println("You'll have only Technical Support and fellow classmates for help");
    }

    public void eat() {
        System.out.println("Your home eat whatever you like");
    }

}

class CollegeStudent extends Student {
    public void tutoring() {
        System.out.println("Tutoring Centers are available for both Math and English classes");
    }

    public void eat() {
        System.out.println("Bring your own lunch");
    }

}

class SchoolStudent extends Student {

    public void eat() {
        System.out.println("Food available in the cafeteria either eat what they are serving or bring your own");
    }

    public static void main(String[] args) {
        Student[] arr = {new Student(), new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};
        for (int i = 0; i < arr.length; i++) {
            arr[i].study();
            arr[i].tutoring();
            arr[i].eat();

            System.out.println();
        }

    }

}
