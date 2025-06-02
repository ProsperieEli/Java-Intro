
import java.util.Arrays;
import java.util.Scanner;

/*
 * Recently, we went over how to create arrays. Now we'll create and loop through an array using user input.
 */
public class ArrayWithInput {

    public static void main(String[] args) {
        String[] games;
        int amount;

        Scanner scanner = new Scanner(System.in);
        System.out.print("How many games do you have?");
        amount = scanner.nextInt();
        games = new String[amount];
        scanner.nextLine();

        for (int i = 0; i < games.length; i++) {
            System.out.println("Enter the name of your game: ");
            games[i] = scanner.nextLine();
        }

        for (String game : games) {
            System.out.println(game);
            Arrays.sort(games);
        }
        scanner.close();
    }

    /*
     * Let's break this code down. Usually to create an array, you specify the amount of elements. Instead, here we create the array but do not declare it. We then create a variable that will be later used to act as the size of the array. 
     * Allowing the user to pass in an amount to fill the variable. We then set our array to the amount. This allows the size of the array to be set to whatever amount the user decideds.
     */
}
