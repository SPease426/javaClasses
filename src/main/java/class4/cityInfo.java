package class4;

import java.util.Scanner;

public class cityInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the name of City: ");
        String cityName = scanner.next();
        System.out.println(cityName);
        System.out.print("Enter the city temperature: ");
        double cityTemperature = scanner.nextDouble();
        System.out.println(cityTemperature);

        System.out.println("Is the degrees in Celsius or Fahrenheit?");
        String tempScale = scanner.next();

        if ((tempScale.equals("Fahrenheit") || (tempScale.equals("fahrenheit")))) {

            System.out.println("Want the Degrees in Celsius");
            String answer = scanner.next();

            if ((answer.equals("yes")) || (answer.equals("Yes"))) {

                cityTemperature = (cityTemperature - 32) * 5/9;
                System.out.print("The temperature is " + cityTemperature + " " + tempScale);

            }

            else { // want the temperature to stay in Fahrenheit
                System.out.print("The temperature is " + cityTemperature + " " + tempScale);

            }
        }

        else if ((tempScale.equals("Celsius") || (tempScale.equals("celsius")))) { // want Fahrenheit

            System.out.println("Want the Degrees in Fahrenheit");
            String answer = scanner.next();

            if ((answer.equals("yes")) || (answer.equals("Yes"))) {
                cityTemperature = (cityTemperature * 9 / 5) + 32;
                System.out.print("The temperature is " + cityTemperature + " " + tempScale);

            }

            else { // want to stay in Celsius
                System.out.print("The temperature is " + cityTemperature + " " + tempScale);
            }
        }

        System.out.println(" in the city of " + cityName);


    }
}
