
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

public class AlarmClock implements Runnable {

    public static void main(String[] args) {

    }

    @Override
    public void run() {
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatted = DateTimeFormatter.ofPattern("HH:mm:ss");
        String currentTime = time.format(formatted);

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                System.out.print(currentTime);

            }
        };
        System.out.print(task);
    }
}
