import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterMain {
    // Hey guys. Today we're gonna go through FileWriter utility and how to use it
    // to create a txt file in Java.

    /*
     * There are multiple different techniques to create a txt file. I'll be going
     * over FileWriter. FileWriter
     * is for small to medium txt files mostly. Let's see it in practice then go
     * over the actual process.
     */

    public static void main(String[] args) {

        /*
         * It seems like a lot of code, but let's go through it! It's actually not a lot
         * at all.
         * We begin by copying our file path and attaching it to a variable. This is
         * where our .txt file will be created.
         * We then create a variable assigned to the text that will appear within the
         * file.
         * 
         * Because we are using dangerous code, we use a try/catch block to hold our
         * FileWriter. FileWriter is how we
         * create the text writer object.
         */

        String fileName = "\\Users\\technov\\Java-Intro\\Daily Assignments\\Object Oriented Programming\\FileWriter\\test.txt";
        String textFile = """
                This is a test txt file.
                Here, you can see that multiple lines are used because of the triple quotation marks.
                This is a simple lesson, but very useful.
                """;

        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(textFile);
            System.out.println("Txt file created!");
        } catch (FileNotFoundException e) {
            System.out.print("Error in pathway");
        } catch (IOException e) {
            System.out.println("Incorrect type.");
        }
    }
}
