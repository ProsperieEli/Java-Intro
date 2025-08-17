import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {
        int userInput;

        MusicObj mp3 = new MusicObj("New Type of Hero", 2025,
                "\\Users\\technov\\Downloads\\New Type of Hero (凸变英雄X动画原声带).mp3");

        System.out.print("Please enter 1 to play song: ");
        Scanner scanner = new Scanner(System.in);
        userInput = scanner.nextInt();
        scanner.nextLine();

        if (userInput == 1) {
            mp3.playMusic();
        } else {
            System.out.println("Error in code workflow.");
        }
        scanner.close();
    }

}
