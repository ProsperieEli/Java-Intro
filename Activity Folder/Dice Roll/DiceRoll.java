import java.util.Random;
import java.util.Scanner;

public class DiceRoll {
    public static void main(String[] args) {
        
        String name;
        Integer chances = 3;
        Integer userChoice;
        Integer hiddenNumber;
        Boolean decision;
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        hiddenNumber = random.nextInt(1, 11);
        
        System.out.print("Welcome to the Casino! Would you like to play a game? (Type true/false)");
        decision = scanner.nextBoolean();
        
        if(decision){
            System.out.print("Perfect! What is your name? ");
            
            
            
        } else{
            System.out.println("Come back soon!");
        }
        
        name = scanner.next();
        
        System.out.println("Welcome to the game, " + name + ". The rules are simple! Guess the correct number and you win! Ready? Alright! The number is between 1 and 10. Choose a number between 1 and 10!");
        
        userChoice = scanner.nextInt();
        
        if(userChoice != hiddenNumber) {
            chances--;
            System.out.println("Oops! Sorry, try again! You have " + chances + " left.");
            userChoice = scanner.nextInt();
            chances--;
            System.out.println("Oops! Sorry, try again! You have " + chances + " left.");
            userChoice = scanner.nextInt();
            chances--;
            if(chances == 0){
                System.out.println("Sorry! You're all out of chances!");
            }
            
        }else {
            System.out.println("Congrats! You win!");
        }
        
        scanner.close();
        
    }
}