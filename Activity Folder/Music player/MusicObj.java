import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.AudioFormat;

public class MusicObj {
    String songName;
    private int releaseDate;
    String filePath;

    MusicObj(String songName, int releaseDate, String filePath) {
        this.songName = songName;
        this.releaseDate = releaseDate;
        this.filePath = filePath;
    }

    int getReleaseDate() {
        return this.releaseDate;
    }

    void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    void playMusic() {
        // play/Pause music
        File file = new File(filePath);
        try (AudioInputStream audioInput = AudioSystem.getAudioInputStream(file)) {

            Clip clip = AudioSystem.getClip();

            clip.open(audioInput);

        } catch (LineUnavailableException e) {
            System.out.println("Issue with clip.");
        } catch (IOException e) {
            System.out.print("Type incorrect");
        } catch (UnsupportedAudioFileException e) {
            System.out.print("Did not support audio.");
        }
    }

}
