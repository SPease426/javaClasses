package class3;

public class T4TemperatureOfDay {

    public static void main(String[] args) {

        double expectedTemp = 70.0;
        double actualTemp =110.0;

        if (expectedTemp > actualTemp) {

            System.out.println("It's cooler than expected, wear a jacket!");
        }

        else if (actualTemp < 90.0){

            System.out.println("It's as warm as expected, enjoy your day");
        }

        else {
            System.out.println("It's really hot today, keep yourself hydrated.");
        }
        /*
        "It's cooler than expected, wear a jacket!", otherwise print "It's as warm as expected, enjoy your day!"


         */
    }
}
