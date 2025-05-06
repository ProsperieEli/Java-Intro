
import java.util.Scanner;

public class JavaCalculator {
    public static void main(String[] args) {
        double userNum;
        double userNum2;
        String operations;
        double answer = 0;

        Scanner scanner = new Scanner(System.in);
        System.err.print("Enter number: ");
        userNum = scanner.nextDouble();
        scanner.nextLine();

        System.err.print("Which operation would you like to use? (+, -. *, /): ");
        operations = scanner.nextLine();

        System.err.print("Enter your second number: ");
        userNum2 = scanner.nextDouble();
        

        switch(operations) {
            case "+" -> answer = userNum + userNum2;  
            case "-" -> answer = userNum - userNum2;
            case "*" -> answer = userNum * userNum2;
            case "/" -> answer = userNum / userNum2;
            default -> System.out.print("Invalid operation method.");


        }
        System.out.print(answer);




        scanner.close();
    }
}