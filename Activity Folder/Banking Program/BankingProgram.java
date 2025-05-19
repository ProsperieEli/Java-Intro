
import java.util.Scanner;

public class BankingProgram {

    public static void main(String[] args) {
        Double balance = 0.0;
        Integer choice;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Welcome to your private bank app!");
        System.out.print("\n1. Balance\n2. Deposit\n3. Withdraw\n4. Quit \n");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.printf("Your current balance is $%.2f\n", balance);
            System.out.print("Is there anything else you would like to do?");
            System.out.print("\n2. Deposit\n3. Withdraw\n4. Quit \n");
        }
        choice = scanner.nextInt();

        if (choice == 4) {
            System.out.print("Thank you for using our private banking app. Goodbye!");
        }

        scanner.close();
    }

    static void depositMoney() {
        //this method will hold data for depositing money into account.
    }

    static void withdrawMoney() {
        //this method will hold data for withdrawing money from account.
    }
}
