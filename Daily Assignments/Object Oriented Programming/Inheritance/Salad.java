public class Salad extends Food {
    /*
     * Salad is our second child. It inherits from Food but NOT Burgers. Like
     * Burgers however, it too grabs the canBeEatenRaw attribute and applies it
     * within its constructor.
     */
    String name;

    Salad(String name, boolean canBeEatenRaw) {
        this.name = name;
        this.canBeEatenRaw = canBeEatenRaw;
    }

}
