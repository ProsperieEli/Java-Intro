
import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    // Here are my ArrayList. These take the constructors that were created in their
    // respective files, and pass them to the Drive file to allow information to be
    // passed to them.
    private static ArrayList<Dog> dogList = new ArrayList<Dog>();
    private static ArrayList<Monkey> monkeyList = new ArrayList<Monkey>();
    // Instance variables (if needed)
    /*
     * The next two lines were created for my menu loop. menuVariable is meant to
     * act as a true/false statement that, while true, will allow the menu to remain
     * open. It's also how I have the quit function on the loop set up. The
     * userSelection variable is for the user to select an option on the menu.
     */
    private static boolean menuVariable = true;
    private static String userSelection;

    public static void main(String[] args) {

        initializeDogList();
        initializeMonkeyList();
        Scanner scanner = new Scanner(System.in);
        // Add a loop that displays the menu, accepts the users input
        // and takes the appropriate action.
        // For the project submission you must also include input validation
        // and appropriate feedback to the user.
        // Hint: create a Scanner and pass it to the necessary
        // methods
        // Hint: Menu options 4, 5, and 6 should all connect to the printAnimals()
        // method.

        /*
         * For my menu, i went with a do while loop. Utilizing if statements for when
         * the user enters a key for the selection. I'm using the .equals method to
         * convert all numbers to Strings. This makes it easier since the functionality
         * to quit the app is mapped to q. this way, you can user numbers and the quit
         * functionality without having conversion errors due to different data types.
         */
        do {
            displayMenu();
            userSelection = scanner.nextLine();

            if (userSelection.equals("1")) {
                /*
                 * For here, we are simply calling our intakeNewDog method that we create later
                 * on and pass in the scanner as the information for the parameter.
                 * We'll go over this method later but it allows the user to add a new dog to
                 * the dog Array.
                 */
                intakeNewDog(scanner);

            }
            if (userSelection.equals("2")) {
                /*
                 * Identical to the first, this menu option brings the user to the
                 * intakeNewMonkey method. Which allows the user to enter and add a new monkey
                 * to the monkeyList array.
                 */
                intakeNewMonkey(scanner);

            }

            if (userSelection.equals("3")) {
                // Option 3 brings the user to the list of reserved animals. However, since this
                // one was not needed for this assignment, it currently is just a string.
                reserveAnimal(scanner);

            }

            if (userSelection.equals("4")) {
                // Option 4 will print all dogs. But, like 3, it was not needed for this
                // assignment so it was not completed.
                System.out.print("Dogs here");
            }

            if (userSelection.equals("5")) {
                // Option 5 will print all Monkeys, but same situation as 4.
                System.out.print("Monkeys here");

            }

            if (userSelection.equals("6")) {
                // Option 6 will print all animals together. Same situation as the previous 3.
                printAnimals();
            }

            if (userSelection.equals("q")) {
                // for the option q, this selection will automatically change the menuVariable
                // to false. Immeditely cancelling and closing the loop thus ending the program.
                menuVariable = false;
            }
        } while (menuVariable);

        scanner.close();
    }

    // This method prints the menu options
    public static void displayMenu() {
        System.out.println("\n\n");
        System.out.println("\t\t\t\tRescue Animal System Menu");
        System.out.println("[1] Intake a new dog");
        System.out.println("[2] Intake a new monkey");
        System.out.println("[3] Reserve an animal");
        System.out.println("[4] Print a list of all dogs");
        System.out.println("[5] Print a list of all monkeys");
        System.out.println("[6] Print a list of all animals that are not reserved");
        System.out.println("[q] Quit application");
        System.out.println();
        System.out.println("Enter a menu selection");
    }

    // Adds dogs to a list for testing
    public static void initializeDogList() {
        Dog dog1 = new Dog("Spot", "German Shepherd", "male", "1", "25.6", "05-12-2019", "United States", "intake",
                false, "United States");
        Dog dog2 = new Dog("Rex", "Great Dane", "male", "3", "35.2", "02-03-2020", "United States", "Phase I", false,
                "United States");
        Dog dog3 = new Dog("Bella", "Chihuahua", "female", "4", "25.6", "12-12-2019", "Canada", "in service", true,
                "Canada");

        dogList.add(dog1);
        dogList.add(dog2);
        dogList.add(dog3);
    }

    // Adds monkeys to a list for testing
    // Optional for testing
    /*
     * Here I created the method, initializeMonkeyList, that acts as placeholder
     * data for our new monkeyList. Matching all the results with the parameters
     * from our constructor.
     */
    public static void initializeMonkeyList() {
        Monkey monkey1 = new Monkey(
                "Kiki", "female", "2", "12.5", "01-01-2021", "Brazil", "intake",
                false, "United States", "Capuchin", "15", "40", "25", "Capuchin");
        monkeyList.add(monkey1);

    }

    // Complete the intakeNewDog method
    // The input validation to check that the dog is not already in the list
    // is done for you
    public static void intakeNewDog(Scanner scanner) {
        System.out.println("What is the dog's name?");
        String name = scanner.nextLine();
        for (Dog dog : dogList) {
            if (dog.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis dog is already in our system\n\n");
                return; // returns to menu
            }
        }
        /*
         * Here is the intakeNewDog method. Here, I am creating prompts to ask a user
         * information. Then attaching the attributes for those prompts to the scanner
         * to assign the users input with those answer.
         */
        System.out.println("What is the dog's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the dog's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the dog's age?");
        String age = scanner.nextLine();

        System.out.println("What is the dog's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("Where was the dog acquired?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the dog reserved? (true/false)");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Which country is the dog in service?");
        String inServiceCountry = scanner.nextLine();

        // After all prompts have been answered, we create a new Dog method with every
        // paramater passed in. This will allow it to be added to the dogList.
        Dog newDog = new Dog(name, gender, age, weight, acquisitionDate,
                acquisitionCountry, trainingStatus, inServiceCountry, reserved, breed);

        dogList.add(newDog);
        System.out.println("Dog added successfully!");

        // Add the code to instantiate a new dog and add it to the appropriate list
    }

    // Complete intakeNewMonkey
    // Instantiate and add the new monkey to the appropriate list
    // For the project submission you must also validate the input
    // to make sure the monkey doesn't already exist and the species type is allowed
    public static void intakeNewMonkey(Scanner scanner) {
        System.out.println("What is the monkey's name?");
        String name = scanner.nextLine();
        for (Monkey monkey : monkeyList) {
            if (monkey.getName().equalsIgnoreCase(name)) {
                System.out.println("\n\nThis monkey is already in our system\n\n");
                return; // returns to menu
            }
        }
        /*
         * Identical to the dog intakeNewDog, I created the intakeNewMonkey method to
         * prompt the user questions and take their answers to assign them to the
         * parameter of the Monkey arrayList.
         * This was the final step I completed since it was all the instructions
         * mentioned. Any future methods were left blank for the moment.
         */
        System.out.println("What is the monkey's gender?");
        String gender = scanner.nextLine();

        System.out.println("What is the monkey's age?");
        String age = scanner.nextLine();

        System.out.println("What is the monkey's weight?");
        String weight = scanner.nextLine();

        System.out.println("What is the acquisition date?");
        String acquisitionDate = scanner.nextLine();

        System.out.println("What country was the monkey acquired from?");
        String acquisitionCountry = scanner.nextLine();

        System.out.println("What is the training status?");
        String trainingStatus = scanner.nextLine();

        System.out.println("Is the monkey reserved? (true/false)");
        boolean reserved = Boolean.parseBoolean(scanner.nextLine());

        System.out.println("Which country is the monkey in service?");
        String inServiceCountry = scanner.nextLine();

        System.out.println("What is the monkey's breed?");
        String breed = scanner.nextLine();

        System.out.println("What is the monkey's tail length?");
        String tailLength = scanner.nextLine();

        System.out.println("What is the monkey's height?");
        String height = scanner.nextLine();

        System.out.println("What is the monkey's body length?");
        String bodyLength = scanner.nextLine();

        System.out.println("What is the monkey's species?");
        String species = scanner.nextLine();

        Monkey newMonkey = new Monkey(name, gender, age, weight, acquisitionDate,
                acquisitionCountry, trainingStatus, reserved, inServiceCountry, breed,
                tailLength, height, bodyLength, species);

        monkeyList.add(newMonkey);
        System.out.println("Monkey added successfully!");
    }

    // Complete reserveAnimal
    // You will need to find the animal by animal type and in service country
    public static void reserveAnimal(Scanner scanner) {
        System.out.println("The method reserveAnimal needs to be implemented");

    }

    // Complete printAnimals
    // Include the animal name, status, acquisition country and if the animal is
    // reserved.
    // Remember that this method connects to three different menu items.
    // The printAnimals() method has three different outputs
    // based on the listType parameter
    // dog - prints the list of dogs
    // monkey - prints the list of monkeys
    // available - prints a combined list of all animals that are
    // fully trained ("in service") but not reserved
    // Remember that you only have to fully implement ONE of these lists.
    // The other lists can have a print statement saying "This option needs to be
    // implemented".
    // To score "exemplary" you must correctly implement the "available" list.
    public static void printAnimals() {
        System.out.println("The method printAnimals needs to be implemented");

    }
}
