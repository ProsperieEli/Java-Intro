
public class ThreadingRunnable implements Runnable {

    /*
     * Let's start with this file. This file is where our threading is happening. We implement the Runnable interface and override the run() method. We then 
     * impliment our counting logic and use the System.exit() method to close the program should the logic be met.
     */
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("There was an interruption.");
            }
            if (i == 10) {
                System.out.print("Time's up!");
                System.exit(0);

            }
        }
    }

}
