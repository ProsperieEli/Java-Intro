/*
 Let's go over the printf() method and it's uses. Similar to both print() and println(), printf() is a method used to format output. However, it differs
 by allowing you to plug in information into the output directly. Think of it like a shorthand way of plugging variables in for your output. 

 Here's an example.
 */

public class PrintFMethod {
    public static void main(String[] args) {
        
        String name = "Elijah";
        char firstLeter = 'E';
        Integer age = 25;
        Double height = 182.88;
        Boolean isProgrammer = true;

        //When using printf(), instead of using the usual System.out.print("My name is " + name " and I am " + age) format. We can shorthand this. Here's how.

        System.out.printf("Hi. My name is %s\n", name);
        //The above code uses the % symbol followed by s, for the String data type. This acts as a placeholder for the variable. Which we then input with only a comma after we have finished.
        //There is one thing to note when using printf(). We have to always manual create a newline using \n. Otherwise, all our work will be on the same line. 
        //while %s outputs the String data type, let's see the characters for the other data types as well.

        System.out.printf("My name begins with %c\n", firstLeter);
        System.out.printf("I am %d years old\n", age);
        System.out.printf("I stand at %f cm tall.\n", height);
        System.out.printf("And yes, it is %b that I am a programmer.\n", isProgrammer);

        /*
         And there are the multiple data types shorthanded. 
         %c is for char
         %s is for String
         %d is for Integers
         %f is for Doubles and Float numbers
         and %b is for Booleans.

         Let's say we want to use multiple variable in one output. Simple! You just seperate them with a comma and add the corresponding shorthand as needed. Here's an example!
         */

         System.out.printf("Hi! My name is %s and I am %d years old.\n", name, age);

         //Be sure you line the variables up with their place in the output. If age was first, place it first in the calling. 

         

         //We can also use printf() to display specific amounts of digits in things such as math. Here's how. 

         Double price1 = 9.99;
         Double price2 = 100.01;
         Double price3 = 10003.98;

         System.out.printf("The price is: %.1f\n", price1);
         //This .1f is telling the computer to display 1 digit out the decimal sign. For price1, that 1 digit is a 9. So, it rounds up. Let's use it with the others.
         System.out.printf("The price is: %.1f\n", price2);
         System.out.printf("The price is: %.1f\n", price3);

         //For price2 we get 100 even. and for price3 we end up with 10004.0. If we wanted to go 2 past the decimal, we could just say:
         System.out.printf("The price is: %.2f\n", price1);

         //Lastly, Lets discuss the comma grouping seperator. This allows any number over a thousand to automatically gain a comma in the output. Like so:
         System.out.printf("The price is: %,.2f", price3);

         //As we can see, the output automatically inputs a common after the digits reach the thousandths. These are just some of the ways the printf() method are useful!
         //Tomorrow, I will create a new application involving these techniques discussed today. 






    }
}
