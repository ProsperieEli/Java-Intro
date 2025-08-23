import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class Countdown {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a starting number: ");
        int count = scanner.nextInt();

        TimerTask task = new TimerTask() {
            int countDown = count;

            @Override
            public void run() {
                System.out.println(countDown);
                countDown--;

                if (countDown < 0) {
                    System.out.println("Happy new Years!");
                    timer.cancel();
                }
            }
        };
        timer.scheduleAtFixedRate(task, 1, 2000);
        scanner.close();
    }
}
