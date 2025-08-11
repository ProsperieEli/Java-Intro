
public class OOP {
    //To access attributes in another Object, we need to first create that object in the file. So for here, we'll say:

    public static void main(String[] args) {
        Console consoles = new Console();

        System.out.println(consoles.name);
        System.out.println(consoles.releaseYear);

        //These two lines work identical to the Scanner and Random objects that we use frequently in java. The Console is pulling the data from the Console.Java class. We give it our own keyname for this file, in this case console, and the create new Console. Meaning we create a new Object named console. 
        //We then can access the attributes from the Console class using dot notation. Remember that we have to use dot notation due to the data type being referance. 
        //We can also access methods from the same class.
        consoles.hasGames = true;
        consoles.doesItHaveGames();

        consoles.hasGames = false;
        consoles.itDoesNotHaveGames();
        //Above we are calling our created method doesItHaveGames using dot notation. We are going into the Class Object and grabbing the method attached to that Object and calling it with the dot notation. 
        //Note that because it is a method, we do not need to pass it through output to be viewed by the console.
    }
}
