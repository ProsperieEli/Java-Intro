
import java.util.Scanner;

public class BankingProgram {

    public static void main(String[] args) {
        Double depositedAmount;
        Double balance = 0.0;
        Integer choice;
        Boolean cont;
        Boolean activeBank = true;

        Scanner scanner = new Scanner(System.in);

        while (activeBank) {
            System.out.print("Welcome to your private bank app!");
            System.out.print("\n1. Balance\n2. Deposit\n3. Withdraw\n4. Quit \n");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.printf("Your current balance is $%.2f\n", balance);
                System.out.print("Is there anything else you would like to do?");
                System.out.print("\n2. Deposit\n3. Withdraw\n4. Quit \n");

                choice = scanner.nextInt();
            }
            if (choice == 2) {
                System.out.print("How much would you like to deposit? ");
                depositedAmount = scanner.nextDouble();
                depositMoney(balance, depositedAmount);
                balance = depositMoney(balance, depositedAmount);
                System.out.printf("Your new balance is %.2f\n", balance);

                System.out.println("Would you like to make another deposit? (true/false)");
                cont = scanner.nextBoolean();
                while (cont) {
                    System.out.print("How much would you like to deposit? ");
                    depositedAmount = scanner.nextDouble();
                    depositMoney(balance, depositedAmount);
                    balance = depositMoney(balance, depositedAmount);
                    System.out.printf("Your new balance is %.2f\n", balance);

                    System.out.println("Would you like to make another deposit? (true/false)");
                    cont = scanner.nextBoolean();
                }
            }
            if (choice == 4) {
                System.out.print("Thank you for choosing out bank! Have a great day!");
                activeBank = false;
            }

        }

        scanner.close();
    }

    static Double depositMoney(Double balance, Double depositedAmount) {
        //this method will hold data for depositing money into account.
        balance += depositedAmount;
        return balance;
    }

    static void withdrawMoney() {
        //this method will hold data for withdrawing money from account.
    }
}
