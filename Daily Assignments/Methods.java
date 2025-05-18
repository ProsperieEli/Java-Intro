/*
 * Hey eveyrone! Today we will be looking at Java methods and how they are used. We will also touch up on overloaded methods. Let's get into it! So a Java method is a block of reusable code that can be called somewhere else. Let's create a few.
 * 
 */

import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        /*
         * Scanner scanner = new Scanner(System.in);
         * String name;
         * String date;
         * Double time;
         * 
         * System.out.println("What is your name?");
         * name = scanner.nextLine();
         * 
         * System.out.println("What is the date?");
         * date = scanner.nextLine();
         * 
         * System.out.println("What is the time?");
         * time = scanner.nextDouble();
         * userInformation(name, date, time);
         * scanner.close();
         */
    }

    // Lets create a method that simply prints out hello world three times.
    static void helloWorld() {
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    /*
     * This is a simple method. Normally, if we wanted to print hello world multiple
     * times, we would have to use either a loop or manually print it multiple.
     * Here, we are only using one line of code.
     */

    // Lets create a method to display a users name, date, and time using input.
    static void userInformation(String name, String date, Double time) {
        System.out.printf("Good morning %s. It is %s and it is %.2f.", name, date, time);
    }

    /*
     * Let's break this one down more. The method itself is similar to the first. We
     * run some code, in this instance a print stating that gives user data to
     * output. However, we do not have any of this user data in our method. So, we
     * pass in arguments within our methods parenthesis.
     * These are variables that, once we call the method in another, we will pass in
     * our data for these.
     */

    // To close, let's look at overloaded methods.
    // An overloaded method is a method that shares a same name but different
    // signature. This means that so long as the arguments of a method differe,
    // methods can have the same name as another.

    static Integer add(Integer num1, Integer num2) {
        return num1 + num2;
    }

    static Integer add(Integer num1, Integer num2, Integer num3) {
        return num1 + num2 + num3;
    }

    /*
     * This is the overloaded methods. Having the same name for a method but
     * different arguments. We can actually call both of these and depending on the
     * number of parameters we place when calling, it will automatically choose the
     * method with the corresponding number. If we use two parameters when called,
     * it will call the first parameter. However, if we use three, it will call the
     * second.
     */
}
