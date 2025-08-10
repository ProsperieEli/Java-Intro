
public class Console {
    // Let's go over what Objects are in Java and how they are used.

    // Objects are things that hold data(attributes) and can perform
    // actions(methods). These are reference data types.
    // To start, let's go over a video game object.
    String name;
    int releaseYear;
    boolean hasGames = true;

    // Above are the attributes. These are data within our Objects class.
    // These attributes exhist within our Objects class, but we can access this
    // object in another file. Let's go to OOP and see how to access these
    // attributes.

    /*
     * Now that we're back in our Console.java file. Let's edit these initial
     * attributes to not be hardcoded information. We're going to create a method
     * with the same name as our Class Object name.
     */

    Console(String name, int releaseYear, boolean hasGames) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.hasGames = hasGames;
    }
    /*
     * Before we continue let's go over this method. We pass in three parameters:
     * name, releaseYear, hasGames--our attributes. However we then use the this.
     * keyword. Think of this as saying the objects name being assigned to that
     * attribute. Recall back in OOP.java, we created an object called consoles. You
     * can think of the this keyword as a replacement of saying consoles.name,
     * consoles.releaseYear, etc.
     * Now we can go back to OOP.java and input our own information to fill the name
     * and releaseYear of these attributes.
     */

    // Let's go over some methods for our Object that can be called in the OOP file.
    // Let's create a method that prints a statement if our playstation has games.
    void doesItHaveGames() {
        if (hasGames) {
            System.out.printf("Yeah, %s, has games!\n", this.name);
        }
    }

    void itDoesNotHaveGames() {
        if (!hasGames) {
            System.out.printf("No, %s does not have games.", this.name);
        }
    }
}
