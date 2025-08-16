
import java.io.PrintStream;

public class AggregationBook {

    /*
     * This is our main Object file. Here, we create the individual books that are turned into Objects. We also have a method here that displays a string 
     * of all of our data. We also use good practice by making each attribute private; as none of these are things that are likely to change.
     * So we don't want a user to be able to make changes to any of them.
     */

    private String name;
    private int pages;
    private String author;

    public AggregationBook(String name, int pages, String author) {
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    PrintStream bookInformation() {
        return System.out.printf("%s. It has %d and was written by %s.\n", this.name, this.pages, this.author);
    }

}
