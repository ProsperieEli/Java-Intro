
import java.util.Scanner;

public class WeightConversion {
    public static void main(String[] args) {

        Integer decision;
        Double lbsToKgs;
        Double kgsToLbs;
        Double convertedKgs;
        Double convertedLbs;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Welcome to the Weight Conversion Program! Are you converting lbs to kgs or kgs to lbs. Type 1 for lbs to kgs. Type 2 for kgs to lbs. ");
        decision = scanner.nextInt();

        if(decision == 1) {
            System.out.println("Welcome to the lbs to kgs conversion! Please enter the weight: ");
            lbsToKgs = scanner.nextDouble();
            System.err.printf("Okay! I'll convert %.2f to kgs! \n", lbsToKgs);
            convertedKgs = lbsToKgs / 2.20462;

            System.out.printf("All done! Your new weight in kgs comes out to %.2f kgs!", convertedKgs);

        } else if(decision == 2) {
            System.err.println("Welcome to the kgs to lbs conversion! Please enter the weight: ");
            kgsToLbs = scanner.nextDouble();
            System.err.printf("Okay! I'll convert %.2f to lbs! \n", kgsToLbs);
            convertedLbs = kgsToLbs * 2.20462;

            System.out.printf("All done! Your new weight in lbs comes out to %.2f lbs!", convertedLbs);

        }
        else {
            System.err.println("Please select 1 or 2 for the conversion.");
        }

       
        scanner.close();
    }
}
