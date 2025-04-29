/*
 Hello everyone! For today's java experience. We will be looking at more advanced methods of using math properties such as built in pi and exponent features. 
 We will also touch on the printf() method and its many uses. 
 */

public class MoreAdvancedMath {
    public static void main(String[] args) {
        //Lets start with PI. For Java, we have a built in method within the Math class.
        System.out.println(Math.PI);
        //Answer: 3.141592653589793

        //We also have a way to raise a number to an exponent. Math.pow().
        Integer num = 2;
        System.out.println(Math.pow(num, 3));
        //Answer: 8.0. The first argument of the .pow() method is the variable or number and the second is the exponent that you are raising that number. 
        //In our exemple, we are raising 2 to the power of 3. Giving us our answer of 8.0

        //Next, lets look at Math.ceil() and Math.floor(). These are to round a decimal up or down respectively.
        Double raiseUp = 4.25;
        Double raiseDown = 4.99;

        System.out.println(Math.ceil(raiseUp));
        //Answer: 5.0
        System.out.println(Math.floor(raiseDown));
        //Answer: 4.0
        //Here, we can see that Math.ceil takes our variable of 4.25 and rounds up to 5.0. Whilee Math.floor takes 4.99 and drops down to 4.0.

        //Next, lets look over Math.sqrt()
        Integer squareRoot = 4;

        System.out.println(Math.sqrt(squareRoot));
        //Answer: 2
        //As expected, when we plug in our variable. We can see that the built in method automatically deduces the square root of our variable. 

        //Now, let's look at the round method. 

        Double rounded = 6.98;
        System.out.println(Math.round(rounded));
        //Answer: 7
        //Similar to math.ceil and Math.floor, Math.round always rounds to the nearest whole integer. 

        //These are some of the most basic built in methods within the Math class that we may use. There are of course many more, so always be sure to check documentation for more.
        //Before we wrap up today's study session, let's look at the printf() method.
    }
}
