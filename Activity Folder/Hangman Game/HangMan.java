
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HangMan {

    public static void main(String[] args) {
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
            System.out.println("File has been created");

            //Reader code not working. Uploading to github to transfer to Mac.
            String textReader;
            while ((textReader = reader.readLine()) != null) {
                System.out.println(textReader);
                System.out.println("Is it reaching.");
            }
            System.out.print("Word: ");

        } catch (IOException e) {
            System.out.print("Error.");
        }
        //Hangman names written.

    }
}
