
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
        System.out.printf("Select a number between %d-%d: \n", min, max);
        userGuess = scanner.nextInt();

        while (userGuess != randomNumber) {
            System.out.println("the answer: " + randomNumber);
            System.out.printf("%d is incorrect. Try again. \n", userGuess);
            userGuess = scanner.nextInt();

        }
        System.out.println("Congrats! You win!");

    }
}
