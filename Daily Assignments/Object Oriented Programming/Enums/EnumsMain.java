
import java.util.Scanner;

public class EnumsMain {

    /*
     * Today we're going to go over Enums in Java. Enums are a special kind of class that represents a fixed set of constants. 
     * They help with readability and are extremely effective in helping with enhanced switches for readability.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What day of the week is it? ");
        String response = scanner.nextLine().toUpperCase();
        try {
            EnumsTest day = EnumsTest.valueOf(response);

            switch (day) {
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY ->
                    System.out.print("It is the weekday");
                case SATURDAY, SUNDAY ->
                    System.out.print("It is the weekend");
            }
        } catch (Exception e) {
            System.out.println("Invalid day entry");
        }

        scanner.close();
    }
}
