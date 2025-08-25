
public class MultiThreadingMain {

    /*
     * To end this Java journey, let's go over multithreading. 
     * Multithreading allows a program to run multiple threads concurrently. We'll use two cars in a race for our example.
     */
    public static void main(String[] args) {
        /*
         * Creating our thread objects, we pass in our MultiThreadingCars objects directly and start both threads. We then run a try/catch to run the join method on both threads.
         * This makes it where the main thread(this current file) will run the statement "Race over" only after the other two threads have finished. 
         */
        Thread thread1 = new Thread(new MultiThreadingCars("Mustang"));
        Thread thread2 = new Thread(new MultiThreadingCars("BMW"));

        System.out.print("START!");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted in main");
        }

        System.out.print("Race over!");
    }
}
