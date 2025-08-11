
public class Abstraction {
    // Today we're going to go through another pillar of OOP; abstraction.

    /*
     * Abstraction is the process of hiding implimentation and only displaying what
     * is critical to know. Think of if you are teaching someone how to drive a car.
     * You don't need to teach them how the engine and inner workings of the car
     * operate. You just need to show them the gas pedal and brakes.
     * 
     * Abstract classes cannot be made into Objects. Abstract parent classes can
     * have two types of methods: Concrete and Abstract.
     * Abstract methods: These MUST called in ALL children classes.
     * Concrete: These methods are automatically implimented across all children.
     * 
     * Let's try a few examples by making a shape file followed by two children.
     */

    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 5);
        Rectangle rectangle = new Rectangle(9, 7);

        System.out.println(triangle.area());
        System.out.println(rectangle.area());

        triangle.displayShape();
        rectangle.displayShape();
    }
}
