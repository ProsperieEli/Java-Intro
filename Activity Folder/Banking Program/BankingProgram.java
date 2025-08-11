
import java.util.Scanner;

public class BankingProgram {

    public static void main(String[] args) {
        Double depositedAmount;
        Double withdrawnAmount;
        Double balance = 0.0;
        Integer choice;
        Integer cont;
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
                System.out.printf("Your new balance is $%,.2f\n", balance);

                System.out.println("Would you like to make another deposit?\n1: Yes\n2. No");
                cont = scanner.nextInt();
                while (cont == 1) {
                    System.out.print("How much would you like to deposit? ");
                    depositedAmount = scanner.nextDouble();
                    depositMoney(balance, depositedAmount);
                    balance = depositMoney(balance, depositedAmount);
                    System.out.printf("Your new balance is $%,.2f\n", balance);

                    System.out.println("Would you like to make another deposit?\n1: Yes\n2. No");
                    cont = scanner.nextInt();
                }
            }
            if (choice == 3) {
                if (balance == 0) {
                    System.out.println("Sorry, you have no money with us to withdraw. Please add funds now.");
                } else {

                    System.out.print("How much would you like to withdraw? ");
                    withdrawnAmount = scanner.nextDouble();
                    withdrawMoney(balance, withdrawnAmount);
                    balance = withdrawMoney(balance, withdrawnAmount);
                    System.out.printf("Your new balance is $%,.2f\n", balance);

                    System.out.println("Would you like to make another withdraw?\n1: Yes\n2. No");
                    cont = scanner.nextInt();
                    while (cont == 1) {
                        System.out.print("How much would you like to withdraw? ");
                        withdrawnAmount = scanner.nextDouble();
                        withdrawMoney(balance, withdrawnAmount);
                        balance = withdrawMoney(balance, withdrawnAmount);
                        System.out.printf("Your new balance is $%,.2f\n", balance);

                        System.out.println("Would you like to make another withdraw?\n1: Yes\n2. No");
                        cont = scanner.nextInt();
                    }
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
        // this method will hold data for depositing money into account.
        balance += depositedAmount;
        return balance;
    }

    static Double withdrawMoney(Double balance, Double withdrawnAmount) {
        // this method will hold data for withdrawing money from account.
        balance -= withdrawnAmount;
        return balance;
    }
}
