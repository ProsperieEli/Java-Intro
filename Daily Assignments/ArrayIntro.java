
import java.util.Arrays;


/*
 * Today we will be going over arrary's and their uses. We will also loop through an array while briefly touching on the built in filter methods.
 */
public class ArrayIntro {

    public static void main(String[] args) {
        String[] games = {"PlayStation 5", "Xbox", "Nintendo Switch", "PC", "Nintendo Switch 2"};
        Arrays.sort(games);

        for (int i = 0; i < games.length; i++) {
            System.out.println(games[i]);

        }

        /*
         * Above, we create an array named games. We placed multiple elements within that array. We then run a loop that iterations for I, run through the length of the array, and print all elements within the array.
         * our Arrays.sort is a built in method that automatically sorts through the array and places things in alphabetic order.
         */
    }
}
