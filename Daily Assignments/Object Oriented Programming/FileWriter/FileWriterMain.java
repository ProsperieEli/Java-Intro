import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
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

        // Now that we have created the text file. What if we wanted to read it? Well,
        // we can use the BufferedRender and FileReader.
        /*
         * BufferedRender and FileReader are great for reading multiple lines of txt
         * files. The Buffered Render acts as a
         * supporter for the FileReader, so it cannot act independently. Let's create a
         * reader and go over it.
         */

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String lines;
            while ((lines = reader.readLine()) != null) {
                System.out.println(lines);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Double check pathway");
        } catch (IOException e) {
            System.out.println("Error. Incorrect type.");
        }
    }
    /*
     * Perfect, it works! So let's just look through the code. We create a
     * BufferedReader and FileReader object within a try/catch block.
     * Once again, because file reading is dangerous code. We then pass in the
     * fileName variable as the location for the FileReader object.
     * We then create a variable of a String datatype. This variable is then used in
     * a while loop. Where we state that the declared
     * variable of lines is the reader.ReadLine() method. This attachs any string
     * from our txt file to our lines variable.
     * The != null portion is to tell our loop to stop running once all the text has
     * been read. As the file will continue going but will
     * just print null.
     */
}
