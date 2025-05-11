
import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 10;
        int userGuess;
        int randomNumber;

        Random random = new Random();
        randomNumber = random.nextInt(min, max);
        System.out.printf("Select a number between %d-%d: ", min, max);
        userGuess = scanner.nextInt();

        do {
            System.out.println("this is number" + randomNumber);
            userGuess = scanner.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congrats! You win!");
            } else if (userGuess < randomNumber) {
                userGuess = scanner.nextInt();
                System.out.println("Go a little higher!");

            } else if (userGuess > randomNumber) {
                userGuess = scanner.nextInt();

                System.out.println("Too high! Back down");

            }
            scanner.close();
        } while (userGuess != randomNumber);
        System.out.println("Game over!");

    }
}
