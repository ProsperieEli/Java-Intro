
public class Overridding {
    // Today we're going to quickly go over the @override keyword.
    // The @override keyword is extremely simple. It overrides a method a child
    // obtains from a parent and that's all. Let's see it in action.

    public static void main(String[] args) {
        MaleOverride male = new MaleOverride();
        FemaleOverride female = new FemaleOverride();

        male.isRunning();
        female.isRunning();

        /*
         * Here we have two objects created from the two children of OverrideParent.
         * Both are calling the isRunning method, however the FemaleOverride is using
         * the @Override annotation to change the method to say "She is running" vs
         * "He is running". That's what the @Override annotation does: Allow independant
         * changes to a method in a child class. It's extremely useful for reusability
         * and error checking.
         */
    }
}
