import java.util.Scanner;

/*
 * hey everyone! Today we're going over Enhanced Switches. Just like the tunery operator can be used to shorthand if statements. Switches are used to shorthand 
 * large amounts of if else branches. I'll use the example of days of the week. I'll also use both the long version and shorthand version of the Enhanced Switch.
 */
public class EnhancedSwitches {
    public static void main(String[] args) {
        String day;

        Scanner scanner = new Scanner(System.in);
        System.err.println("What is the day?");
        day = scanner.nextLine();
        // switch(day){
        //     case "Monday" -> System.out.println("Today is a weekday.");
        //     case "Tuesday" -> System.out.println("Today is a weekday.");
        //     case "Wednesday" -> System.out.println("Today is a weekday.");
        //     case "Thursday" -> System.out.println("Today is a weekday.");
        //     case "Friday" -> System.out.println("Today is a weekday.");
        //     case "Saturday" -> System.out.println("Today is the weekend.");
        //     case "Sunday" -> System.out.println("Today is the weekend.");
            
        //     default -> System.err.println("Today is not a weekday.");
        // }
        /*
         * The above code is a switch case method of running multiple branches. We begin with our switch statement and pass in our variable. Then we create a case, or branch, followed by what we expect it to include.
         * In our work since we are using days, we say case "Monday". We then use the arrow functionality to mean do this. It reads "in case our DAY variable is 'Monday', do the following". Which then gives us our 
         * print statement. We repeat this as many times and have a default branch at the bottom. This is our else statement. So if something is entered that does not match any of our case branches, it will automatically 
         * trigger the default. 
         * 
         * This code can be simplified a step further. Since we have multiple branches outputting the same result. We can use commas to seperate multiple cases. 
         */
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.printf("Today is %s. A weekday.", day);
            case "Saturday", "Sunday" -> System.out.printf("Today is %s. It is the weekend!", day);
            default -> System.out.printf("%s is not a day of the week.", day);
        }
        /*
         * Here is the same amount of work reduced to only three lines of code. Using commas to seperate all cases that share the same output. We can clean up our work and get the same result. 
         */

        scanner.close();
    }
}
