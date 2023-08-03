package class4;

public class Donor {
    public static void main(String[] args) {
        int age = 18;
        double patientWeight = 110.5;

        if ((age >= 18) && (patientWeight > 110) ) {
            System.out.println("Patient is eligible to donate");

        }

        else {
            System.out.println("We cannot accept this patient as a donor");
        }
    }
}
