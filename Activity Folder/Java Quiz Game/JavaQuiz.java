
import java.util.Scanner;

public class JavaQuiz {

    static Integer userScore = 0;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //First thing we need are variables.
        boolean play = true;

        // while (play) {
        // }
        questions(scanner);

        scanner.close();
    }

    public static void questions(Scanner scanner) {
        String[] question1 = {"Storing information", "Not sure"};
        String[] question2 = {"I'm not sure", "380"};

        String[][] questionAnswers = {question1, question2};

        System.out.print("What is the main function of a variable? \n");
        for (int i = 0; i < questionAnswers.length; i++) {
            for (int j = 0; j < questionAnswers[0].length; j++) {
                System.out.println(questionAnswers[i][j]);
                System.out.println(j + " This should be question 1 elements");
                // Integer userSelection = scanner.nextInt();
                // if (userSelection.equals(answer)) {
                //     userScore++;
                // }

            }
        }
        // for (String[] answers : questionAnswers) {
        //     for (String answer : answers) {
        //         System.out.print(answer + " What is answer \n");

        //     }
        // }
        // System.out.println("What is the max number of bytes in a String data type?");
        // System.out.print(userScore + "testing");
    }
;
}
