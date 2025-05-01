/*
 Today we're going to go over some String methods and how they are used in programs. We'll also touch on the use of Java substrings and how to combine the two. 
 */

public class StringMethods {
    public static void main(String[] args) {
        //The first we'll look at is .length. This will give you the amount of characters within a string.

        String name = "Techno";
        Integer length = name.length();

        System.out.println(length);

        //We can see we get an answer returned of 6 for the amount of characters. 

        //next, let's look at .charAt. charAt is used to determine what character is at a specific index. 

        char letter = name.charAt(0);
        System.err.println(letter);
        //As expected, by specifying the character at index 0, we are rturned the T character. 

        //Now, lets move to .indexOf. This method can help locate the idex of specific characters. Say you want to know where the character of a @ is in a string. indexOf would tell you exactly where it is.

        Integer index = name.indexOf("e");
        System.err.println(index);
        //As expected, by specifying the character of e, we are given an index of 1. Because in our name variable. The character e is the second index of the string.
        //Side note before moving on. Please remember that in programming, indexes start at 0 and go up. So T is index 0, e is 2, etc. Also remember that spaces are also counted as an index.

        //Cutting lesson short for today. Will return tomorrow and conclude String methods! Take care everyone.
        
    }
}
