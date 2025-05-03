import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double initialTemp;
        String decision;
        Double fToC;
        Double cToF;

        System.out.println("Please enter your initial temperature: ");
        initialTemp = scanner.nextDouble();
        System.out.printf("Your current temperature is %.1f. Is this in Fahrenheit or Celsius? Type C or F\n",
                initialTemp);
        scanner.nextDouble();

        decision = scanner.nextLine();
        /*
         * if (decision == "F") {
         * System.out.
         * printf("Alright! We will take your initial temperature of %.1f degrees to Celsius."
         * ,
         * initialTemp);
         * fToC = initialTemp - 32 * (9 / 5);
         * System.out.printf("Your new temperature is %.1f degrees Celcius.", fToC);
         * }
         * 
         */

        scanner.close();
    }
}
