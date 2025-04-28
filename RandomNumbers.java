import java.util.Random;

/*
 Below we will discuss the usages of Java's random number operator. 
 */
public class RandomNumbers {
    public static void main(String[] args) {
        Integer dice;

        Random random = new Random();
        System.out.println("Roll the dice for an number!");
        dice = random.nextInt(1, 6);
        System.out.print(dice);
        /*
         Lets disect the above code more. Much like our Scanner class, we create a new random number object on line 11. 
         We then create the output for user information on line 12.
         On line 13, we assign our created variable to our random object. Using the nextInt() method to assign the start and end point of our numbers. 
         It is important to note that the first parameter, in this case 1, will always be used. It is included within the generator. However, the second
         parameter, or 6, will not be used due to being excluded. This means that five would be the max number that could be generated within the generator. 
         */


    }
}
