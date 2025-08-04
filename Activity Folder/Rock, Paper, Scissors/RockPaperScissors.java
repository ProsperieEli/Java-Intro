
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {
        String playerChoice;
        Integer score = 0;
        Integer gamesPlayed = 0;
        String[] choices = {"Rock", "Paper", "Scissors"};
        String computerChoice;
        boolean gameRunning = true;
        String userChoice;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the game! To begin type true!");
        gameRunning = scanner.nextBoolean();
        scanner.nextLine();
        System.out.println("Enter your selection(Rock, Paper, Scissors): ");
        playerChoice = scanner.nextLine();

        computerChoice = choices[random.nextInt(3)];
        System.out.println(computerChoice);

        while (gameRunning) {
            if (playerChoice.equals(computerChoice)) {
                System.out.print("Draw!");
                gamesPlayed += 1;
            } else if ("Rock".equals(playerChoice) && "Paper".equals(computerChoice)) {
                System.out.println("You lose!");
                gamesPlayed += 1;
            } else if ("Rock".equals(playerChoice) && "Scissors".equals(computerChoice)) {
                System.out.println("You win!");
                gamesPlayed += 1;
                score += 1;
            } else if ("Paper".equals(playerChoice) && "Scissors".equals(computerChoice)) {
                System.out.println("You lose!");
                gamesPlayed += 1;
            } else if ("Paper".equals(playerChoice) && "Rock".equals(computerChoice)) {
                System.out.println("You win!");
                gamesPlayed += 1;
                score += 1;
            } else if ("Scissors".equals(playerChoice) && "Rock".equals(computerChoice)) {
                System.out.println("You lose!");
                gamesPlayed += 1;
            } else {
                System.out.println("You win!");
                gamesPlayed += 1;
                score = +1;
            }

            System.out.print("Would you like to play again(Y/N): ");
            userChoice = scanner.nextLine();
            if ("Y".equals(userChoice)) {
                gameRunning = true;
                System.out.println("Enter your selection(Rock, Paper, Scissors): ");
                playerChoice = scanner.nextLine();
                computerChoice = choices[random.nextInt(3)];
                System.out.println(computerChoice);
            } else if ("N".equals(userChoice)) {
                System.out.println("Thank you for playing!");
                gameRunning = false;
            }
        }
        System.out.println("Score: " + score);
        System.out.print("Games Played: " + gamesPlayed);
        scanner.close();
    }
}
