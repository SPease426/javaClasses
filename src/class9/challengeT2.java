package class9;

public class challengeT2 {
    public static void main(String[] args) {

        String[][] students = {
                {"Aysha", "Giulia","John","Deepali"},
                {"A","A+","C","B"}
        };

        for (int i = 0; i < 4; ++i) {

            if (students[1][i].equals(("A")) || (students[1][i].equals("B"))) {

                System.out.print("Student " + students[0][i] + " received the grade of a ");
                System.out.println(students[1][i]);
            }
        }
    }
}
