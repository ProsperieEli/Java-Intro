
public class OOP {
    // To access attributes in another Object, we need to first create that object
    // in the file. So for here, we'll say:

    public static void main(String[] args) {
        Console playStation5 = new Console("PlayStation 5", 2019, true);
        Console switch2 = new Console("Nintendo Switch 2", 2025, true);
        Console pC = new Console("PC", 2020, false);

        System.out.println(playStation5.name);
        System.out.println(playStation5.releaseYear);

        System.out.println(switch2.name);
        System.out.println(switch2.releaseYear);

        System.out.println(pC.name);
        System.out.println(pC.releaseYear);

        // These two lines work identical to the Scanner and Random objects that we use
        // frequently in java. The Console is pulling the data from the Console.Java
        // class. We give it our own keyname for this file, in this case console, and
        // the create new Console. Meaning we create a new Object named console.
        // We then can access the attributes from the Console class using dot notation.
        // Remember that we have to use dot notation due to the data type being
        // referance.
        // We can also access methods from the same class.

        playStation5.doesItHaveGames();
        playStation5.itDoesNotHaveGames();

        switch2.doesItHaveGames();
        switch2.itDoesNotHaveGames();

        pC.doesItHaveGames();
        pC.itDoesNotHaveGames();
        // Above we are calling our created method doesItHaveGames using dot notation.
        // We are going into the Class Object and grabbing the method attached to that
        // Object and calling it with the dot notation.

        // This is targetting an Object class that already has pre-determined data. But
        // what if we wanted to create our own Object with user inputted data?
        // Then we would use a constructor.

        /*
         * A constructor is a special method that you can pass arguments into that can
         * initialize an object. It's actually important to know that you already are
         * using a constructor. Console playStation5 = new Console() is a constructor
         * method
         * calling the Console() object. But, let's go back to Console.java and make the
         * 
         * object user friendly.
         */

    }
}