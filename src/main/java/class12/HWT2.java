package class12;

public class HWT2 {
    String getGrade(int score) {
        String gradeLetter;

        if (score >= 90) {
            gradeLetter = ("My letter grade is an A");
        }
        else if (score >= 80) {
            gradeLetter = ("My letter grade is a B");
        }
        else if (score >= 70) {
            gradeLetter = ("My letter grade is a C");
        }
        else if (score >= 50) {
            gradeLetter = ("My letter grade is a D");
        }
        else {
            gradeLetter = ("My letter grade is a F");
        }

        return gradeLetter;


    }
    public static void main(String[] args) {

        HWT2 myGradeObj = new HWT2();
        System.out.println(myGradeObj.getGrade(90));

    }
}
