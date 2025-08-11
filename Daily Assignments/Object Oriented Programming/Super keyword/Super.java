
public class Super {
    // The super keyword is our next lesson. This is a relatively short and straight
    // forward explanation.

    /*
     * The super keyword is used when the parent classes constructor takes in
     * attributes that a child class wants to access. Let's go see it in action.
     */

    public static void main(String[] args) {
        WorkUtensils workUtensil = new WorkUtensils("Kleenex", 3);
        HomeUtensils homeUtensil = new HomeUtensils("Controller", 1, 30);

        System.out.println(homeUtensil.objectName);
        System.out.println(homeUtensil.quantity);
        System.out.println(homeUtensil.price);

    }
}
