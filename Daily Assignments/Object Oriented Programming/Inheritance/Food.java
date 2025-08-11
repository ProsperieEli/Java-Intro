
public class Food {

    /*
     * This is our parent file. Here, we declare two attributes and create a method
     * based on a simple conditional referring to those two variables.
     */

    boolean isEditable = true;
    boolean canBeEatenRaw;

    void edible(boolean isEditable) {
        if (isEditable) {
            if (!canBeEatenRaw) {
                System.out.println("Please cook this menu item before consumption.");
            } else {
                System.out.println("This menu item is safe for consumption.");
            }
        }
    }
}
