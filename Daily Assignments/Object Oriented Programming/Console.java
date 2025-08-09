
public class Console {
    //Let's go over what Objects are in Java and how they are used. 

    //Objects are things that hold data(attributes) and can perform actions(methods). These are reference data types. 
    //To start, let's go over a video game object.
    String name = "Playstation 5";
    int releaseYear = 2019;
    boolean hasGames = true;

    //Above are the attributes. These are data within our Objects class. 
    //These attributes exhist within our Objects class, but we can access this object in another file. Let's go to OOP and see how to access these attributes.
    //Let's go over some methods for our Object that can be called in the OOP file. 
    //Let's create a method that prints a statement if our playstation has games.
    void doesItHaveGames() {
        if (hasGames) {
            System.out.println("Yeah, we have games!");
        }
    }

    void itDoesNotHaveGames() {
        if (!hasGames) {
            System.out.println("It does not have games.");
        }
    }
}
