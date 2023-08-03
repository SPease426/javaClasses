package class4;

public class haveDiploma {
    public static void main(String[] args) {

        boolean earnedDiploma = true;
        double grade = 3.4;

        if (earnedDiploma) {
            System.out.println("Congratulations ");

            if (grade >= 3.5) {
                System.out.println("You are eligible for scholarship");
            }

            else {
                System.out.println("You should have studied harder");
            }
        }

        else {
            System.out.print("You should earn at least your Associate's Degree your future will be ");
            System.out.println("much more likely to succeed with that degree!");
        }
    }
}
