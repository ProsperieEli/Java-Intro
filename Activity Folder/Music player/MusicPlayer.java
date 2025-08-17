
public class MusicPlayer {
    public static void main(String[] args) {

        MusicObj mp3 = new MusicObj("New Type of Hero", 2025, "tbh");
        System.out.println(mp3.songName);
        System.out.println(mp3.getFilePath());
        System.out.println(mp3.getReleaseDate());
    }
}
