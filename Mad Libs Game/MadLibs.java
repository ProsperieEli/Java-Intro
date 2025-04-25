import java.util.Scanner;
/*
 With new lessons on Scanners and data types. I'm going to create a Mad Lib game in order to display the use of Scanners in a real scenario. 
 I'll be using a mix of Strings and Integers to create my story.
 */

public class MadLibs{
public static void main(String[] args) {
    
    
    Scanner scanner = new Scanner(System.in);
    String name;
    String location;
    String animal;
    Integer age;
    Double temp;

    System.out.println("Who did you see?: ");
    name = scanner.nextLine();

    System.out.println("Where did you see them?: ");
    location = scanner.nextLine();

    System.out.println("What animal was nearby?: ");
    animal = scanner.nextLine();
    
    System.out.println("How old were they?: ");
    age = scanner.nextInt();
    
    System.out.println("How hot was it?: ");
    temp = scanner.nextDouble();
    
    

    
    System.out.println("I saw " + name + " today at " + location + "!");
    System.out.println("They were battling a massive " + animal + ".");
    System.out.println("The animal had to have been over "+ age + " years old!");
    System.out.println("It was awesome, but it was " + temp + " degrees outside, so I left early before they finished."); 

   


    scanner.close();
    }    
}

/*The above code is a brief, simple Mad Libs assignment I created using a mix of Strings, Integers, and Doubles in tangent with Scanners to prove my understanding on the concept.
 line 11 is where I created my scanner object. This allows the user to take in input and interact with the terminal.
 lines 12-16 is where I initialize my variables and their data type. 

 Lines 18-31 are where I am having the terminal ask a question that will require the user to answer through input. here, I am also assigning these variables with the
 scanners respective method. nextLine() for String data types, nextInt() for Integers, and nextDouble() for non-whole Integers.

 Finally, line 36-39 I am printing out the results of those inputs to the terminal through use of concating text with the information stored on the variables. And closing my scanner on
 line 44 as good practice to prevent any issues if I were to add on to this assignment later. 

 This assignment was fun and a great way to show an understanding on the concept of Scanners and how they interact with data types and the user. 
 */