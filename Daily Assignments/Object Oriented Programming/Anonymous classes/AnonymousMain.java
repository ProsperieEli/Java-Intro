
public class AnonymousMain {
    /*
     * Today we're gonna go over Anonymous classes. An anonymous class is a class
     * that has no name and a one time use. You can use anonymous classes to create
     * specific jobs for an object, but it CANNOT be used more than once.
     */

    public static void main(String[] args) {
        AnonymousCar car1 = new AnonymousCar();
        AnonymousCar car2 = new AnonymousCar() {
            @Override
            void carRuns() {
                System.out.println("This is a Mustang that runs.");
            }
        };

        car1.carRuns();
        car2.carRuns();

        // We are using the anonymous class feature on car2 by manipulating it to
        // override the method carRuns. This is a single time use.
    }
}
