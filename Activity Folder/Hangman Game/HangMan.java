
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangMan {

    public static void main(String[] args) {
        int gameChoice;
        String userChoice;
        String filePath = "C:\\Users\\Techno\\Java Exercises\\Activity Folder\\Hangman Game\\Hangman.txt";
        String textFile = """
            Apple
            Principle
            Happy
            Sonic
            """;
        try (Scanner scanner = new Scanner(System.in); FileWriter writer = new FileWriter(filePath); BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            writer.write(textFile);
            writer.flush(); //because you're writing and reading in same try, you have to flush.
            System.out.println("File has been created");

            //Reader code not working. Uploading to github to transfer to Mac.
            String textReader;

            ArrayList<String> textNames = new ArrayList<>();
            while ((textReader = reader.readLine()) != null) {
                textNames.add(textReader);

            }
            System.out.print("Word: ");
            Random random = new Random();
            gameChoice = random.nextInt(textNames.size());
            //System.out.print(textNames.get(gameChoice));
            for (int i = 0; i <= textNames.get(gameChoice).length(); i++) {
                System.out.print(" _ ");
            }
        } catch (IOException e) {
            System.out.print("Error.");
        }
        //Hangman names written.

    }
}
