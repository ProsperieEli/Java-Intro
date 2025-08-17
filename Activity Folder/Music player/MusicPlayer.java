
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class MusicPlayer {

    public static void main(String[] args) {
        String userInput = "";
        String filePath = "Activity Folder\\Music player\\Marino - Devil in Disguise (Lyrics).wav";
        File file = new File(filePath);

        try (Scanner scanner = new Scanner(System.in); AudioInputStream audioInput = AudioSystem.getAudioInputStream(file)) {
            Clip clip = AudioSystem.getClip();

            clip.open(audioInput);

            while (!userInput.equals("Q")) {
                System.out.println("Press P for play");
                System.out.println("Press S for stop");
                System.out.println("Press R for reset");
                System.out.println("Press Q for quit");

                userInput = scanner.next().toUpperCase();

                switch (userInput) {
                    case "P" ->
                        clip.start();
                    case "S" ->
                        clip.stop();
                    case "R" ->
                        clip.setMicrosecondPosition(0);
                    case "Q" ->
                        clip.close();

                }
            }
        } catch (LineUnavailableException e) {
            System.out.println("Issue with clip.");
        } catch (IOException e) {
            System.out.print("Type incorrect");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Unsupported audio type.");
        }

    }

}
