import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        Integer budget;
        String item;
        Integer quantity;
        Integer price;
        Boolean answer;
        Integer totalprice;

        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your budget? $");
        budget = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What would you like to buy? ");
        item = scanner.nextLine();

        System.out.print("How much does it cost? $");
        price = scanner.nextInt();

        System.out.print("How many would you like? ");
        quantity = scanner.nextInt();

        System.out.println("So you would like " + quantity + " " + item + "'s " + "and they cost $" + price
                + " each right(type true/false)?");
        answer = scanner.nextBoolean();

        if (answer) {
            System.out.println("Your budget is $" + budget);
            totalprice = quantity * price;

            System.out.println("Your cart comes out to a total of: $" + totalprice);
        } else {
            System.out.print("Please restart when ready.");
        }

        scanner.close();

    }
}
