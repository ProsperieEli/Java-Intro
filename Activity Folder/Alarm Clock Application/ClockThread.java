
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class ClockThread implements Runnable {

    private final LocalDateTime alarmDateTime; // now holds both date and time
    String filePath;
    private final Scanner scanner;

    ClockThread(LocalTime alarmTime, String filePath, Scanner scanner) {
        // Combine today's date with the user’s chosen time
        LocalDateTime candidate = LocalDateTime.now()
                .withHour(alarmTime.getHour())
                .withMinute(alarmTime.getMinute())
                .withSecond(alarmTime.getSecond())
                .withNano(0);

        // If that time already passed today, roll it over to tomorrow
        if (!LocalDateTime.now().isBefore(candidate)) {
            candidate = candidate.plusDays(1);
        }

        this.alarmDateTime = candidate;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run() {
        System.out.println("Current time: " + LocalTime.now());
        System.out.println("Alarm set for: " + alarmDateTime);

        // Tick until the alarm time
        while (LocalDateTime.now().isBefore(alarmDateTime)) {
            try {
                LocalTime now = LocalTime.now();
                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.print("thread was interrupted");
            }
        }

        System.out.print("\n*ALARM NOISE*\n");
        playSound(filePath);
    }

    private void playSound(String filePath) {
        File file = new File(filePath);
        try (AudioInputStream audioInput = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();
            System.out.print("Press Enter to stop the alarm: ");
            scanner.nextLine();
            clip.stop();
            // don’t close scanner here (it will close System.in)
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable");
        } catch (IOException e) {
            System.out.println("Error reading audio file");
        }
    }
}
