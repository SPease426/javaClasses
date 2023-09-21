package class1;

public class practiceVariables {

    public static void main(String[] args) {

        /* Homework is to declare and print
        all 8 primitive data types
        6 are numeric and 2 are non-numeric
         */

        // the following 4 Data Types below are numeric integers
        byte age=10;
        short powerLevel=900;
        int gameRelease=128359; //number of minutes till the game is released looking forward to it
        long largeFigure=675677456775678L;

        // the following two Data Types below are numeric floating points
        float gamePrice= 79.99F;
        double pi=3.14159265;

        // the last two Data Types are non-numeric
        char firstInitial='S';
        boolean youRich=false;


        System.out.println("Here is my 8 primitive data types");

        System.out.println(age);
        System.out.println(powerLevel);
        System.out.println(gameRelease);
        System.out.println(largeFigure);
        System.out.println(gamePrice);
        System.out.println(pi);
        System.out.println(firstInitial);
        System.out.println(youRich);

        System.out.println("\n");


        age=20;
        powerLevel=100;
        gameRelease=128059; //number of minutes till the game is released looking forward to it
        largeFigure=6756774567756788L;
        gamePrice= 79.99F;
        pi=3.1415926;
        firstInitial='P';
        youRich=true;

        System.out.println("Here is my 8 updated primitive data types");

        System.out.println(age);
        System.out.println(powerLevel);
        System.out.println(gameRelease);
        System.out.println(largeFigure);
        System.out.println(gamePrice);
        System.out.println(pi);
        System.out.println(firstInitial);
        System.out.println(youRich);




    }
}
