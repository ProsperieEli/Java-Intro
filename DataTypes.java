//In this file. We will look over the different data types in Java and give exemples of how they are used.

/*
 In Java, we have seven(7) primary forms of data types:
 -Integers
 -Doubles
 -Char
 -Boolean
 -String
 -Object
 -Arrays.
 For this start, we will take a look at five(5) and give examples of their uses. Objects and Arrays we will return to at a later point.
 */
public class DataTypes {
    public static void main(String[] args){
        Integer age = 23;
        Integer games = 2;

        System.out.println(age);
        System.out.println(games);

        /*
         In the above lines, we are using Integer data types. Integers are for any whole numbers. In Java, we have to declared these variables by specifying the Integer keyword, followed
         by the variables name and its initialized rate.
         */
        
        Double rate = 13.99;
        Double percent = 10.0;

        System.out.println(rate);
        System.out.println(percent);
        /*
        In the above 4 lines, we are using the data type known as Double. Doubles are similar to Integers in which they use numbers. However, they differ from Integers due to using 
        non-whole numbers. Doubles are used whenever you are using variables that are assigned to things that require decimal numbers. 
         */

        char letter = 'C';
        char grade = 'A';

        System.out.println(letter);
        System.out.println(grade);

        /*
         The above four lines go over the char data type. This data type is very similar to the String type, however it has a few differences. The first is that char is used only
         with single-quotes. Using "" will generate an error reading "char data types cannot be converted to String data types". This is because unlike String, char is meant to hold
         a singular character.
         */

        Boolean isAlive = true;
        Boolean hasCoffee = false;

        System.out.println(isAlive);
        System.out.println(hasCoffee);
        /*
         The Boolean data type is a True/False data response. This type has a variable that is only one of those two. Either the variable is true or it is false. This type is most
         notably used in If statements.
         */

         String name = "Techno";
         String month = "April";

         System.out.println(name);
         System.out.println(month);

         /*
          String is perhaps one of the most famous data types. String is for storing a sequence of characters. As we can see, Strings differ from char by the use of double quotes.
          */
          

          /*
           Now that we know the data types and how to initialize them. We can use them together in lines of code through means of concating.
           */
          System.out.println("My name is " + name);
          System.out.println("I am  " + age + " and we are currently in " + month);
    }
  
}
