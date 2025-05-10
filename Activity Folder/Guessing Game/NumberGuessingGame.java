
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int userGuess;

        System.out.printf("Select a number between %d-%d:", min, max);
        userGuess = scanner.nextInt();

        if(userGuess > max) {
            System.out.printf("Sorry! %d is too big!", userGuess);
            
        }
        

        scanner.close();
    }
}
