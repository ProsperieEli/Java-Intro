import java.security.InvalidParameterException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClockMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // String filePath = "Activity Folder\\Music player\\Marino - Devil in Disguise
        // (Lyrics).wav";
        LocalTime alarmTime = null;
        System.out.print("Enter your alarm time(HH:MM:SS): ");
        while (alarmTime == null) {
            try {
                DateTimeFormatter formatting = DateTimeFormatter.ofPattern("HH:mm:ss");

                String alarmTimer = scanner.nextLine();

                alarmTime = LocalTime.parse(alarmTimer, formatting);
                System.out.println("Your alarm is set for " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.print("Enter time in HH:mm:ss format: ");

            }

        }

        ClockThread clock = new ClockThread(alarmTime);
        Thread clockThread = new Thread(clock);
        clockThread.start();

        scanner.close();

    }
}
