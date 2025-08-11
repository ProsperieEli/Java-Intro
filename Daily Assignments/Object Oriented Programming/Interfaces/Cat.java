
public class Cat implements Predator, Prey {

    /*
     * And finally, we do the same here in the Cat file. Only now we are implementing both the Predator and Prey interface and override both methods.
     */
    @Override
    public void hunter() {
        System.out.println("I am a hunter!");
    }

    @Override
    public void prey() {
        System.out.println("But I am also prey.");
    }
}
