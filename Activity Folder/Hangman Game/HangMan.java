
public static void main(String[] args) {
    int gameChoice;
    boolean isAlive = true;
    String userChoice;
    String filePath = "C:\\Users\\Techno\\Java Exercises\\Activity Folder\\Hangman Game\\Hangman.txt";
    String textFile = """
            Apple
            Principle
            Happy
            Sonic
            """;

    try (Scanner scanner = new Scanner(System.in);
            FileWriter writer = new FileWriter(filePath);
            BufferedReader reader = new BufferedReader(new FileReader(filePath))) {

        writer.write(textFile);
        writer.flush();
        System.out.println("File has been created");

        String textReader;
        ArrayList<String> textNames = new ArrayList<>();
        while ((textReader = reader.readLine()) != null) {
            textNames.add(textReader.trim());
        }

        Random random = new Random();
        gameChoice = random.nextInt(textNames.size());
        String chosenWord = textNames.get(gameChoice);

        // Track revealed letters with char[]
        char[] displayWord = new char[chosenWord.length()];
        for (int i = 0; i < chosenWord.length(); i++) {
            displayWord[i] = '_';
        }

        // Game loop
        while (isAlive) {
            System.out.println("\nWord: " + String.valueOf(displayWord));
            System.out.print("Guess a letter: ");
            userChoice = scanner.nextLine();

            if (userChoice.isEmpty())
                continue; // skip empty input

            char guess = Character.toLowerCase(userChoice.charAt(0));
            boolean found = false;

            for (int i = 0; i < chosenWord.length(); i++) {
                if (Character.toLowerCase(chosenWord.charAt(i)) == guess) {
                    displayWord[i] = chosenWord.charAt(i); // reveal
                    found = true;
                }
            }

            if (found) {
                System.out.println("Yes, this letter is in the word.");
            } else {
                System.out.println("No, it is not.");
                isAlive = false; // for now: end game on one wrong guess
            }

            // Win condition
            if (String.valueOf(displayWord).equalsIgnoreCase(chosenWord)) {
                System.out.println("\nCongrats! You guessed the word: " + chosenWord);
                break;
            }
        }

    } catch (IOException e) {
        System.out.print("Error.");
    }
}
