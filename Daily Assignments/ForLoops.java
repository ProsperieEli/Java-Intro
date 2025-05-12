
import java.util.Scanner;

/*
 * Hey guys! Today we're gonna go over For Loops. Similar to While loops, for loops will loop any actions done inside them until a specific condition is met. Let's go over it! 
 */

public class ForLoops {
    public static void main(String[] args) {
        System.out.println("First For Loop Example: ");
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
        /*
         * Let's go over the code. We create our for loop and have three statements. The first is an initalization. Where we say I, for index, is set to start at a given number.
         * Following that, we give the condition of I. in this case, we are saying while I is less than 10, run the loop. 
         * Finally, we declare the incrimation. This tells our loop that at the end of each iteration, incriment I upwards. We could change this to be decreasing, or increasing by a specific number as well.
         * Lets do another example. 
         */
        System.out.println(" ");
        System.out.println("Second For Loop Example: ");

        System.out.println("We're going down!!");

        for(int i = 20; i > 0; i-= 5) {
            System.out.print(i + " ");
        }
        System.out.println("We crashed down!!");
        /*
         * Here, we use a decrimenting by 5 statement. Let's do one more, but this time using user information.
         */
        System.out.println("Final For Loop Example with input: ");
        System.out.println("Please write your name ten times.");
         Scanner scanner = new Scanner(System.in);
        
         String name;
         name = scanner.nextLine();

        for(int i = 0; i < 10; i++) {
            System.out.println("My name is: " + name);
        }
        /*
         * Here we use a scanner to get a string. We then run a loop saying to run a string that concats our inputed name in, for as long as I is less than 10. Terminating once I has incrimented 10 times.
         */

         scanner.close();
    }
}
