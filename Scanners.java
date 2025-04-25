import java.util.Scanner;
//For today's lesson, we will be going over Scanners and what they are used for in Java. Scanners are how Java can take input from a user. 
//To begin, we need to import the scanners util.

//For To begin, we need to initalize and create our Scanner class within our code.
public class Scanners {

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        //scanner.close();
        /*
         Before going forward, let's go over these two lines of code. 
         Scanner is the name of the class that is being imported from the utilities to create our object. 
         scanner is the name of the object that we will be working with. 
         new Scanner(System.in) is initializing the object with a new Scanner class. 
         And finally, we use scanner.close(); as good code to say we are closing this specific object. This can help prevent future issues down the line for bigger projects.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + " It is good to meet you!");
        scanner.close();

        /*
         here we have an example of a scanner being used in real time using three lines. 
         We begin with line 22 by printing a question that will be answered by users input. 
         Following this, we initalize a variable of String data type followed by our Scanners object name that we declared followed by the .nextLine() method. 
         Finally, we print to our terminal a string that concats using our declared variable. 
         */
       

         /*
          Scanners are a simple concept, but going forward. I will conduct a mini-assignment to test how well I am familiar with them using multiple data types. 
          The assignment will be posted on my GitHub and will be a Mad Libs game.
          */
    }    
}
