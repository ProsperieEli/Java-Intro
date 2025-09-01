import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.awt.Dimension;

public class ClockThread implements Runnable {
    private final LocalTime alarmTime;
    // String filePath;

    ClockThread(LocalTime alarmTime) {
        this.alarmTime = alarmTime;
        // this.filePath = filePath;

    }

    // File where the clock itself runs in the background on a second thread.
    @Override
    public void run() {

        while (LocalTime.now().isBefore(alarmTime)) {
            try {
                Thread.sleep(1000);
                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());

            } catch (InterruptedException e) {
                System.out.print("thread was interrupted");
            }
        }
        // System.out.print("\n*ALARM NOISE*");
        // Toolkit.getDefaultToolkit().beep();
        // playSound(filePath);

    }

    private void playSound(String filePath) {
        File file = new File(filePath);
        try (AudioInputStream audioInput = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();
            clip.open(audioInput);
            clip.start();

        } catch (LineUnavailableException e) {
            System.out.println("Issue with clip.");
        } catch (IOException e) {
            System.out.print("Type incorrect");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio type.");
        }

    };
}
