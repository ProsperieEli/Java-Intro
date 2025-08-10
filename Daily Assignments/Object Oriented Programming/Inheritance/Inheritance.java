
public class Inheritance {
    /*
     * Today we're gonna go through the topic of inherintance. Inheritance is the
     * concept of classes inheriting attributes from another. Think of a child
     * inheriting things from their parent.
     * Remeber: Grandparent --> Parent --> Child --> Child's child.
     * The Child class can use things from the Grandparent class, but the Parent
     * cannot use things from the Child class.
     * Let's use an example of Food.
     */

    public static void main(String[] args) {
        Burgers burger = new Burgers("Hamburgers", 40, false);
        Salad salads = new Salad("Caesar", true);

        System.out.println(burger.name);
        burger.edible(true);

        System.out.println(salads.name);
        salads.edible(true);

    }
    /*
     * Let's go through what's happening in each file. Starting with Food.
     * (Read Food.java, Burgers.java, and Salad.java comments first).
     * Finally, we create two objects of Burger and salads. We can pass in the
     * canBeEatenRaw boolean into both and declare them as either true or false.
     * This, along with calling the edible method on both, gives a different
     * conditional answer based on their answer.
     */

}
