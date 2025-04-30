
import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Double A;
        Double P;
        Double r = 0.05;
        Integer n = 1;
        Integer t;
        Boolean decision;
        Boolean makeDeposit;

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Hello! Welcome to the bank. Would you like to make a deposit? (type true or false)");
        makeDeposit = scanner.nextBoolean();
        if(makeDeposit){
            System.err.println("Great! How much will you like to invest? ");

            P = scanner.nextDouble();
            System.out.printf("Awesome! So you want to invest $%,.2f. Here at Bank of Code, we have an annual interest rate of %.2f. How many years would you like to keep it with us?\n", P, r);
            
            t = scanner.nextInt();

            System.out.printf("Sounds good! We will keep your investment of $%,.2f for the next %d years. We will compound your interest annually(%d). Is this alright with you?(Type true or false)\n", P,t,n);
            decision = scanner.nextBoolean();

            if(decision) {
                A = P * Math.pow(1+r/n, n*t);
                System.out.printf("Thank you for placing your money with Bank of Code. After the %d year gap, your return investment comes out to be a total of $%,.2f. Thank you for your business and please come back!", t, A);
            }
        } else {
            System.err.println("Come back soon!");
        }

        scanner.close();
    }
}
