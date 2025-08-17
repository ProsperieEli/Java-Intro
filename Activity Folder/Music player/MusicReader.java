import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

public class MusicReader extends MusicObj {

    MusicReader(String songName, int releaseDate, String filePath) {
        super(songName, releaseDate, filePath);
        // TODO Auto-generated constructor stub
    }

    /*
     * public void musicPlay(filePath) {
     * // play/Pause music
     * File file = new File(filePath);
     * try (AudioInputStream audioInput = new AudioInputStream(file)) {
     * Clip clip = AudioSystem.getClip();
     * 
     * clip.open(audioInput);
     * 
     * } catch (LineUnavailableException e) {
     * System.out.println("Issue with clip.");
     * } catch (IOException e) {
     * System.out.print("Type incorrect");
     * }
     * 
     * }
     */
    void musicStop() {
        // stop music
    }

    void musicSkip() {
        // skip song
    }

}
