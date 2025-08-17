
public class MusicObj {
    String songName;
    private int releaseDate;
    private String filePath;

    MusicObj(String songName, int releaseDate, String filePath) {
        this.songName = songName;
        this.releaseDate = releaseDate;
        this.filePath = filePath;
    }

    String getFilePath() {
        return this.filePath;
    }

    int getReleaseDate() {
        return this.releaseDate;
    }

    void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

}
