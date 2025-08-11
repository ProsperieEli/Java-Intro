
public class Burgers extends Food {
    String name;
    int timeToCook;

    /*
     * This is one of Food.java's children. We can know this because we have the
     * extends keyword. This means the Burgers file is inheriting from the Food
     * class. As such, Burger has access to all attributes and methods from the Food
     * class. However if you tried to access Burgers name or timeToCook variable
     * from the Food Object, you would get an error.
     * 
     * We can see we create our Burgers constructor and a boolean is passed through.
     * This canBeEatenRaw boolean is not defined in Burgers, but is inherited from
     * Food.java. So we do not need to declare it here, but we set it to be read
     * once the Object is called in Inheritance.java.
     */

    Burgers(String name, int timeToCook, boolean canBeEatenRaw) {
        this.name = name;
        this.timeToCook = timeToCook;
        this.canBeEatenRaw = canBeEatenRaw;
    }

}
