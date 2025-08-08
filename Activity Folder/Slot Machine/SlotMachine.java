
import java.util.Random;
import java.util.Scanner;

public class SlotMachine {

    public static void main(String[] args) {
        //slot machine game.
        //what do we need?
        //Variables
        String player;
        String[] emojis = {"Cherry", "Bell", "Lemon", "Star", "Watermelon"};
        Integer balance = 0;
        Integer bettingAmount;
        String spin;
        boolean gameRunning = true;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Java Slot game!");
        System.out.print("Current balance: ");
        balance = scanner.nextInt();

        System.out.println("Place your bet amount: ");
        bettingAmount = scanner.nextInt();

        //emojis[0] = "🍒";
        System.out.println(emojis[0]);

        while (gameRunning) {
            System.out.println("Spinning. . .");
            for (int i = 0; i <= emojis.length - 3; i++) {
                spin = emojis[random.nextInt(5)];
                System.out.print(spin + " " + "|" + " ");
                System.out.println(spin.length() + "length");
            }
            gameRunning = false;
        }

        scanner.nextLine();

        scanner.close();

    }
}
