
import java.util.InputMismatchException;
import java.util.Scanner;

public class HandlingException {

    public static void main(String[] args) {
        //Let's go over exception handling. 
        /*
         * An exception is an event that interrupts the normal flow of code. Common exemples being
         * dividing by zero, files not found, and mismatch input types. Exception handling is when you
         * would surround any dangerous code with a try{} block. Dangerous code is any code
         * that can potentially stop the flow of code. Most notably any type of user input.
         * a try{}, catch{} block acts as a means of safety to alert an issue is present without disrupting the state of flow. 
         * finally{} is an optional keyword use that will always run in a try/catch block. it's purpose is to clean up any resources.
         */

 /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.print(num);
         * 
         */

 /*
  * the above block of code is a traditional scanner user input. We can see that if the user enters a number, it works as intended. But, if user enters a
  * String, we get a InputMismatchException error. This stops the flow of code and prevents any future code. To get around this, we can use a try/catch for security.
         */
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.print(num);

        } catch (InputMismatchException e) {
            System.out.print("Please enter a number");
        }
    }
}
