package class19;

import class17.Teacher;

public class FuturePlans {
    private void plan(String month) {
        System.out.print("For " + month + ", ");
        System.out.println("I'm not playing any games until I get caught up in Syntax Videos, Tasks, and Replits");
        System.out.println();
    }
    private void plan(String month, int workDays) {
        System.out.print("For " + month + " ");
        System.out.println("my plan is to try and work at least " + workDays+ "days as a substitute Teacher in October");
        System.out.println("Also plan to keep up my studies and play the new Spider-Man 2 game releasing on the 20th");

        System.out.println();
    }
    private void plan(String month, double cash) {
        System.out.println("After being a substitute teacher for roughly 2 months now, I hope to have earned over " +
                cash + "dollars in cash");

        System.out.println();
    }

    public static void main(String[] args) {
        FuturePlans obj = new FuturePlans();

        obj.plan("September");
        obj.plan("October", 8);
        obj.plan("November", 2010.40);
    }
}
