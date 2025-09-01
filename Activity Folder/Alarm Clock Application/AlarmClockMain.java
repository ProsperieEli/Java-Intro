
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class AlarmClockMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "Activity Folder\\Alarm Clock Application\\Marino - Devil in Disguise (Lyrics).wav";
        DateTimeFormatter formatting = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        System.out.print("Enter your alarm time(HH:MM:SS): ");

        String alarmTimer = scanner.nextLine();
        while (alarmTime == null) {

            try {

                alarmTime = LocalTime.parse(alarmTimer, formatting);
                System.out.println("Your alarm is set for " + alarmTime);
            } catch (DateTimeParseException e) {
                System.out.print("Enter time in HH:mm:ss format: ");

            }

        }

        ClockThread clock = new ClockThread(alarmTime, filePath, scanner);
        Thread clockThread = new Thread(clock);
        clockThread.start();

    }
}
