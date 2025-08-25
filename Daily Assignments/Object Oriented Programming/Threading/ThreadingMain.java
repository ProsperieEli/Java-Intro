
import java.util.Scanner;

public class ThreadingMain {

    /*
    As we come to a close on our Java journey, let's go over Threading. 
    Threading allows a program to run multiple task simultaneously. It helps improve performance with time-consuming operations.
    In this program, we'll create a program that ask for user input on a timed schedule. If user does not input on time, the program will close.
     */
    public static void main(String[] args) {
        /*
         * Here, we are creating our Thread object. We create our object of ThreadingRunnable and pass that in to the Thread object. We then use the setDaemon to 
         * close the program should the main thread(main file) complete. This means we have logic that will end the program if the timer runs out or if user enters a name beforehand.
         */
        ThreadingRunnable threadingRunnable = new ThreadingRunnable();
        Thread thread = new Thread(threadingRunnable);
        thread.setDaemon(true);
        thread.start();

        Scanner scanner = new Scanner(System.in);
        System.out.print("You have ten(10) seconds to input your name: ");
        String response = scanner.nextLine();

        System.out.print("Your name is " + response);

        scanner.close();
    }
}
