
import java.util.Scanner;

/*
 * Today we're going to go over While and do loops. A while loop is similar to an If statement, however it locks the user in a loop that will only break once the internal conditions
 * have been met. It's an extremely useful tool mainly in user checking and authentication. Let's try a few!
 */

public class WhileLoops {
    public static void main(String[] args) {
        int num = 0;
        String userName = "";

        Scanner scanner = new Scanner(System.in);
       /*  while(num < 100){
            num += 5;
            System.err.println(num);

        }
        System.err.println(num);

 * This is an extremely basic example. Here, we create a while loop that incriments our variable of num by 5 until it reaches 100. The loop ends once the condition has been met. 
 * let's try something using an input of a user name. 
 

        while(!userName.contains(".")) {
            System.err.println("Please enter your name and end with a period: ");
            userName = scanner.nextLine();

        }
        System.err.println("Your name is " + userName);
        
         * This code works. We are trapped inside our while loop. No matter what we enter, if we do not enter a . character within our input, the loop will continue. 
         * A variation of this is the do loop. The do loop is functionally the same, however it runs the code first and then checks for the condition to be true. 
         */

         do { 
            System.err.println("Please enter your name and end with a period: ");
            userName = scanner.nextLine();
         } while (!userName.contains("."));
         System.err.println("Your name is " + userName);

         /*
          * and there we go. That is While and do loops in Java. Practicing these are extremely useful. Especially if you need top limit a user's input until after criteria has been
          met. 
          */
        scanner.close();
    }
}
