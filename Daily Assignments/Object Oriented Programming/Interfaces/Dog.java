
public class Dog implements Predator {

    /*
     * Here we have a Dog file. In this file, just like we would extend with an Inherited file. We impliment the Predator file. 
     * We then call the hunter() method from that Predator interface, but we make sure we Override it so that it is unique to this file.
     */
    @Override
    public void hunter() {
        System.out.println("I am the hunter!");
    }
}
