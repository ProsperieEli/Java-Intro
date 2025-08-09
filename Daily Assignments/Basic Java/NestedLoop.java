
import java.util.Scanner;

/*
 * Hello! Today we'll go over nested loops. Nested Loops are purely loops within another loop. First we'll go over a small example, but then we'll use a nested loop using user input.
 */
public class NestedLoop {
    public static void main(String[] args) {
        // for(int i = 0; i <=5; i++) {
        //     for(int j = 0; j <= 10; j++) {
        //         System.out.print(j + " ");
        //     }      

        //     System.out.println("");
        // }

        /*
         * In our above example, we have two for loops. Our first initializes i to 0, states that so long as i is less than or equal to 5 to loop through the code, and incremint by one.
         * As for the code itself, we create a second loop. This loop is a simple counting loop. Going from 0 to 10. But, because we specified in the outer loop to run it up to 5 times.
         * Our loop prints the numbers in 5 rows. Let's try a nested loop using user input.
         */

         String userInput;
         int userRows;
         int userColumns;

         Scanner scanner = new Scanner(System.in);
        
         System.out.print("Enter your favorite symbol: ");
         userInput = scanner.nextLine();

         System.out.print("Enter the # of rows: ");
         userRows = scanner.nextInt();

         System.out.print("Enter # of colomns: ");
         userColumns = scanner.nextInt();

         for(int i = 0; i < userColumns; i++) {
            for(int j = 0; j < userRows; j++) {
                System.out.print(userInput + " ");
            }
            System.out.println("");
         }

         /*
          * Let's go over this code. 
          We have two loops. The first is creating our colomn output byt saying that while i is less than userColumns(the user input), run the code within the for loop and incriment by one.
          Then, we have our second loop. here, we say that while j is less than userRows(the second user input), run the code within that loop and incriment by one. 
          Which brings us to the print statement where we put our userInput out to the screen. Printed as many times as we entered it. 
          */



         scanner.close();
    }
}
