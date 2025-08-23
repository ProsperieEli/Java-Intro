import java.util.Timer;
import java.util.TimerTask;

public class TimeTaskMain {
    /*
     * Today we're going to go over Timer and TimeTask.
     * 
     * Timer is an class that schedules task. This is used for things like
     * notifications.
     * 
     * TimeTask is the work that will be done using a Timer.
     */

    public static void main(String[] args) {
        /*
         * So how does this work.
         * We start by creating a Timer and TimerTask class. We then use an anonymous
         * class on TimerTask to override it to perform specific task for this timer.
         * We define a countdown for 5. This tells out code that it will run 5 times
         * before finishing.
         * We thenschedule the timer to run the code at 1000 miliseconds(or 1 second)
         * and continue every 3000 miliseconds(3 seconds) until the conditions are all
         * met.
         */
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int countdown = 5;

            @Override
            public void run() {
                System.out.println("Hello!");
                countdown--;
                if (countdown <= 0) {
                    System.out.println("Goodbye!");
                    timer.cancel();
                }
            }

        };
        timer.schedule(task, 1000, 3000);
    }
}
