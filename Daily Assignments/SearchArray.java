
import java.util.Scanner;

/*
 * Today we'll go over how to search an array using user input both for an integer and a string.
 */
public class SearchArray {

    public static void main(String[] args) {
        // Integer[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        // Integer target;
        // Boolean isTrue = false;
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("What number are you searching for?: ");
        // target = scanner.nextInt();
        // for (int i = 0; i < num.length; i++) {
        //     if (target == num[i]) {
        //         System.out.println("Element found at " + i);
        //         isTrue = true;
        //         break;
        //     }
        // }
        // if (!isTrue) {
        //     System.out.println("Sorry. Not available.");
        // }
        //scanner.close();
        /*
                    * This is an example of a numbered array being searched by user input. We create our array variable, a target that is set to user input, and a Boolean that will tell our program
                    * when to say that the input is not within the array. We then iterate through our array's length with a for loop. Using an if statement inside, we are saying that if the 
                    * user input is set equal to the array index of I, then to print it and set our Boolean to true. Following this, we create another if statement outside of our for loop that states
                    * that if the boolean is not true, give a message that the user input cannot be found within the array. 
         */
        String[] names = {"Ben", "Alex", "Ross"};
        String target;
        Boolean isTrue = false;
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        target = scanner.nextLine();

        for (int i = 0; i < names.length; i++) {
            if (target.equals(names[i])) {
                System.out.print("Hello " + target);
                isTrue = true;
                break;
            }

        }

        if (!isTrue) {
            System.out.println("Sorry, you are not in our records.");
        }

        scanner.close();
    }

    /*
     * Above we are scanning through an array of a string for a specific name. It is extremely similar to an int array, however because a String datatype is a reference. We
     * have to use the built in .equals method. Here we say that if the user input .equals the element at the index within the names array, then print. 
     */
}
